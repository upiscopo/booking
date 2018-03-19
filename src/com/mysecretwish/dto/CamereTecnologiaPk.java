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
 * This class represents the primary key of the camere_tecnologia table.
 */
public class CamereTecnologiaPk implements Serializable
{
	protected long sctId;

	/** 
	 * This attribute represents whether the primitive attribute sctId is null.
	 */
	protected boolean sctIdNull;

	/** 
	 * Sets the value of sctId
	 */
	public void setSctId(long sctId)
	{
		this.sctId = sctId;
	}

	/** 
	 * Gets the value of sctId
	 */
	public long getSctId()
	{
		return sctId;
	}

	/**
	 * Method 'CamereTecnologiaPk'
	 * 
	 */
	public CamereTecnologiaPk()
	{
	}

	/**
	 * Method 'CamereTecnologiaPk'
	 * 
	 * @param sctId
	 */
	public CamereTecnologiaPk(final long sctId)
	{
		this.sctId = sctId;
	}

	/** 
	 * Sets the value of sctIdNull
	 */
	public void setSctIdNull(boolean sctIdNull)
	{
		this.sctIdNull = sctIdNull;
	}

	/** 
	 * Gets the value of sctIdNull
	 */
	public boolean isSctIdNull()
	{
		return sctIdNull;
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
		
		if (!(_other instanceof CamereTecnologiaPk)) {
			return false;
		}
		
		final CamereTecnologiaPk _cast = (CamereTecnologiaPk) _other;
		if (sctId != _cast.sctId) {
			return false;
		}
		
		if (sctIdNull != _cast.sctIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (sctId ^ (sctId >>> 32));
		_hashCode = 29 * _hashCode + (sctIdNull ? 1 : 0);
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
		ret.append( "com.mysecretwish.dto.CamereTecnologiaPk: " );
		ret.append( "sctId=" + sctId );
		return ret.toString();
	}

}
