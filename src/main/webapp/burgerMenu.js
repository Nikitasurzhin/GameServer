function burgerMenu(selector) {
    let menu = $(selector);
    let button = menu.find('.burger-menu__button');

    button.on('click', (e) => {
        e.preventDefault();
        toggleMenu();
    });

    function toggleMenu() {
        menu.toggleClass('burger-menu_active');
        if (menu.hasClass('burger-menu_active')) {
            $('body').css('overflow', 'hidden');
        } else {
            $('body').css('overflow', 'visible');
        }
    }
}
burgerMenu('.burger-menu');


