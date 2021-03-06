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

public interface StrutturaTrasportiDao
{
	/** 
	 * Inserts a new row in the struttura_trasporti table.
	 */
	public StrutturaTrasportiPk insert(StrutturaTrasporti dto) throws StrutturaTrasportiDaoException;

	/** 
	 * Updates a single row in the struttura_trasporti table.
	 */
	public void update(StrutturaTrasportiPk pk, StrutturaTrasporti dto) throws StrutturaTrasportiDaoException;

	/** 
	 * Deletes a single row in the struttura_trasporti table.
	 */
	public void delete(StrutturaTrasportiPk pk) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns the rows from the struttura_trasporti table that matches the specified primary-key value.
	 */
	public StrutturaTrasporti findByPrimaryKey(StrutturaTrasportiPk pk) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_id = :strId'.
	 */
	public StrutturaTrasporti findByPrimaryKey(long strId) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria ''.
	 */
	public StrutturaTrasporti[] findAll() throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaTrasporti[] findByStruttura(long strutturaStrId) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_id = :strId'.
	 */
	public StrutturaTrasporti[] findWhereStrIdEquals(long strId) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_parc_custodito = :strParcCustodito'.
	 */
	public StrutturaTrasporti[] findWhereStrParcCustoditoEquals(String strParcCustodito) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_parc_strada = :strParcStrada'.
	 */
	public StrutturaTrasporti[] findWhereStrParcStradaEquals(String strParcStrada) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_autorimessa = :strAutorimessa'.
	 */
	public StrutturaTrasporti[] findWhereStrAutorimessaEquals(String strAutorimessa) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_parc_disabili = :strParcDisabili'.
	 */
	public StrutturaTrasporti[] findWhereStrParcDisabiliEquals(String strParcDisabili) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_ricarica_elett = :strRicaricaElett'.
	 */
	public StrutturaTrasporti[] findWhereStrRicaricaElettEquals(String strRicaricaElett) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_biglietti_trasp = :strBigliettiTrasp'.
	 */
	public StrutturaTrasporti[] findWhereStrBigliettiTraspEquals(String strBigliettiTrasp) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_autonoleggio = :strAutonoleggio'.
	 */
	public StrutturaTrasporti[] findWhereStrAutonoleggioEquals(String strAutonoleggio) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_nolo_bici_grat = :strNoloBiciGrat'.
	 */
	public StrutturaTrasporti[] findWhereStrNoloBiciGratEquals(String strNoloBiciGrat) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_nolo_bici_pag = :strNoloBiciPag'.
	 */
	public StrutturaTrasporti[] findWhereStrNoloBiciPagEquals(String strNoloBiciPag) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_navetta = :strNavetta'.
	 */
	public StrutturaTrasporti[] findWhereStrNavettaEquals(String strNavetta) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'str_navetta_aero = :strNavettaAero'.
	 */
	public StrutturaTrasporti[] findWhereStrNavettaAeroEquals(String strNavettaAero) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaTrasporti[] findWhereStrutturaStrIdEquals(long strutturaStrId) throws StrutturaTrasportiDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the struttura_trasporti table that match the specified arbitrary SQL statement
	 */
	public StrutturaTrasporti[] findByDynamicSelect(String sql, Object[] sqlParams) throws StrutturaTrasportiDaoException;

	/** 
	 * Returns all rows from the struttura_trasporti table that match the specified arbitrary SQL statement
	 */
	public StrutturaTrasporti[] findByDynamicWhere(String sql, Object[] sqlParams) throws StrutturaTrasportiDaoException;

}
