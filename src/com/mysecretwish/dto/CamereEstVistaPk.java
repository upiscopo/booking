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
 * This class represents the primary key of the camere_est_vista table.
 */
public class CamereEstVistaPk implements Serializable
{
	protected long sceId;

	/** 
	 * This attribute represents whether the primitive attribute sceId is null.
	 */
	protected boolean sceIdNull;

	/** 
	 * Sets the value of sceId
	 */
	public void setSceId(long sceId)
	{
		this.sceId = sceId;
	}

	/** 
	 * Gets the value of sceId
	 */
	public long getSceId()
	{
		return sceId;
	}

	/**
	 * Method 'CamereEstVistaPk'
	 * 
	 */
	public CamereEstVistaPk()
	{
	}

	/**
	 * Method 'CamereEstVistaPk'
	 * 
	 * @param sceId
	 */
	public CamereEstVistaPk(final long sceId)
	{
		this.sceId = sceId;
	}

	/** 
	 * Sets the value of sceIdNull
	 */
	public void setSceIdNull(boolean sceIdNull)
	{
		this.sceIdNull = sceIdNull;
	}

	/** 
	 * Gets the value of sceIdNull
	 */
	public boolean isSceIdNull()
	{
		return sceIdNull;
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
		
		if (!(_other instanceof CamereEstVistaPk)) {
			return false;
		}
		
		final CamereEstVistaPk _cast = (CamereEstVistaPk) _other;
		if (sceId != _cast.sceId) {
			return false;
		}
		
		if (sceIdNull != _cast.sceIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (sceId ^ (sceId >>> 32));
		_hashCode = 29 * _hashCode + (sceIdNull ? 1 : 0);
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
		ret.append( "com.mysecretwish.dto.CamereEstVistaPk: " );
		ret.append( "sceId=" + sceId );
		return ret.toString();
	}

}
