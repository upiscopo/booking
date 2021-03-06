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
 * This class represents the primary key of the struttura_cond_altre table.
 */
public class StrutturaCondAltrePk implements Serializable
{
	protected long scaId;

	/** 
	 * This attribute represents whether the primitive attribute scaId is null.
	 */
	protected boolean scaIdNull;

	/** 
	 * Sets the value of scaId
	 */
	public void setScaId(long scaId)
	{
		this.scaId = scaId;
	}

	/** 
	 * Gets the value of scaId
	 */
	public long getScaId()
	{
		return scaId;
	}

	/**
	 * Method 'StrutturaCondAltrePk'
	 * 
	 */
	public StrutturaCondAltrePk()
	{
	}

	/**
	 * Method 'StrutturaCondAltrePk'
	 * 
	 * @param scaId
	 */
	public StrutturaCondAltrePk(final long scaId)
	{
		this.scaId = scaId;
	}

	/** 
	 * Sets the value of scaIdNull
	 */
	public void setScaIdNull(boolean scaIdNull)
	{
		this.scaIdNull = scaIdNull;
	}

	/** 
	 * Gets the value of scaIdNull
	 */
	public boolean isScaIdNull()
	{
		return scaIdNull;
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
		
		if (!(_other instanceof StrutturaCondAltrePk)) {
			return false;
		}
		
		final StrutturaCondAltrePk _cast = (StrutturaCondAltrePk) _other;
		if (scaId != _cast.scaId) {
			return false;
		}
		
		if (scaIdNull != _cast.scaIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (scaId ^ (scaId >>> 32));
		_hashCode = 29 * _hashCode + (scaIdNull ? 1 : 0);
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
		ret.append( "com.mysecretwish.dto.StrutturaCondAltrePk: " );
		ret.append( "scaId=" + scaId );
		return ret.toString();
	}

}
