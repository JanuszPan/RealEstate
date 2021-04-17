<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Strona główna</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<!-- kod html -->
<h1>Strona główna</h1>
<%-- ${param.foo} --%>
<jsp:include page="footer.jsp"/>
</body>
</html>