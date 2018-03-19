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
 * This class represents the primary key of the tipologia_struttura table.
 */
public class TipologiaStrutturaPk implements Serializable
{
	protected long id;

	/** 
	 * This attribute represents whether the primitive attribute id is null.
	 */
	protected boolean idNull;

	/** 
	 * Sets the value of id
	 */
	public void setId(long id)
	{
		this.id = id;
	}

	/** 
	 * Gets the value of id
	 */
	public long getId()
	{
		return id;
	}

	/**
	 * Method 'TipologiaStrutturaPk'
	 * 
	 */
	public TipologiaStrutturaPk()
	{
	}

	/**
	 * Method 'TipologiaStrutturaPk'
	 * 
	 * @param id
	 */
	public TipologiaStrutturaPk(final long id)
	{
		this.id = id;
	}

	/** 
	 * Sets the value of idNull
	 */
	public void setIdNull(boolean idNull)
	{
		this.idNull = idNull;
	}

	/** 
	 * Gets the value of idNull
	 */
	public boolean isIdNull()
	{
		return idNull;
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
		
		if (!(_other instanceof TipologiaStrutturaPk)) {
			return false;
		}
		
		final TipologiaStrutturaPk _cast = (TipologiaStrutturaPk) _other;
		if (id != _cast.id) {
			return false;
		}
		
		if (idNull != _cast.idNull) {
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
		_hashCode = 29 * _hashCode + (int) (id ^ (id >>> 32));
		_hashCode = 29 * _hashCode + (idNull ? 1 : 0);
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
		ret.append( "com.mysecretwish.dto.TipologiaStrutturaPk: " );
		ret.append( "id=" + id );
		return ret.toString();
	}

}
