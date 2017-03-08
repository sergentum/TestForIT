<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Part list</title>
</head>
<body>
<section>
    <h2><a href="carparts.jsp">Car part list</a></h2>
    <h2>Part list</h2>
    <hr>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>id</th>
            <th>Name</th>
        </tr>
        </thead>
        <c:forEach items="${parts}" var="part">
            <jsp:useBean id="part" scope="page" type="org.app.model.Part"/>
            <tr>
                <td>${part.id}</td>
                <td>${part.name}</td>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>