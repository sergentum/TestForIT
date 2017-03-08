<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Car Part</title>
</head>
<body>
<section>
    <h2><a href="carparts.jsp">Car part list</a></h2>
    <h2>${param.action == 'create' ? 'Create car part' : 'Edit car part'}</h2>
    <hr>
    <jsp:useBean id="carpart" type="org.app.model.CarPart" scope="request"/>
    <form method="post" action="carparts">
        <input type="hidden" name="id" value="${carpart.id}">
        <dl>
            <dt>Car name:</dt>
            <dd>
                <select>
                    <c:forEach items="${car}" var="car">
                        <jsp:useBean id="car" scope="page" type="org.app.model.Car"/>
                        <option>${car.name}</option>
                    </c:forEach>
                </select>
            </dd>
        </dl>
        <dl>
            <dt>Part name:</dt>
            <dd>
                <select>
                    <c:forEach items="${part}" var="part">
                        <jsp:useBean id="part" scope="page" type="org.app.model.Part"/>
                        <option>${part.name}</option>
                    </c:forEach>
                </select>
            </dd>
        </dl>
        <button type="submit">Save</button>
        <button onclick="window.history.back()">Cancel</button>
    </form>
</section>
</body>
</html>
