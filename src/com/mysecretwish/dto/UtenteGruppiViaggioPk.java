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
 * This class represents the primary key of the utente_gruppi_viaggio table.
 */
public class UtenteGruppiViaggioPk implements Serializable
{
	protected long ugvId;

	/** 
	 * This attribute represents whether the primitive attribute ugvId is null.
	 */
	protected boolean ugvIdNull;

	/** 
	 * Sets the value of ugvId
	 */
	public void setUgvId(long ugvId)
	{
		this.ugvId = ugvId;
	}

	/** 
	 * Gets the value of ugvId
	 */
	public long getUgvId()
	{
		return ugvId;
	}

	/**
	 * Method 'UtenteGruppiViaggioPk'
	 * 
	 */
	public UtenteGruppiViaggioPk()
	{
	}

	/**
	 * Method 'UtenteGruppiViaggioPk'
	 * 
	 * @param ugvId
	 */
	public UtenteGruppiViaggioPk(final long ugvId)
	{
		this.ugvId = ugvId;
	}

	/** 
	 * Sets the value of ugvIdNull
	 */
	public void setUgvIdNull(boolean ugvIdNull)
	{
		this.ugvIdNull = ugvIdNull;
	}

	/** 
	 * Gets the value of ugvIdNull
	 */
	public boolean isUgvIdNull()
	{
		return ugvIdNull;
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
		
		if (!(_other instanceof UtenteGruppiViaggioPk)) {
			return false;
		}
		
		final UtenteGruppiViaggioPk _cast = (UtenteGruppiViaggioPk) _other;
		if (ugvId != _cast.ugvId) {
			return false;
		}
		
		if (ugvIdNull != _cast.ugvIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (ugvId ^ (ugvId >>> 32));
		_hashCode = 29 * _hashCode + (ugvIdNull ? 1 : 0);
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
		ret.append( "com.mysecretwish.dto.UtenteGruppiViaggioPk: " );
		ret.append( "ugvId=" + ugvId );
		return ret.toString();
	}

}
