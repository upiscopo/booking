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

public interface StrutturaRestrizioniDao
{
	/** 
	 * Inserts a new row in the struttura_restrizioni table.
	 */
	public StrutturaRestrizioniPk insert(StrutturaRestrizioni dto) throws StrutturaRestrizioniDaoException;

	/** 
	 * Updates a single row in the struttura_restrizioni table.
	 */
	public void update(StrutturaRestrizioniPk pk, StrutturaRestrizioni dto) throws StrutturaRestrizioniDaoException;

	/** 
	 * Deletes a single row in the struttura_restrizioni table.
	 */
	public void delete(StrutturaRestrizioniPk pk) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns the rows from the struttura_restrizioni table that matches the specified primary-key value.
	 */
	public StrutturaRestrizioni findByPrimaryKey(StrutturaRestrizioniPk pk) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_id = :resId'.
	 */
	public StrutturaRestrizioni findByPrimaryKey(long resId) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria ''.
	 */
	public StrutturaRestrizioni[] findAll() throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaRestrizioni[] findByStruttura(long strutturaStrId) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'tipologia_camere_tpc_id = :tipologiaCamereTpcId'.
	 */
	public StrutturaRestrizioni[] findByTipologiaCamere(long tipologiaCamereTpcId) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_id = :resId'.
	 */
	public StrutturaRestrizioni[] findWhereResIdEquals(long resId) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_data_inizio = :resDataInizio'.
	 */
	public StrutturaRestrizioni[] findWhereResDataInizioEquals(Date resDataInizio) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_data_fine = :resDataFine'.
	 */
	public StrutturaRestrizioni[] findWhereResDataFineEquals(Date resDataFine) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_lunedi = :resLunedi'.
	 */
	public StrutturaRestrizioni[] findWhereResLunediEquals(String resLunedi) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_martedi = :resMartedi'.
	 */
	public StrutturaRestrizioni[] findWhereResMartediEquals(String resMartedi) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_mercoledi = :resMercoledi'.
	 */
	public StrutturaRestrizioni[] findWhereResMercolediEquals(String resMercoledi) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_giovedi = :resGiovedi'.
	 */
	public StrutturaRestrizioni[] findWhereResGiovediEquals(String resGiovedi) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_venerdi = :resVenerdi'.
	 */
	public StrutturaRestrizioni[] findWhereResVenerdiEquals(String resVenerdi) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_sabato = :resSabato'.
	 */
	public StrutturaRestrizioni[] findWhereResSabatoEquals(String resSabato) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_domenica = :resDomenica'.
	 */
	public StrutturaRestrizioni[] findWhereResDomenicaEquals(String resDomenica) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_soggiorno_minimo = :resSoggiornoMinimo'.
	 */
	public StrutturaRestrizioni[] findWhereResSoggiornoMinimoEquals(int resSoggiornoMinimo) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_chiuso_arrivo = :resChiusoArrivo'.
	 */
	public StrutturaRestrizioni[] findWhereResChiusoArrivoEquals(String resChiusoArrivo) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'res_chiuso_partenza = :resChiusoPartenza'.
	 */
	public StrutturaRestrizioni[] findWhereResChiusoPartenzaEquals(String resChiusoPartenza) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'categorie_cat_id = :categorieCatId'.
	 */
	public StrutturaRestrizioni[] findWhereCategorieCatIdEquals(long categorieCatId) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'tipologia_camere_tpc_id = :tipologiaCamereTpcId'.
	 */
	public StrutturaRestrizioni[] findWhereTipologiaCamereTpcIdEquals(long tipologiaCamereTpcId) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaRestrizioni[] findWhereStrutturaStrIdEquals(long strutturaStrId) throws StrutturaRestrizioniDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the specified arbitrary SQL statement
	 */
	public StrutturaRestrizioni[] findByDynamicSelect(String sql, Object[] sqlParams) throws StrutturaRestrizioniDaoException;

	/** 
	 * Returns all rows from the struttura_restrizioni table that match the specified arbitrary SQL statement
	 */
	public StrutturaRestrizioni[] findByDynamicWhere(String sql, Object[] sqlParams) throws StrutturaRestrizioniDaoException;

}
