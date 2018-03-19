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
 * This class represents the primary key of the comuni table.
 */
public class ComuniPk implements Serializable
{
	protected long comId;

	/** 
	 * This attribute represents whether the primitive attribute comId is null.
	 */
	protected boolean comIdNull;

	/** 
	 * Sets the value of comId
	 */
	public void setComId(long comId)
	{
		this.comId = comId;
	}

	/** 
	 * Gets the value of comId
	 */
	public long getComId()
	{
		return comId;
	}

	/**
	 * Method 'ComuniPk'
	 * 
	 */
	public ComuniPk()
	{
	}

	/**
	 * Method 'ComuniPk'
	 * 
	 * @param comId
	 */
	public ComuniPk(final long comId)
	{
		this.comId = comId;
	}

	/** 
	 * Sets the value of comIdNull
	 */
	public void setComIdNull(boolean comIdNull)
	{
		this.comIdNull = comIdNull;
	}

	/** 
	 * Gets the value of comIdNull
	 */
	public boolean isComIdNull()
	{
		return comIdNull;
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
		
		if (!(_other instanceof ComuniPk)) {
			return false;
		}
		
		final ComuniPk _cast = (ComuniPk) _other;
		if (comId != _cast.comId) {
			return false;
		}
		
		if (comIdNull != _cast.comIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (comId ^ (comId >>> 32));
		_hashCode = 29 * _hashCode + (comIdNull ? 1 : 0);
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
		ret.append( "com.mysecretwish.dto.ComuniPk: " );
		ret.append( "comId=" + comId );
		return ret.toString();
	}

}
