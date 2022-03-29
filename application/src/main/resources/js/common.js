const darkMode = localStorage.getItem('dark-mode');

window.addEventListener('load', () => {
     if (darkMode === 'false') {
         u('html').addClass('light-mode');
         u('#logo-image').attr('src', '/images/logo/affiliora-dark.png');
         u('.switch span:last-child').html('Light Mode');
     }
     u('.switch input').attr('checked', darkMode === 'true');
});

u('.switch input').on('input', ({ target }) => {
    const checked = u(target).is(':checked');

    u('html').toggleClass('light-mode');
    u('#logo-image').attr('src', `/images/logo/affiliora-${checked ? 'light' : 'dark'}.png`);
    u('.switch span:last-child').html(checked ? 'Dark Mode' : 'Light Mode');

    localStorage.setItem('dark-mode', checked);
});