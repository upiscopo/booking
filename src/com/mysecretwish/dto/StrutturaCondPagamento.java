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

public class StrutturaCondPagamento implements Serializable
{
	/** 
	 * This attribute maps to the column scp_id in the struttura_cond_pagamento table.
	 */
	protected long scpId;

	/** 
	 * This attribute maps to the column scp_accetta_carte in the struttura_cond_pagamento table.
	 */
	protected String scpAccettaCarte;

	/** 
	 * This attribute maps to the column scp_american_express in the struttura_cond_pagamento table.
	 */
	protected String scpAmericanExpress;

	/** 
	 * This attribute maps to the column scp_mastercard in the struttura_cond_pagamento table.
	 */
	protected String scpMastercard;

	/** 
	 * This attribute maps to the column scp_jcb in the struttura_cond_pagamento table.
	 */
	protected String scpJcb;

	/** 
	 * This attribute maps to the column scp_discover in the struttura_cond_pagamento table.
	 */
	protected String scpDiscover;

	/** 
	 * This attribute maps to the column scp_cartasi in the struttura_cond_pagamento table.
	 */
	protected String scpCartasi;

	/** 
	 * This attribute maps to the column scp_unionpay in the struttura_cond_pagamento table.
	 */
	protected String scpUnionpay;

	/** 
	 * This attribute maps to the column scp_visa in the struttura_cond_pagamento table.
	 */
	protected String scpVisa;

	/** 
	 * This attribute maps to the column scp_maestro in the struttura_cond_pagamento table.
	 */
	protected String scpMaestro;

	/** 
	 * This attribute maps to the column scp_diners in the struttura_cond_pagamento table.
	 */
	protected String scpDiners;

	/** 
	 * This attribute maps to the column scp_pin in the struttura_cond_pagamento table.
	 */
	protected String scpPin;

	/** 
	 * This attribute maps to the column scp_pren_no_carta_connaz in the struttura_cond_pagamento table.
	 */
	protected String scpPrenNoCartaConnaz;

	/** 
	 * This attribute maps to the column scp_pag_online in the struttura_cond_pagamento table.
	 */
	protected String scpPagOnline;

	/** 
	 * This attribute maps to the column scp_attivo in the struttura_cond_pagamento table.
	 */
	protected String scpAttivo;

	/** 
	 * This attribute maps to the column struttura_str_id in the struttura_cond_pagamento table.
	 */
	protected long strutturaStrId;

	/** 
	 * This attribute maps to the column scp_imp_last_minut in the struttura_cond_pagamento table.
	 */
	protected long scpImpLastMinut;

	/** 
	 * This attribute represents whether the primitive attribute scpImpLastMinut is null.
	 */
	protected boolean scpImpLastMinutNull = true;

	/**
	 * Method 'StrutturaCondPagamento'
	 * 
	 */
	public StrutturaCondPagamento()
	{
	}

	/**
	 * Method 'getScpId'
	 * 
	 * @return long
	 */
	public long getScpId()
	{
		return scpId;
	}

	/**
	 * Method 'setScpId'
	 * 
	 * @param scpId
	 */
	public void setScpId(long scpId)
	{
		this.scpId = scpId;
	}

	/**
	 * Method 'getScpAccettaCarte'
	 * 
	 * @return String
	 */
	public String getScpAccettaCarte()
	{
		return scpAccettaCarte;
	}

	/**
	 * Method 'setScpAccettaCarte'
	 * 
	 * @param scpAccettaCarte
	 */
	public void setScpAccettaCarte(String scpAccettaCarte)
	{
		this.scpAccettaCarte = scpAccettaCarte;
	}

	/**
	 * Method 'getScpAmericanExpress'
	 * 
	 * @return String
	 */
	public String getScpAmericanExpress()
	{
		return scpAmericanExpress;
	}

	/**
	 * Method 'setScpAmericanExpress'
	 * 
	 * @param scpAmericanExpress
	 */
	public void setScpAmericanExpress(String scpAmericanExpress)
	{
		this.scpAmericanExpress = scpAmericanExpress;
	}

	/**
	 * Method 'getScpMastercard'
	 * 
	 * @return String
	 */
	public String getScpMastercard()
	{
		return scpMastercard;
	}

	/**
	 * Method 'setScpMastercard'
	 * 
	 * @param scpMastercard
	 */
	public void setScpMastercard(String scpMastercard)
	{
		this.scpMastercard = scpMastercard;
	}

	/**
	 * Method 'getScpJcb'
	 * 
	 * @return String
	 */
	public String getScpJcb()
	{
		return scpJcb;
	}

	/**
	 * Method 'setScpJcb'
	 * 
	 * @param scpJcb
	 */
	public void setScpJcb(String scpJcb)
	{
		this.scpJcb = scpJcb;
	}

	/**
	 * Method 'getScpDiscover'
	 * 
	 * @return String
	 */
	public String getScpDiscover()
	{
		return scpDiscover;
	}

	/**
	 * Method 'setScpDiscover'
	 * 
	 * @param scpDiscover
	 */
	public void setScpDiscover(String scpDiscover)
	{
		this.scpDiscover = scpDiscover;
	}

	/**
	 * Method 'getScpCartasi'
	 * 
	 * @return String
	 */
	public String getScpCartasi()
	{
		return scpCartasi;
	}

	/**
	 * Method 'setScpCartasi'
	 * 
	 * @param scpCartasi
	 */
	public void setScpCartasi(String scpCartasi)
	{
		this.scpCartasi = scpCartasi;
	}

	/**
	 * Method 'getScpUnionpay'
	 * 
	 * @return String
	 */
	public String getScpUnionpay()
	{
		return scpUnionpay;
	}

	/**
	 * Method 'setScpUnionpay'
	 * 
	 * @param scpUnionpay
	 */
	public void setScpUnionpay(String scpUnionpay)
	{
		this.scpUnionpay = scpUnionpay;
	}

	/**
	 * Method 'getScpVisa'
	 * 
	 * @return String
	 */
	public String getScpVisa()
	{
		return scpVisa;
	}

	/**
	 * Method 'setScpVisa'
	 * 
	 * @param scpVisa
	 */
	public void setScpVisa(String scpVisa)
	{
		this.scpVisa = scpVisa;
	}

	/**
	 * Method 'getScpMaestro'
	 * 
	 * @return String
	 */
	public String getScpMaestro()
	{
		return scpMaestro;
	}

	/**
	 * Method 'setScpMaestro'
	 * 
	 * @param scpMaestro
	 */
	public void setScpMaestro(String scpMaestro)
	{
		this.scpMaestro = scpMaestro;
	}

	/**
	 * Method 'getScpDiners'
	 * 
	 * @return String
	 */
	public String getScpDiners()
	{
		return scpDiners;
	}

	/**
	 * Method 'setScpDiners'
	 * 
	 * @param scpDiners
	 */
	public void setScpDiners(String scpDiners)
	{
		this.scpDiners = scpDiners;
	}

	/**
	 * Method 'getScpPin'
	 * 
	 * @return String
	 */
	public String getScpPin()
	{
		return scpPin;
	}

	/**
	 * Method 'setScpPin'
	 * 
	 * @param scpPin
	 */
	public void setScpPin(String scpPin)
	{
		this.scpPin = scpPin;
	}

	/**
	 * Method 'getScpPrenNoCartaConnaz'
	 * 
	 * @return String
	 */
	public String getScpPrenNoCartaConnaz()
	{
		return scpPrenNoCartaConnaz;
	}

	/**
	 * Method 'setScpPrenNoCartaConnaz'
	 * 
	 * @param scpPrenNoCartaConnaz
	 */
	public void setScpPrenNoCartaConnaz(String scpPrenNoCartaConnaz)
	{
		this.scpPrenNoCartaConnaz = scpPrenNoCartaConnaz;
	}

	/**
	 * Method 'getScpPagOnline'
	 * 
	 * @return String
	 */
	public String getScpPagOnline()
	{
		return scpPagOnline;
	}

	/**
	 * Method 'setScpPagOnline'
	 * 
	 * @param scpPagOnline
	 */
	public void setScpPagOnline(String scpPagOnline)
	{
		this.scpPagOnline = scpPagOnline;
	}

	/**
	 * Method 'getScpAttivo'
	 * 
	 * @return String
	 */
	public String getScpAttivo()
	{
		return scpAttivo;
	}

	/**
	 * Method 'setScpAttivo'
	 * 
	 * @param scpAttivo
	 */
	public void setScpAttivo(String scpAttivo)
	{
		this.scpAttivo = scpAttivo;
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
	 * Method 'getScpImpLastMinut'
	 * 
	 * @return long
	 */
	public long getScpImpLastMinut()
	{
		return scpImpLastMinut;
	}

	/**
	 * Method 'setScpImpLastMinut'
	 * 
	 * @param scpImpLastMinut
	 */
	public void setScpImpLastMinut(long scpImpLastMinut)
	{
		this.scpImpLastMinut = scpImpLastMinut;
		this.scpImpLastMinutNull = false;
	}

	/**
	 * Method 'setScpImpLastMinutNull'
	 * 
	 * @param value
	 */
	public void setScpImpLastMinutNull(boolean value)
	{
		this.scpImpLastMinutNull = value;
	}

	/**
	 * Method 'isScpImpLastMinutNull'
	 * 
	 * @return boolean
	 */
	public boolean isScpImpLastMinutNull()
	{
		return scpImpLastMinutNull;
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
		
		if (!(_other instanceof StrutturaCondPagamento)) {
			return false;
		}
		
		final StrutturaCondPagamento _cast = (StrutturaCondPagamento) _other;
		if (scpId != _cast.scpId) {
			return false;
		}
		
		if (scpAccettaCarte == null ? _cast.scpAccettaCarte != scpAccettaCarte : !scpAccettaCarte.equals( _cast.scpAccettaCarte )) {
			return false;
		}
		
		if (scpAmericanExpress == null ? _cast.scpAmericanExpress != scpAmericanExpress : !scpAmericanExpress.equals( _cast.scpAmericanExpress )) {
			return false;
		}
		
		if (scpMastercard == null ? _cast.scpMastercard != scpMastercard : !scpMastercard.equals( _cast.scpMastercard )) {
			return false;
		}
		
		if (scpJcb == null ? _cast.scpJcb != scpJcb : !scpJcb.equals( _cast.scpJcb )) {
			return false;
		}
		
		if (scpDiscover == null ? _cast.scpDiscover != scpDiscover : !scpDiscover.equals( _cast.scpDiscover )) {
			return false;
		}
		
		if (scpCartasi == null ? _cast.scpCartasi != scpCartasi : !scpCartasi.equals( _cast.scpCartasi )) {
			return false;
		}
		
		if (scpUnionpay == null ? _cast.scpUnionpay != scpUnionpay : !scpUnionpay.equals( _cast.scpUnionpay )) {
			return false;
		}
		
		if (scpVisa == null ? _cast.scpVisa != scpVisa : !scpVisa.equals( _cast.scpVisa )) {
			return false;
		}
		
		if (scpMaestro == null ? _cast.scpMaestro != scpMaestro : !scpMaestro.equals( _cast.scpMaestro )) {
			return false;
		}
		
		if (scpDiners == null ? _cast.scpDiners != scpDiners : !scpDiners.equals( _cast.scpDiners )) {
			return false;
		}
		
		if (scpPin == null ? _cast.scpPin != scpPin : !scpPin.equals( _cast.scpPin )) {
			return false;
		}
		
		if (scpPrenNoCartaConnaz == null ? _cast.scpPrenNoCartaConnaz != scpPrenNoCartaConnaz : !scpPrenNoCartaConnaz.equals( _cast.scpPrenNoCartaConnaz )) {
			return false;
		}
		
		if (scpPagOnline == null ? _cast.scpPagOnline != scpPagOnline : !scpPagOnline.equals( _cast.scpPagOnline )) {
			return false;
		}
		
		if (scpAttivo == null ? _cast.scpAttivo != scpAttivo : !scpAttivo.equals( _cast.scpAttivo )) {
			return false;
		}
		
		if (strutturaStrId != _cast.strutturaStrId) {
			return false;
		}
		
		if (scpImpLastMinut != _cast.scpImpLastMinut) {
			return false;
		}
		
		if (scpImpLastMinutNull != _cast.scpImpLastMinutNull) {
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
		_hashCode = 29 * _hashCode + (int) (scpId ^ (scpId >>> 32));
		if (scpAccettaCarte != null) {
			_hashCode = 29 * _hashCode + scpAccettaCarte.hashCode();
		}
		
		if (scpAmericanExpress != null) {
			_hashCode = 29 * _hashCode + scpAmericanExpress.hashCode();
		}
		
		if (scpMastercard != null) {
			_hashCode = 29 * _hashCode + scpMastercard.hashCode();
		}
		
		if (scpJcb != null) {
			_hashCode = 29 * _hashCode + scpJcb.hashCode();
		}
		
		if (scpDiscover != null) {
			_hashCode = 29 * _hashCode + scpDiscover.hashCode();
		}
		
		if (scpCartasi != null) {
			_hashCode = 29 * _hashCode + scpCartasi.hashCode();
		}
		
		if (scpUnionpay != null) {
			_hashCode = 29 * _hashCode + scpUnionpay.hashCode();
		}
		
		if (scpVisa != null) {
			_hashCode = 29 * _hashCode + scpVisa.hashCode();
		}
		
		if (scpMaestro != null) {
			_hashCode = 29 * _hashCode + scpMaestro.hashCode();
		}
		
		if (scpDiners != null) {
			_hashCode = 29 * _hashCode + scpDiners.hashCode();
		}
		
		if (scpPin != null) {
			_hashCode = 29 * _hashCode + scpPin.hashCode();
		}
		
		if (scpPrenNoCartaConnaz != null) {
			_hashCode = 29 * _hashCode + scpPrenNoCartaConnaz.hashCode();
		}
		
		if (scpPagOnline != null) {
			_hashCode = 29 * _hashCode + scpPagOnline.hashCode();
		}
		
		if (scpAttivo != null) {
			_hashCode = 29 * _hashCode + scpAttivo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		_hashCode = 29 * _hashCode + (int) (scpImpLastMinut ^ (scpImpLastMinut >>> 32));
		_hashCode = 29 * _hashCode + (scpImpLastMinutNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return StrutturaCondPagamentoPk
	 */
	public StrutturaCondPagamentoPk createPk()
	{
		return new StrutturaCondPagamentoPk(scpId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.StrutturaCondPagamento: " );
		ret.append( "scpId=" + scpId );
		ret.append( ", scpAccettaCarte=" + scpAccettaCarte );
		ret.append( ", scpAmericanExpress=" + scpAmericanExpress );
		ret.append( ", scpMastercard=" + scpMastercard );
		ret.append( ", scpJcb=" + scpJcb );
		ret.append( ", scpDiscover=" + scpDiscover );
		ret.append( ", scpCartasi=" + scpCartasi );
		ret.append( ", scpUnionpay=" + scpUnionpay );
		ret.append( ", scpVisa=" + scpVisa );
		ret.append( ", scpMaestro=" + scpMaestro );
		ret.append( ", scpDiners=" + scpDiners );
		ret.append( ", scpPin=" + scpPin );
		ret.append( ", scpPrenNoCartaConnaz=" + scpPrenNoCartaConnaz );
		ret.append( ", scpPagOnline=" + scpPagOnline );
		ret.append( ", scpAttivo=" + scpAttivo );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		ret.append( ", scpImpLastMinut=" + scpImpLastMinut );
		return ret.toString();
	}

}