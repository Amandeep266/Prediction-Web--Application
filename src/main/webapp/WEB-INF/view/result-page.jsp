<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Love Calculator</h1>
<hr>
<h2>The love calculator predicts :</h2>
<p>
${userInfo.yourname} and  ${userInfo.crushname} are <br>
${result}
</p>
<br>
<a href="/spring-love-calculator/sendEmail">Send result to your email</a>

</body>
</html>