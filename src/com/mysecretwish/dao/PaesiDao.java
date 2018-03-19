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

public interface PaesiDao
{
	/** 
	 * Inserts a new row in the paesi table.
	 */
	public PaesiPk insert(Paesi dto) throws PaesiDaoException;

	/** 
	 * Updates a single row in the paesi table.
	 */
	public void update(PaesiPk pk, Paesi dto) throws PaesiDaoException;

	/** 
	 * Deletes a single row in the paesi table.
	 */
	public void delete(PaesiPk pk) throws PaesiDaoException;

	/** 
	 * Returns the rows from the paesi table that matches the specified primary-key value.
	 */
	public Paesi findByPrimaryKey(PaesiPk pk) throws PaesiDaoException;

	/** 
	 * Returns all rows from the paesi table that match the criteria 'pae_id = :paeId'.
	 */
	public Paesi findByPrimaryKey(long paeId) throws PaesiDaoException;

	/** 
	 * Returns all rows from the paesi table that match the criteria ''.
	 */
	public Paesi[] findAll() throws PaesiDaoException;

	/** 
	 * Returns all rows from the paesi table that match the criteria 'pae_id = :paeId'.
	 */
	public Paesi[] findWherePaeIdEquals(long paeId) throws PaesiDaoException;

	/** 
	 * Returns all rows from the paesi table that match the criteria 'pae_descrizione = :paeDescrizione'.
	 */
	public Paesi[] findWherePaeDescrizioneEquals(String paeDescrizione) throws PaesiDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the paesi table that match the specified arbitrary SQL statement
	 */
	public Paesi[] findByDynamicSelect(String sql, Object[] sqlParams) throws PaesiDaoException;

	/** 
	 * Returns all rows from the paesi table that match the specified arbitrary SQL statement
	 */
	public Paesi[] findByDynamicWhere(String sql, Object[] sqlParams) throws PaesiDaoException;

}