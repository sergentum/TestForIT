<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Part</title>
</head>
<body>
<section>
    <h2><a href="carparts.jsp">Car part list</a></h2>
    <h2>${param.action == 'create' ? 'Create part' : 'Edit part'}</h2>
    <hr>
    <jsp:useBean id="part" type="org.app.model.Part" scope="request"/>
    <form method="post" action="parts">
        <input type="hidden" name="id" value="${part.id}">
        <dl>
            <dt>Name:</dt>
            <dd><input type="text" value="${part.name}" size=100 name="name"></dd>
        </dl>
        <button type="submit">Save</button>
        <button onclick="window.history.back()">Cancel</button>
    </form>
</section>
</body>
</html>
