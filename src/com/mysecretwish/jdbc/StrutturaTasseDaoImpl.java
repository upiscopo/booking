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

public class StrutturaTasseDaoImpl extends AbstractDAO implements StrutturaTasseDao
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
	protected final String SQL_SELECT = "SELECT tas_id, tas_nome, tas_costo, struttura_str_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( tas_id, tas_nome, tas_costo, struttura_str_id ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET tas_id = ?, tas_nome = ?, tas_costo = ?, struttura_str_id = ? WHERE tas_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE tas_id = ?";

	/** 
	 * Index of column tas_id
	 */
	protected static final int COLUMN_TAS_ID = 1;

	/** 
	 * Index of column tas_nome
	 */
	protected static final int COLUMN_TAS_NOME = 2;

	/** 
	 * Index of column tas_costo
	 */
	protected static final int COLUMN_TAS_COSTO = 3;

	/** 
	 * Index of column struttura_str_id
	 */
	protected static final int COLUMN_STRUTTURA_STR_ID = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column tas_id
	 */
	protected static final int PK_COLUMN_TAS_ID = 1;

	/** 
	 * Inserts a new row in the struttura_tasse table.
	 */
	public StrutturaTassePk insert(StrutturaTasse dto) throws StrutturaTasseDaoException
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
		
			stmt = conn.prepareStatement( "SELECT nextval('seq_strutture')" );
			rs = stmt.executeQuery();
			if (rs.next()) {
				dto.setTasId( rs.getLong( 1 ) );
				rs.close();
				stmt.close();
			}
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setLong( index++, dto.getTasId() );
			stmt.setString( index++, dto.getTasNome() );
			stmt.setFloat( index++, dto.getTasCosto() );
			stmt.setLong( index++, dto.getStrutturaStrId() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrutturaTasseDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the struttura_tasse table.
	 */
	public void update(StrutturaTassePk pk, StrutturaTasse dto) throws StrutturaTasseDaoException
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
			stmt.setLong( index++, dto.getTasId() );
			stmt.setString( index++, dto.getTasNome() );
			stmt.setFloat( index++, dto.getTasCosto() );
			stmt.setLong( index++, dto.getStrutturaStrId() );
			stmt.setLong( 5, pk.getTasId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrutturaTasseDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the struttura_tasse table.
	 */
	public void delete(StrutturaTassePk pk) throws StrutturaTasseDaoException
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
			stmt.setLong( 1, pk.getTasId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrutturaTasseDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the struttura_tasse table that matches the specified primary-key value.
	 */
	public StrutturaTasse findByPrimaryKey(StrutturaTassePk pk) throws StrutturaTasseDaoException
	{
		return findByPrimaryKey( pk.getTasId() );
	}

	/** 
	 * Returns all rows from the struttura_tasse table that match the criteria 'tas_id = :tasId'.
	 */
	public StrutturaTasse findByPrimaryKey(long tasId) throws StrutturaTasseDaoException
	{
		StrutturaTasse ret[] = findByDynamicSelect( SQL_SELECT + " WHERE tas_id = ?", new Object[] {  new Long(tasId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the struttura_tasse table that match the criteria ''.
	 */
	public StrutturaTasse[] findAll() throws StrutturaTasseDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY tas_id", null );
	}

	/** 
	 * Returns all rows from the struttura_tasse table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaTasse[] findByStruttura(long strutturaStrId) throws StrutturaTasseDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE struttura_str_id = ?", new Object[] {  new Long(strutturaStrId) } );
	}

	/** 
	 * Returns all rows from the struttura_tasse table that match the criteria 'tas_id = :tasId'.
	 */
	public StrutturaTasse[] findWhereTasIdEquals(long tasId) throws StrutturaTasseDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tas_id = ? ORDER BY tas_id", new Object[] {  new Long(tasId) } );
	}

	/** 
	 * Returns all rows from the struttura_tasse table that match the criteria 'tas_nome = :tasNome'.
	 */
	public StrutturaTasse[] findWhereTasNomeEquals(String tasNome) throws StrutturaTasseDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tas_nome = ? ORDER BY tas_nome", new Object[] { tasNome } );
	}

	/** 
	 * Returns all rows from the struttura_tasse table that match the criteria 'tas_costo = :tasCosto'.
	 */
	public StrutturaTasse[] findWhereTasCostoEquals(float tasCosto) throws StrutturaTasseDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE tas_costo = ? ORDER BY tas_costo", new Object[] {  new Float(tasCosto) } );
	}

	/** 
	 * Returns all rows from the struttura_tasse table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaTasse[] findWhereStrutturaStrIdEquals(long strutturaStrId) throws StrutturaTasseDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE struttura_str_id = ? ORDER BY struttura_str_id", new Object[] {  new Long(strutturaStrId) } );
	}

	/**
	 * Method 'StrutturaTasseDaoImpl'
	 * 
	 */
	public StrutturaTasseDaoImpl()
	{
	}

	/**
	 * Method 'StrutturaTasseDaoImpl'
	 * 
	 * @param userConn
	 */
	public StrutturaTasseDaoImpl(final java.sql.Connection userConn)
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
		return "struttura_tasse";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected StrutturaTasse fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			StrutturaTasse dto = new StrutturaTasse();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected StrutturaTasse[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			StrutturaTasse dto = new StrutturaTasse();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		StrutturaTasse ret[] = new StrutturaTasse[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(StrutturaTasse dto, ResultSet rs) throws SQLException
	{
		dto.setTasId( rs.getLong( COLUMN_TAS_ID ) );
		dto.setTasNome( rs.getString( COLUMN_TAS_NOME ) );
		dto.setTasCosto( rs.getFloat( COLUMN_TAS_COSTO ) );
		dto.setStrutturaStrId( rs.getLong( COLUMN_STRUTTURA_STR_ID ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(StrutturaTasse dto)
	{
	}

	/** 
	 * Returns all rows from the struttura_tasse table that match the specified arbitrary SQL statement
	 */
	public StrutturaTasse[] findByDynamicSelect(String sql, Object[] sqlParams) throws StrutturaTasseDaoException
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
			throw new StrutturaTasseDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the struttura_tasse table that match the specified arbitrary SQL statement
	 */
	public StrutturaTasse[] findByDynamicWhere(String sql, Object[] sqlParams) throws StrutturaTasseDaoException
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
			throw new StrutturaTasseDaoException( "Exception: " + _e.getMessage(), _e );
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