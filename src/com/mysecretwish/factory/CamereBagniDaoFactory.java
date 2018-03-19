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

public class CamereBagniDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return CamereBagniDao
	 */
	public static CamereBagniDao create()
	{
		return new CamereBagniDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return CamereBagniDao
	 */
	public static CamereBagniDao create(Connection conn)
	{
		return new CamereBagniDaoImpl( conn );
	}

}
