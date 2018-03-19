/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mysecretwish.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the camere_bagni table.
 */
public class CamereBagniPk implements Serializable
{
	protected long scbId;

	/** 
	 * This attribute represents whether the primitive attribute scbId is null.
	 */
	protected boolean scbIdNull;

	/** 
	 * Sets the value of scbId
	 */
	public void setScbId(long scbId)
	{
		this.scbId = scbId;
	}

	/** 
	 * Gets the value of scbId
	 */
	public long getScbId()
	{
		return scbId;
	}

	/**
	 * Method 'CamereBagniPk'
	 * 
	 */
	public CamereBagniPk()
	{
	}

	/**
	 * Method 'CamereBagniPk'
	 * 
	 * @param scbId
	 */
	public CamereBagniPk(final long scbId)
	{
		this.scbId = scbId;
	}

	/** 
	 * Sets the value of scbIdNull
	 */
	public void setScbIdNull(boolean scbIdNull)
	{
		this.scbIdNull = scbIdNull;
	}

	/** 
	 * Gets the value of scbIdNull
	 */
	public boolean isScbIdNull()
	{
		return scbIdNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof CamereBagniPk)) {
			return false;
		}
		
		final CamereBagniPk _cast = (CamereBagniPk) _other;
		if (scbId != _cast.scbId) {
			return false;
		}
		
		if (scbIdNull != _cast.scbIdNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + (int) (scbId ^ (scbId >>> 32));
		_hashCode = 29 * _hashCode + (scbIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.CamereBagniPk: " );
		ret.append( "scbId=" + scbId );
		return ret.toString();
	}

}