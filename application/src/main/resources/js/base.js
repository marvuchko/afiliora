window.addEventListener('beforeunload', () => {
    u('body').addClass("blur-sm");
});

window.addEventListener('unload', () => {
    u('body').removeClass("blur-sm");
});