<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
    <head>
        <title>View Bibizian</title>
        <link href="<c:url value="/css/style.css"/>" rel="stylesheet" type="text/css">
    </head>
    <body>
    <h1 class="headerText">Bibizian</h1>
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
                    <td class="userAge">${user.age}</td>
                </tr>
            </tbody>
        </table>
        <h3><a href="users">All Bibizians</a></h3>
    </body>
</html>
