<%-- 
    Document   : handbagList
    Created on : Mar 24, 2021, 3:09:15 AM
    Author     : CPere
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Handbag List</title>
    </head>
    <body>
        <h2>Handbag List</h2>
         <div class="row col-md-5">
                <table  class ="table table-striped table-hover">
                    <thead class="table-active">
                        <tr>
                            <th>#</th>
                            <th>Bag Name</th>
                            <th>Date Added</th>
                         </tr>
                    </thead>
                    <c:forEach var="a" items="${handbagList}">
                        <tr>
                            <td>${a.handbagId}</td>                   
                            <td>${a.handbagName}</td>
                            <td><fmt:formatDate pattern = "yyyy-MM-dd" value = "${a.dateAdded}" /></td>
                            

                        </tr>

                    </c:forEach>
                </table> 
         </div>
    </body>
</html>
