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
 * This class represents the primary key of the struttura_restrizioni table.
 */
public class StrutturaRestrizioniPk implements Serializable
{
	protected long resId;

	/** 
	 * This attribute represents whether the primitive attribute resId is null.
	 */
	protected boolean resIdNull;

	/** 
	 * Sets the value of resId
	 */
	public void setResId(long resId)
	{
		this.resId = resId;
	}

	/** 
	 * Gets the value of resId
	 */
	public long getResId()
	{
		return resId;
	}

	/**
	 * Method 'StrutturaRestrizioniPk'
	 * 
	 */
	public StrutturaRestrizioniPk()
	{
	}

	/**
	 * Method 'StrutturaRestrizioniPk'
	 * 
	 * @param resId
	 */
	public StrutturaRestrizioniPk(final long resId)
	{
		this.resId = resId;
	}

	/** 
	 * Sets the value of resIdNull
	 */
	public void setResIdNull(boolean resIdNull)
	{
		this.resIdNull = resIdNull;
	}

	/** 
	 * Gets the value of resIdNull
	 */
	public boolean isResIdNull()
	{
		return resIdNull;
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
		
		if (!(_other instanceof StrutturaRestrizioniPk)) {
			return false;
		}
		
		final StrutturaRestrizioniPk _cast = (StrutturaRestrizioniPk) _other;
		if (resId != _cast.resId) {
			return false;
		}
		
		if (resIdNull != _cast.resIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (resId ^ (resId >>> 32));
		_hashCode = 29 * _hashCode + (resIdNull ? 1 : 0);
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
		ret.append( "com.mysecretwish.dto.StrutturaRestrizioniPk: " );
		ret.append( "resId=" + resId );
		return ret.toString();
	}

}
