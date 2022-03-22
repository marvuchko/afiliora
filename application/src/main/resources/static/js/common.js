const html = document.documentElement;
const body = document.body;
const logo = document.querySelector("#logo-image");
const menuLinks = document.querySelectorAll(".admin-menu a");
const collapseBtn = document.querySelector(".admin-menu .collapse-btn");
const toggleMobileMenu = document.querySelector(".toggle-mob-menu");
const switchInput = document.querySelector(".switch input");
const switchLabel = document.querySelector(".switch label");
const switchLabelText = switchLabel.querySelector("span:last-child");
const collapsedClass = "collapsed";
const lightModeClass = "light-mode";

/*TOGGLE HEADER STATE*/
collapseBtn.addEventListener("click", function() {
    body.classList.toggle(collapsedClass);
    this.getAttribute("aria-expanded") == "true" ?
        this.setAttribute("aria-expanded", "false") :
        this.setAttribute("aria-expanded", "true");
    this.getAttribute("aria-label") == "collapse menu" ?
        this.setAttribute("aria-label", "expand menu") :
        this.setAttribute("aria-label", "collapse menu");
});

/*TOGGLE MOBILE MENU*/
toggleMobileMenu.addEventListener("click", function() {
    body.classList.toggle("mob-menu-opened");
    this.getAttribute("aria-expanded") == "true" ?
        this.setAttribute("aria-expanded", "false") :
        this.setAttribute("aria-expanded", "true");
    this.getAttribute("aria-label") == "open menu" ?
        this.setAttribute("aria-label", "close menu") :
        this.setAttribute("aria-label", "open menu");
});

/*SHOW TOOLTIP ON MENU LINK HOVER*/
for (const link of menuLinks) {
    link.addEventListener("mouseenter", function() {
        if (
            body.classList.contains(collapsedClass) &&
            window.matchMedia("(min-width: 768px)").matches
        ) {
            const tooltip = this.querySelector("span").textContent;
            this.setAttribute("title", tooltip);
            return;
        }
        this.removeAttribute("title");
    });
}

/*TOGGLE LIGHT/DARK MODE*/
const darkMode = localStorage.getItem("dark-mode");

if (darkMode === "false") {
    html.classList.add(lightModeClass);
    switchInput.checked = false;
    switchLabelText.textContent = "Light Mode";
}

switchInput.addEventListener("input", function() {
    html.classList.toggle(lightModeClass);

    if (html.classList.contains(lightModeClass)) {
        switchLabelText.textContent = "Light Mode";
        logo.src = "/images/logo/affiliora-dark.png";
        localStorage.setItem("dark-mode", "false");
        return;
    }

    switchLabelText.textContent = "Dark Mode";
    logo.src = "/images/logo/affiliora-light.png";
    localStorage.setItem("dark-mode", "true");
});