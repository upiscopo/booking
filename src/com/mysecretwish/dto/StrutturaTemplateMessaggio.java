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

public class StrutturaTemplateMessaggio implements Serializable
{
	/** 
	 * This attribute maps to the column stm_id in the struttura_template_messaggio table.
	 */
	protected long stmId;

	/** 
	 * This attribute maps to the column stm_rientra_cond_checkin in the struttura_template_messaggio table.
	 */
	protected String stmRientraCondCheckin;

	/** 
	 * This attribute maps to the column stm_rietnra_cond_checkout in the struttura_template_messaggio table.
	 */
	protected String stmRietnraCondCheckout;

	/** 
	 * This attribute maps to the column stm_risp_parc in the struttura_template_messaggio table.
	 */
	protected int stmRispParc;

	/** 
	 * This attribute maps to the column struttura_str_id in the struttura_template_messaggio table.
	 */
	protected long strutturaStrId;

	/** 
	 * This attribute maps to the column condizioni_con_id in the struttura_template_messaggio table.
	 */
	protected long condizioniConId;

	/**
	 * Method 'StrutturaTemplateMessaggio'
	 * 
	 */
	public StrutturaTemplateMessaggio()
	{
	}

	/**
	 * Method 'getStmId'
	 * 
	 * @return long
	 */
	public long getStmId()
	{
		return stmId;
	}

	/**
	 * Method 'setStmId'
	 * 
	 * @param stmId
	 */
	public void setStmId(long stmId)
	{
		this.stmId = stmId;
	}

	/**
	 * Method 'getStmRientraCondCheckin'
	 * 
	 * @return String
	 */
	public String getStmRientraCondCheckin()
	{
		return stmRientraCondCheckin;
	}

	/**
	 * Method 'setStmRientraCondCheckin'
	 * 
	 * @param stmRientraCondCheckin
	 */
	public void setStmRientraCondCheckin(String stmRientraCondCheckin)
	{
		this.stmRientraCondCheckin = stmRientraCondCheckin;
	}

	/**
	 * Method 'getStmRietnraCondCheckout'
	 * 
	 * @return String
	 */
	public String getStmRietnraCondCheckout()
	{
		return stmRietnraCondCheckout;
	}

	/**
	 * Method 'setStmRietnraCondCheckout'
	 * 
	 * @param stmRietnraCondCheckout
	 */
	public void setStmRietnraCondCheckout(String stmRietnraCondCheckout)
	{
		this.stmRietnraCondCheckout = stmRietnraCondCheckout;
	}

	/**
	 * Method 'getStmRispParc'
	 * 
	 * @return int
	 */
	public int getStmRispParc()
	{
		return stmRispParc;
	}

	/**
	 * Method 'setStmRispParc'
	 * 
	 * @param stmRispParc
	 */
	public void setStmRispParc(int stmRispParc)
	{
		this.stmRispParc = stmRispParc;
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
	 * Method 'getCondizioniConId'
	 * 
	 * @return long
	 */
	public long getCondizioniConId()
	{
		return condizioniConId;
	}

	/**
	 * Method 'setCondizioniConId'
	 * 
	 * @param condizioniConId
	 */
	public void setCondizioniConId(long condizioniConId)
	{
		this.condizioniConId = condizioniConId;
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
		
		if (!(_other instanceof StrutturaTemplateMessaggio)) {
			return false;
		}
		
		final StrutturaTemplateMessaggio _cast = (StrutturaTemplateMessaggio) _other;
		if (stmId != _cast.stmId) {
			return false;
		}
		
		if (stmRientraCondCheckin == null ? _cast.stmRientraCondCheckin != stmRientraCondCheckin : !stmRientraCondCheckin.equals( _cast.stmRientraCondCheckin )) {
			return false;
		}
		
		if (stmRietnraCondCheckout == null ? _cast.stmRietnraCondCheckout != stmRietnraCondCheckout : !stmRietnraCondCheckout.equals( _cast.stmRietnraCondCheckout )) {
			return false;
		}
		
		if (stmRispParc != _cast.stmRispParc) {
			return false;
		}
		
		if (strutturaStrId != _cast.strutturaStrId) {
			return false;
		}
		
		if (condizioniConId != _cast.condizioniConId) {
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
		_hashCode = 29 * _hashCode + (int) (stmId ^ (stmId >>> 32));
		if (stmRientraCondCheckin != null) {
			_hashCode = 29 * _hashCode + stmRientraCondCheckin.hashCode();
		}
		
		if (stmRietnraCondCheckout != null) {
			_hashCode = 29 * _hashCode + stmRietnraCondCheckout.hashCode();
		}
		
		_hashCode = 29 * _hashCode + stmRispParc;
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		_hashCode = 29 * _hashCode + (int) (condizioniConId ^ (condizioniConId >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return StrutturaTemplateMessaggioPk
	 */
	public StrutturaTemplateMessaggioPk createPk()
	{
		return new StrutturaTemplateMessaggioPk(stmId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.StrutturaTemplateMessaggio: " );
		ret.append( "stmId=" + stmId );
		ret.append( ", stmRientraCondCheckin=" + stmRientraCondCheckin );
		ret.append( ", stmRietnraCondCheckout=" + stmRietnraCondCheckout );
		ret.append( ", stmRispParc=" + stmRispParc );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		ret.append( ", condizioniConId=" + condizioniConId );
		return ret.toString();
	}

}