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

public class StrutturaLingueDaoImpl extends AbstractDAO implements StrutturaLingueDao
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
	protected final String SQL_SELECT = "SELECT sli_id, struttura_str_id, lingue_parlate_lin_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( sli_id, struttura_str_id, lingue_parlate_lin_id ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET sli_id = ?, struttura_str_id = ?, lingue_parlate_lin_id = ? WHERE sli_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE sli_id = ?";

	/** 
	 * Index of column sli_id
	 */
	protected static final int COLUMN_SLI_ID = 1;

	/** 
	 * Index of column struttura_str_id
	 */
	protected static final int COLUMN_STRUTTURA_STR_ID = 2;

	/** 
	 * Index of column lingue_parlate_lin_id
	 */
	protected static final int COLUMN_LINGUE_PARLATE_LIN_ID = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column sli_id
	 */
	protected static final int PK_COLUMN_SLI_ID = 1;

	/** 
	 * Inserts a new row in the struttura_lingue table.
	 */
	public StrutturaLinguePk insert(StrutturaLingue dto) throws StrutturaLingueDaoException
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
				dto.setSliId( rs.getLong( 1 ) );
				rs.close();
				stmt.close();
			}
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setLong( index++, dto.getSliId() );
			stmt.setLong( index++, dto.getStrutturaStrId() );
			stmt.setLong( index++, dto.getLingueParlateLinId() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrutturaLingueDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the struttura_lingue table.
	 */
	public void update(StrutturaLinguePk pk, StrutturaLingue dto) throws StrutturaLingueDaoException
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
			stmt.setLong( index++, dto.getSliId() );
			stmt.setLong( index++, dto.getStrutturaStrId() );
			stmt.setLong( index++, dto.getLingueParlateLinId() );
			stmt.setLong( 4, pk.getSliId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrutturaLingueDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the struttura_lingue table.
	 */
	public void delete(StrutturaLinguePk pk) throws StrutturaLingueDaoException
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
			stmt.setLong( 1, pk.getSliId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrutturaLingueDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the struttura_lingue table that matches the specified primary-key value.
	 */
	public StrutturaLingue findByPrimaryKey(StrutturaLinguePk pk) throws StrutturaLingueDaoException
	{
		return findByPrimaryKey( pk.getSliId() );
	}

	/** 
	 * Returns all rows from the struttura_lingue table that match the criteria 'sli_id = :sliId'.
	 */
	public StrutturaLingue findByPrimaryKey(long sliId) throws StrutturaLingueDaoException
	{
		StrutturaLingue ret[] = findByDynamicSelect( SQL_SELECT + " WHERE sli_id = ?", new Object[] {  new Long(sliId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the struttura_lingue table that match the criteria ''.
	 */
	public StrutturaLingue[] findAll() throws StrutturaLingueDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY sli_id", null );
	}

	/** 
	 * Returns all rows from the struttura_lingue table that match the criteria 'lingue_parlate_lin_id = :lingueParlateLinId'.
	 */
	public StrutturaLingue[] findByLingueParlate(long lingueParlateLinId) throws StrutturaLingueDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE lingue_parlate_lin_id = ?", new Object[] {  new Long(lingueParlateLinId) } );
	}

	/** 
	 * Returns all rows from the struttura_lingue table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaLingue[] findByStruttura(long strutturaStrId) throws StrutturaLingueDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE struttura_str_id = ?", new Object[] {  new Long(strutturaStrId) } );
	}

	/** 
	 * Returns all rows from the struttura_lingue table that match the criteria 'sli_id = :sliId'.
	 */
	public StrutturaLingue[] findWhereSliIdEquals(long sliId) throws StrutturaLingueDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sli_id = ? ORDER BY sli_id", new Object[] {  new Long(sliId) } );
	}

	/** 
	 * Returns all rows from the struttura_lingue table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaLingue[] findWhereStrutturaStrIdEquals(long strutturaStrId) throws StrutturaLingueDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE struttura_str_id = ? ORDER BY struttura_str_id", new Object[] {  new Long(strutturaStrId) } );
	}

	/** 
	 * Returns all rows from the struttura_lingue table that match the criteria 'lingue_parlate_lin_id = :lingueParlateLinId'.
	 */
	public StrutturaLingue[] findWhereLingueParlateLinIdEquals(long lingueParlateLinId) throws StrutturaLingueDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE lingue_parlate_lin_id = ? ORDER BY lingue_parlate_lin_id", new Object[] {  new Long(lingueParlateLinId) } );
	}

	/**
	 * Method 'StrutturaLingueDaoImpl'
	 * 
	 */
	public StrutturaLingueDaoImpl()
	{
	}

	/**
	 * Method 'StrutturaLingueDaoImpl'
	 * 
	 * @param userConn
	 */
	public StrutturaLingueDaoImpl(final java.sql.Connection userConn)
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
		return "struttura_lingue";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected StrutturaLingue fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			StrutturaLingue dto = new StrutturaLingue();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected StrutturaLingue[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			StrutturaLingue dto = new StrutturaLingue();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		StrutturaLingue ret[] = new StrutturaLingue[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(StrutturaLingue dto, ResultSet rs) throws SQLException
	{
		dto.setSliId( rs.getLong( COLUMN_SLI_ID ) );
		dto.setStrutturaStrId( rs.getLong( COLUMN_STRUTTURA_STR_ID ) );
		dto.setLingueParlateLinId( rs.getLong( COLUMN_LINGUE_PARLATE_LIN_ID ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(StrutturaLingue dto)
	{
	}

	/** 
	 * Returns all rows from the struttura_lingue table that match the specified arbitrary SQL statement
	 */
	public StrutturaLingue[] findByDynamicSelect(String sql, Object[] sqlParams) throws StrutturaLingueDaoException
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
			throw new StrutturaLingueDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the struttura_lingue table that match the specified arbitrary SQL statement
	 */
	public StrutturaLingue[] findByDynamicWhere(String sql, Object[] sqlParams) throws StrutturaLingueDaoException
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
			throw new StrutturaLingueDaoException( "Exception: " + _e.getMessage(), _e );
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
