<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Voivodeship</title>
</head>
<body>
<table>

    <%--@elvariable id="voivodeship" type="java.util.List"--%>
    <c:forEach items="${voivodeship}" var="voiv">
        <tr>
            <td>${voiv.id}</td><br>
            <td>${voiv.name}</td><br>
            <td><a href="/voivodeship/delete?id=${voivodeship.id}">Usuń</a></td>
            <td><a href="/voivodeship/edit?id=${voivodeship.id}">Edytuj</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
