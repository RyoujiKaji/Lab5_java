$(document).ready(function () {
    $("#enter").click(function () {
        let form = read_form($('#enter_form'));
        if (form.password.length < 3) {
            $('#error_password').append("Неверный логин или пароль");
            return;
        }
        $.ajax({
            type: 'POST',
            url: 'Enter',
            data: form,
            success: function (response) {
                alert(response);
            }
        });
    });
});

        