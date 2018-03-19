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

public class StrutturaCondAltre implements Serializable
{
	/** 
	 * This attribute maps to the column sca_id in the struttura_cond_altre table.
	 */
	protected long scaId;

	/** 
	 * This attribute maps to the column sca_ospita_bamb in the struttura_cond_altre table.
	 */
	protected String scaOspitaBamb;

	/** 
	 * This attribute maps to the column sca_bamb_in_letti in the struttura_cond_altre table.
	 */
	protected String scaBambInLetti;

	/** 
	 * This attribute maps to the column sca_letti_agg in the struttura_cond_altre table.
	 */
	protected String scaLettiAgg;

	/** 
	 * This attribute maps to the column scp_checkin_dalle in the struttura_cond_altre table.
	 */
	protected String scpCheckinDalle;

	/** 
	 * This attribute maps to the column scp_checkin_alle in the struttura_cond_altre table.
	 */
	protected String scpCheckinAlle;

	/** 
	 * This attribute maps to the column scp_checkout_dalle in the struttura_cond_altre table.
	 */
	protected String scpCheckoutDalle;

	/** 
	 * This attribute maps to the column scp_checkout_alle in the struttura_cond_altre table.
	 */
	protected String scpCheckoutAlle;

	/** 
	 * This attribute maps to the column sca_pren_no_indirizzo in the struttura_cond_altre table.
	 */
	protected String scaPrenNoIndirizzo;

	/** 
	 * This attribute maps to the column sca_pren_no_tel in the struttura_cond_altre table.
	 */
	protected String scaPrenNoTel;

	/** 
	 * This attribute maps to the column struttura_str_id in the struttura_cond_altre table.
	 */
	protected long strutturaStrId;

	/** 
	 * This attribute maps to the column scp_internet in the struttura_cond_altre table.
	 */
	protected long scpInternet;

	/** 
	 * This attribute represents whether the primitive attribute scpInternet is null.
	 */
	protected boolean scpInternetNull = true;

	/** 
	 * This attribute maps to the column scp_parcheggio in the struttura_cond_altre table.
	 */
	protected long scpParcheggio;

	/** 
	 * This attribute represents whether the primitive attribute scpParcheggio is null.
	 */
	protected boolean scpParcheggioNull = true;

	/** 
	 * This attribute maps to the column scp_animali in the struttura_cond_altre table.
	 */
	protected long scpAnimali;

	/** 
	 * This attribute represents whether the primitive attribute scpAnimali is null.
	 */
	protected boolean scpAnimaliNull = true;

	/**
	 * Method 'StrutturaCondAltre'
	 * 
	 */
	public StrutturaCondAltre()
	{
	}

	/**
	 * Method 'getScaId'
	 * 
	 * @return long
	 */
	public long getScaId()
	{
		return scaId;
	}

	/**
	 * Method 'setScaId'
	 * 
	 * @param scaId
	 */
	public void setScaId(long scaId)
	{
		this.scaId = scaId;
	}

	/**
	 * Method 'getScaOspitaBamb'
	 * 
	 * @return String
	 */
	public String getScaOspitaBamb()
	{
		return scaOspitaBamb;
	}

	/**
	 * Method 'setScaOspitaBamb'
	 * 
	 * @param scaOspitaBamb
	 */
	public void setScaOspitaBamb(String scaOspitaBamb)
	{
		this.scaOspitaBamb = scaOspitaBamb;
	}

	/**
	 * Method 'getScaBambInLetti'
	 * 
	 * @return String
	 */
	public String getScaBambInLetti()
	{
		return scaBambInLetti;
	}

	/**
	 * Method 'setScaBambInLetti'
	 * 
	 * @param scaBambInLetti
	 */
	public void setScaBambInLetti(String scaBambInLetti)
	{
		this.scaBambInLetti = scaBambInLetti;
	}

	/**
	 * Method 'getScaLettiAgg'
	 * 
	 * @return String
	 */
	public String getScaLettiAgg()
	{
		return scaLettiAgg;
	}

	/**
	 * Method 'setScaLettiAgg'
	 * 
	 * @param scaLettiAgg
	 */
	public void setScaLettiAgg(String scaLettiAgg)
	{
		this.scaLettiAgg = scaLettiAgg;
	}

	/**
	 * Method 'getScpCheckinDalle'
	 * 
	 * @return String
	 */
	public String getScpCheckinDalle()
	{
		return scpCheckinDalle;
	}

	/**
	 * Method 'setScpCheckinDalle'
	 * 
	 * @param scpCheckinDalle
	 */
	public void setScpCheckinDalle(String scpCheckinDalle)
	{
		this.scpCheckinDalle = scpCheckinDalle;
	}

	/**
	 * Method 'getScpCheckinAlle'
	 * 
	 * @return String
	 */
	public String getScpCheckinAlle()
	{
		return scpCheckinAlle;
	}

	/**
	 * Method 'setScpCheckinAlle'
	 * 
	 * @param scpCheckinAlle
	 */
	public void setScpCheckinAlle(String scpCheckinAlle)
	{
		this.scpCheckinAlle = scpCheckinAlle;
	}

	/**
	 * Method 'getScpCheckoutDalle'
	 * 
	 * @return String
	 */
	public String getScpCheckoutDalle()
	{
		return scpCheckoutDalle;
	}

	/**
	 * Method 'setScpCheckoutDalle'
	 * 
	 * @param scpCheckoutDalle
	 */
	public void setScpCheckoutDalle(String scpCheckoutDalle)
	{
		this.scpCheckoutDalle = scpCheckoutDalle;
	}

	/**
	 * Method 'getScpCheckoutAlle'
	 * 
	 * @return String
	 */
	public String getScpCheckoutAlle()
	{
		return scpCheckoutAlle;
	}

	/**
	 * Method 'setScpCheckoutAlle'
	 * 
	 * @param scpCheckoutAlle
	 */
	public void setScpCheckoutAlle(String scpCheckoutAlle)
	{
		this.scpCheckoutAlle = scpCheckoutAlle;
	}

	/**
	 * Method 'getScaPrenNoIndirizzo'
	 * 
	 * @return String
	 */
	public String getScaPrenNoIndirizzo()
	{
		return scaPrenNoIndirizzo;
	}

	/**
	 * Method 'setScaPrenNoIndirizzo'
	 * 
	 * @param scaPrenNoIndirizzo
	 */
	public void setScaPrenNoIndirizzo(String scaPrenNoIndirizzo)
	{
		this.scaPrenNoIndirizzo = scaPrenNoIndirizzo;
	}

	/**
	 * Method 'getScaPrenNoTel'
	 * 
	 * @return String
	 */
	public String getScaPrenNoTel()
	{
		return scaPrenNoTel;
	}

	/**
	 * Method 'setScaPrenNoTel'
	 * 
	 * @param scaPrenNoTel
	 */
	public void setScaPrenNoTel(String scaPrenNoTel)
	{
		this.scaPrenNoTel = scaPrenNoTel;
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
	 * Method 'getScpInternet'
	 * 
	 * @return long
	 */
	public long getScpInternet()
	{
		return scpInternet;
	}

	/**
	 * Method 'setScpInternet'
	 * 
	 * @param scpInternet
	 */
	public void setScpInternet(long scpInternet)
	{
		this.scpInternet = scpInternet;
		this.scpInternetNull = false;
	}

	/**
	 * Method 'setScpInternetNull'
	 * 
	 * @param value
	 */
	public void setScpInternetNull(boolean value)
	{
		this.scpInternetNull = value;
	}

	/**
	 * Method 'isScpInternetNull'
	 * 
	 * @return boolean
	 */
	public boolean isScpInternetNull()
	{
		return scpInternetNull;
	}

	/**
	 * Method 'getScpParcheggio'
	 * 
	 * @return long
	 */
	public long getScpParcheggio()
	{
		return scpParcheggio;
	}

	/**
	 * Method 'setScpParcheggio'
	 * 
	 * @param scpParcheggio
	 */
	public void setScpParcheggio(long scpParcheggio)
	{
		this.scpParcheggio = scpParcheggio;
		this.scpParcheggioNull = false;
	}

	/**
	 * Method 'setScpParcheggioNull'
	 * 
	 * @param value
	 */
	public void setScpParcheggioNull(boolean value)
	{
		this.scpParcheggioNull = value;
	}

	/**
	 * Method 'isScpParcheggioNull'
	 * 
	 * @return boolean
	 */
	public boolean isScpParcheggioNull()
	{
		return scpParcheggioNull;
	}

	/**
	 * Method 'getScpAnimali'
	 * 
	 * @return long
	 */
	public long getScpAnimali()
	{
		return scpAnimali;
	}

	/**
	 * Method 'setScpAnimali'
	 * 
	 * @param scpAnimali
	 */
	public void setScpAnimali(long scpAnimali)
	{
		this.scpAnimali = scpAnimali;
		this.scpAnimaliNull = false;
	}

	/**
	 * Method 'setScpAnimaliNull'
	 * 
	 * @param value
	 */
	public void setScpAnimaliNull(boolean value)
	{
		this.scpAnimaliNull = value;
	}

	/**
	 * Method 'isScpAnimaliNull'
	 * 
	 * @return boolean
	 */
	public boolean isScpAnimaliNull()
	{
		return scpAnimaliNull;
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
		
		if (!(_other instanceof StrutturaCondAltre)) {
			return false;
		}
		
		final StrutturaCondAltre _cast = (StrutturaCondAltre) _other;
		if (scaId != _cast.scaId) {
			return false;
		}
		
		if (scaOspitaBamb == null ? _cast.scaOspitaBamb != scaOspitaBamb : !scaOspitaBamb.equals( _cast.scaOspitaBamb )) {
			return false;
		}
		
		if (scaBambInLetti == null ? _cast.scaBambInLetti != scaBambInLetti : !scaBambInLetti.equals( _cast.scaBambInLetti )) {
			return false;
		}
		
		if (scaLettiAgg == null ? _cast.scaLettiAgg != scaLettiAgg : !scaLettiAgg.equals( _cast.scaLettiAgg )) {
			return false;
		}
		
		if (scpCheckinDalle == null ? _cast.scpCheckinDalle != scpCheckinDalle : !scpCheckinDalle.equals( _cast.scpCheckinDalle )) {
			return false;
		}
		
		if (scpCheckinAlle == null ? _cast.scpCheckinAlle != scpCheckinAlle : !scpCheckinAlle.equals( _cast.scpCheckinAlle )) {
			return false;
		}
		
		if (scpCheckoutDalle == null ? _cast.scpCheckoutDalle != scpCheckoutDalle : !scpCheckoutDalle.equals( _cast.scpCheckoutDalle )) {
			return false;
		}
		
		if (scpCheckoutAlle == null ? _cast.scpCheckoutAlle != scpCheckoutAlle : !scpCheckoutAlle.equals( _cast.scpCheckoutAlle )) {
			return false;
		}
		
		if (scaPrenNoIndirizzo == null ? _cast.scaPrenNoIndirizzo != scaPrenNoIndirizzo : !scaPrenNoIndirizzo.equals( _cast.scaPrenNoIndirizzo )) {
			return false;
		}
		
		if (scaPrenNoTel == null ? _cast.scaPrenNoTel != scaPrenNoTel : !scaPrenNoTel.equals( _cast.scaPrenNoTel )) {
			return false;
		}
		
		if (strutturaStrId != _cast.strutturaStrId) {
			return false;
		}
		
		if (scpInternet != _cast.scpInternet) {
			return false;
		}
		
		if (scpInternetNull != _cast.scpInternetNull) {
			return false;
		}
		
		if (scpParcheggio != _cast.scpParcheggio) {
			return false;
		}
		
		if (scpParcheggioNull != _cast.scpParcheggioNull) {
			return false;
		}
		
		if (scpAnimali != _cast.scpAnimali) {
			return false;
		}
		
		if (scpAnimaliNull != _cast.scpAnimaliNull) {
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
		_hashCode = 29 * _hashCode + (int) (scaId ^ (scaId >>> 32));
		if (scaOspitaBamb != null) {
			_hashCode = 29 * _hashCode + scaOspitaBamb.hashCode();
		}
		
		if (scaBambInLetti != null) {
			_hashCode = 29 * _hashCode + scaBambInLetti.hashCode();
		}
		
		if (scaLettiAgg != null) {
			_hashCode = 29 * _hashCode + scaLettiAgg.hashCode();
		}
		
		if (scpCheckinDalle != null) {
			_hashCode = 29 * _hashCode + scpCheckinDalle.hashCode();
		}
		
		if (scpCheckinAlle != null) {
			_hashCode = 29 * _hashCode + scpCheckinAlle.hashCode();
		}
		
		if (scpCheckoutDalle != null) {
			_hashCode = 29 * _hashCode + scpCheckoutDalle.hashCode();
		}
		
		if (scpCheckoutAlle != null) {
			_hashCode = 29 * _hashCode + scpCheckoutAlle.hashCode();
		}
		
		if (scaPrenNoIndirizzo != null) {
			_hashCode = 29 * _hashCode + scaPrenNoIndirizzo.hashCode();
		}
		
		if (scaPrenNoTel != null) {
			_hashCode = 29 * _hashCode + scaPrenNoTel.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		_hashCode = 29 * _hashCode + (int) (scpInternet ^ (scpInternet >>> 32));
		_hashCode = 29 * _hashCode + (scpInternetNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (scpParcheggio ^ (scpParcheggio >>> 32));
		_hashCode = 29 * _hashCode + (scpParcheggioNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (scpAnimali ^ (scpAnimali >>> 32));
		_hashCode = 29 * _hashCode + (scpAnimaliNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return StrutturaCondAltrePk
	 */
	public StrutturaCondAltrePk createPk()
	{
		return new StrutturaCondAltrePk(scaId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.StrutturaCondAltre: " );
		ret.append( "scaId=" + scaId );
		ret.append( ", scaOspitaBamb=" + scaOspitaBamb );
		ret.append( ", scaBambInLetti=" + scaBambInLetti );
		ret.append( ", scaLettiAgg=" + scaLettiAgg );
		ret.append( ", scpCheckinDalle=" + scpCheckinDalle );
		ret.append( ", scpCheckinAlle=" + scpCheckinAlle );
		ret.append( ", scpCheckoutDalle=" + scpCheckoutDalle );
		ret.append( ", scpCheckoutAlle=" + scpCheckoutAlle );
		ret.append( ", scaPrenNoIndirizzo=" + scaPrenNoIndirizzo );
		ret.append( ", scaPrenNoTel=" + scaPrenNoTel );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		ret.append( ", scpInternet=" + scpInternet );
		ret.append( ", scpParcheggio=" + scpParcheggio );
		ret.append( ", scpAnimali=" + scpAnimali );
		return ret.toString();
	}

}