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

package com.liferay.service.persistence;

import com.liferay.model.Reserva;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the reserva service. This utility wraps <code>com.liferay.service.persistence.impl.ReservaPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReservaPersistence
 * @generated
 */
public class ReservaUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Reserva reserva) {
		getPersistence().clearCache(reserva);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Reserva> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Reserva> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Reserva> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Reserva> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Reserva> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Reserva update(Reserva reserva) {
		return getPersistence().update(reserva);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Reserva update(
		Reserva reserva, ServiceContext serviceContext) {

		return getPersistence().update(reserva, serviceContext);
	}

	/**
	 * Returns all the reservas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching reservas
	 */
	public static List<Reserva> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the reservas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @return the range of matching reservas
	 */
	public static List<Reserva> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the reservas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching reservas
	 */
	public static List<Reserva> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Reserva> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservas where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching reservas
	 */
	public static List<Reserva> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Reserva> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first reserva in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reserva
	 * @throws NoSuchReservaException if a matching reserva could not be found
	 */
	public static Reserva findByUuid_First(
			String uuid, OrderByComparator<Reserva> orderByComparator)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first reserva in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reserva, or <code>null</code> if a matching reserva could not be found
	 */
	public static Reserva fetchByUuid_First(
		String uuid, OrderByComparator<Reserva> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last reserva in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reserva
	 * @throws NoSuchReservaException if a matching reserva could not be found
	 */
	public static Reserva findByUuid_Last(
			String uuid, OrderByComparator<Reserva> orderByComparator)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last reserva in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reserva, or <code>null</code> if a matching reserva could not be found
	 */
	public static Reserva fetchByUuid_Last(
		String uuid, OrderByComparator<Reserva> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the reservas before and after the current reserva in the ordered set where uuid = &#63;.
	 *
	 * @param idReserva the primary key of the current reserva
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reserva
	 * @throws NoSuchReservaException if a reserva with the primary key could not be found
	 */
	public static Reserva[] findByUuid_PrevAndNext(
			long idReserva, String uuid,
			OrderByComparator<Reserva> orderByComparator)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().findByUuid_PrevAndNext(
			idReserva, uuid, orderByComparator);
	}

	/**
	 * Removes all the reservas where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of reservas where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching reservas
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the reserva where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchReservaException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching reserva
	 * @throws NoSuchReservaException if a matching reserva could not be found
	 */
	public static Reserva findByUUID_G(String uuid, long groupId)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the reserva where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching reserva, or <code>null</code> if a matching reserva could not be found
	 */
	public static Reserva fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the reserva where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching reserva, or <code>null</code> if a matching reserva could not be found
	 */
	public static Reserva fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the reserva where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the reserva that was removed
	 */
	public static Reserva removeByUUID_G(String uuid, long groupId)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of reservas where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching reservas
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the reservas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching reservas
	 */
	public static List<Reserva> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the reservas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @return the range of matching reservas
	 */
	public static List<Reserva> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the reservas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching reservas
	 */
	public static List<Reserva> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Reserva> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservas where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching reservas
	 */
	public static List<Reserva> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Reserva> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first reserva in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reserva
	 * @throws NoSuchReservaException if a matching reserva could not be found
	 */
	public static Reserva findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Reserva> orderByComparator)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first reserva in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reserva, or <code>null</code> if a matching reserva could not be found
	 */
	public static Reserva fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Reserva> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last reserva in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reserva
	 * @throws NoSuchReservaException if a matching reserva could not be found
	 */
	public static Reserva findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Reserva> orderByComparator)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last reserva in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reserva, or <code>null</code> if a matching reserva could not be found
	 */
	public static Reserva fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Reserva> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the reservas before and after the current reserva in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param idReserva the primary key of the current reserva
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reserva
	 * @throws NoSuchReservaException if a reserva with the primary key could not be found
	 */
	public static Reserva[] findByUuid_C_PrevAndNext(
			long idReserva, String uuid, long companyId,
			OrderByComparator<Reserva> orderByComparator)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().findByUuid_C_PrevAndNext(
			idReserva, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the reservas where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of reservas where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching reservas
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the reservas where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching reservas
	 */
	public static List<Reserva> findBygroupId(long groupId) {
		return getPersistence().findBygroupId(groupId);
	}

	/**
	 * Returns a range of all the reservas where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @return the range of matching reservas
	 */
	public static List<Reserva> findBygroupId(
		long groupId, int start, int end) {

		return getPersistence().findBygroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the reservas where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching reservas
	 */
	public static List<Reserva> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<Reserva> orderByComparator) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservas where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching reservas
	 */
	public static List<Reserva> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<Reserva> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first reserva in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reserva
	 * @throws NoSuchReservaException if a matching reserva could not be found
	 */
	public static Reserva findBygroupId_First(
			long groupId, OrderByComparator<Reserva> orderByComparator)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().findBygroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first reserva in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reserva, or <code>null</code> if a matching reserva could not be found
	 */
	public static Reserva fetchBygroupId_First(
		long groupId, OrderByComparator<Reserva> orderByComparator) {

		return getPersistence().fetchBygroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last reserva in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reserva
	 * @throws NoSuchReservaException if a matching reserva could not be found
	 */
	public static Reserva findBygroupId_Last(
			long groupId, OrderByComparator<Reserva> orderByComparator)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().findBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last reserva in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reserva, or <code>null</code> if a matching reserva could not be found
	 */
	public static Reserva fetchBygroupId_Last(
		long groupId, OrderByComparator<Reserva> orderByComparator) {

		return getPersistence().fetchBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the reservas before and after the current reserva in the ordered set where groupId = &#63;.
	 *
	 * @param idReserva the primary key of the current reserva
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reserva
	 * @throws NoSuchReservaException if a reserva with the primary key could not be found
	 */
	public static Reserva[] findBygroupId_PrevAndNext(
			long idReserva, long groupId,
			OrderByComparator<Reserva> orderByComparator)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().findBygroupId_PrevAndNext(
			idReserva, groupId, orderByComparator);
	}

	/**
	 * Removes all the reservas where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeBygroupId(long groupId) {
		getPersistence().removeBygroupId(groupId);
	}

	/**
	 * Returns the number of reservas where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching reservas
	 */
	public static int countBygroupId(long groupId) {
		return getPersistence().countBygroupId(groupId);
	}

	/**
	 * Caches the reserva in the entity cache if it is enabled.
	 *
	 * @param reserva the reserva
	 */
	public static void cacheResult(Reserva reserva) {
		getPersistence().cacheResult(reserva);
	}

	/**
	 * Caches the reservas in the entity cache if it is enabled.
	 *
	 * @param reservas the reservas
	 */
	public static void cacheResult(List<Reserva> reservas) {
		getPersistence().cacheResult(reservas);
	}

	/**
	 * Creates a new reserva with the primary key. Does not add the reserva to the database.
	 *
	 * @param idReserva the primary key for the new reserva
	 * @return the new reserva
	 */
	public static Reserva create(long idReserva) {
		return getPersistence().create(idReserva);
	}

	/**
	 * Removes the reserva with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idReserva the primary key of the reserva
	 * @return the reserva that was removed
	 * @throws NoSuchReservaException if a reserva with the primary key could not be found
	 */
	public static Reserva remove(long idReserva)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().remove(idReserva);
	}

	public static Reserva updateImpl(Reserva reserva) {
		return getPersistence().updateImpl(reserva);
	}

	/**
	 * Returns the reserva with the primary key or throws a <code>NoSuchReservaException</code> if it could not be found.
	 *
	 * @param idReserva the primary key of the reserva
	 * @return the reserva
	 * @throws NoSuchReservaException if a reserva with the primary key could not be found
	 */
	public static Reserva findByPrimaryKey(long idReserva)
		throws com.liferay.exception.NoSuchReservaException {

		return getPersistence().findByPrimaryKey(idReserva);
	}

	/**
	 * Returns the reserva with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idReserva the primary key of the reserva
	 * @return the reserva, or <code>null</code> if a reserva with the primary key could not be found
	 */
	public static Reserva fetchByPrimaryKey(long idReserva) {
		return getPersistence().fetchByPrimaryKey(idReserva);
	}

	/**
	 * Returns all the reservas.
	 *
	 * @return the reservas
	 */
	public static List<Reserva> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the reservas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @return the range of reservas
	 */
	public static List<Reserva> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the reservas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of reservas
	 */
	public static List<Reserva> findAll(
		int start, int end, OrderByComparator<Reserva> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the reservas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReservaModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reservas
	 * @param end the upper bound of the range of reservas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of reservas
	 */
	public static List<Reserva> findAll(
		int start, int end, OrderByComparator<Reserva> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the reservas from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of reservas.
	 *
	 * @return the number of reservas
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ReservaPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ReservaPersistence _persistence;

}