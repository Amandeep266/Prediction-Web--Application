<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  h1>Hi ${username}</h1>-->
 <h1>Hi ${userInfo.yourname}</h1> <!-- session attribute -->
<form:form action="process-email" method="GET" modelAttribute="emailDTO">
<label>Enter Your Email</label>
<form:input path="userEmail"></form:input>
<input type="submit" value="send"/>
</form:form>
</body>
</html>
