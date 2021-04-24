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
<%--@elvariable id="apartment" type=""--%>
<form:form method="post" modelAttribute="apartment">
    <div class="flex-container">
       <span> Województwo: <form:select path="voivodeship" items="${voivodeship}" itemLabel="name"
                                        itemValue="id"/><form:errors path="voivodeship" cssClass="error"/></span>
        <span>Miasto: <form:select path="city" items="${city}" itemLabel="name" multiple="true"
                                   itemValue="id"/><form:errors path="city.id" cssClass="error"/></span>
        <span>Dzielnica: <form:select path="district" items="${district}" itemLabel="name" multiple="true"
                                      itemValue="id"/><form:errors path="district" cssClass="error"/></span>

        <span>Powierzchnia:<form:select path="area" type="number" min="1" max="500"/><form:errors path="area"
                                                                                                  cssClass="error"/></span>
        <span> Pokoje: <form:select path="rooms" type="number" min="1" max="20" value="1"/><form:errors path="rooms"
                                                                                                        cssClass="error"/></span>
        <span>Łazienki: <form:select path="bathrooms" type="number" min="0" max="10" value="1"/><form:errors path="rooms"
                                                                                                             cssClass="error"/></span>
        <span>Piętro: <form:select path="storey"/><form:errors path="storey" cssClass="error"/></span>
        <span>Parking: <form:select path="parking"/><form:errors path="parking" cssClass="error"/></span>
        <span>Winda: <form:checkbox path="lift"/><form:errors path="lift" cssClass="error"/></span>
        <span>Zdjęcia: <form:checkbox path="image"/><form:errors path="image" cssClass="error"/></span>
    </div>
    <%--            <td><a href="/apartments/delete?id=${apartments.id}">Szukaj</a></td>--%>
    <a href="apartments">Szukaj nieruchomości </a>

</form:form>
</body>
</html>
