<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
    <head>
        <title>View all Bibizians</title>
        <link href="<c:url value="/css/style.css"/>" rel="stylesheet" type="text/css">
    </head>
    <body>
        <h1>Bibizian's List</h1>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Surname</th>
                    <th>Description</th>
                    <th>Age</th>
                    <th>Operation</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${users}" var="user">
                    <c:url var="updateButton" value="/api/updateUser">
                        <c:param name="userId" value="${user.id}"/>
                    </c:url>
                    <c:url var="deleteButton" value="/api/deleteUser">
                        <c:param name="userId" value="${user.id}"/>
                    </c:url>
                    <tr>
                        <td>${user.name}</td>
                        <td>${user.surname}</td>
                        <td>${user.description}</td>
                        <td>${user.age}</td>
                        <td>
                            <input type="button" value="update" onclick="window.location.href='${updateButton}'"/>
                            <input type="button" value="delete" onclick="window.location.href='${deleteButton}'"/>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <h3><a href="addUser">Become a Bibizian</a></h3>
    </body>

</html>