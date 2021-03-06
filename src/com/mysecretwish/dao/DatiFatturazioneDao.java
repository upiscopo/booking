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

public interface DatiFatturazioneDao
{
	/** 
	 * Inserts a new row in the dati_fatturazione table.
	 */
	public DatiFatturazionePk insert(DatiFatturazione dto) throws DatiFatturazioneDaoException;

	/** 
	 * Updates a single row in the dati_fatturazione table.
	 */
	public void update(DatiFatturazionePk pk, DatiFatturazione dto) throws DatiFatturazioneDaoException;

	/** 
	 * Deletes a single row in the dati_fatturazione table.
	 */
	public void delete(DatiFatturazionePk pk) throws DatiFatturazioneDaoException;

	/** 
	 * Returns the rows from the dati_fatturazione table that matches the specified primary-key value.
	 */
	public DatiFatturazione findByPrimaryKey(DatiFatturazionePk pk) throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_id = :fatId'.
	 */
	public DatiFatturazione findByPrimaryKey(long fatId) throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria ''.
	 */
	public DatiFatturazione[] findAll() throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fk_comune = :fkComune'.
	 */
	public DatiFatturazione[] findByComuni(long fkComune) throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fk_struttura = :fkStruttura'.
	 */
	public DatiFatturazione[] findByStruttura(long fkStruttura) throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_id = :fatId'.
	 */
	public DatiFatturazione[] findWhereFatIdEquals(long fatId) throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_ragione_sociale = :fatRagioneSociale'.
	 */
	public DatiFatturazione[] findWhereFatRagioneSocialeEquals(String fatRagioneSociale) throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_attenzione = :fatAttenzione'.
	 */
	public DatiFatturazione[] findWhereFatAttenzioneEquals(String fatAttenzione) throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_indirizzo = :fatIndirizzo'.
	 */
	public DatiFatturazione[] findWhereFatIndirizzoEquals(String fatIndirizzo) throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_cap = :fatCap'.
	 */
	public DatiFatturazione[] findWhereFatCapEquals(String fatCap) throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fk_struttura = :fkStruttura'.
	 */
	public DatiFatturazione[] findWhereFkStrutturaEquals(long fkStruttura) throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fk_comune = :fkComune'.
	 */
	public DatiFatturazione[] findWhereFkComuneEquals(long fkComune) throws DatiFatturazioneDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the dati_fatturazione table that match the specified arbitrary SQL statement
	 */
	public DatiFatturazione[] findByDynamicSelect(String sql, Object[] sqlParams) throws DatiFatturazioneDaoException;

	/** 
	 * Returns all rows from the dati_fatturazione table that match the specified arbitrary SQL statement
	 */
	public DatiFatturazione[] findByDynamicWhere(String sql, Object[] sqlParams) throws DatiFatturazioneDaoException;

}
