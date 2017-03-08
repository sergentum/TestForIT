<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Car list</title>
</head>
<body>
<%--<section>--%>
<%--<h2><a href="carparts.jsp">Car part list</a></h2>--%>
<h1>Car list</h1>


<%--<a href="/cars/add">Add</a>--%>
<form:form action="<c:url value='/cars/add' />" modelAttribute="carEntity">
    <table>
        <tr>
            <c:if test="${!empty carEntity.name}">
                <td>
                    <form:label path="id">id</form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8" disabled="true"/>
                    <form:hidden path="id" />
                </td>
            </c:if>
            <td>
                <form:label path="name">Name</form:label>
            </td>
            <td>
                <form:input path="name" />
            </td>
            <td colspan="2">
                <input type="submit" value="${!empty carEntity.name ? 'Edit' : 'Add'}"/>
            </td>
        </tr>
    </table>
</form:form>

<br>
<c:if test="${!empty listCars}">
    <%--<h3>Cars List</h3>--%>
    <table border="1" cellpadding="8" cellspacing="0">
        <tr>
            <th width="80">ID</th>
            <th width="120">Name</th>
            <th width="60"></th>
            <th width="60"></th>
        </tr>
        <c:forEach items="${listCars}" var="car">
            <jsp:useBean id="car" scope="page" type="org.app.model.CarEntity"/>
            <tr>
                <td>${car.id}</td>
                <td>${car.name}</td>
                <td><a href="<c:url value='/cars/edit/${car.id}' />">Edit</a></td>
                <td><a href="<c:url value='/cars/remove/${car.id}' />">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<%--<a href="cars?action=create">Add Car</a>
<hr>
<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>Name</th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <c:forEach items="${cars}" var="car">
        <jsp:useBean id="car" scope="page" type="org.app.model.CarEntity"/>
        <tr>
            <td>${car.name}</td>
            <td><a href="cars?action=update&id=${car.id}">Update</a></td>
            <td><a href="cars?action=delete&id=${car.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>--%>
<%--</section>--%>
</body>
</html>