<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="windows-1251">
        <style type="text/css"><%@include file="css/style.css" %> %></style>
        <script src="js/jquery-3.7.1.min.js" defer="">
            <%@include file="js/jquery-3.7.1.min.js" %>
        </script>
        <script src="js/readerForms.js" defer="">
            <%@include file="js/readerForms.js" %>
        </script>
        <script src="js/registration.js" defer="">
            <%@include file="js/registration.js" %>
        </script>
        <title>Регистрация</title>
    </head>
    <body>
        <h2>РЕГИСТРАЦИЯ</h2>
        <div>
            <form id="registr_form" class="textcols">
                <div class="textcols-row">
                    <label class="textcols-item">Имя пользователя </label>
                    <input class="textcols-item" type="text" name="name">
                    <p class="error" id="error_name"></p>
                </div>
                <div class="textcols-row">
                    <label class="textcols-item">Дата рождения </label>
                    <input class="textcols-item" type="date" name="bday">
                    <p class="error" id="error_bday"></p>
                </div>
                <div class="textcols-row">
                    <label class="textcols-item">Электронная почта</label>
                    <input class="textcols-item" type="text" name="email">
                    <p class="error" id="error_email"></p>
                </div>
                <div class="textcols-row">
                    <label class="textcols-item">Логин </label>
                    <input class="textcols-item" type="text" name="login">
                    <p class="error" id="error_login"></p>
                </div>
                <div class="textcols-row"> 
                    <label class="textcols-item">Пароль </label>
                    <input class="textcols-item" type="password" name="password">
                    <p class="error" id="error_password"></p>
                </div>
                <div class="textcols-row"> 
                    <label class="textcols-item">Повторите пароль </label>
                    <input class="textcols-item" type="password" 
                           name="double_password">
                    <p class="error" id="error_double_password"></p>
                </div>
                <input type="button" value="Зарегистрироваться" id="registr_but">
                <p>Уже есть аккаунт?
                    <a href="index.jsp">Войти</a>
                </p>
            </form>
            <div id="error_registr" class="error"></div>
        </div>
        <p class = "down">Today <%= new java.util.Date()%></p>
    </body>
</html>
