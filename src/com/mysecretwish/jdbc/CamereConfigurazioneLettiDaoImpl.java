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

public class CamereConfigurazioneLettiDaoImpl extends AbstractDAO implements CamereConfigurazioneLettiDao
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
	protected final String SQL_SELECT = "SELECT scl_id, scl_quantita, camere_cam_id, scl_tipologia FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( scl_id, scl_quantita, camere_cam_id, scl_tipologia ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET scl_id = ?, scl_quantita = ?, camere_cam_id = ?, scl_tipologia = ? WHERE scl_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE scl_id = ?";

	/** 
	 * Index of column scl_id
	 */
	protected static final int COLUMN_SCL_ID = 1;

	/** 
	 * Index of column scl_quantita
	 */
	protected static final int COLUMN_SCL_QUANTITA = 2;

	/** 
	 * Index of column camere_cam_id
	 */
	protected static final int COLUMN_CAMERE_CAM_ID = 3;

	/** 
	 * Index of column scl_tipologia
	 */
	protected static final int COLUMN_SCL_TIPOLOGIA = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column scl_id
	 */
	protected static final int PK_COLUMN_SCL_ID = 1;

	/** 
	 * Inserts a new row in the camere_configurazione_letti table.
	 */
	public CamereConfigurazioneLettiPk insert(CamereConfigurazioneLetti dto) throws CamereConfigurazioneLettiDaoException
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
		
			stmt = conn.prepareStatement( "SELECT nextval('seq_camere')" );
			rs = stmt.executeQuery();
			if (rs.next()) {
				dto.setSclId( rs.getLong( 1 ) );
				rs.close();
				stmt.close();
			}
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setLong( index++, dto.getSclId() );
			stmt.setInt( index++, dto.getSclQuantita() );
			stmt.setLong( index++, dto.getCamereCamId() );
			if (dto.isSclTipologiaNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setLong( index++, dto.getSclTipologia() );
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
			throw new CamereConfigurazioneLettiDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the camere_configurazione_letti table.
	 */
	public void update(CamereConfigurazioneLettiPk pk, CamereConfigurazioneLetti dto) throws CamereConfigurazioneLettiDaoException
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
			stmt.setLong( index++, dto.getSclId() );
			stmt.setInt( index++, dto.getSclQuantita() );
			stmt.setLong( index++, dto.getCamereCamId() );
			if (dto.isSclTipologiaNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setLong( index++, dto.getSclTipologia() );
			}
		
			stmt.setLong( 5, pk.getSclId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CamereConfigurazioneLettiDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the camere_configurazione_letti table.
	 */
	public void delete(CamereConfigurazioneLettiPk pk) throws CamereConfigurazioneLettiDaoException
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
			stmt.setLong( 1, pk.getSclId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new CamereConfigurazioneLettiDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the camere_configurazione_letti table that matches the specified primary-key value.
	 */
	public CamereConfigurazioneLetti findByPrimaryKey(CamereConfigurazioneLettiPk pk) throws CamereConfigurazioneLettiDaoException
	{
		return findByPrimaryKey( pk.getSclId() );
	}

	/** 
	 * Returns all rows from the camere_configurazione_letti table that match the criteria 'scl_id = :sclId'.
	 */
	public CamereConfigurazioneLetti findByPrimaryKey(long sclId) throws CamereConfigurazioneLettiDaoException
	{
		CamereConfigurazioneLetti ret[] = findByDynamicSelect( SQL_SELECT + " WHERE scl_id = ?", new Object[] {  new Long(sclId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the camere_configurazione_letti table that match the criteria ''.
	 */
	public CamereConfigurazioneLetti[] findAll() throws CamereConfigurazioneLettiDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY scl_id", null );
	}

	/** 
	 * Returns all rows from the camere_configurazione_letti table that match the criteria 'camere_cam_id = :camereCamId'.
	 */
	public CamereConfigurazioneLetti[] findByCamere(long camereCamId) throws CamereConfigurazioneLettiDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE camere_cam_id = ?", new Object[] {  new Long(camereCamId) } );
	}

	/** 
	 * Returns all rows from the camere_configurazione_letti table that match the criteria 'scl_id = :sclId'.
	 */
	public CamereConfigurazioneLetti[] findWhereSclIdEquals(long sclId) throws CamereConfigurazioneLettiDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE scl_id = ? ORDER BY scl_id", new Object[] {  new Long(sclId) } );
	}

	/** 
	 * Returns all rows from the camere_configurazione_letti table that match the criteria 'scl_quantita = :sclQuantita'.
	 */
	public CamereConfigurazioneLetti[] findWhereSclQuantitaEquals(int sclQuantita) throws CamereConfigurazioneLettiDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE scl_quantita = ? ORDER BY scl_quantita", new Object[] {  new Integer(sclQuantita) } );
	}

	/** 
	 * Returns all rows from the camere_configurazione_letti table that match the criteria 'camere_cam_id = :camereCamId'.
	 */
	public CamereConfigurazioneLetti[] findWhereCamereCamIdEquals(long camereCamId) throws CamereConfigurazioneLettiDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE camere_cam_id = ? ORDER BY camere_cam_id", new Object[] {  new Long(camereCamId) } );
	}

	/** 
	 * Returns all rows from the camere_configurazione_letti table that match the criteria 'scl_tipologia = :sclTipologia'.
	 */
	public CamereConfigurazioneLetti[] findWhereSclTipologiaEquals(long sclTipologia) throws CamereConfigurazioneLettiDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE scl_tipologia = ? ORDER BY scl_tipologia", new Object[] {  new Long(sclTipologia) } );
	}

	/**
	 * Method 'CamereConfigurazioneLettiDaoImpl'
	 * 
	 */
	public CamereConfigurazioneLettiDaoImpl()
	{
	}

	/**
	 * Method 'CamereConfigurazioneLettiDaoImpl'
	 * 
	 * @param userConn
	 */
	public CamereConfigurazioneLettiDaoImpl(final java.sql.Connection userConn)
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
		return "camere_configurazione_letti";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected CamereConfigurazioneLetti fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			CamereConfigurazioneLetti dto = new CamereConfigurazioneLetti();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected CamereConfigurazioneLetti[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			CamereConfigurazioneLetti dto = new CamereConfigurazioneLetti();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		CamereConfigurazioneLetti ret[] = new CamereConfigurazioneLetti[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(CamereConfigurazioneLetti dto, ResultSet rs) throws SQLException
	{
		dto.setSclId( rs.getLong( COLUMN_SCL_ID ) );
		dto.setSclQuantita( rs.getInt( COLUMN_SCL_QUANTITA ) );
		dto.setCamereCamId( rs.getLong( COLUMN_CAMERE_CAM_ID ) );
		dto.setSclTipologia( rs.getLong( COLUMN_SCL_TIPOLOGIA ) );
		if (rs.wasNull()) {
			dto.setSclTipologiaNull( true );
		}
		
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(CamereConfigurazioneLetti dto)
	{
	}

	/** 
	 * Returns all rows from the camere_configurazione_letti table that match the specified arbitrary SQL statement
	 */
	public CamereConfigurazioneLetti[] findByDynamicSelect(String sql, Object[] sqlParams) throws CamereConfigurazioneLettiDaoException
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
			throw new CamereConfigurazioneLettiDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the camere_configurazione_letti table that match the specified arbitrary SQL statement
	 */
	public CamereConfigurazioneLetti[] findByDynamicWhere(String sql, Object[] sqlParams) throws CamereConfigurazioneLettiDaoException
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
			throw new CamereConfigurazioneLettiDaoException( "Exception: " + _e.getMessage(), _e );
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
