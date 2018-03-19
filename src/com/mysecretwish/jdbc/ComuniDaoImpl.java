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

public class ComuniDaoImpl extends AbstractDAO implements ComuniDao
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
	protected final String SQL_SELECT = "SELECT com_codice, com_descrizione, com_provincia, com_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( com_codice, com_descrizione, com_provincia, com_id ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET com_codice = ?, com_descrizione = ?, com_provincia = ?, com_id = ? WHERE com_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE com_id = ?";

	/** 
	 * Index of column com_codice
	 */
	protected static final int COLUMN_COM_CODICE = 1;

	/** 
	 * Index of column com_descrizione
	 */
	protected static final int COLUMN_COM_DESCRIZIONE = 2;

	/** 
	 * Index of column com_provincia
	 */
	protected static final int COLUMN_COM_PROVINCIA = 3;

	/** 
	 * Index of column com_id
	 */
	protected static final int COLUMN_COM_ID = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column com_id
	 */
	protected static final int PK_COLUMN_COM_ID = 1;

	/** 
	 * Inserts a new row in the comuni table.
	 */
	public ComuniPk insert(Comuni dto) throws ComuniDaoException
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
				dto.setComId( rs.getLong( 1 ) );
				rs.close();
				stmt.close();
			}
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setString( index++, dto.getComCodice() );
			stmt.setString( index++, dto.getComDescrizione() );
			stmt.setString( index++, dto.getComProvincia() );
			stmt.setLong( index++, dto.getComId() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComuniDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the comuni table.
	 */
	public void update(ComuniPk pk, Comuni dto) throws ComuniDaoException
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
			stmt.setString( index++, dto.getComCodice() );
			stmt.setString( index++, dto.getComDescrizione() );
			stmt.setString( index++, dto.getComProvincia() );
			stmt.setLong( index++, dto.getComId() );
			stmt.setLong( 5, pk.getComId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComuniDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the comuni table.
	 */
	public void delete(ComuniPk pk) throws ComuniDaoException
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
			stmt.setLong( 1, pk.getComId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new ComuniDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the comuni table that matches the specified primary-key value.
	 */
	public Comuni findByPrimaryKey(ComuniPk pk) throws ComuniDaoException
	{
		return findByPrimaryKey( pk.getComId() );
	}

	/** 
	 * Returns all rows from the comuni table that match the criteria 'com_id = :comId'.
	 */
	public Comuni findByPrimaryKey(long comId) throws ComuniDaoException
	{
		Comuni ret[] = findByDynamicSelect( SQL_SELECT + " WHERE com_id = ?", new Object[] {  new Long(comId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the comuni table that match the criteria 'com_cod_catasto = :comCodCatasto'.
	 */
	public Comuni[] findWhereComCodCatastoEquals(String comCodCatasto) throws ComuniDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE com_cod_catasto = ? ORDER BY com_cod_catasto", new Object[] { comCodCatasto } );
	}

	/** 
	 * Returns all rows from the comuni table that match the criteria ''.
	 */
	public Comuni[] findAll() throws ComuniDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY com_id", null );
	}

	/** 
	 * Returns all rows from the comuni table that match the criteria 'com_codice = :comCodice'.
	 */
	public Comuni[] findWhereComCodiceEquals(String comCodice) throws ComuniDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE com_codice = ? ORDER BY com_codice", new Object[] { comCodice } );
	}

	/** 
	 * Returns all rows from the comuni table that match the criteria 'com_descrizione = :comDescrizione'.
	 */
	public Comuni[] findWhereComDescrizioneEquals(String comDescrizione) throws ComuniDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE com_descrizione = ? ORDER BY com_descrizione", new Object[] { comDescrizione } );
	}

	/** 
	 * Returns all rows from the comuni table that match the criteria 'com_provincia = :comProvincia'.
	 */
	public Comuni[] findWhereComProvinciaEquals(String comProvincia) throws ComuniDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE com_provincia = ? ORDER BY com_provincia", new Object[] { comProvincia } );
	}

	/** 
	 * Returns all rows from the comuni table that match the criteria 'com_id = :comId'.
	 */
	public Comuni[] findWhereComIdEquals(long comId) throws ComuniDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE com_id = ? ORDER BY com_id", new Object[] {  new Long(comId) } );
	}

	/**
	 * Method 'ComuniDaoImpl'
	 * 
	 */
	public ComuniDaoImpl()
	{
	}

	/**
	 * Method 'ComuniDaoImpl'
	 * 
	 * @param userConn
	 */
	public ComuniDaoImpl(final java.sql.Connection userConn)
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
		return "comuni";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Comuni fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Comuni dto = new Comuni();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Comuni[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Comuni dto = new Comuni();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Comuni ret[] = new Comuni[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Comuni dto, ResultSet rs) throws SQLException
	{
		dto.setComCodice( rs.getString( COLUMN_COM_CODICE ) );
		dto.setComDescrizione( rs.getString( COLUMN_COM_DESCRIZIONE ) );
		dto.setComProvincia( rs.getString( COLUMN_COM_PROVINCIA ) );
		dto.setComId( rs.getLong( COLUMN_COM_ID ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Comuni dto)
	{
	}

	/** 
	 * Returns all rows from the comuni table that match the specified arbitrary SQL statement
	 */
	public Comuni[] findByDynamicSelect(String sql, Object[] sqlParams) throws ComuniDaoException
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
			throw new ComuniDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the comuni table that match the specified arbitrary SQL statement
	 */
	public Comuni[] findByDynamicWhere(String sql, Object[] sqlParams) throws ComuniDaoException
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
			throw new ComuniDaoException( "Exception: " + _e.getMessage(), _e );
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