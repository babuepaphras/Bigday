/**
 *
 */
package de.hybris.platform.acceleratorstorefrontcommons.forms.validation;

import de.hybris.platform.acceleratorstorefrontcommons.forms.ForgottenPwdForm;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.stereotype.Component;

/**
 * @author admin
 *
 */
 
 @Component("forgotPasswordValidator")
public class ForgotPasswordValidator implements Validator
{

	public static final String EMAIL_REGEX = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";

	public static final String MOBILE_REGEX = "[0-9]{10}";



	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(final Class<?> aClass)
	{
		// YTODO Auto-generated method stub
		return ForgottenPwdForm.class.equals(aClass);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public void validate(final Object obj, final Errors error)
	{
		final ForgottenPwdForm form = (ForgottenPwdForm) obj;
		final String email = form.getEmail();


		if (StringUtils.isEmpty(email))
		{
			System.out.println("password validator if");
			error.rejectValue("email", "forgottenPwd.email.invalid");
		}
		else if (!Pattern.matches(MOBILE_REGEX, email))
		{
			System.out.println("password validator else if");
			error.rejectValue("email", "forgottenPwd.email.invalid");
		}
		else if (StringUtils.length(email) > 255 || !Pattern.matches(EMAIL_REGEX, email))
		{
			System.out.println("password validator mobile");
			error.rejectValue("email", "forgottenPwd.email.invalid");
		}


	}

}
