/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mysecretwish.dao;

import java.util.Date;
import com.mysecretwish.dto.*;
import com.mysecretwish.exceptions.*;

public interface FattureDao
{
	/** 
	 * Inserts a new row in the fatture table.
	 */
	public FatturePk insert(Fatture dto) throws FattureDaoException;

	/** 
	 * Updates a single row in the fatture table.
	 */
	public void update(FatturePk pk, Fatture dto) throws FattureDaoException;

	/** 
	 * Deletes a single row in the fatture table.
	 */
	public void delete(FatturePk pk) throws FattureDaoException;

	/** 
	 * Returns the rows from the fatture table that matches the specified primary-key value.
	 */
	public Fatture findByPrimaryKey(FatturePk pk) throws FattureDaoException;

	/** 
	 * Returns all rows from the fatture table that match the criteria 'fatture_id = :fattureId'.
	 */
	public Fatture findByPrimaryKey(long fattureId) throws FattureDaoException;

	/** 
	 * Returns all rows from the fatture table that match the criteria ''.
	 */
	public Fatture[] findAll() throws FattureDaoException;

	/** 
	 * Returns all rows from the fatture table that match the criteria 'fatture_id = :fattureId'.
	 */
	public Fatture[] findWhereFattureIdEquals(long fattureId) throws FattureDaoException;

	/** 
	 * Returns all rows from the fatture table that match the criteria 'periodo = :periodo'.
	 */
	public Fatture[] findWherePeriodoEquals(int periodo) throws FattureDaoException;

	/** 
	 * Returns all rows from the fatture table that match the criteria 'data_emissione = :dataEmissione'.
	 */
	public Fatture[] findWhereDataEmissioneEquals(Date dataEmissione) throws FattureDaoException;

	/** 
	 * Returns all rows from the fatture table that match the criteria 'tipo_fattura = :tipoFattura'.
	 */
	public Fatture[] findWhereTipoFatturaEquals(long tipoFattura) throws FattureDaoException;

	/** 
	 * Returns all rows from the fatture table that match the criteria 'data_scadenza = :dataScadenza'.
	 */
	public Fatture[] findWhereDataScadenzaEquals(Date dataScadenza) throws FattureDaoException;

	/** 
	 * Returns all rows from the fatture table that match the criteria 'importo = :importo'.
	 */
	public Fatture[] findWhereImportoEquals(float importo) throws FattureDaoException;

	/** 
	 * Returns all rows from the fatture table that match the criteria 'data_saldo = :dataSaldo'.
	 */
	public Fatture[] findWhereDataSaldoEquals(Date dataSaldo) throws FattureDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the fatture table that match the specified arbitrary SQL statement
	 */
	public Fatture[] findByDynamicSelect(String sql, Object[] sqlParams) throws FattureDaoException;

	/** 
	 * Returns all rows from the fatture table that match the specified arbitrary SQL statement
	 */
	public Fatture[] findByDynamicWhere(String sql, Object[] sqlParams) throws FattureDaoException;

}
