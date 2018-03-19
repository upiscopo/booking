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
 * This class represents the primary key of the struttura_accoglienza table.
 */
public class StrutturaAccoglienzaPk implements Serializable
{
	protected long sacId;

	/** 
	 * This attribute represents whether the primitive attribute sacId is null.
	 */
	protected boolean sacIdNull;

	/** 
	 * Sets the value of sacId
	 */
	public void setSacId(long sacId)
	{
		this.sacId = sacId;
	}

	/** 
	 * Gets the value of sacId
	 */
	public long getSacId()
	{
		return sacId;
	}

	/**
	 * Method 'StrutturaAccoglienzaPk'
	 * 
	 */
	public StrutturaAccoglienzaPk()
	{
	}

	/**
	 * Method 'StrutturaAccoglienzaPk'
	 * 
	 * @param sacId
	 */
	public StrutturaAccoglienzaPk(final long sacId)
	{
		this.sacId = sacId;
	}

	/** 
	 * Sets the value of sacIdNull
	 */
	public void setSacIdNull(boolean sacIdNull)
	{
		this.sacIdNull = sacIdNull;
	}

	/** 
	 * Gets the value of sacIdNull
	 */
	public boolean isSacIdNull()
	{
		return sacIdNull;
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
		
		if (!(_other instanceof StrutturaAccoglienzaPk)) {
			return false;
		}
		
		final StrutturaAccoglienzaPk _cast = (StrutturaAccoglienzaPk) _other;
		if (sacId != _cast.sacId) {
			return false;
		}
		
		if (sacIdNull != _cast.sacIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (sacId ^ (sacId >>> 32));
		_hashCode = 29 * _hashCode + (sacIdNull ? 1 : 0);
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
		ret.append( "com.mysecretwish.dto.StrutturaAccoglienzaPk: " );
		ret.append( "sacId=" + sacId );
		return ret.toString();
	}

}
