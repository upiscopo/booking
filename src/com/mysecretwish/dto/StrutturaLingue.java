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

public class StrutturaLingue implements Serializable
{
	/** 
	 * This attribute maps to the column sli_id in the struttura_lingue table.
	 */
	protected long sliId;

	/** 
	 * This attribute maps to the column struttura_str_id in the struttura_lingue table.
	 */
	protected long strutturaStrId;

	/** 
	 * This attribute maps to the column lingue_parlate_lin_id in the struttura_lingue table.
	 */
	protected long lingueParlateLinId;

	/**
	 * Method 'StrutturaLingue'
	 * 
	 */
	public StrutturaLingue()
	{
	}

	/**
	 * Method 'getSliId'
	 * 
	 * @return long
	 */
	public long getSliId()
	{
		return sliId;
	}

	/**
	 * Method 'setSliId'
	 * 
	 * @param sliId
	 */
	public void setSliId(long sliId)
	{
		this.sliId = sliId;
	}

	/**
	 * Method 'getStrutturaStrId'
	 * 
	 * @return long
	 */
	public long getStrutturaStrId()
	{
		return strutturaStrId;
	}

	/**
	 * Method 'setStrutturaStrId'
	 * 
	 * @param strutturaStrId
	 */
	public void setStrutturaStrId(long strutturaStrId)
	{
		this.strutturaStrId = strutturaStrId;
	}

	/**
	 * Method 'getLingueParlateLinId'
	 * 
	 * @return long
	 */
	public long getLingueParlateLinId()
	{
		return lingueParlateLinId;
	}

	/**
	 * Method 'setLingueParlateLinId'
	 * 
	 * @param lingueParlateLinId
	 */
	public void setLingueParlateLinId(long lingueParlateLinId)
	{
		this.lingueParlateLinId = lingueParlateLinId;
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
		
		if (!(_other instanceof StrutturaLingue)) {
			return false;
		}
		
		final StrutturaLingue _cast = (StrutturaLingue) _other;
		if (sliId != _cast.sliId) {
			return false;
		}
		
		if (strutturaStrId != _cast.strutturaStrId) {
			return false;
		}
		
		if (lingueParlateLinId != _cast.lingueParlateLinId) {
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
		_hashCode = 29 * _hashCode + (int) (sliId ^ (sliId >>> 32));
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		_hashCode = 29 * _hashCode + (int) (lingueParlateLinId ^ (lingueParlateLinId >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return StrutturaLinguePk
	 */
	public StrutturaLinguePk createPk()
	{
		return new StrutturaLinguePk(sliId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.StrutturaLingue: " );
		ret.append( "sliId=" + sliId );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		ret.append( ", lingueParlateLinId=" + lingueParlateLinId );
		return ret.toString();
	}

}
