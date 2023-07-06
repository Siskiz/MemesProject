<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" />
<html>
    <head>
        <title>View all Bibizians</title>
        <link rel="stylesheet" href="${root}/WEB-INF/css/style.css"/>
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
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td>${user.name}</td>
                        <td>${user.surname}</td>
                        <td>${user.description}</td>
                        <td>${user.age}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>

</html>