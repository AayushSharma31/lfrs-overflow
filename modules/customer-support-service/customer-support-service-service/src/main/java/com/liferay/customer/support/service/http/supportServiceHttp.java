/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.customer.support.service.http;

import com.liferay.customer.support.service.supportServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>supportServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see supportServiceSoap
 * @generated
 */
public class supportServiceHttp {

	public static com.liferay.customer.support.model.support createsupport1(
		HttpPrincipal httpPrincipal, String claim, String query,
		String suggestioncomplaint, String BU, String channel,
		long invoiceNumber, java.util.Date invoiceDate, long itemvalueinvoice,
		long itemvalueyou, long claimvalue, String detailclaim, String querybox,
		String scbox) {

		try {
			MethodKey methodKey = new MethodKey(
				supportServiceUtil.class, "createsupport1",
				_createsupport1ParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, claim, query, suggestioncomplaint, BU, channel,
				invoiceNumber, invoiceDate, itemvalueinvoice, itemvalueyou,
				claimvalue, detailclaim, querybox, scbox);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.customer.support.model.support)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(supportServiceHttp.class);

	private static final Class<?>[] _createsupport1ParameterTypes0 =
		new Class[] {
			String.class, String.class, String.class, String.class,
			String.class, long.class, java.util.Date.class, long.class,
			long.class, long.class, String.class, String.class, String.class
		};

}