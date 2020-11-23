<%-- 
    Document   : registration
    Created on : Nov 4, 2020, 7:32:27 PM
    Author     : nikita
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel = "stylesheet">
    </head>
    <body>
    <center><h1><u>Registration</u></h1></center>
    <center>
        <script>
            function checkPass() {
            if (document.getElementById("password").value !== document.getElementById("confirmPassword").value) {
                    alert("No check!");
                    return false;
            } else return true;
            }
        </script>
        <div>
            <form action="registration" method="POST" onsubmit="return checkPass()">

                <table>
                    <tr>
                        <td>User name:</td>
                        <td><input type = "text" class="form-control" id="uname"  name = "uname" placeholder="User name" min="3"> </td>
                    </tr>
                    <tr>
                        <td>E-mail:</td>
                        <td><input type = "email" class="form-control" name = "email" placeholder="Email"> </td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type = "password" class="form-control" id="password" name = "password" placeholder="Password" minlength = "6" maxlength = "16"> </td>
                    </tr>

                    <tr>
                        <td>Confirm Password</td>
                        <td><input type = "password"  class="form-control" id = "confirmPassword" name = "confirmPassword" placeholder="Password" minlength = "6" maxlength = "16"> </td>
                    </tr>

                    <tr>
                        <td colspan="2" style = "text-align: center"><input class="btn btn-success" type = "submit" value = "Submit" ></td>
                    </tr>
                </table>            
            </form>
        </div>
    </center>
</body>
</html>
