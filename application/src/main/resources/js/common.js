if (typeof beforeSubmit != 'function') {
    window.beforeSubmit = (target, callback) => {
        u(target).html('<i class="fa fa-spinner fa-spin"></i>');

        if (callback) {
            callback();
        }

        return true;
    }
}