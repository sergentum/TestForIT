<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Car</title>
</head>
<body>
<section>
    <%--<h2><a href="carparts.jsp">Car part list</a></h2>--%>
    <h2>${param.action == 'create' ? 'Create car' : 'Edit car'}</h2>
    <hr>
    <jsp:useBean id="car" type="org.app.model.CarEntity" scope="request"/>
    <form method="post" action="car">
        <input type="hidden" name="id" value="${car.id}">
        <dl>
            <dt>Name:</dt>
            <dd><input type="text" value="${car.name}" size=100 name="name"></dd>
        </dl>
        <button type="submit">Save</button>
        <button onclick="window.history.back()">Cancel</button>
    </form>
</section>
</body>
</html>
