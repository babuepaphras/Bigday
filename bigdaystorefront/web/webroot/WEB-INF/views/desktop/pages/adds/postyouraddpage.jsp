<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%--   <c:url var="postaddurl" value="/store/electronics/en/postadd/insert"/> --%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post Your Add Here</title>
</head>
<body >
 

	<form:form action="/store/electronics/en/postadd/insert" method="post">
		
			<table border="2" bgcolor="">
				<tr>
					<td>Add Title:</td>
					<td><input type="text" name="adtitle"></td>
				</tr>
				<tr>
					<td>Category:</td>
					<td><select name="category">
							<option  value="electronics">Electronics</option>
							<option value="appearel">Apperel</option>
							<option value="Kitchen">kitchen</option>
							<option value="personal">Personal</option>
					</select></td>
				</tr> 
				 <tr>
					<td>Description:</td>
					<td><input type="text" name="description"></td>
				</tr> 
				<tr>
					<td>Valid Till:</td>
					<td><input type="text" name="valid"></td>
				</tr>
				<tr>
					<td>Phone number:</td>
					<td><input type="text" name="phno"></td>
				</tr>
			</table>
		
					<input type="submit" value="Post Your Add" >
				
	</form:form>
</body>
</html>
