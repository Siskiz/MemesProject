<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
    <head>
        <title>Update Bibizian</title>
        <link href="<c:url value="/css/style.css"/>" rel="stylesheet" type="text/css">
    </head>
    <body>
        <div class="container">
            <h1> What do you want change in yourself</h1>
            <c:url var="update_user_url" value="/api/updateUser"/>
            <form:form action="${update_user_url}" method="post" modelAttribute="user">
                <form:hidden path="id"/>

                <form:label path="name">Name: </form:label>
                <form:input type="text" path="name"/>

                <form:label path="surname">Surname: </form:label>
                <form:input type="text" path="surname"/>

                <form:label path="age">Age: </form:label>
                <form:input type="number" path="age"/>

                <form:label path="description">Description: </form:label>
                <form:textarea type="text" path="description" rows="4" cols="50"/>

                <input type="submit" value="Become a new version yourself">
            </form:form>
        </div>
    </body>
</html>
