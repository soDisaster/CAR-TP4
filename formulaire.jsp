<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulaire</title>
    </head>
    <body>
        <form action="informations.jsp" method=POST>
            <p> Title <input name='title'> </p>
            <p> Author name <input name='author'> </p> 
            <p> Parution date <input name='date'> </p>
            
            <input type="submit" value="Send">
            <input type="reset" value="Reset">
            
        </form>
    </body>
</html>
