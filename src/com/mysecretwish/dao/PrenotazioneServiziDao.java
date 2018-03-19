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

public interface PrenotazioneServiziDao
{
	/** 
	 * Inserts a new row in the prenotazione_servizi table.
	 */
	public PrenotazioneServiziPk insert(PrenotazioneServizi dto) throws PrenotazioneServiziDaoException;

	/** 
	 * Updates a single row in the prenotazione_servizi table.
	 */
	public void update(PrenotazioneServiziPk pk, PrenotazioneServizi dto) throws PrenotazioneServiziDaoException;

	/** 
	 * Deletes a single row in the prenotazione_servizi table.
	 */
	public void delete(PrenotazioneServiziPk pk) throws PrenotazioneServiziDaoException;

	/** 
	 * Returns the rows from the prenotazione_servizi table that matches the specified primary-key value.
	 */
	public PrenotazioneServizi findByPrimaryKey(PrenotazioneServiziPk pk) throws PrenotazioneServiziDaoException;

	/** 
	 * Returns all rows from the prenotazione_servizi table that match the criteria 'prenotazione_servizi_id = :prenotazioneServiziId'.
	 */
	public PrenotazioneServizi findByPrimaryKey(long prenotazioneServiziId) throws PrenotazioneServiziDaoException;

	/** 
	 * Returns all rows from the prenotazione_servizi table that match the criteria ''.
	 */
	public PrenotazioneServizi[] findAll() throws PrenotazioneServiziDaoException;

	/** 
	 * Returns all rows from the prenotazione_servizi table that match the criteria 'prenotazione_id = :prenotazioneId'.
	 */
	public PrenotazioneServizi[] findByPrenotazioni(long prenotazioneId) throws PrenotazioneServiziDaoException;

	/** 
	 * Returns all rows from the prenotazione_servizi table that match the criteria 'prenotazione_servizi_id = :prenotazioneServiziId'.
	 */
	public PrenotazioneServizi[] findWherePrenotazioneServiziIdEquals(long prenotazioneServiziId) throws PrenotazioneServiziDaoException;

	/** 
	 * Returns all rows from the prenotazione_servizi table that match the criteria 'descrizione_servizio = :descrizioneServizio'.
	 */
	public PrenotazioneServizi[] findWhereDescrizioneServizioEquals(String descrizioneServizio) throws PrenotazioneServiziDaoException;

	/** 
	 * Returns all rows from the prenotazione_servizi table that match the criteria 'prenotazione_id = :prenotazioneId'.
	 */
	public PrenotazioneServizi[] findWherePrenotazioneIdEquals(long prenotazioneId) throws PrenotazioneServiziDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the prenotazione_servizi table that match the specified arbitrary SQL statement
	 */
	public PrenotazioneServizi[] findByDynamicSelect(String sql, Object[] sqlParams) throws PrenotazioneServiziDaoException;

	/** 
	 * Returns all rows from the prenotazione_servizi table that match the specified arbitrary SQL statement
	 */
	public PrenotazioneServizi[] findByDynamicWhere(String sql, Object[] sqlParams) throws PrenotazioneServiziDaoException;

}
