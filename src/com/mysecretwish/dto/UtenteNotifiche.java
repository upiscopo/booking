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
import java.util.Date;

public class UtenteNotifiche implements Serializable
{
	/** 
	 * This attribute maps to the column notifiche_id in the utente_notifiche table.
	 */
	protected long notificheId;

	/** 
	 * This attribute maps to the column utente_id in the utente_notifiche table.
	 */
	protected long utenteId;

	/** 
	 * This attribute represents whether the primitive attribute utenteId is null.
	 */
	protected boolean utenteIdNull = true;

	/** 
	 * This attribute maps to the column data_notifica in the utente_notifiche table.
	 */
	protected Date dataNotifica;

	/** 
	 * This attribute maps to the column testo_notifica in the utente_notifiche table.
	 */
	protected String testoNotifica;

	/**
	 * Method 'UtenteNotifiche'
	 * 
	 */
	public UtenteNotifiche()
	{
	}

	/**
	 * Method 'getNotificheId'
	 * 
	 * @return long
	 */
	public long getNotificheId()
	{
		return notificheId;
	}

	/**
	 * Method 'setNotificheId'
	 * 
	 * @param notificheId
	 */
	public void setNotificheId(long notificheId)
	{
		this.notificheId = notificheId;
	}

	/**
	 * Method 'getUtenteId'
	 * 
	 * @return long
	 */
	public long getUtenteId()
	{
		return utenteId;
	}

	/**
	 * Method 'setUtenteId'
	 * 
	 * @param utenteId
	 */
	public void setUtenteId(long utenteId)
	{
		this.utenteId = utenteId;
		this.utenteIdNull = false;
	}

	/**
	 * Method 'setUtenteIdNull'
	 * 
	 * @param value
	 */
	public void setUtenteIdNull(boolean value)
	{
		this.utenteIdNull = value;
	}

	/**
	 * Method 'isUtenteIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isUtenteIdNull()
	{
		return utenteIdNull;
	}

	/**
	 * Method 'getDataNotifica'
	 * 
	 * @return Date
	 */
	public Date getDataNotifica()
	{
		return dataNotifica;
	}

	/**
	 * Method 'setDataNotifica'
	 * 
	 * @param dataNotifica
	 */
	public void setDataNotifica(Date dataNotifica)
	{
		this.dataNotifica = dataNotifica;
	}

	/**
	 * Method 'getTestoNotifica'
	 * 
	 * @return String
	 */
	public String getTestoNotifica()
	{
		return testoNotifica;
	}

	/**
	 * Method 'setTestoNotifica'
	 * 
	 * @param testoNotifica
	 */
	public void setTestoNotifica(String testoNotifica)
	{
		this.testoNotifica = testoNotifica;
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
		
		if (!(_other instanceof UtenteNotifiche)) {
			return false;
		}
		
		final UtenteNotifiche _cast = (UtenteNotifiche) _other;
		if (notificheId != _cast.notificheId) {
			return false;
		}
		
		if (utenteId != _cast.utenteId) {
			return false;
		}
		
		if (utenteIdNull != _cast.utenteIdNull) {
			return false;
		}
		
		if (dataNotifica == null ? _cast.dataNotifica != dataNotifica : !dataNotifica.equals( _cast.dataNotifica )) {
			return false;
		}
		
		if (testoNotifica == null ? _cast.testoNotifica != testoNotifica : !testoNotifica.equals( _cast.testoNotifica )) {
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
		_hashCode = 29 * _hashCode + (int) (notificheId ^ (notificheId >>> 32));
		_hashCode = 29 * _hashCode + (int) (utenteId ^ (utenteId >>> 32));
		_hashCode = 29 * _hashCode + (utenteIdNull ? 1 : 0);
		if (dataNotifica != null) {
			_hashCode = 29 * _hashCode + dataNotifica.hashCode();
		}
		
		if (testoNotifica != null) {
			_hashCode = 29 * _hashCode + testoNotifica.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UtenteNotifichePk
	 */
	public UtenteNotifichePk createPk()
	{
		return new UtenteNotifichePk(notificheId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.UtenteNotifiche: " );
		ret.append( "notificheId=" + notificheId );
		ret.append( ", utenteId=" + utenteId );
		ret.append( ", dataNotifica=" + dataNotifica );
		ret.append( ", testoNotifica=" + testoNotifica );
		return ret.toString();
	}

}
