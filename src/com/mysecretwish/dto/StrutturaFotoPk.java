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
 * This class represents the primary key of the struttura_foto table.
 */
public class StrutturaFotoPk implements Serializable
{
	protected long fotoId;

	/** 
	 * This attribute represents whether the primitive attribute fotoId is null.
	 */
	protected boolean fotoIdNull;

	/** 
	 * Sets the value of fotoId
	 */
	public void setFotoId(long fotoId)
	{
		this.fotoId = fotoId;
	}

	/** 
	 * Gets the value of fotoId
	 */
	public long getFotoId()
	{
		return fotoId;
	}

	/**
	 * Method 'StrutturaFotoPk'
	 * 
	 */
	public StrutturaFotoPk()
	{
	}

	/**
	 * Method 'StrutturaFotoPk'
	 * 
	 * @param fotoId
	 */
	public StrutturaFotoPk(final long fotoId)
	{
		this.fotoId = fotoId;
	}

	/** 
	 * Sets the value of fotoIdNull
	 */
	public void setFotoIdNull(boolean fotoIdNull)
	{
		this.fotoIdNull = fotoIdNull;
	}

	/** 
	 * Gets the value of fotoIdNull
	 */
	public boolean isFotoIdNull()
	{
		return fotoIdNull;
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
		
		if (!(_other instanceof StrutturaFotoPk)) {
			return false;
		}
		
		final StrutturaFotoPk _cast = (StrutturaFotoPk) _other;
		if (fotoId != _cast.fotoId) {
			return false;
		}
		
		if (fotoIdNull != _cast.fotoIdNull) {
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
		_hashCode = 29 * _hashCode + (int) (fotoId ^ (fotoId >>> 32));
		_hashCode = 29 * _hashCode + (fotoIdNull ? 1 : 0);
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
		ret.append( "com.mysecretwish.dto.StrutturaFotoPk: " );
		ret.append( "fotoId=" + fotoId );
		return ret.toString();
	}

}
