<%-- 
    Document   : index
    Created on : Mar 24, 2021, 1:36:14 AM
    Author     : CPerera
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!DOCTYPE html>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bags Web Application</title>
      
      <jsp:include page="header.jsp"/>
    </head>
    <div class="panel-body">
        <body>
            <h3>Pick a Task</h3>
            <ul>
             <li><a href="hbc?action=displayList">View all Handbags</a></li>
            </ul>
        </body>
    </div>
    <div>
       <jsp:include page="footer.jsp"/>
    </div>
</html>

