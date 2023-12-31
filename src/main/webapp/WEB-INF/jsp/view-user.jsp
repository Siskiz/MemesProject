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
        <div class="container">
            <h1>Bibizian</h1>
            <c:if test="${addUserSuccess}">
                <div>Successfully added Bibizian with id: ${savedUser.getId()}</div>
            </c:if>
            <c:if test="${updateUserSuccess}">
                <div>Successfully updated Bibizian with id: ${updatedUser.getId()}</div>
            </c:if>
            <br>
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
            <h3><a href="/api/users">All Bibizians</a></h3>
        </div>
    </body>
</html>
