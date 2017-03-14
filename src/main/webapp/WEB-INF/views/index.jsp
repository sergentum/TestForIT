<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Main list</h1>

<ul>
    <li><a href="<c:url value='/cars' />">Cars list</a></li>
    <li><a href="<c:url value='/parts' />">Parts list</a></li>
</ul>

<br>
<c:url var="addAction" value="/add"></c:url>

<form:form method="POST" action="${addAction}" modelAttribute="itemTo">
    <table>
        <tr>
            <c:if test="${!empty itemTo.id}">
                <td>
                    <form:label path="id">id</form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8" disabled="true"/>
                    <form:hidden path="id"/>
                </td>
            </c:if>
            <td>
                <form:label path="carId">Car</form:label>
            </td>
            <td>
                <form:select path="carId" items="${mapCars}" />
            </td>
            <td>
                <form:label path="partId">Part</form:label>
            </td>
            <td>
                <form:select path="partId" items="${mapParts}" />
            </td>
            <td colspan="2">
                <input type="submit" value="${!empty itemTo.id ? 'Edit' : 'Add'}"/>
            </td>
        </tr>
    </table>
</form:form>

<br>
<c:if test="${!empty listItem}">
    <table border="1" cellpadding="8" cellspacing="0">
        <tr>
            <th width="80">ID</th>
            <th width="120">Car</th>
            <th width="120">Part</th>
            <th width="60"></th>
            <th width="60"></th>
        </tr>
        <c:forEach items="${listItem}" var="item">
            <jsp:useBean id="item" scope="page" type="org.app.model.CarPartEntity"/>
            <tr>
                <td>${item.id}</td>
                <td>${item.carEntity.name}</td>
                <td>${item.partEntity.name}</td>
                <td><a href="<c:url value='/edit/${item.id}' />">Edit</a></td>
                <td><a href="<c:url value='/remove/${item.id}' />">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
