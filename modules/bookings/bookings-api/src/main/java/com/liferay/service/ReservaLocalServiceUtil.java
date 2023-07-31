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

package com.liferay.service;

import com.liferay.model.Reserva;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Reserva. This utility wraps
 * <code>com.liferay.service.impl.ReservaLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ReservaLocalService
 * @generated
 */
public class ReservaLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.service.impl.ReservaLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Reserva addReserva(
			long groupId, String nombre, String apellidos, String email,
			long idAlojamiento, java.util.Date fechaEntrada,
			java.util.Date fechaSalida, int habitaciones, int personas,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addReserva(
			groupId, nombre, apellidos, email, idAlojamiento, fechaEntrada,
			fechaSalida, habitaciones, personas, serviceContext);
	}

	/**
	 * Adds the reserva to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ReservaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param reserva the reserva
	 * @return the reserva that was added
	 */
	public static Reserva addReserva(Reserva reserva) {
		return getService().addReserva(reserva);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new reserva with the primary key. Does not add the reserva to the database.
	 *
	 * @param idReserva the primary key for the new reserva
	 * @return the new reserva
	 */
	public static Reserva createReserva(long idReserva) {
		return getService().createReserva(idReserva);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the reserva with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ReservaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idReserva the primary key of the reserva
	 * @return the reserva that was removed
	 * @throws PortalException if a reserva with the primary key could not be found
	 */
	public static Reserva deleteReserva(long idReserva) throws PortalException {
		return getService().deleteReserva(idReserva);
	}

	/**
	 * Deletes the reserva from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ReservaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param reserva the reserva
	 * @return the reserva that was removed
	 */
	public static Reserva deleteReserva(Reserva reserva) {
		return getService().deleteReserva(reserva);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.model.impl.ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.model.impl.ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Reserva fetchReserva(long idReserva) {
		return getService().fetchReserva(idReserva);
	}

	/**
	 * Returns the reserva matching the UUID and group.
	 *
	 * @param uuid the reserva's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reserva, or <code>null</code> if a matching reserva could not be found
	 */
	public static Reserva fetchReservaByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchReservaByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the reserva with the primary key.
	 *
	 * @param idReserva the primary key of the reserva
	 * @return the reserva
	 * @throws PortalException if a reserva with the primary key could not be found
	 */
	public static Reserva getReserva(long idReserva) throws PortalException {
		return getService().getReserva(idReserva);
	}

	/**
	 * Returns the reserva matching the UUID and group.
	 *
	 * @param uuid the reserva's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reserva
	 * @throws PortalException if a matching reserva could not be found
	 */
	public static Reserva getReservaByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getReservaByUuidAndGroupId(uuid, groupId);
	}

	public static List<Reserva> getReservas() {
		return getService().getReservas();
	}

	/**
	 * Returns a range of all the reservas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.model.impl.ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @return the range of reservas
	 */
	public static List<Reserva> getReservas(int start, int end) {
		return getService().getReservas(start, end);
	}

	public static List<Reserva> getReservasByGroupId(long groupId) {
		return getService().getReservasByGroupId(groupId);
	}

	public static List<Reserva> getReservasByGroupId(
		long groupId, int start, int end) {

		return getService().getReservasByGroupId(groupId, start, end);
	}

	public static List<Reserva> getReservasByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Reserva> orderByComparator) {

		return getService().getReservasByGroupId(
			groupId, start, end, orderByComparator);
	}

	public static List<Reserva> getReservasByKeywords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<Reserva> orderByComparator) {

		return getService().getReservasByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	/**
	 * Returns all the reservas matching the UUID and company.
	 *
	 * @param uuid the UUID of the reservas
	 * @param companyId the primary key of the company
	 * @return the matching reservas, or an empty list if no matches were found
	 */
	public static List<Reserva> getReservasByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getReservasByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of reservas matching the UUID and company.
	 *
	 * @param uuid the UUID of the reservas
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching reservas, or an empty list if no matches were found
	 */
	public static List<Reserva> getReservasByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Reserva> orderByComparator) {

		return getService().getReservasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of reservas.
	 *
	 * @return the number of reservas
	 */
	public static int getReservasCount() {
		return getService().getReservasCount();
	}

	public static long getReservasCountByKeywords(
		long groupId, String keywords) {

		return getService().getReservasCountByKeywords(groupId, keywords);
	}

	public static Reserva updateReserva(
			long idReserva, String nombre, String apellidos, String email,
			long idAlojamiento, java.util.Date fechaEntrada,
			java.util.Date fechaSalida, int habitaciones, int personas,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().updateReserva(
			idReserva, nombre, apellidos, email, idAlojamiento, fechaEntrada,
			fechaSalida, habitaciones, personas, serviceContext);
	}

	/**
	 * Updates the reserva in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ReservaLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param reserva the reserva
	 * @return the reserva that was updated
	 */
	public static Reserva updateReserva(Reserva reserva) {
		return getService().updateReserva(reserva);
	}

	public static ReservaLocalService getService() {
		return _service;
	}

	private static volatile ReservaLocalService _service;

}