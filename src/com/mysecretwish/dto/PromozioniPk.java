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
 * This class represents the primary key of the promozioni table.
 */
public class PromozioniPk implements Serializable
{
	protected long proId;

	/** 
	 * This attribute represents whether the primitive attribute proId is null.
	 */
	protected boolean proIdNull;

	/** 
	 * Sets the value of proId
	 */
	public void setProId(long proId)
	{
		this.proId = proId;
	}

	/** 
	 * Gets the value of proId
	 */
	public long getProId()
	{
		return proId;
	}

	/**
	 * Method 'PromozioniPk'
	 * 
	 */
	public PromozioniPk()
	{
	}

	/**
	 * Method 'PromozioniPk'
	 * 
	 * @param proId
	 */
	public PromozioniPk(final long proId)
	{
		this.proId = proId;
	}

	/** 
	 * Sets the value of proIdNull
	 */
	public void setProIdNull(boolean proIdNull)
	{
		this.proIdNull = proIdNull;
	}

	/** 
	 * Gets the value of proIdNull
	 */
	public boolean isProIdNull()
	{
		return proIdNull;
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
		
		if (!(_other instanceof PromozioniPk)) {
			return false;
		}
		
		final PromozioniPk _cast = (PromozioniPk) _other;
		if (proId != _cast.proId) {
			return false;
		}
		
		if (proIdNull != _cast.proIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (proId ^ (proId >>> 32));
		_hashCode = 29 * _hashCode + (proIdNull ? 1 : 0);
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
		ret.append( "com.mysecretwish.dto.PromozioniPk: " );
		ret.append( "proId=" + proId );
		return ret.toString();
	}

}
