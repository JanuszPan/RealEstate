<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Apartments</title>
</head>
<body>
<table>
    <%--@elvariable id="apartments" type="java.util.List"--%>
    <c:forEach items="${apartments}" var="apartments">
        <tr>
            <td>${apartments.id}</td><br>
            <td>${apartments.voivodeship.name}</td><br>
            <td>${apartments.city.name}</td><br>
            <td>${apartments.district.name}</td><br>
            <td>${apartments.street}</td><br>
            <td>${apartments.area}</td><br>
            <td>${apartments.rooms}</td><br>
            <td>${apartments.bathrooms}</td><br>
            <td>${apartments.storey}</td><br>
            <td>${apartments.lift}</td><br>
            <td>${apartments.parking}</td><br>
            <td>${apartments.description}</td><br>
            <td><a href="/apartments/delete?id=${apartments.id}">Usuń</a></td>
            <td><a href="/apartments/edit?id=${apartments.id}">Edytuj</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>