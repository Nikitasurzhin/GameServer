<%-- 
    Document   : Index
    Created on : Nov 3, 2020, 6:38:43 PM
    Author     : nikita
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Начало работы</title>
        <link rel="stylesheet" href="base-style.css">
        <link rel="stylesheet" href="style.css">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel = "stylesheet">
     
</head>
<body class = "page">    

    <div class="burger-menu">

        <a href="#" class="burger-menu__button">
            <span class="burger-menu__lines"></span>
        </a>

        <nav class="burger-menu__nav">
            <a class="burger-menu__link">
                <input type="checkbox" id="theme-button" class="theme-button">

                <br>
                <script src = "themebutton.js"></script>
                <br><input type = "text" class="form-control" id="username" name = "username" placeholder="User name" minlength = "6" maxlength = "16"> 
                <br><input type = "password" class="form-control" id ="password" name = "password" placeholder="Password" minlength = "6" maxlength = "16"> 
                <br><input class="btn btn-success" type = "submit" value = "Submit" >
                <a href="registration.jsp" class="burger-menu__link">Регистрация</a>


            </a>
            <a href="" class="burger-menu__link">Настройки</a>         
            <a href="#section-1" class="burger-menu__link">Начало работы</a>
            <a href="#section-2" class="burger-menu__link">Биснес процессы</a>
            <a href="#section-3" class="burger-menu__link">Список задач</a>
            <a href="#section-4" class="burger-menu__link">Доски SCRUM</a>
            <a href="#section-5" class="burger-menu__link">Календарь</a>
            <a href="#section-6" class="burger-menu__link">Диаграммы ганта</a>
            <a href="#section-7" class="burger-menu__link">Видео конференции</a>
            <a href="#section-8" class="burger-menu__link">Редактор интрефейсов</a>
            <a href="#section-9" class="burger-menu__link">Сообщения</a>
            <a href="#section-10" class="burger-menu__link">Помодоро таймер</a>

        </nav>
        <div class="burger-menu__overlay"></div>
    </div>
    <section id="section-1">
        <center><img src="images/mainlogo.png"></center>
        <center>Начало работы</center>
        
    </section>
     <section id="section-2">Биснес процессы</section>
    <section id="section-3">Список задач</section>
    <section id="section-4">Доски SCRUM</section>
    <section id="section-5">Календарь</section>
    <section id="section-6">Диаграммы ганта</section>
    <section id="section-7">Видео конференции</section>
    <section id="section-8">Редактор интрефейсов</section>
    <section id="section-9">Сообщения</section>
    <section id="section-10">Помодоро таймер</section>   
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="burgerMenu.js" ></script>


</body>
</html>