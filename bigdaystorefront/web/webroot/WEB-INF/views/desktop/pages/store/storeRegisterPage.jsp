<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template"%>
<%@ taglib prefix="user" tagdir="/WEB-INF/tags/desktop/user"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common"%>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/desktop/nav"%>

<div id="globalMessages">
	<common:globalMessages />
</div>

<div class="span-24" align="center">
<form action="/storereg" method="get">
	<h2>Store Register</h2>
		<table align="center" border="2" cellpadding="2" cellspacing="2" bgcolor="skyblue">
			<tr>
				<td>Store Name:</td>
				<td><input type="text" name="storeName"></td>
			</tr>  
		    <tr>
				<td>Phone Number:</td>
				<td><input type="text" name="phno"></td>
			</tr>
			<tr>
				<td>E-Mail:</td>
				<td><input type="text" name="email"></td>
			</tr>
		     <tr>
				<td></td>
				<td><input type="submit" value="StoreRegister" ></td>
				
			</tr>
		</table>
</form>
	

</div>
