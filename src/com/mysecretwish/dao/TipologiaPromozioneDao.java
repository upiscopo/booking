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

public interface TipologiaPromozioneDao
{
	/** 
	 * Inserts a new row in the tipologia_promozione table.
	 */
	public TipologiaPromozionePk insert(TipologiaPromozione dto) throws TipologiaPromozioneDaoException;

	/** 
	 * Updates a single row in the tipologia_promozione table.
	 */
	public void update(TipologiaPromozionePk pk, TipologiaPromozione dto) throws TipologiaPromozioneDaoException;

	/** 
	 * Deletes a single row in the tipologia_promozione table.
	 */
	public void delete(TipologiaPromozionePk pk) throws TipologiaPromozioneDaoException;

	/** 
	 * Returns the rows from the tipologia_promozione table that matches the specified primary-key value.
	 */
	public TipologiaPromozione findByPrimaryKey(TipologiaPromozionePk pk) throws TipologiaPromozioneDaoException;

	/** 
	 * Returns all rows from the tipologia_promozione table that match the criteria 'tpp_id = :tppId'.
	 */
	public TipologiaPromozione findByPrimaryKey(long tppId) throws TipologiaPromozioneDaoException;

	/** 
	 * Returns all rows from the tipologia_promozione table that match the criteria ''.
	 */
	public TipologiaPromozione[] findAll() throws TipologiaPromozioneDaoException;

	/** 
	 * Returns all rows from the tipologia_promozione table that match the criteria 'tpp_id = :tppId'.
	 */
	public TipologiaPromozione[] findWhereTppIdEquals(long tppId) throws TipologiaPromozioneDaoException;

	/** 
	 * Returns all rows from the tipologia_promozione table that match the criteria 'tpp_descrizione = :tppDescrizione'.
	 */
	public TipologiaPromozione[] findWhereTppDescrizioneEquals(String tppDescrizione) throws TipologiaPromozioneDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the tipologia_promozione table that match the specified arbitrary SQL statement
	 */
	public TipologiaPromozione[] findByDynamicSelect(String sql, Object[] sqlParams) throws TipologiaPromozioneDaoException;

	/** 
	 * Returns all rows from the tipologia_promozione table that match the specified arbitrary SQL statement
	 */
	public TipologiaPromozione[] findByDynamicWhere(String sql, Object[] sqlParams) throws TipologiaPromozioneDaoException;

}
