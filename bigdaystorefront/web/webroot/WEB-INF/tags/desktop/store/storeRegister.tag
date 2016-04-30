<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ attribute name="actionNameKey" required="true" type="java.lang.String" %>
<%@ attribute name="action" required="true" type="java.lang.String" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/desktop/formElement" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>

<div class="storeregister">
	<div class="headline"><spring:theme code="store.new.customer" /></div>
	<div class="required right"><spring:theme code="form.required"/></div>
	<div class="description"><spring:theme code="store.description"/></div>


	<form:form method="post" commandName="StoreRegisterForm" action="${action}">
		<div class="form_field-elements js-recaptcha-captchaaddon">
			<formElement:formInputBox idKey="storeregister.storename" labelKey="storeregister.storenamee" path="storename" inputCSS="text" mandatory="true"/>
			<formElement:formInputBox idKey="storeregister.phno" labelKey="storeregister.phno" path="phno" inputCSS="text" mandatory="true"/>
			<formElement:formPasswordBox idKey="storeregister.email" labelKey="storeregister.email" path="email" inputCSS="text" mandatory="true"/>
			<input type="hidden" id="recaptchaChallangeAnswered" value="${requestScope.recaptchaChallangeAnswered}"/>

		</div>
		<div class="form-actions clearfix">
			<ycommerce:testId code="store_Register_button">
				<button type="submit" class="positive"><spring:theme code='${actionNameKey}'/></button>
			</ycommerce:testId>
		</div>
	</form:form>
</div>
