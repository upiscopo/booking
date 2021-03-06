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

public class VincoliValidita implements Serializable
{
	/** 
	 * This attribute maps to the column viv_id in the vincoli_validita table.
	 */
	protected long vivId;

	/** 
	 * This attribute maps to the column viv_descrizione in the vincoli_validita table.
	 */
	protected String vivDescrizione;

	/**
	 * Method 'VincoliValidita'
	 * 
	 */
	public VincoliValidita()
	{
	}

	/**
	 * Method 'getVivId'
	 * 
	 * @return long
	 */
	public long getVivId()
	{
		return vivId;
	}

	/**
	 * Method 'setVivId'
	 * 
	 * @param vivId
	 */
	public void setVivId(long vivId)
	{
		this.vivId = vivId;
	}

	/**
	 * Method 'getVivDescrizione'
	 * 
	 * @return String
	 */
	public String getVivDescrizione()
	{
		return vivDescrizione;
	}

	/**
	 * Method 'setVivDescrizione'
	 * 
	 * @param vivDescrizione
	 */
	public void setVivDescrizione(String vivDescrizione)
	{
		this.vivDescrizione = vivDescrizione;
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
		
		if (!(_other instanceof VincoliValidita)) {
			return false;
		}
		
		final VincoliValidita _cast = (VincoliValidita) _other;
		if (vivId != _cast.vivId) {
			return false;
		}
		
		if (vivDescrizione == null ? _cast.vivDescrizione != vivDescrizione : !vivDescrizione.equals( _cast.vivDescrizione )) {
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
		_hashCode = 29 * _hashCode + (int) (vivId ^ (vivId >>> 32));
		if (vivDescrizione != null) {
			_hashCode = 29 * _hashCode + vivDescrizione.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return VincoliValiditaPk
	 */
	public VincoliValiditaPk createPk()
	{
		return new VincoliValiditaPk(vivId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.VincoliValidita: " );
		ret.append( "vivId=" + vivId );
		ret.append( ", vivDescrizione=" + vivDescrizione );
		return ret.toString();
	}

}
