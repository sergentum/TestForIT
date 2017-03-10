<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Parts list</title>
</head>
<body>

<h1>Parts list</h1>

<h2><a href="<c:url value='/' />">On main</a></h2>

<c:url var="addAction" value="/parts/add" ></c:url>

<form:form method="POST" action="${addAction}" modelAttribute="partEntity">
    <table>
        <tr>
            <c:if test="${!empty partEntity.name}">
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
                <input type="submit" value="${!empty partEntity.name ? 'Edit' : 'Add'}"/>
            </td>
        </tr>
    </table>
</form:form>

<br>
<c:if test="${!empty listParts}">
    <table border="1" cellpadding="8" cellspacing="0">
        <tr>
            <th width="80">ID</th>
            <th width="120">Name</th>
            <th width="60"></th>
            <th width="60"></th>
        </tr>
        <c:forEach items="${listParts}" var="part">
            <jsp:useBean id="part" scope="page" type="org.app.model.PartEntity"/>
            <tr>
                <td>${part.id}</td>
                <td>${part.name}</td>
                <td><a href="<c:url value='/parts/edit/${part.id}' />">Edit</a></td>
                <td><a href="<c:url value='/parts/remove/${part.id}' />">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>