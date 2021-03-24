<%-- 
    Document   : personalAccount
    Created on : 21.01.2021, 17:06:26
    Author     : nikit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel = "stylesheet">

  </div>
    </head>
    <body>
    <center><h1><u>Личный кабинет</u></h1></center>
    <center>
        <div>
            <form action="login" method="POST">                             
            <table>
                <tr>
                    <td>User name</td>
                    <td><input type = "text" class="form-control" id="username" name = "username" placeholder="User name" minlength = "6" maxlength = "16"> </td>
                </tr>
                 <tr>
                    <td>Password</td>
                    <td><input type = "password" class="form-control" id ="password" name = "password" placeholder="Password" minlength = "6" maxlength = "16"> </td>
                </tr>
                <tr>
                    <td colspan="2" style = "text-align: center"><input class="btn btn-success" type = "submit" value = "Submit" ></td>
                </tr>
                <tr>
                    <td colspan="2" style = "text-align: center"><a href = "registration.jsp">Registration</a></td>
                </tr>
            </table>
            </form>
        </div>
    </center>
    </body>
</html> 