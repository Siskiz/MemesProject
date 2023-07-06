<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
    <head>
        <title>View Bibizian</title>
    </head>
    <body>
    <h1>Bibizian</h1>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Surname</th>
                    <th>Description</th>
                    <th>Age</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${user.name}</td>
                    <td>${user.surname}</td>
                    <td>${user.description}</td>
                    <td>${user.age}</td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
