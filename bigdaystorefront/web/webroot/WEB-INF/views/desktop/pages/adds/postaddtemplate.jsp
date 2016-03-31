<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/desktop/nav" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/desktop/product" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>


<template:page pageTitle="${pageTitle}">
<!-- Acctually this form should be written in tag file and inserted as content slot -->
	 
	 
	 <form:form action="/bigdaystorefront/electronics/en/insertpost" method="get" commandName="PostAddForm">
	 <center>
	 <br><br>
	
	<h3 style="color: #66ccff" >Here You give your offers</h3>
	
		<br><br>
		
			<table border="2" bgcolor="white">
			<tr>
					<td>Type of Add	</td>
					
					<td><select name="typeofadd">
					        <option value="">Select your option</option>
							<option  value="above">Above 50%</option>
							<option value="below">Above 30%-50%</option>
							<option value="medium">Below 30%</option>
							
							 <style type="typeofadd">     
                        select {
                      width:200px;
                             }
                       </style>
					</select></td>
				</tr> 
				<tr>
					<td>Add Title	</td>
					<td><input type="text" name="adtitle" size="17"></td>
				</tr>
				<tr>
					<td>Category</td>
					<td><select name="catgory">
					          <option value="">Select your category</option>
							<option  value="electronics">Electronics</option>
							<option value="appearel">Apperel</option>
							<option value="Kitchen">kitchen</option>
							<option value="personal">Personal</option>
					</select></td>
				</tr> 
				 <tr>
					<td>Description	</td>
					<td><input type="text" name="description" size="17"></td>
				</tr> 
				<tr>
					<td>Valid Till	</td>
					<td><input type="text" name="valid" size="17"></td>
				</tr>
				<tr>
					<td>Phone number	</td>
					<td><input type="text" name="phno" size="17"></td>
				</tr>
			</table>
			<br><br>
			
			<h4 style="color: blue" >By clicking 'submit' you Accept <a href="terms">Terms & conditions</a></h4>
		
					<input type="submit" value="Submit" >
					</center>
				
	</form:form>
</template:page>
