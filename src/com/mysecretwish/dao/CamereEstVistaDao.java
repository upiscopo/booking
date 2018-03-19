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

public interface CamereEstVistaDao
{
	/** 
	 * Inserts a new row in the camere_est_vista table.
	 */
	public CamereEstVistaPk insert(CamereEstVista dto) throws CamereEstVistaDaoException;

	/** 
	 * Updates a single row in the camere_est_vista table.
	 */
	public void update(CamereEstVistaPk pk, CamereEstVista dto) throws CamereEstVistaDaoException;

	/** 
	 * Deletes a single row in the camere_est_vista table.
	 */
	public void delete(CamereEstVistaPk pk) throws CamereEstVistaDaoException;

	/** 
	 * Returns the rows from the camere_est_vista table that matches the specified primary-key value.
	 */
	public CamereEstVista findByPrimaryKey(CamereEstVistaPk pk) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_id = :sceId'.
	 */
	public CamereEstVista findByPrimaryKey(long sceId) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria ''.
	 */
	public CamereEstVista[] findAll() throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'camere_cam_id = :camereCamId'.
	 */
	public CamereEstVista[] findByCamere(long camereCamId) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_id = :sceId'.
	 */
	public CamereEstVista[] findWhereSceIdEquals(long sceId) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_balcone = :sceBalcone'.
	 */
	public CamereEstVista[] findWhereSceBalconeEquals(String sceBalcone) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_patio = :scePatio'.
	 */
	public CamereEstVista[] findWhereScePatioEquals(String scePatio) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_vista = :sceVista'.
	 */
	public CamereEstVista[] findWhereSceVistaEquals(String sceVista) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_terrazza = :sceTerrazza'.
	 */
	public CamereEstVista[] findWhereSceTerrazzaEquals(String sceTerrazza) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_vista_citta = :sceVistaCitta'.
	 */
	public CamereEstVista[] findWhereSceVistaCittaEquals(String sceVistaCitta) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_vista_giard = :sceVistaGiard'.
	 */
	public CamereEstVista[] findWhereSceVistaGiardEquals(String sceVistaGiard) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_vista_lago = :sceVistaLago'.
	 */
	public CamereEstVista[] findWhereSceVistaLagoEquals(String sceVistaLago) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_vista_luogo = :sceVistaLuogo'.
	 */
	public CamereEstVista[] findWhereSceVistaLuogoEquals(String sceVistaLuogo) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_vista_montagna = :sceVistaMontagna'.
	 */
	public CamereEstVista[] findWhereSceVistaMontagnaEquals(String sceVistaMontagna) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_piscina = :scePiscina'.
	 */
	public CamereEstVista[] findWhereScePiscinaEquals(String scePiscina) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_vista_fiume = :sceVistaFiume'.
	 */
	public CamereEstVista[] findWhereSceVistaFiumeEquals(String sceVistaFiume) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_vista_mare = :sceVistaMare'.
	 */
	public CamereEstVista[] findWhereSceVistaMareEquals(String sceVistaMare) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_vista_cortile = :sceVistaCortile'.
	 */
	public CamereEstVista[] findWhereSceVistaCortileEquals(String sceVistaCortile) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'sce_vista_strada = :sceVistaStrada'.
	 */
	public CamereEstVista[] findWhereSceVistaStradaEquals(String sceVistaStrada) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the criteria 'camere_cam_id = :camereCamId'.
	 */
	public CamereEstVista[] findWhereCamereCamIdEquals(long camereCamId) throws CamereEstVistaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the camere_est_vista table that match the specified arbitrary SQL statement
	 */
	public CamereEstVista[] findByDynamicSelect(String sql, Object[] sqlParams) throws CamereEstVistaDaoException;

	/** 
	 * Returns all rows from the camere_est_vista table that match the specified arbitrary SQL statement
	 */
	public CamereEstVista[] findByDynamicWhere(String sql, Object[] sqlParams) throws CamereEstVistaDaoException;

}
