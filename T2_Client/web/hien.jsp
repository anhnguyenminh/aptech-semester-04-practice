<%-- 
    Document   : hien.jsp
    Created on : Aug 4, 2022, 7:38:50 PM
    Author     : duynn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Roll</th>
                <th>Name</th>
                <th>Class</th>
            </tr>
            <c:forEach items="${sinhViens}" var="sv">
                <tr>
                    <td>${sv.rollNo}</td>
                    <td>${sv.fullName}</td>
                    <td>${sv.className}</td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
