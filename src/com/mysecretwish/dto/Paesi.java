/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mysecretwish.dto;

import com.mysecretwish.dao.*;
import com.mysecretwish.factory.*;
import com.mysecretwish.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Paesi implements Serializable
{
	/** 
	 * This attribute maps to the column pae_id in the paesi table.
	 */
	protected long paeId;

	/** 
	 * This attribute maps to the column pae_descrizione in the paesi table.
	 */
	protected String paeDescrizione;

	/**
	 * Method 'Paesi'
	 * 
	 */
	public Paesi()
	{
	}

	/**
	 * Method 'getPaeId'
	 * 
	 * @return long
	 */
	public long getPaeId()
	{
		return paeId;
	}

	/**
	 * Method 'setPaeId'
	 * 
	 * @param paeId
	 */
	public void setPaeId(long paeId)
	{
		this.paeId = paeId;
	}

	/**
	 * Method 'getPaeDescrizione'
	 * 
	 * @return String
	 */
	public String getPaeDescrizione()
	{
		return paeDescrizione;
	}

	/**
	 * Method 'setPaeDescrizione'
	 * 
	 * @param paeDescrizione
	 */
	public void setPaeDescrizione(String paeDescrizione)
	{
		this.paeDescrizione = paeDescrizione;
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
		
		if (!(_other instanceof Paesi)) {
			return false;
		}
		
		final Paesi _cast = (Paesi) _other;
		if (paeId != _cast.paeId) {
			return false;
		}
		
		if (paeDescrizione == null ? _cast.paeDescrizione != paeDescrizione : !paeDescrizione.equals( _cast.paeDescrizione )) {
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
		_hashCode = 29 * _hashCode + (int) (paeId ^ (paeId >>> 32));
		if (paeDescrizione != null) {
			_hashCode = 29 * _hashCode + paeDescrizione.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return PaesiPk
	 */
	public PaesiPk createPk()
	{
		return new PaesiPk(paeId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.Paesi: " );
		ret.append( "paeId=" + paeId );
		ret.append( ", paeDescrizione=" + paeDescrizione );
		return ret.toString();
	}

}
