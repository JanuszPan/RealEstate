<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="pl">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <style>
        .error {
            color: red;
        }
    </style>
    <title>Biuro Nieruchomości</title>
</head>
<body>
<jsp:include page="common/header.jsp"/>
<%--@elvariable id="apartment" type=""--%>
<%--@elvariable id="index" type=""--%>
<%--@elvariable id="apartament" type=""--%>
<form:form method="post" modelAttribute="apartament">
    <div class="flex-container">
       <span> Województwo: <form:select path="district.city.voivodeship" items="${voivodeship}" itemLabel="name"
                                        itemValue="id"/><form:errors path="district.city.voivodeship" cssClass="error"/></span>
        <span>Miasto: <form:select path="district.city" items="${city}" itemLabel="name" multiple="true"
                                   itemValue="id"/><form:errors path="district.city" cssClass="error"/></span>
        <span>Dzielnica: <form:select path="district" items="${district}" itemLabel="name" multiple="true"
                                      itemValue="id"/><form:errors path="district" cssClass="error"/></span>

        <span>Powierzchnia:<form:select path="area" type="number" min="1" max="500"/><form:errors path="area"
                                                                                                  cssClass="error"/></span>
        <span> Pokoje: <form:select path="rooms" type="number" min="1" max="20" value="1"/><form:errors path="rooms"
                                                                                                        cssClass="error"/></span>
        <span>Łazienki: <form:select path="bathrooms" type="number" min="0" max="10" value="1"/><form:errors
                path="rooms"
                cssClass="error"/></span>
<%--        <span>Piętro: <form:select path="storey"/><form:errors path="storey" cssClass="error"/></span>--%>
<%--        <span>Parking: <form:select path="parking"/><form:errors path="parking" cssClass="error"/></span>--%>
<%--        <span>Winda: <form:checkbox path="lift"/><form:errors path="lift" cssClass="error"/></span>--%>
<%--        <span>Zdjęcia: <form:checkbox path="image"/><form:errors path="image" cssClass="error"/></span>--%>
    </div>
    <%--            <td><a href="/apartments/find?id=${apartments.id}">Szukaj</a></td>--%>
    <a href="apartments">Szukaj nieruchomości </a>

</form:form>
<jsp:include page="common/footer.jsp"/>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
        crossorigin="anonymous"></script>
</body>
</html>