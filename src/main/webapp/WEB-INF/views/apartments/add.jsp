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
<h1>Add apartment</h1>
<%--@elvariable id="apartments" type=""--%>
<form:form method="post" modelAttribute="apartments">
    <div class="flex-container">
        <h2>Dodawanie mieszkania</h2><br>
        <span> Województwo: <form:input path="district.city.voivodeship" items="${voivodeship}" itemLabel="name" itemValue="id"/><form:errors path="district.city.voivodeship" cssClass="error"/></span><br>
        <span>Miasto: <form:input path="district.city" items="${district.city}" itemLabel="name" itemValue="id"/><form:errors path="district.city" cssClass="error"/></span><br>
        <span>Dzielnica: <form:input path="district" items="${district}" itemLabel="name" itemValue="id"/><form:errors path="district" cssClass="error"/></span><br>
        <span> Ulica: <form:input path="street"/><form:errors path="street" cssClass="error"/></span><br>
        <span>Cena/Czynsz:<form:input path="price" type="number" min="1.0" max="200000000.0"/><form:errors path="area" cssClass="error"/></span><br>
        <span>Powierzchnia:<form:input path="area" type="number" min="1" max="500"/><form:errors path="area" cssClass="error"/></span><br>
        <span> Pokoje: <form:input path="rooms" type="number" min="1" max="20" value="1"/><form:errors path="rooms" cssClass="error"/></span><br>
        <span>Łazienki: <form:input path="bathrooms" type="number" min="0" max="10" value="1"/><form:errors path="rooms" cssClass="error"/></span><br>
        <span>Piętro: <form:input path="storey"/><form:errors path="storey" cssClass="error"/></span><br>
        <span>Parking: <form:input path="parking"/><form:errors path="parking" cssClass="error"/></span><br>
        <span>Winda: <form:input path="lift"/><form:errors path="lift" cssClass="error"/></span><br><br>
        <span>Rodzaj transakcji: <form:input path="transaction" items="${transaction}" itemLabel="name" itemValue="id"/><form:errors path="transaction" cssClass="error"/></span><br><br>
    </div>
    <%--            <td><a href="/apartments/find?id=${apartments.id}">Szukaj</a></td>--%>
    <input type="submit" value="Dodaj">
</form:form>
</body>
</html>
