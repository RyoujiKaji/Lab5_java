<%@page contentType="text/html" pageEncoding="windows-1251"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="windows-1251">
        <style type="text/css"><%@ include file="css/style.css" %>
        </style>
        <script src="js/readerForms.js" defer="">
            <%@include file="js/readerForms.js" %>
        </script>
        <script src="js/jquery-3.7.1.min.js" defer="">
            <%@include file="js/jquery-3.7.1.min.js" %>
        </script>
        <script src="js/login.js" defer="">
            <%@include file="js/login.js" %>
        </script>
        <title>Авторизация</title>
    </head>
    <body>
        <h1 class = "center">Лабораторная работа №5</h1>
        <h3 class = "center">Вариант 12</h3>
        <p class = "center">Игровой портал</p>
        <div class = "enter">
            <p>${goodRegistration}</p>
            <form id="enter_form">
                <p>Электронная почта:<input type = "text" name = "email"></p>
                <p id = "error_email" class = "error"></p>
                <p>Пароль:<input type = "text" name = "password"></p>
                <p id = "error_password" class = "error"></p>
                <input type="button" value="Войти" id="enter">
            </form>
            <a href = "registration.jsp">Зарегистрироваться</a>
            <div id = "result"></div>
        </div>
        <p class = "down">Today <%= new java.util.Date()%></p>
    </body>
</html>
