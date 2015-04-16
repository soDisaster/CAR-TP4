<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulaire</title>
    </head>
    <body>
        <form action="FormServlet" method=POST>
            <%
              if (request.getParameter("title") != null){ 
                out.println("<p> Title <input name='title' value='" + request.getParameter("title") + "'> </p>");
              }
              else{
                  out.println("<p> Title <input name='title'></p>");
              }
              if (request.getParameter("author") != null){ 
                out.println("<p> Author <input name='author' value='" + request.getParameter("author") + "'> </p>");
              }
              else{
                  out.println("<p> Author <input name='author'></p>");
              }
              
              if (request.getParameter("date") != null){ 
                out.println("<p> Date <input name='date' value='" + request.getParameter("date") + "'> </p>");
              }
              else{
                  out.println("<p> Date <input name='date'></p>");
              }
              
              
                  
            %>
            
            <input type="submit" value="Send">
            <input type="reset" value="Reset">
            
        </form>
    </body>
</html>
