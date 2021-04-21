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
            <td>${apartments.id}</td>
            <td>${apartments.area}</td>
            <td>${apartments.rooms}</td>
            <td>${apartments.bathrooms}</td>
            <td>${apartments.storey}</td>
            <td>${apartments.parking}</td>
            <td>${apartments.lift}</td>
            <td>${apartments.district.name}</td>
<%--            <td><a href="/form/apartments/delete?id=${apartments.id}">Usuń</a></td>--%>
<%--            <td><a href="/form/apartments/edit?id=${apartments.id}">Edytuj</a></td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>