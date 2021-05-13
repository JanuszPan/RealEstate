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
<%--@elvariable id="apartments" type=""--%>
<form:form method="post" modelAttribute="apartments">
    <div class="flex-container">
        <h2>Wyszukiwarka</h2><br>
        <span> Województwo: <form:select path="district.city.voivodeship" items="${voivodeship}" itemLabel="name"
                                         itemValue="id"/><form:errors path="district.city.voivodeship"
                                                                      cssClass="error"/></span><br>
        <span>Miasto: <form:select path="district.city" items="${city}" itemLabel="name"
                                   itemValue="id"/><form:errors path="district.city" cssClass="error"/></span><br>
        <span>Dzielnica: <form:select path="district" items="${district}" itemLabel="name"
                                      itemValue="id"/><form:errors path="district" cssClass="error"/></span><br>
        <span>Cena/Czynsz:<form:input path="price" type="number" min="1" max="200000000" value="1"/><form:errors path="price"
                                                                                                  cssClass="error"/></span><br>
        <span>Powierzchnia:<form:input path="area" type="number" min="1" max="500" value="1"/><form:errors path="area"
                                                                                                  cssClass="error"/></span><br>
        <span> Pokoje: <form:input path="rooms" type="number" min="1" max="20" value="1"/><form:errors path="rooms"
                                                                                                        cssClass="error"/></span><br>
        <span>Łazienki: <form:input path="bathrooms" type="number" min="0" max="10" value="1"/><form:errors
                path="rooms"
                cssClass="error"/></span><br>
        <span>Piętro: <form:input path="storey" type="number" min="-2" max="15" value="0"/><form:errors path="storey" cssClass="error"/></span><br>
        <span>Parking: <form:select path="parking"/><form:errors path="parking" cssClass="error"/></span><br>
        <span>Winda: <form:select path="lift"/><form:errors path="lift" cssClass="error"/></span><br><br>
        <span>Rodzaj transakcji: <form:select path="transaction" items="${transaction}" itemLabel="name"
                                              itemValue="id"/><form:errors path="transaction" cssClass="error"/></span><br><br>
        <span>Nr oferty: <form:input path="id"/><form:errors path="id" cssClass="error"/></span><br><br>
    </div>
    <%--            <td><a href="/apartments/find?id=${apartments.id}">Szukaj</a></td>--%>
    <input type="submit" value="Szukaj"><br><br>
</form:form>
<%--<a href="${apartments/add}">Dodaj własną nieruchomość do sprzedaży lub wynajmu</a>&ndash;%&gt;--%>
<jsp:include page="common/footer.jsp"/>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
        crossorigin="anonymous"></script>
</body>
</html>