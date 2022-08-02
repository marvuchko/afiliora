(function() {

    const loadPage = (url, method = 'GET', body = {}) => {
        const options = method === 'GET' ? { method } : { method, body: JSON.stringify(body) }
        return fetch(url, { method, options }).then((response) => response.text());
    }

    const changePage = () => {
        const htmlElement = document.body.parentElement;
        const url = window.location.href;

        loadPage(url).then((responseText) => {
            const wrapper = document.createElement('html');
            wrapper.innerHTML = responseText;

            document.title = wrapper.children[0].querySelector('title').innerHTML;
            htmlElement.children[1].innerHTML = wrapper.children[1].innerHTML;

            window.scrollTo(0, 0);

            reloadScripts();
        });
    }

    const reloadScripts = () => {
        const scripts = [...document.querySelectorAll('script')]
            .filter(scriptTag => scriptTag.src.indexOf('routing.js') === -1);

        if (scripts) {
            scripts.forEach(scriptTag => {
                document.body.removeChild(scriptTag);
                const newScriptTag = document.createElement("script");
                newScriptTag.src = scriptTag.src;
                newScriptTag.async = scriptTag.async;
                document.body.appendChild(newScriptTag);
            });
        }
    }

    window.addEventListener('popstate', changePage);

    document.addEventListener('click', (event) => {
        let element = event.target;

        while (element && !element.href) {
            element = element.parentNode;
        }

        if (element && element.href) {
            event.preventDefault();
            const link = element.href.split('#')[0];
            history.pushState(null, null, link);
            changePage();
        }

    });

})();