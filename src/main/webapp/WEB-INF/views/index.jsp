<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Strona główna</title>
</head>
<body>
<jsp:include page="common/header.jsp"/>
<!-- kod html -->
<h1>Strona główna</h1>

<%-- ${param.foo} --%>
<jsp:include page="common/footer.jsp"/>
</body>
</html>