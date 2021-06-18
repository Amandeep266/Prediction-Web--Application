<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<script type="text/javascript">
function validateUserName()
{
var userName=Document.getElementById("yn").value;

 if(userName.length<3)
{alert("you should have atleast 1 charaters");
return false;}

 else 
{
System.out.println("chl pda hai");
return true;
}

}
</script>

<style type="text/css">
.error{
color:red;
position:fixed;
text-align:left;
}
</style>
</head>


<body>
<h1 align="center"> Love Calculator</h1>
<form:form action="process-homepage" method="get" modelAttribute="userInfo" onsubmit="return validateUserName()">
<div align="center">
<p>
<label for="yn"> Your Name :</label>
<form:input type="text" id="yn" path="yourname"/> <!-- path help us binding userInfo attribute with this inpput field -->
<form:errors path="yourname"  cssClass="error"></form:errors>
</p>
<p>
<label for="cn"> Crush Name :</label>
<form:input type="text" id="cn" path="crushname"/>
<form:errors path="crushname" cssClass="error"></form:errors>
</p>
<p>

<form:checkbox path="TandC" id="check"/>
<label>I am agreeing that this is for fun</label>
<form:errors path="TandC" cssClass="error"></form:errors>
</p>
<input type="submit" value="calculate">
</div>
</form:form>
</body>
</html>