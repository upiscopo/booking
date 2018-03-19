/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mysecretwish.jdbc;

import com.mysecretwish.dao.*;
import com.mysecretwish.factory.*;
import com.mysecretwish.dto.*;
import com.mysecretwish.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class DatiFatturazioneDaoImpl extends AbstractDAO implements DatiFatturazioneDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT fat_id, fat_ragione_sociale, fat_attenzione, fat_indirizzo, fat_cap, fk_struttura, fk_comune FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( fat_id, fat_ragione_sociale, fat_attenzione, fat_indirizzo, fat_cap, fk_struttura, fk_comune ) VALUES ( ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET fat_id = ?, fat_ragione_sociale = ?, fat_attenzione = ?, fat_indirizzo = ?, fat_cap = ?, fk_struttura = ?, fk_comune = ? WHERE fat_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE fat_id = ?";

	/** 
	 * Index of column fat_id
	 */
	protected static final int COLUMN_FAT_ID = 1;

	/** 
	 * Index of column fat_ragione_sociale
	 */
	protected static final int COLUMN_FAT_RAGIONE_SOCIALE = 2;

	/** 
	 * Index of column fat_attenzione
	 */
	protected static final int COLUMN_FAT_ATTENZIONE = 3;

	/** 
	 * Index of column fat_indirizzo
	 */
	protected static final int COLUMN_FAT_INDIRIZZO = 4;

	/** 
	 * Index of column fat_cap
	 */
	protected static final int COLUMN_FAT_CAP = 5;

	/** 
	 * Index of column fk_struttura
	 */
	protected static final int COLUMN_FK_STRUTTURA = 6;

	/** 
	 * Index of column fk_comune
	 */
	protected static final int COLUMN_FK_COMUNE = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column fat_id
	 */
	protected static final int PK_COLUMN_FAT_ID = 1;

	/** 
	 * Inserts a new row in the dati_fatturazione table.
	 */
	public DatiFatturazionePk insert(DatiFatturazione dto) throws DatiFatturazioneDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( "SELECT nextval('seq_tabelle_dominio')" );
			rs = stmt.executeQuery();
			if (rs.next()) {
				dto.setFatId( rs.getLong( 1 ) );
				rs.close();
				stmt.close();
			}
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setLong( index++, dto.getFatId() );
			stmt.setString( index++, dto.getFatRagioneSociale() );
			stmt.setString( index++, dto.getFatAttenzione() );
			stmt.setString( index++, dto.getFatIndirizzo() );
			stmt.setString( index++, dto.getFatCap() );
			stmt.setLong( index++, dto.getFkStruttura() );
			if (dto.isFkComuneNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setLong( index++, dto.getFkComune() );
			}
		
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DatiFatturazioneDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the dati_fatturazione table.
	 */
	public void update(DatiFatturazionePk pk, DatiFatturazione dto) throws DatiFatturazioneDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setLong( index++, dto.getFatId() );
			stmt.setString( index++, dto.getFatRagioneSociale() );
			stmt.setString( index++, dto.getFatAttenzione() );
			stmt.setString( index++, dto.getFatIndirizzo() );
			stmt.setString( index++, dto.getFatCap() );
			stmt.setLong( index++, dto.getFkStruttura() );
			if (dto.isFkComuneNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setLong( index++, dto.getFkComune() );
			}
		
			stmt.setLong( 8, pk.getFatId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DatiFatturazioneDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the dati_fatturazione table.
	 */
	public void delete(DatiFatturazionePk pk) throws DatiFatturazioneDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setLong( 1, pk.getFatId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DatiFatturazioneDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the dati_fatturazione table that matches the specified primary-key value.
	 */
	public DatiFatturazione findByPrimaryKey(DatiFatturazionePk pk) throws DatiFatturazioneDaoException
	{
		return findByPrimaryKey( pk.getFatId() );
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_id = :fatId'.
	 */
	public DatiFatturazione findByPrimaryKey(long fatId) throws DatiFatturazioneDaoException
	{
		DatiFatturazione ret[] = findByDynamicSelect( SQL_SELECT + " WHERE fat_id = ?", new Object[] {  new Long(fatId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria ''.
	 */
	public DatiFatturazione[] findAll() throws DatiFatturazioneDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY fat_id", null );
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fk_comune = :fkComune'.
	 */
	public DatiFatturazione[] findByComuni(long fkComune) throws DatiFatturazioneDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fk_comune = ?", new Object[] {  new Long(fkComune) } );
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fk_struttura = :fkStruttura'.
	 */
	public DatiFatturazione[] findByStruttura(long fkStruttura) throws DatiFatturazioneDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fk_struttura = ?", new Object[] {  new Long(fkStruttura) } );
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_id = :fatId'.
	 */
	public DatiFatturazione[] findWhereFatIdEquals(long fatId) throws DatiFatturazioneDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fat_id = ? ORDER BY fat_id", new Object[] {  new Long(fatId) } );
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_ragione_sociale = :fatRagioneSociale'.
	 */
	public DatiFatturazione[] findWhereFatRagioneSocialeEquals(String fatRagioneSociale) throws DatiFatturazioneDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fat_ragione_sociale = ? ORDER BY fat_ragione_sociale", new Object[] { fatRagioneSociale } );
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_attenzione = :fatAttenzione'.
	 */
	public DatiFatturazione[] findWhereFatAttenzioneEquals(String fatAttenzione) throws DatiFatturazioneDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fat_attenzione = ? ORDER BY fat_attenzione", new Object[] { fatAttenzione } );
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_indirizzo = :fatIndirizzo'.
	 */
	public DatiFatturazione[] findWhereFatIndirizzoEquals(String fatIndirizzo) throws DatiFatturazioneDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fat_indirizzo = ? ORDER BY fat_indirizzo", new Object[] { fatIndirizzo } );
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fat_cap = :fatCap'.
	 */
	public DatiFatturazione[] findWhereFatCapEquals(String fatCap) throws DatiFatturazioneDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fat_cap = ? ORDER BY fat_cap", new Object[] { fatCap } );
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fk_struttura = :fkStruttura'.
	 */
	public DatiFatturazione[] findWhereFkStrutturaEquals(long fkStruttura) throws DatiFatturazioneDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fk_struttura = ? ORDER BY fk_struttura", new Object[] {  new Long(fkStruttura) } );
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the criteria 'fk_comune = :fkComune'.
	 */
	public DatiFatturazione[] findWhereFkComuneEquals(long fkComune) throws DatiFatturazioneDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE fk_comune = ? ORDER BY fk_comune", new Object[] {  new Long(fkComune) } );
	}

	/**
	 * Method 'DatiFatturazioneDaoImpl'
	 * 
	 */
	public DatiFatturazioneDaoImpl()
	{
	}

	/**
	 * Method 'DatiFatturazioneDaoImpl'
	 * 
	 * @param userConn
	 */
	public DatiFatturazioneDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "dati_fatturazione";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected DatiFatturazione fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			DatiFatturazione dto = new DatiFatturazione();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected DatiFatturazione[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			DatiFatturazione dto = new DatiFatturazione();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		DatiFatturazione ret[] = new DatiFatturazione[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(DatiFatturazione dto, ResultSet rs) throws SQLException
	{
		dto.setFatId( rs.getLong( COLUMN_FAT_ID ) );
		dto.setFatRagioneSociale( rs.getString( COLUMN_FAT_RAGIONE_SOCIALE ) );
		dto.setFatAttenzione( rs.getString( COLUMN_FAT_ATTENZIONE ) );
		dto.setFatIndirizzo( rs.getString( COLUMN_FAT_INDIRIZZO ) );
		dto.setFatCap( rs.getString( COLUMN_FAT_CAP ) );
		dto.setFkStruttura( rs.getLong( COLUMN_FK_STRUTTURA ) );
		dto.setFkComune( rs.getLong( COLUMN_FK_COMUNE ) );
		if (rs.wasNull()) {
			dto.setFkComuneNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(DatiFatturazione dto)
	{
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the specified arbitrary SQL statement
	 */
	public DatiFatturazione[] findByDynamicSelect(String sql, Object[] sqlParams) throws DatiFatturazioneDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DatiFatturazioneDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the dati_fatturazione table that match the specified arbitrary SQL statement
	 */
	public DatiFatturazione[] findByDynamicWhere(String sql, Object[] sqlParams) throws DatiFatturazioneDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DatiFatturazioneDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}