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

public interface StrutturaTariffeDao
{
	/** 
	 * Inserts a new row in the struttura_tariffe table.
	 */
	public StrutturaTariffePk insert(StrutturaTariffe dto) throws StrutturaTariffeDaoException;

	/** 
	 * Updates a single row in the struttura_tariffe table.
	 */
	public void update(StrutturaTariffePk pk, StrutturaTariffe dto) throws StrutturaTariffeDaoException;

	/** 
	 * Deletes a single row in the struttura_tariffe table.
	 */
	public void delete(StrutturaTariffePk pk) throws StrutturaTariffeDaoException;

	/** 
	 * Returns the rows from the struttura_tariffe table that matches the specified primary-key value.
	 */
	public StrutturaTariffe findByPrimaryKey(StrutturaTariffePk pk) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_id = :tarId'.
	 */
	public StrutturaTariffe findByPrimaryKey(long tarId) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria ''.
	 */
	public StrutturaTariffe[] findAll() throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaTariffe[] findByStruttura(long strutturaStrId) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tipologia_camere_tpc_id = :tipologiaCamereTpcId'.
	 */
	public StrutturaTariffe[] findByTipologiaCamere(long tipologiaCamereTpcId) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_id = :tarId'.
	 */
	public StrutturaTariffe[] findWhereTarIdEquals(long tarId) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_data_inizio = :tarDataInizio'.
	 */
	public StrutturaTariffe[] findWhereTarDataInizioEquals(Date tarDataInizio) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_data_fine = :tarDataFine'.
	 */
	public StrutturaTariffe[] findWhereTarDataFineEquals(Date tarDataFine) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_lunedi = :tarLunedi'.
	 */
	public StrutturaTariffe[] findWhereTarLunediEquals(String tarLunedi) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_martedi = :tarMartedi'.
	 */
	public StrutturaTariffe[] findWhereTarMartediEquals(String tarMartedi) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_mercoledi = :tarMercoledi'.
	 */
	public StrutturaTariffe[] findWhereTarMercolediEquals(String tarMercoledi) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_giovedi = :tarGiovedi'.
	 */
	public StrutturaTariffe[] findWhereTarGiovediEquals(String tarGiovedi) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_venerdi = :tarVenerdi'.
	 */
	public StrutturaTariffe[] findWhereTarVenerdiEquals(String tarVenerdi) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_sabato = :tarSabato'.
	 */
	public StrutturaTariffe[] findWhereTarSabatoEquals(String tarSabato) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_domenica = :tarDomenica'.
	 */
	public StrutturaTariffe[] findWhereTarDomenicaEquals(String tarDomenica) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_tariffa_uso_sing = :tarTariffaUsoSing'.
	 */
	public StrutturaTariffe[] findWhereTarTariffaUsoSingEquals(float tarTariffaUsoSing) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_tariffa_minima = :tarTariffaMinima'.
	 */
	public StrutturaTariffe[] findWhereTarTariffaMinimaEquals(float tarTariffaMinima) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tar_tariffa_standard = :tarTariffaStandard'.
	 */
	public StrutturaTariffe[] findWhereTarTariffaStandardEquals(float tarTariffaStandard) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaTariffe[] findWhereStrutturaStrIdEquals(long strutturaStrId) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'categorie_cat_id = :categorieCatId'.
	 */
	public StrutturaTariffe[] findWhereCategorieCatIdEquals(long categorieCatId) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the criteria 'tipologia_camere_tpc_id = :tipologiaCamereTpcId'.
	 */
	public StrutturaTariffe[] findWhereTipologiaCamereTpcIdEquals(long tipologiaCamereTpcId) throws StrutturaTariffeDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the struttura_tariffe table that match the specified arbitrary SQL statement
	 */
	public StrutturaTariffe[] findByDynamicSelect(String sql, Object[] sqlParams) throws StrutturaTariffeDaoException;

	/** 
	 * Returns all rows from the struttura_tariffe table that match the specified arbitrary SQL statement
	 */
	public StrutturaTariffe[] findByDynamicWhere(String sql, Object[] sqlParams) throws StrutturaTariffeDaoException;

}
