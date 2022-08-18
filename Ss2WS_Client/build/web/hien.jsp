<%-- 
    Document   : hien
    Created on : Aug 18, 2022, 4:15:38 PM
    Author     : Admin
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
                <th>Roll no</th>
                <th>Full name</th>
                <th>Classname</th>

            </tr>
            <c:forEach items="${sinhViens}" var="sv" >
                <tr>
                    <td>${sv.rollNo}</td>
                    <th>${sv.fullName}</th>
                    <th>${sv.className}</th>

                </tr>
            </c:forEach>
        </table>
    </body>
</html>
