<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<html>
    <head>
        <title>Welcome!!!</title>
        <link href="<c:url value="/css/style.css"/>" rel="stylesheet" type="text/css">
    </head>
    <body>
        <h1>Greetings dear Bibizians. You are at home</h1>
        <h3><a href="api/users">Look at all Bibizians</a></h3>
        <h3><a href="api/addUser">Become a Bibizian</a></h3>
    </body>
</html>
