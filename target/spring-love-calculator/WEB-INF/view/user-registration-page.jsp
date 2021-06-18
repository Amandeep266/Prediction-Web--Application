<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<style type="text/css">
.error{
color:red;
position:fixed;
text-align:left;
}
</style>
</head>
<body>
<h1 align="center">Please Register Here . . .</h1>

<form:form action="registration-success" method="get" modelAttribute="userReg">
<div align ="center">
<label>User : </label>
<form:input path="name"/><br>
<label>User Name : </label>
<form:input path="username"/><br>
<label>Password : </label>
<form:password path="password"/><br>
<form:errors path="username" cssClass="error"></form:errors>
<label>Country : </label>
<form:select path="countryName">
<form:option value="Ind" label="India"></form:option>
<form:option value="THI" label="Thialand"></form:option>
<form:option value="CHN" label="China"></form:option>
<form:option value="RUS" label="Russia"></form:option>
</form:select>
<br>
<label>Hobbies :</label>
Cricket<form:checkbox path="hobbies" value="cricket"/>
Programming<form:checkbox path="hobbies" value="Programming"/>
Reading<form:checkbox path="hobbies" value="Reading"/>
Travel<form:checkbox path="hobbies" value="travel"/>
<br>
<label>Gender :</label>
Male:<form:radiobutton path="gender" value="male"/>
Female:<form:radiobutton path="gender" value="female"/>
<label>Age :</label>
<form:input path="age" />
<form:errors path="age" cssClass="error"></form:errors>
<br>
<input type="submit" value="Register"/>
</div>
<div align="center">
<h3>Communication</h3>
<label> Email</label>
<form:input path="communicationDTO.email"/>
<form:errors path="communicationDTO.email" cssClass="error"></form:errors>

<label> Phone</label>
<form:input path="communicationDTO.phone"/>
</div>
</form:form>


</body>
</html>