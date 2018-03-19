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

public class CondizioniTemplateMessaggi implements Serializable
{
	/** 
	 * This attribute maps to the column con_id in the condizioni_template_messaggi table.
	 */
	protected long conId;

	/** 
	 * This attribute maps to the column con_descrizione in the condizioni_template_messaggi table.
	 */
	protected String conDescrizione;

	/**
	 * Method 'CondizioniTemplateMessaggi'
	 * 
	 */
	public CondizioniTemplateMessaggi()
	{
	}

	/**
	 * Method 'getConId'
	 * 
	 * @return long
	 */
	public long getConId()
	{
		return conId;
	}

	/**
	 * Method 'setConId'
	 * 
	 * @param conId
	 */
	public void setConId(long conId)
	{
		this.conId = conId;
	}

	/**
	 * Method 'getConDescrizione'
	 * 
	 * @return String
	 */
	public String getConDescrizione()
	{
		return conDescrizione;
	}

	/**
	 * Method 'setConDescrizione'
	 * 
	 * @param conDescrizione
	 */
	public void setConDescrizione(String conDescrizione)
	{
		this.conDescrizione = conDescrizione;
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
		
		if (!(_other instanceof CondizioniTemplateMessaggi)) {
			return false;
		}
		
		final CondizioniTemplateMessaggi _cast = (CondizioniTemplateMessaggi) _other;
		if (conId != _cast.conId) {
			return false;
		}
		
		if (conDescrizione == null ? _cast.conDescrizione != conDescrizione : !conDescrizione.equals( _cast.conDescrizione )) {
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
		_hashCode = 29 * _hashCode + (int) (conId ^ (conId >>> 32));
		if (conDescrizione != null) {
			_hashCode = 29 * _hashCode + conDescrizione.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CondizioniTemplateMessaggiPk
	 */
	public CondizioniTemplateMessaggiPk createPk()
	{
		return new CondizioniTemplateMessaggiPk(conId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.CondizioniTemplateMessaggi: " );
		ret.append( "conId=" + conId );
		ret.append( ", conDescrizione=" + conDescrizione );
		return ret.toString();
	}

}