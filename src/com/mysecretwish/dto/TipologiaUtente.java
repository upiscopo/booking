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

public class TipologiaUtente implements Serializable
{
	/** 
	 * This attribute maps to the column id in the tipologia_utente table.
	 */
	protected long id;

	/** 
	 * This attribute maps to the column descrizione in the tipologia_utente table.
	 */
	protected String descrizione;

	/**
	 * Method 'TipologiaUtente'
	 * 
	 */
	public TipologiaUtente()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return long
	 */
	public long getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(long id)
	{
		this.id = id;
	}

	/**
	 * Method 'getDescrizione'
	 * 
	 * @return String
	 */
	public String getDescrizione()
	{
		return descrizione;
	}

	/**
	 * Method 'setDescrizione'
	 * 
	 * @param descrizione
	 */
	public void setDescrizione(String descrizione)
	{
		this.descrizione = descrizione;
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
		
		if (!(_other instanceof TipologiaUtente)) {
			return false;
		}
		
		final TipologiaUtente _cast = (TipologiaUtente) _other;
		if (id != _cast.id) {
			return false;
		}
		
		if (descrizione == null ? _cast.descrizione != descrizione : !descrizione.equals( _cast.descrizione )) {
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
		if (descrizione != null) {
			_hashCode = 29 * _hashCode + descrizione.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return TipologiaUtentePk
	 */
	public TipologiaUtentePk createPk()
	{
		return new TipologiaUtentePk(id);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.TipologiaUtente: " );
		ret.append( "id=" + id );
		ret.append( ", descrizione=" + descrizione );
		return ret.toString();
	}

}
