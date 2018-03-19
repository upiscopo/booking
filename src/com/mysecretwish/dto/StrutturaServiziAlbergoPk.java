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
 * This class represents the primary key of the struttura_servizi_albergo table.
 */
public class StrutturaServiziAlbergoPk implements Serializable
{
	protected long ssaId;

	/** 
	 * This attribute represents whether the primitive attribute ssaId is null.
	 */
	protected boolean ssaIdNull;

	/** 
	 * Sets the value of ssaId
	 */
	public void setSsaId(long ssaId)
	{
		this.ssaId = ssaId;
	}

	/** 
	 * Gets the value of ssaId
	 */
	public long getSsaId()
	{
		return ssaId;
	}

	/**
	 * Method 'StrutturaServiziAlbergoPk'
	 * 
	 */
	public StrutturaServiziAlbergoPk()
	{
	}

	/**
	 * Method 'StrutturaServiziAlbergoPk'
	 * 
	 * @param ssaId
	 */
	public StrutturaServiziAlbergoPk(final long ssaId)
	{
		this.ssaId = ssaId;
	}

	/** 
	 * Sets the value of ssaIdNull
	 */
	public void setSsaIdNull(boolean ssaIdNull)
	{
		this.ssaIdNull = ssaIdNull;
	}

	/** 
	 * Gets the value of ssaIdNull
	 */
	public boolean isSsaIdNull()
	{
		return ssaIdNull;
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
		
		if (!(_other instanceof StrutturaServiziAlbergoPk)) {
			return false;
		}
		
		final StrutturaServiziAlbergoPk _cast = (StrutturaServiziAlbergoPk) _other;
		if (ssaId != _cast.ssaId) {
			return false;
		}
		
		if (ssaIdNull != _cast.ssaIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (ssaId ^ (ssaId >>> 32));
		_hashCode = 29 * _hashCode + (ssaIdNull ? 1 : 0);
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
		ret.append( "com.mysecretwish.dto.StrutturaServiziAlbergoPk: " );
		ret.append( "ssaId=" + ssaId );
		return ret.toString();
	}

}
