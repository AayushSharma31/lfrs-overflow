package com.liferay.mail.internal.graphql.mutation.v1_0;

import com.liferay.mail.dto.v1_0.Mail;
import com.liferay.mail.resource.v1_0.MailResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author me
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setMailResourceComponentServiceObjects(
		ComponentServiceObjects<MailResource>
			mailResourceComponentServiceObjects) {

		_mailResourceComponentServiceObjects =
			mailResourceComponentServiceObjects;
	}

	@GraphQLField
	public Mail sendEmail(@GraphQLName("mail") Mail mail) throws Exception {
		return _applyComponentServiceObjects(
			_mailResourceComponentServiceObjects,
			this::_populateResourceContext,
			mailResource -> mailResource.sendEmail(mail));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(MailResource mailResource)
		throws Exception {

		mailResource.setContextAcceptLanguage(_acceptLanguage);
		mailResource.setContextCompany(_company);
		mailResource.setContextHttpServletRequest(_httpServletRequest);
		mailResource.setContextHttpServletResponse(_httpServletResponse);
		mailResource.setContextUriInfo(_uriInfo);
		mailResource.setContextUser(_user);
		mailResource.setGroupLocalService(_groupLocalService);
		mailResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<MailResource>
		_mailResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}