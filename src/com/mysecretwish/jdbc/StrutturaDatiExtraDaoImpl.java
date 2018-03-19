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
import java.util.Date;
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

public class StrutturaDatiExtraDaoImpl extends AbstractDAO implements StrutturaDatiExtraDao
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
	protected final String SQL_SELECT = "SELECT str_data_inizio_attivita, str_data_costruzione, str_data_ultima_ristr, struttura_str_id, dati_estra_id, str_abit_privata FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( str_data_inizio_attivita, str_data_costruzione, str_data_ultima_ristr, struttura_str_id, dati_estra_id, str_abit_privata ) VALUES ( ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET str_data_inizio_attivita = ?, str_data_costruzione = ?, str_data_ultima_ristr = ?, struttura_str_id = ?, dati_estra_id = ?, str_abit_privata = ? WHERE dati_estra_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE dati_estra_id = ?";

	/** 
	 * Index of column str_data_inizio_attivita
	 */
	protected static final int COLUMN_STR_DATA_INIZIO_ATTIVITA = 1;

	/** 
	 * Index of column str_data_costruzione
	 */
	protected static final int COLUMN_STR_DATA_COSTRUZIONE = 2;

	/** 
	 * Index of column str_data_ultima_ristr
	 */
	protected static final int COLUMN_STR_DATA_ULTIMA_RISTR = 3;

	/** 
	 * Index of column struttura_str_id
	 */
	protected static final int COLUMN_STRUTTURA_STR_ID = 4;

	/** 
	 * Index of column dati_estra_id
	 */
	protected static final int COLUMN_DATI_ESTRA_ID = 5;

	/** 
	 * Index of column str_abit_privata
	 */
	protected static final int COLUMN_STR_ABIT_PRIVATA = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column dati_estra_id
	 */
	protected static final int PK_COLUMN_DATI_ESTRA_ID = 1;

	/** 
	 * Inserts a new row in the struttura_dati_extra table.
	 */
	public StrutturaDatiExtraPk insert(StrutturaDatiExtra dto) throws StrutturaDatiExtraDaoException
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
				dto.setDatiEstraId( rs.getLong( 1 ) );
				rs.close();
				stmt.close();
			}
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setDate(index++, dto.getStrDataInizioAttivita()==null ? null : new java.sql.Date( dto.getStrDataInizioAttivita().getTime() ) );
			stmt.setDate(index++, dto.getStrDataCostruzione()==null ? null : new java.sql.Date( dto.getStrDataCostruzione().getTime() ) );
			stmt.setDate(index++, dto.getStrDataUltimaRistr()==null ? null : new java.sql.Date( dto.getStrDataUltimaRistr().getTime() ) );
			stmt.setLong( index++, dto.getStrutturaStrId() );
			stmt.setLong( index++, dto.getDatiEstraId() );
			stmt.setString( index++, dto.getStrAbitPrivata() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrutturaDatiExtraDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the struttura_dati_extra table.
	 */
	public void update(StrutturaDatiExtraPk pk, StrutturaDatiExtra dto) throws StrutturaDatiExtraDaoException
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
			stmt.setDate(index++, dto.getStrDataInizioAttivita()==null ? null : new java.sql.Date( dto.getStrDataInizioAttivita().getTime() ) );
			stmt.setDate(index++, dto.getStrDataCostruzione()==null ? null : new java.sql.Date( dto.getStrDataCostruzione().getTime() ) );
			stmt.setDate(index++, dto.getStrDataUltimaRistr()==null ? null : new java.sql.Date( dto.getStrDataUltimaRistr().getTime() ) );
			stmt.setLong( index++, dto.getStrutturaStrId() );
			stmt.setLong( index++, dto.getDatiEstraId() );
			stmt.setString( index++, dto.getStrAbitPrivata() );
			stmt.setLong( 7, pk.getDatiEstraId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrutturaDatiExtraDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the struttura_dati_extra table.
	 */
	public void delete(StrutturaDatiExtraPk pk) throws StrutturaDatiExtraDaoException
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
			stmt.setLong( 1, pk.getDatiEstraId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrutturaDatiExtraDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the struttura_dati_extra table that matches the specified primary-key value.
	 */
	public StrutturaDatiExtra findByPrimaryKey(StrutturaDatiExtraPk pk) throws StrutturaDatiExtraDaoException
	{
		return findByPrimaryKey( pk.getDatiEstraId() );
	}

	/** 
	 * Returns all rows from the struttura_dati_extra table that match the criteria 'dati_estra_id = :datiEstraId'.
	 */
	public StrutturaDatiExtra findByPrimaryKey(long datiEstraId) throws StrutturaDatiExtraDaoException
	{
		StrutturaDatiExtra ret[] = findByDynamicSelect( SQL_SELECT + " WHERE dati_estra_id = ?", new Object[] {  new Long(datiEstraId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the struttura_dati_extra table that match the criteria ''.
	 */
	public StrutturaDatiExtra[] findAll() throws StrutturaDatiExtraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY dati_estra_id", null );
	}

	/** 
	 * Returns all rows from the struttura_dati_extra table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaDatiExtra[] findByStruttura(long strutturaStrId) throws StrutturaDatiExtraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE struttura_str_id = ?", new Object[] {  new Long(strutturaStrId) } );
	}

	/** 
	 * Returns all rows from the struttura_dati_extra table that match the criteria 'str_data_inizio_attivita = :strDataInizioAttivita'.
	 */
	public StrutturaDatiExtra[] findWhereStrDataInizioAttivitaEquals(Date strDataInizioAttivita) throws StrutturaDatiExtraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE str_data_inizio_attivita = ? ORDER BY str_data_inizio_attivita", new Object[] { strDataInizioAttivita==null ? null : new java.sql.Date( strDataInizioAttivita.getTime() ) } );
	}

	/** 
	 * Returns all rows from the struttura_dati_extra table that match the criteria 'str_data_costruzione = :strDataCostruzione'.
	 */
	public StrutturaDatiExtra[] findWhereStrDataCostruzioneEquals(Date strDataCostruzione) throws StrutturaDatiExtraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE str_data_costruzione = ? ORDER BY str_data_costruzione", new Object[] { strDataCostruzione==null ? null : new java.sql.Date( strDataCostruzione.getTime() ) } );
	}

	/** 
	 * Returns all rows from the struttura_dati_extra table that match the criteria 'str_data_ultima_ristr = :strDataUltimaRistr'.
	 */
	public StrutturaDatiExtra[] findWhereStrDataUltimaRistrEquals(Date strDataUltimaRistr) throws StrutturaDatiExtraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE str_data_ultima_ristr = ? ORDER BY str_data_ultima_ristr", new Object[] { strDataUltimaRistr==null ? null : new java.sql.Date( strDataUltimaRistr.getTime() ) } );
	}

	/** 
	 * Returns all rows from the struttura_dati_extra table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaDatiExtra[] findWhereStrutturaStrIdEquals(long strutturaStrId) throws StrutturaDatiExtraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE struttura_str_id = ? ORDER BY struttura_str_id", new Object[] {  new Long(strutturaStrId) } );
	}

	/** 
	 * Returns all rows from the struttura_dati_extra table that match the criteria 'dati_estra_id = :datiEstraId'.
	 */
	public StrutturaDatiExtra[] findWhereDatiEstraIdEquals(long datiEstraId) throws StrutturaDatiExtraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE dati_estra_id = ? ORDER BY dati_estra_id", new Object[] {  new Long(datiEstraId) } );
	}

	/** 
	 * Returns all rows from the struttura_dati_extra table that match the criteria 'str_abit_privata = :strAbitPrivata'.
	 */
	public StrutturaDatiExtra[] findWhereStrAbitPrivataEquals(String strAbitPrivata) throws StrutturaDatiExtraDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE str_abit_privata = ? ORDER BY str_abit_privata", new Object[] { strAbitPrivata } );
	}

	/**
	 * Method 'StrutturaDatiExtraDaoImpl'
	 * 
	 */
	public StrutturaDatiExtraDaoImpl()
	{
	}

	/**
	 * Method 'StrutturaDatiExtraDaoImpl'
	 * 
	 * @param userConn
	 */
	public StrutturaDatiExtraDaoImpl(final java.sql.Connection userConn)
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
		return "struttura_dati_extra";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected StrutturaDatiExtra fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			StrutturaDatiExtra dto = new StrutturaDatiExtra();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected StrutturaDatiExtra[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			StrutturaDatiExtra dto = new StrutturaDatiExtra();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		StrutturaDatiExtra ret[] = new StrutturaDatiExtra[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(StrutturaDatiExtra dto, ResultSet rs) throws SQLException
	{
		dto.setStrDataInizioAttivita( rs.getDate(COLUMN_STR_DATA_INIZIO_ATTIVITA ) );
		dto.setStrDataCostruzione( rs.getDate(COLUMN_STR_DATA_COSTRUZIONE ) );
		dto.setStrDataUltimaRistr( rs.getDate(COLUMN_STR_DATA_ULTIMA_RISTR ) );
		dto.setStrutturaStrId( rs.getLong( COLUMN_STRUTTURA_STR_ID ) );
		dto.setDatiEstraId( rs.getLong( COLUMN_DATI_ESTRA_ID ) );
		dto.setStrAbitPrivata( rs.getString( COLUMN_STR_ABIT_PRIVATA ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(StrutturaDatiExtra dto)
	{
	}

	/** 
	 * Returns all rows from the struttura_dati_extra table that match the specified arbitrary SQL statement
	 */
	public StrutturaDatiExtra[] findByDynamicSelect(String sql, Object[] sqlParams) throws StrutturaDatiExtraDaoException
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
			throw new StrutturaDatiExtraDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the struttura_dati_extra table that match the specified arbitrary SQL statement
	 */
	public StrutturaDatiExtra[] findByDynamicWhere(String sql, Object[] sqlParams) throws StrutturaDatiExtraDaoException
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
			throw new StrutturaDatiExtraDaoException( "Exception: " + _e.getMessage(), _e );
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