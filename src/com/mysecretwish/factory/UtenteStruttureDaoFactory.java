/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mysecretwish.factory;

import java.sql.Connection;
import com.mysecretwish.dao.*;
import com.mysecretwish.jdbc.*;

public class UtenteStruttureDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return UtenteStruttureDao
	 */
	public static UtenteStruttureDao create()
	{
		return new UtenteStruttureDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return UtenteStruttureDao
	 */
	public static UtenteStruttureDao create(Connection conn)
	{
		return new UtenteStruttureDaoImpl( conn );
	}

}
