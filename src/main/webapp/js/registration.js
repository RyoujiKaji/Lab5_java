$(document).ready(function () {
    $("#registr_but").click(function () {
        let form = read_form($("#registr_form"));
        //Запретить вводить пробелы, имя пользователя должно быть уникальным, 
        //проверять почту

        //имя
        if (form.name.includes(" ")) {
            $("#error_name").append("В имени пользователя не должны содержаться пробелы");
            return;
        }

        //дата рождения
        if (new Date(form.bday) > new Date()) {
            $('#error_bday').append('Вы еще не родились :)');
            return;
        }
        if ((new Date().getFullYear() - new Date(form.bday).getFullYear()) > 100) {
            $('#error_bday').append('Вам слишком много лет');
            return;
        }

        //почта
        if (!(/^.+@.+\..+$/.test(form.email))) {
            $('#error_email').append('Неверный формат электронной почты');
        }

        //пароли
        if (form.password.length < 3) {
            $('#error_password').append('Длина пароля должна быть больше 3');
            return;
        }
        if (form.password !== form.double_password) {
            $('#error_password').append('Пароли не совпадают');
            return;
        }

        $.ajax({
            type: 'POST',
            url: 'Registration',
            data: form,
            success: function(response){
               // alert(response);
            }
        });

        //
        //alert(form.name);
    });
});


