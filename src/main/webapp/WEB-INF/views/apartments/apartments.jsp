<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Apartments</title>
</head>
<body>
<table>
    <c:forEach items="${apartments}" var="apartments">
        <tr>
            <td>${apartments.id}</td><br>
            <td>${apartments.area}</td><br>
            <td>${apartments.rooms}</td><br>
            <td>${apartments.bathrooms}</td><br>
            <td>${apartments.storey}</td><br>
            <td>${apartments.parking}</td><br>
            <td>${apartments.lift}</td><br>
            <td>${apartments.district.name}</td><br>
<%--            <td><a href="/form/apartments/delete?id=${apartments.id}">Usuń</a></td>--%>
<%--            <td><a href="/form/apartments/edit?id=${apartments.id}">Edytuj</a></td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>