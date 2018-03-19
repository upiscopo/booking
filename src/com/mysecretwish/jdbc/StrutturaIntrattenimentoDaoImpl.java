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

public class StrutturaIntrattenimentoDaoImpl extends AbstractDAO implements StrutturaIntrattenimentoDao
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
	protected final String SQL_SELECT = "SELECT sin_id, sin_giochi_tav, sin_libri, sin_area_gio_coperto, sin_area_gio_aperto, sin_canc_sicurezza, sin_tv_bambini, sin_passeggini, struttura_str_id FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( sin_id, sin_giochi_tav, sin_libri, sin_area_gio_coperto, sin_area_gio_aperto, sin_canc_sicurezza, sin_tv_bambini, sin_passeggini, struttura_str_id ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET sin_id = ?, sin_giochi_tav = ?, sin_libri = ?, sin_area_gio_coperto = ?, sin_area_gio_aperto = ?, sin_canc_sicurezza = ?, sin_tv_bambini = ?, sin_passeggini = ?, struttura_str_id = ? WHERE sin_id = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE sin_id = ?";

	/** 
	 * Index of column sin_id
	 */
	protected static final int COLUMN_SIN_ID = 1;

	/** 
	 * Index of column sin_giochi_tav
	 */
	protected static final int COLUMN_SIN_GIOCHI_TAV = 2;

	/** 
	 * Index of column sin_libri
	 */
	protected static final int COLUMN_SIN_LIBRI = 3;

	/** 
	 * Index of column sin_area_gio_coperto
	 */
	protected static final int COLUMN_SIN_AREA_GIO_COPERTO = 4;

	/** 
	 * Index of column sin_area_gio_aperto
	 */
	protected static final int COLUMN_SIN_AREA_GIO_APERTO = 5;

	/** 
	 * Index of column sin_canc_sicurezza
	 */
	protected static final int COLUMN_SIN_CANC_SICUREZZA = 6;

	/** 
	 * Index of column sin_tv_bambini
	 */
	protected static final int COLUMN_SIN_TV_BAMBINI = 7;

	/** 
	 * Index of column sin_passeggini
	 */
	protected static final int COLUMN_SIN_PASSEGGINI = 8;

	/** 
	 * Index of column struttura_str_id
	 */
	protected static final int COLUMN_STRUTTURA_STR_ID = 9;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 9;

	/** 
	 * Index of primary-key column sin_id
	 */
	protected static final int PK_COLUMN_SIN_ID = 1;

	/** 
	 * Inserts a new row in the struttura_intrattenimento table.
	 */
	public StrutturaIntrattenimentoPk insert(StrutturaIntrattenimento dto) throws StrutturaIntrattenimentoDaoException
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
				dto.setSinId( rs.getLong( 1 ) );
				rs.close();
				stmt.close();
			}
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setLong( index++, dto.getSinId() );
			stmt.setString( index++, dto.getSinGiochiTav() );
			stmt.setString( index++, dto.getSinLibri() );
			stmt.setString( index++, dto.getSinAreaGioCoperto() );
			stmt.setString( index++, dto.getSinAreaGioAperto() );
			stmt.setString( index++, dto.getSinCancSicurezza() );
			stmt.setString( index++, dto.getSinTvBambini() );
			stmt.setString( index++, dto.getSinPasseggini() );
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
			throw new StrutturaIntrattenimentoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the struttura_intrattenimento table.
	 */
	public void update(StrutturaIntrattenimentoPk pk, StrutturaIntrattenimento dto) throws StrutturaIntrattenimentoDaoException
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
			stmt.setLong( index++, dto.getSinId() );
			stmt.setString( index++, dto.getSinGiochiTav() );
			stmt.setString( index++, dto.getSinLibri() );
			stmt.setString( index++, dto.getSinAreaGioCoperto() );
			stmt.setString( index++, dto.getSinAreaGioAperto() );
			stmt.setString( index++, dto.getSinCancSicurezza() );
			stmt.setString( index++, dto.getSinTvBambini() );
			stmt.setString( index++, dto.getSinPasseggini() );
			stmt.setLong( index++, dto.getStrutturaStrId() );
			stmt.setLong( 10, pk.getSinId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrutturaIntrattenimentoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the struttura_intrattenimento table.
	 */
	public void delete(StrutturaIntrattenimentoPk pk) throws StrutturaIntrattenimentoDaoException
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
			stmt.setLong( 1, pk.getSinId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new StrutturaIntrattenimentoDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the struttura_intrattenimento table that matches the specified primary-key value.
	 */
	public StrutturaIntrattenimento findByPrimaryKey(StrutturaIntrattenimentoPk pk) throws StrutturaIntrattenimentoDaoException
	{
		return findByPrimaryKey( pk.getSinId() );
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria 'sin_id = :sinId'.
	 */
	public StrutturaIntrattenimento findByPrimaryKey(long sinId) throws StrutturaIntrattenimentoDaoException
	{
		StrutturaIntrattenimento ret[] = findByDynamicSelect( SQL_SELECT + " WHERE sin_id = ?", new Object[] {  new Long(sinId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria ''.
	 */
	public StrutturaIntrattenimento[] findAll() throws StrutturaIntrattenimentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY sin_id", null );
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaIntrattenimento[] findByStruttura(long strutturaStrId) throws StrutturaIntrattenimentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE struttura_str_id = ?", new Object[] {  new Long(strutturaStrId) } );
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria 'sin_id = :sinId'.
	 */
	public StrutturaIntrattenimento[] findWhereSinIdEquals(long sinId) throws StrutturaIntrattenimentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sin_id = ? ORDER BY sin_id", new Object[] {  new Long(sinId) } );
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria 'sin_giochi_tav = :sinGiochiTav'.
	 */
	public StrutturaIntrattenimento[] findWhereSinGiochiTavEquals(String sinGiochiTav) throws StrutturaIntrattenimentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sin_giochi_tav = ? ORDER BY sin_giochi_tav", new Object[] { sinGiochiTav } );
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria 'sin_libri = :sinLibri'.
	 */
	public StrutturaIntrattenimento[] findWhereSinLibriEquals(String sinLibri) throws StrutturaIntrattenimentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sin_libri = ? ORDER BY sin_libri", new Object[] { sinLibri } );
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria 'sin_area_gio_coperto = :sinAreaGioCoperto'.
	 */
	public StrutturaIntrattenimento[] findWhereSinAreaGioCopertoEquals(String sinAreaGioCoperto) throws StrutturaIntrattenimentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sin_area_gio_coperto = ? ORDER BY sin_area_gio_coperto", new Object[] { sinAreaGioCoperto } );
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria 'sin_area_gio_aperto = :sinAreaGioAperto'.
	 */
	public StrutturaIntrattenimento[] findWhereSinAreaGioApertoEquals(String sinAreaGioAperto) throws StrutturaIntrattenimentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sin_area_gio_aperto = ? ORDER BY sin_area_gio_aperto", new Object[] { sinAreaGioAperto } );
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria 'sin_canc_sicurezza = :sinCancSicurezza'.
	 */
	public StrutturaIntrattenimento[] findWhereSinCancSicurezzaEquals(String sinCancSicurezza) throws StrutturaIntrattenimentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sin_canc_sicurezza = ? ORDER BY sin_canc_sicurezza", new Object[] { sinCancSicurezza } );
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria 'sin_tv_bambini = :sinTvBambini'.
	 */
	public StrutturaIntrattenimento[] findWhereSinTvBambiniEquals(String sinTvBambini) throws StrutturaIntrattenimentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sin_tv_bambini = ? ORDER BY sin_tv_bambini", new Object[] { sinTvBambini } );
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria 'sin_passeggini = :sinPasseggini'.
	 */
	public StrutturaIntrattenimento[] findWhereSinPassegginiEquals(String sinPasseggini) throws StrutturaIntrattenimentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE sin_passeggini = ? ORDER BY sin_passeggini", new Object[] { sinPasseggini } );
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the criteria 'struttura_str_id = :strutturaStrId'.
	 */
	public StrutturaIntrattenimento[] findWhereStrutturaStrIdEquals(long strutturaStrId) throws StrutturaIntrattenimentoDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE struttura_str_id = ? ORDER BY struttura_str_id", new Object[] {  new Long(strutturaStrId) } );
	}

	/**
	 * Method 'StrutturaIntrattenimentoDaoImpl'
	 * 
	 */
	public StrutturaIntrattenimentoDaoImpl()
	{
	}

	/**
	 * Method 'StrutturaIntrattenimentoDaoImpl'
	 * 
	 * @param userConn
	 */
	public StrutturaIntrattenimentoDaoImpl(final java.sql.Connection userConn)
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
		return "struttura_intrattenimento";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected StrutturaIntrattenimento fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			StrutturaIntrattenimento dto = new StrutturaIntrattenimento();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected StrutturaIntrattenimento[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			StrutturaIntrattenimento dto = new StrutturaIntrattenimento();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		StrutturaIntrattenimento ret[] = new StrutturaIntrattenimento[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(StrutturaIntrattenimento dto, ResultSet rs) throws SQLException
	{
		dto.setSinId( rs.getLong( COLUMN_SIN_ID ) );
		dto.setSinGiochiTav( rs.getString( COLUMN_SIN_GIOCHI_TAV ) );
		dto.setSinLibri( rs.getString( COLUMN_SIN_LIBRI ) );
		dto.setSinAreaGioCoperto( rs.getString( COLUMN_SIN_AREA_GIO_COPERTO ) );
		dto.setSinAreaGioAperto( rs.getString( COLUMN_SIN_AREA_GIO_APERTO ) );
		dto.setSinCancSicurezza( rs.getString( COLUMN_SIN_CANC_SICUREZZA ) );
		dto.setSinTvBambini( rs.getString( COLUMN_SIN_TV_BAMBINI ) );
		dto.setSinPasseggini( rs.getString( COLUMN_SIN_PASSEGGINI ) );
		dto.setStrutturaStrId( rs.getLong( COLUMN_STRUTTURA_STR_ID ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(StrutturaIntrattenimento dto)
	{
	}

	/** 
	 * Returns all rows from the struttura_intrattenimento table that match the specified arbitrary SQL statement
	 */
	public StrutturaIntrattenimento[] findByDynamicSelect(String sql, Object[] sqlParams) throws StrutturaIntrattenimentoDaoException
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
			throw new StrutturaIntrattenimentoDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the struttura_intrattenimento table that match the specified arbitrary SQL statement
	 */
	public StrutturaIntrattenimento[] findByDynamicWhere(String sql, Object[] sqlParams) throws StrutturaIntrattenimentoDaoException
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
			throw new StrutturaIntrattenimentoDaoException( "Exception: " + _e.getMessage(), _e );
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
