<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
    <head>
        <title>Add Bibizian</title>
        <link href="<c:url value="/css/style.css"/>" rel="stylesheet" type="text/css">
    </head>
    <body>
        <h1 class="headerText">Tell me a little about yourself</h1>
        <c:url var="add_user_url" value="/api/addUser"/>
        <form:form action="${add_user_url}" method="post" modelAttribute="user">
            <form:label path="name">Name: </form:label><form:input type="text" path="name"/><br>
            <form:label path="surname">Surname: </form:label><form:input type="text" path="surname"/><br>
            <form:label path="description">Description: </form:label><form:input type="text" path="description"/><br>
            <form:label path="age">Age: </form:label><form:input type="text" path="age"/><br>
            <input type="submit" value="Become Bibizian">
        </form:form>
    </body>
</html>
