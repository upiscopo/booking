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

public interface UtenteGruppiViaggioDao
{
	/** 
	 * Inserts a new row in the utente_gruppi_viaggio table.
	 */
	public UtenteGruppiViaggioPk insert(UtenteGruppiViaggio dto) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Updates a single row in the utente_gruppi_viaggio table.
	 */
	public void update(UtenteGruppiViaggioPk pk, UtenteGruppiViaggio dto) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Deletes a single row in the utente_gruppi_viaggio table.
	 */
	public void delete(UtenteGruppiViaggioPk pk) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Returns the rows from the utente_gruppi_viaggio table that matches the specified primary-key value.
	 */
	public UtenteGruppiViaggio findByPrimaryKey(UtenteGruppiViaggioPk pk) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Returns all rows from the utente_gruppi_viaggio table that match the criteria 'ugv_id = :ugvId'.
	 */
	public UtenteGruppiViaggio findByPrimaryKey(long ugvId) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Returns all rows from the utente_gruppi_viaggio table that match the criteria ''.
	 */
	public UtenteGruppiViaggio[] findAll() throws UtenteGruppiViaggioDaoException;

	/** 
	 * Returns all rows from the utente_gruppi_viaggio table that match the criteria 'utente_ute_id = :utenteUteId'.
	 */
	public UtenteGruppiViaggio[] findByUtente(long utenteUteId) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Returns all rows from the utente_gruppi_viaggio table that match the criteria 'ugv_id = :ugvId'.
	 */
	public UtenteGruppiViaggio[] findWhereUgvIdEquals(long ugvId) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Returns all rows from the utente_gruppi_viaggio table that match the criteria 'uid_nome = :uidNome'.
	 */
	public UtenteGruppiViaggio[] findWhereUidNomeEquals(String uidNome) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Returns all rows from the utente_gruppi_viaggio table that match the criteria 'ugv_camere = :ugvCamere'.
	 */
	public UtenteGruppiViaggio[] findWhereUgvCamereEquals(int ugvCamere) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Returns all rows from the utente_gruppi_viaggio table that match the criteria 'ugv_adulti = :ugvAdulti'.
	 */
	public UtenteGruppiViaggio[] findWhereUgvAdultiEquals(int ugvAdulti) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Returns all rows from the utente_gruppi_viaggio table that match the criteria 'ugv_bambini = :ugvBambini'.
	 */
	public UtenteGruppiViaggio[] findWhereUgvBambiniEquals(int ugvBambini) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Returns all rows from the utente_gruppi_viaggio table that match the criteria 'utente_ute_id = :utenteUteId'.
	 */
	public UtenteGruppiViaggio[] findWhereUtenteUteIdEquals(long utenteUteId) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the utente_gruppi_viaggio table that match the specified arbitrary SQL statement
	 */
	public UtenteGruppiViaggio[] findByDynamicSelect(String sql, Object[] sqlParams) throws UtenteGruppiViaggioDaoException;

	/** 
	 * Returns all rows from the utente_gruppi_viaggio table that match the specified arbitrary SQL statement
	 */
	public UtenteGruppiViaggio[] findByDynamicWhere(String sql, Object[] sqlParams) throws UtenteGruppiViaggioDaoException;

}