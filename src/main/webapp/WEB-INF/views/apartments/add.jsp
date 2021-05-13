<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Apartments AddForm</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<jsp:include page="../common/header.jsp"/>
<h1>Add apartment</h1>
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
    <input type="submit" value="Dodaj">

</form:form>
<jsp:include page="../common/footer.jsp"/>
</body>
</html>
