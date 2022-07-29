const loadPage = (url) => {
  return fetch(url).then((response) => {
    return response.text();
  });
}

const changePage = () => {
  var htmlElement = document.body.parentElement;
  var url = window.location.href;

  loadPage(url).then((responseText) => {
    var wrapper = document.createElement('html');
    wrapper.innerHTML = responseText;

    document.title = wrapper.children[0].querySelector('title').innerHTML;
    htmlElement.children[1].innerHTML = wrapper.children[1].innerHTML;

    window.top.location = window.top.location;
  });
}

window.addEventListener('popstate', changePage);

document.addEventListener('click', (event) => {
  var element = event.target;

  while (element && !element.href) {
    element = element.parentNode;
  }

  if (element) {
    event.preventDefault();
    history.pushState(null, null, element.href);
    changePage();
  }

});

const reloadScripts = () => {
  var scripts = document.querySelectorAll('script');
  if (scripts) {
    scripts.forEach(scriptTag => {
      console.log(scriptTag);

      document.body.removeChild(scriptTag);
      const newScriptTag = document.createElement("script");
      newScriptTag.src = scriptTag.src;
      document.body.appendChild(newScriptTag);
    });
  }
}