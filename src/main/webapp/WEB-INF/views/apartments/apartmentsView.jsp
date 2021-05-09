<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Apartments</title>
</head>
<body>
<table>
    <%--@elvariable id="apartments" type="java.util.List"--%>
    <c:forEach items="${apartments}" var="apartment">
        <tr>
            <td>${apartment.id}</td><br>
            <td>${apartment.voivodeship.name}</td><br>
            <td>${apartment.city.name}</td><br>
            <td>${apartment.district.name}</td><br>
            <td>${apartment.street}</td><br>
            <td>${apartment.area}</td><br>
            <td>${apartment.rooms}</td><br>
            <td>${apartment.bathrooms}</td><br>
            <td>${apartment.storey}</td><br>
            <td>${apartment.lift}</td><br>
            <td>${apartment.parking}</td><br>
            <td>${apartment.description}</td><br>
        </tr>
    </c:forEach>
</table>
</body>
</html>
