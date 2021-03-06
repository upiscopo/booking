/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mysecretwish.dao;

import com.mysecretwish.dto.*;
import com.mysecretwish.exceptions.*;

public interface CamereIntrattenimentoDao
{
	/** 
	 * Inserts a new row in the camere_intrattenimento table.
	 */
	public CamereIntrattenimentoPk insert(CamereIntrattenimento dto) throws CamereIntrattenimentoDaoException;

	/** 
	 * Updates a single row in the camere_intrattenimento table.
	 */
	public void update(CamereIntrattenimentoPk pk, CamereIntrattenimento dto) throws CamereIntrattenimentoDaoException;

	/** 
	 * Deletes a single row in the camere_intrattenimento table.
	 */
	public void delete(CamereIntrattenimentoPk pk) throws CamereIntrattenimentoDaoException;

	/** 
	 * Returns the rows from the camere_intrattenimento table that matches the specified primary-key value.
	 */
	public CamereIntrattenimento findByPrimaryKey(CamereIntrattenimentoPk pk) throws CamereIntrattenimentoDaoException;

	/** 
	 * Returns all rows from the camere_intrattenimento table that match the criteria 'sci_id = :sciId'.
	 */
	public CamereIntrattenimento findByPrimaryKey(long sciId) throws CamereIntrattenimentoDaoException;

	/** 
	 * Returns all rows from the camere_intrattenimento table that match the criteria ''.
	 */
	public CamereIntrattenimento[] findAll() throws CamereIntrattenimentoDaoException;

	/** 
	 * Returns all rows from the camere_intrattenimento table that match the criteria 'camere_cam_id = :camereCamId'.
	 */
	public CamereIntrattenimento[] findByCamere(long camereCamId) throws CamereIntrattenimentoDaoException;

	/** 
	 * Returns all rows from the camere_intrattenimento table that match the criteria 'sci_id = :sciId'.
	 */
	public CamereIntrattenimento[] findWhereSciIdEquals(long sciId) throws CamereIntrattenimentoDaoException;

	/** 
	 * Returns all rows from the camere_intrattenimento table that match the criteria 'sci_canc_bambini = :sciCancBambini'.
	 */
	public CamereIntrattenimento[] findWhereSciCancBambiniEquals(String sciCancBambini) throws CamereIntrattenimentoDaoException;

	/** 
	 * Returns all rows from the camere_intrattenimento table that match the criteria 'sci_giochi_tav = :sciGiochiTav'.
	 */
	public CamereIntrattenimento[] findWhereSciGiochiTavEquals(String sciGiochiTav) throws CamereIntrattenimentoDaoException;

	/** 
	 * Returns all rows from the camere_intrattenimento table that match the criteria 'sci_libri = :sciLibri'.
	 */
	public CamereIntrattenimento[] findWhereSciLibriEquals(String sciLibri) throws CamereIntrattenimentoDaoException;

	/** 
	 * Returns all rows from the camere_intrattenimento table that match the criteria 'sci_copriprese = :sciCopriprese'.
	 */
	public CamereIntrattenimento[] findWhereSciCopripreseEquals(String sciCopriprese) throws CamereIntrattenimentoDaoException;

	/** 
	 * Returns all rows from the camere_intrattenimento table that match the criteria 'camere_cam_id = :camereCamId'.
	 */
	public CamereIntrattenimento[] findWhereCamereCamIdEquals(long camereCamId) throws CamereIntrattenimentoDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the camere_intrattenimento table that match the specified arbitrary SQL statement
	 */
	public CamereIntrattenimento[] findByDynamicSelect(String sql, Object[] sqlParams) throws CamereIntrattenimentoDaoException;

	/** 
	 * Returns all rows from the camere_intrattenimento table that match the specified arbitrary SQL statement
	 */
	public CamereIntrattenimento[] findByDynamicWhere(String sql, Object[] sqlParams) throws CamereIntrattenimentoDaoException;

}
