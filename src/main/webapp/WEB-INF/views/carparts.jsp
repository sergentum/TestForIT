<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>CarPart list</title>
</head>
<body>
<section>
    <h2><a href="/cars">Car list</a></h2>
    <h2><a href="parts.jsp">Part list</a></h2>
    <h2>CarPart list</h2>
    <hr>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>Id</th>
            <th>Car Name</th>
            <th>Part Name</th>
        </tr>
        </thead>
        <c:forEach items="${carparts}" var="meal">
            <jsp:useBean id="carpart" scope="page" type="org.app.model.CarPartEntity"/>
            <tr>
                <td>${carpart.id}</td>
                <td>${carpart.car.name}</td>
                <td>${carpart.part.name}</td>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>
