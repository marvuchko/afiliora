window.addEventListener('unload', () => {
    u('body').addClass("blur-sm");
});

window.addEventListener('load', () => {
     u('body').removeClass("blur-sm");
     AOS.init();
});