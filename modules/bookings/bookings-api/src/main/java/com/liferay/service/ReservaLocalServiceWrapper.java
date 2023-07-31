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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ReservaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ReservaLocalService
 * @generated
 */
public class ReservaLocalServiceWrapper
	implements ReservaLocalService, ServiceWrapper<ReservaLocalService> {

	public ReservaLocalServiceWrapper() {
		this(null);
	}

	public ReservaLocalServiceWrapper(ReservaLocalService reservaLocalService) {
		_reservaLocalService = reservaLocalService;
	}

	@Override
	public com.liferay.model.Reserva addReserva(
			long groupId, String nombre, String apellidos, String email,
			long idAlojamiento, java.util.Date fechaEntrada,
			java.util.Date fechaSalida, int habitaciones, int personas,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservaLocalService.addReserva(
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
	@Override
	public com.liferay.model.Reserva addReserva(
		com.liferay.model.Reserva reserva) {

		return _reservaLocalService.addReserva(reserva);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservaLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new reserva with the primary key. Does not add the reserva to the database.
	 *
	 * @param idReserva the primary key for the new reserva
	 * @return the new reserva
	 */
	@Override
	public com.liferay.model.Reserva createReserva(long idReserva) {
		return _reservaLocalService.createReserva(idReserva);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservaLocalService.deletePersistedModel(persistedModel);
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
	@Override
	public com.liferay.model.Reserva deleteReserva(long idReserva)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservaLocalService.deleteReserva(idReserva);
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
	@Override
	public com.liferay.model.Reserva deleteReserva(
		com.liferay.model.Reserva reserva) {

		return _reservaLocalService.deleteReserva(reserva);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _reservaLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _reservaLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _reservaLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _reservaLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _reservaLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _reservaLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _reservaLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _reservaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.liferay.model.Reserva fetchReserva(long idReserva) {
		return _reservaLocalService.fetchReserva(idReserva);
	}

	/**
	 * Returns the reserva matching the UUID and group.
	 *
	 * @param uuid the reserva's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reserva, or <code>null</code> if a matching reserva could not be found
	 */
	@Override
	public com.liferay.model.Reserva fetchReservaByUuidAndGroupId(
		String uuid, long groupId) {

		return _reservaLocalService.fetchReservaByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _reservaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _reservaLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _reservaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _reservaLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the reserva with the primary key.
	 *
	 * @param idReserva the primary key of the reserva
	 * @return the reserva
	 * @throws PortalException if a reserva with the primary key could not be found
	 */
	@Override
	public com.liferay.model.Reserva getReserva(long idReserva)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservaLocalService.getReserva(idReserva);
	}

	/**
	 * Returns the reserva matching the UUID and group.
	 *
	 * @param uuid the reserva's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reserva
	 * @throws PortalException if a matching reserva could not be found
	 */
	@Override
	public com.liferay.model.Reserva getReservaByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservaLocalService.getReservaByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<com.liferay.model.Reserva> getReservas() {
		return _reservaLocalService.getReservas();
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
	@Override
	public java.util.List<com.liferay.model.Reserva> getReservas(
		int start, int end) {

		return _reservaLocalService.getReservas(start, end);
	}

	@Override
	public java.util.List<com.liferay.model.Reserva> getReservasByGroupId(
		long groupId) {

		return _reservaLocalService.getReservasByGroupId(groupId);
	}

	@Override
	public java.util.List<com.liferay.model.Reserva> getReservasByGroupId(
		long groupId, int start, int end) {

		return _reservaLocalService.getReservasByGroupId(groupId, start, end);
	}

	@Override
	public java.util.List<com.liferay.model.Reserva> getReservasByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<com.liferay.model.Reserva> orderByComparator) {

		return _reservaLocalService.getReservasByGroupId(
			groupId, start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.model.Reserva> getReservasByKeywords(
		long groupId, String keywords, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<com.liferay.model.Reserva> orderByComparator) {

		return _reservaLocalService.getReservasByKeywords(
			groupId, keywords, start, end, orderByComparator);
	}

	/**
	 * Returns all the reservas matching the UUID and company.
	 *
	 * @param uuid the UUID of the reservas
	 * @param companyId the primary key of the company
	 * @return the matching reservas, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.liferay.model.Reserva>
		getReservasByUuidAndCompanyId(String uuid, long companyId) {

		return _reservaLocalService.getReservasByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.liferay.model.Reserva>
		getReservasByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.model.Reserva> orderByComparator) {

		return _reservaLocalService.getReservasByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of reservas.
	 *
	 * @return the number of reservas
	 */
	@Override
	public int getReservasCount() {
		return _reservaLocalService.getReservasCount();
	}

	@Override
	public long getReservasCountByKeywords(long groupId, String keywords) {
		return _reservaLocalService.getReservasCountByKeywords(
			groupId, keywords);
	}

	@Override
	public com.liferay.model.Reserva updateReserva(
			long idReserva, String nombre, String apellidos, String email,
			long idAlojamiento, java.util.Date fechaEntrada,
			java.util.Date fechaSalida, int habitaciones, int personas,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reservaLocalService.updateReserva(
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
	@Override
	public com.liferay.model.Reserva updateReserva(
		com.liferay.model.Reserva reserva) {

		return _reservaLocalService.updateReserva(reserva);
	}

	@Override
	public ReservaLocalService getWrappedService() {
		return _reservaLocalService;
	}

	@Override
	public void setWrappedService(ReservaLocalService reservaLocalService) {
		_reservaLocalService = reservaLocalService;
	}

	private ReservaLocalService _reservaLocalService;

}