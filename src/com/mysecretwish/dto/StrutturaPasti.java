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

public class StrutturaPasti implements Serializable
{
	/** 
	 * This attribute maps to the column spa_id in the struttura_pasti table.
	 */
	protected long spaId;

	/** 
	 * This attribute maps to the column spa_offre_col_pra_cen in the struttura_pasti table.
	 */
	protected String spaOffreColPraCen;

	/** 
	 * This attribute maps to the column spa_colazione_inclusa in the struttura_pasti table.
	 */
	protected String spaColazioneInclusa;

	/** 
	 * This attribute maps to the column spa_vendo_pasti_online in the struttura_pasti table.
	 */
	protected String spaVendoPastiOnline;

	/** 
	 * This attribute maps to the column spe_prezzo_col_online in the struttura_pasti table.
	 */
	protected float spePrezzoColOnline;

	/** 
	 * This attribute represents whether the primitive attribute spePrezzoColOnline is null.
	 */
	protected boolean spePrezzoColOnlineNull = true;

	/** 
	 * This attribute maps to the column spe_prezzo_par_online in the struttura_pasti table.
	 */
	protected float spePrezzoParOnline;

	/** 
	 * This attribute represents whether the primitive attribute spePrezzoParOnline is null.
	 */
	protected boolean spePrezzoParOnlineNull = true;

	/** 
	 * This attribute maps to the column spe_prezzo_cen_online in the struttura_pasti table.
	 */
	protected float spePrezzoCenOnline;

	/** 
	 * This attribute represents whether the primitive attribute spePrezzoCenOnline is null.
	 */
	protected boolean spePrezzoCenOnlineNull = true;

	/** 
	 * This attribute maps to the column spa_col_americana in the struttura_pasti table.
	 */
	protected String spaColAmericana;

	/** 
	 * This attribute maps to the column spa_col_senza_glutine in the struttura_pasti table.
	 */
	protected String spaColSenzaGlutine;

	/** 
	 * This attribute maps to the column spa_col_vegetariana in the struttura_pasti table.
	 */
	protected String spaColVegetariana;

	/** 
	 * This attribute maps to the column spa_col_asiatica in the struttura_pasti table.
	 */
	protected String spaColAsiatica;

	/** 
	 * This attribute maps to the column spa_col_halal in the struttura_pasti table.
	 */
	protected String spaColHalal;

	/** 
	 * This attribute maps to the column spa_col_vegana in the struttura_pasti table.
	 */
	protected String spaColVegana;

	/** 
	 * This attribute maps to the column spa_col_buffet in the struttura_pasti table.
	 */
	protected String spaColBuffet;

	/** 
	 * This attribute maps to the column spa_col_italiana in the struttura_pasti table.
	 */
	protected String spaColItaliana;

	/** 
	 * This attribute maps to the column spa_col_inglese in the struttura_pasti table.
	 */
	protected String spaColInglese;

	/** 
	 * This attribute maps to the column spa_col_continentale in the struttura_pasti table.
	 */
	protected String spaColContinentale;

	/** 
	 * This attribute maps to the column spa_col_koser in the struttura_pasti table.
	 */
	protected String spaColKoser;

	/** 
	 * This attribute maps to the column struttura_str_id in the struttura_pasti table.
	 */
	protected long strutturaStrId;

	/**
	 * Method 'StrutturaPasti'
	 * 
	 */
	public StrutturaPasti()
	{
	}

	/**
	 * Method 'getSpaId'
	 * 
	 * @return long
	 */
	public long getSpaId()
	{
		return spaId;
	}

	/**
	 * Method 'setSpaId'
	 * 
	 * @param spaId
	 */
	public void setSpaId(long spaId)
	{
		this.spaId = spaId;
	}

	/**
	 * Method 'getSpaOffreColPraCen'
	 * 
	 * @return String
	 */
	public String getSpaOffreColPraCen()
	{
		return spaOffreColPraCen;
	}

	/**
	 * Method 'setSpaOffreColPraCen'
	 * 
	 * @param spaOffreColPraCen
	 */
	public void setSpaOffreColPraCen(String spaOffreColPraCen)
	{
		this.spaOffreColPraCen = spaOffreColPraCen;
	}

	/**
	 * Method 'getSpaColazioneInclusa'
	 * 
	 * @return String
	 */
	public String getSpaColazioneInclusa()
	{
		return spaColazioneInclusa;
	}

	/**
	 * Method 'setSpaColazioneInclusa'
	 * 
	 * @param spaColazioneInclusa
	 */
	public void setSpaColazioneInclusa(String spaColazioneInclusa)
	{
		this.spaColazioneInclusa = spaColazioneInclusa;
	}

	/**
	 * Method 'getSpaVendoPastiOnline'
	 * 
	 * @return String
	 */
	public String getSpaVendoPastiOnline()
	{
		return spaVendoPastiOnline;
	}

	/**
	 * Method 'setSpaVendoPastiOnline'
	 * 
	 * @param spaVendoPastiOnline
	 */
	public void setSpaVendoPastiOnline(String spaVendoPastiOnline)
	{
		this.spaVendoPastiOnline = spaVendoPastiOnline;
	}

	/**
	 * Method 'getSpePrezzoColOnline'
	 * 
	 * @return float
	 */
	public float getSpePrezzoColOnline()
	{
		return spePrezzoColOnline;
	}

	/**
	 * Method 'setSpePrezzoColOnline'
	 * 
	 * @param spePrezzoColOnline
	 */
	public void setSpePrezzoColOnline(float spePrezzoColOnline)
	{
		this.spePrezzoColOnline = spePrezzoColOnline;
		this.spePrezzoColOnlineNull = false;
	}

	/**
	 * Method 'setSpePrezzoColOnlineNull'
	 * 
	 * @param value
	 */
	public void setSpePrezzoColOnlineNull(boolean value)
	{
		this.spePrezzoColOnlineNull = value;
	}

	/**
	 * Method 'isSpePrezzoColOnlineNull'
	 * 
	 * @return boolean
	 */
	public boolean isSpePrezzoColOnlineNull()
	{
		return spePrezzoColOnlineNull;
	}

	/**
	 * Method 'getSpePrezzoParOnline'
	 * 
	 * @return float
	 */
	public float getSpePrezzoParOnline()
	{
		return spePrezzoParOnline;
	}

	/**
	 * Method 'setSpePrezzoParOnline'
	 * 
	 * @param spePrezzoParOnline
	 */
	public void setSpePrezzoParOnline(float spePrezzoParOnline)
	{
		this.spePrezzoParOnline = spePrezzoParOnline;
		this.spePrezzoParOnlineNull = false;
	}

	/**
	 * Method 'setSpePrezzoParOnlineNull'
	 * 
	 * @param value
	 */
	public void setSpePrezzoParOnlineNull(boolean value)
	{
		this.spePrezzoParOnlineNull = value;
	}

	/**
	 * Method 'isSpePrezzoParOnlineNull'
	 * 
	 * @return boolean
	 */
	public boolean isSpePrezzoParOnlineNull()
	{
		return spePrezzoParOnlineNull;
	}

	/**
	 * Method 'getSpePrezzoCenOnline'
	 * 
	 * @return float
	 */
	public float getSpePrezzoCenOnline()
	{
		return spePrezzoCenOnline;
	}

	/**
	 * Method 'setSpePrezzoCenOnline'
	 * 
	 * @param spePrezzoCenOnline
	 */
	public void setSpePrezzoCenOnline(float spePrezzoCenOnline)
	{
		this.spePrezzoCenOnline = spePrezzoCenOnline;
		this.spePrezzoCenOnlineNull = false;
	}

	/**
	 * Method 'setSpePrezzoCenOnlineNull'
	 * 
	 * @param value
	 */
	public void setSpePrezzoCenOnlineNull(boolean value)
	{
		this.spePrezzoCenOnlineNull = value;
	}

	/**
	 * Method 'isSpePrezzoCenOnlineNull'
	 * 
	 * @return boolean
	 */
	public boolean isSpePrezzoCenOnlineNull()
	{
		return spePrezzoCenOnlineNull;
	}

	/**
	 * Method 'getSpaColAmericana'
	 * 
	 * @return String
	 */
	public String getSpaColAmericana()
	{
		return spaColAmericana;
	}

	/**
	 * Method 'setSpaColAmericana'
	 * 
	 * @param spaColAmericana
	 */
	public void setSpaColAmericana(String spaColAmericana)
	{
		this.spaColAmericana = spaColAmericana;
	}

	/**
	 * Method 'getSpaColSenzaGlutine'
	 * 
	 * @return String
	 */
	public String getSpaColSenzaGlutine()
	{
		return spaColSenzaGlutine;
	}

	/**
	 * Method 'setSpaColSenzaGlutine'
	 * 
	 * @param spaColSenzaGlutine
	 */
	public void setSpaColSenzaGlutine(String spaColSenzaGlutine)
	{
		this.spaColSenzaGlutine = spaColSenzaGlutine;
	}

	/**
	 * Method 'getSpaColVegetariana'
	 * 
	 * @return String
	 */
	public String getSpaColVegetariana()
	{
		return spaColVegetariana;
	}

	/**
	 * Method 'setSpaColVegetariana'
	 * 
	 * @param spaColVegetariana
	 */
	public void setSpaColVegetariana(String spaColVegetariana)
	{
		this.spaColVegetariana = spaColVegetariana;
	}

	/**
	 * Method 'getSpaColAsiatica'
	 * 
	 * @return String
	 */
	public String getSpaColAsiatica()
	{
		return spaColAsiatica;
	}

	/**
	 * Method 'setSpaColAsiatica'
	 * 
	 * @param spaColAsiatica
	 */
	public void setSpaColAsiatica(String spaColAsiatica)
	{
		this.spaColAsiatica = spaColAsiatica;
	}

	/**
	 * Method 'getSpaColHalal'
	 * 
	 * @return String
	 */
	public String getSpaColHalal()
	{
		return spaColHalal;
	}

	/**
	 * Method 'setSpaColHalal'
	 * 
	 * @param spaColHalal
	 */
	public void setSpaColHalal(String spaColHalal)
	{
		this.spaColHalal = spaColHalal;
	}

	/**
	 * Method 'getSpaColVegana'
	 * 
	 * @return String
	 */
	public String getSpaColVegana()
	{
		return spaColVegana;
	}

	/**
	 * Method 'setSpaColVegana'
	 * 
	 * @param spaColVegana
	 */
	public void setSpaColVegana(String spaColVegana)
	{
		this.spaColVegana = spaColVegana;
	}

	/**
	 * Method 'getSpaColBuffet'
	 * 
	 * @return String
	 */
	public String getSpaColBuffet()
	{
		return spaColBuffet;
	}

	/**
	 * Method 'setSpaColBuffet'
	 * 
	 * @param spaColBuffet
	 */
	public void setSpaColBuffet(String spaColBuffet)
	{
		this.spaColBuffet = spaColBuffet;
	}

	/**
	 * Method 'getSpaColItaliana'
	 * 
	 * @return String
	 */
	public String getSpaColItaliana()
	{
		return spaColItaliana;
	}

	/**
	 * Method 'setSpaColItaliana'
	 * 
	 * @param spaColItaliana
	 */
	public void setSpaColItaliana(String spaColItaliana)
	{
		this.spaColItaliana = spaColItaliana;
	}

	/**
	 * Method 'getSpaColInglese'
	 * 
	 * @return String
	 */
	public String getSpaColInglese()
	{
		return spaColInglese;
	}

	/**
	 * Method 'setSpaColInglese'
	 * 
	 * @param spaColInglese
	 */
	public void setSpaColInglese(String spaColInglese)
	{
		this.spaColInglese = spaColInglese;
	}

	/**
	 * Method 'getSpaColContinentale'
	 * 
	 * @return String
	 */
	public String getSpaColContinentale()
	{
		return spaColContinentale;
	}

	/**
	 * Method 'setSpaColContinentale'
	 * 
	 * @param spaColContinentale
	 */
	public void setSpaColContinentale(String spaColContinentale)
	{
		this.spaColContinentale = spaColContinentale;
	}

	/**
	 * Method 'getSpaColKoser'
	 * 
	 * @return String
	 */
	public String getSpaColKoser()
	{
		return spaColKoser;
	}

	/**
	 * Method 'setSpaColKoser'
	 * 
	 * @param spaColKoser
	 */
	public void setSpaColKoser(String spaColKoser)
	{
		this.spaColKoser = spaColKoser;
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
		
		if (!(_other instanceof StrutturaPasti)) {
			return false;
		}
		
		final StrutturaPasti _cast = (StrutturaPasti) _other;
		if (spaId != _cast.spaId) {
			return false;
		}
		
		if (spaOffreColPraCen == null ? _cast.spaOffreColPraCen != spaOffreColPraCen : !spaOffreColPraCen.equals( _cast.spaOffreColPraCen )) {
			return false;
		}
		
		if (spaColazioneInclusa == null ? _cast.spaColazioneInclusa != spaColazioneInclusa : !spaColazioneInclusa.equals( _cast.spaColazioneInclusa )) {
			return false;
		}
		
		if (spaVendoPastiOnline == null ? _cast.spaVendoPastiOnline != spaVendoPastiOnline : !spaVendoPastiOnline.equals( _cast.spaVendoPastiOnline )) {
			return false;
		}
		
		if (spePrezzoColOnline != _cast.spePrezzoColOnline) {
			return false;
		}
		
		if (spePrezzoColOnlineNull != _cast.spePrezzoColOnlineNull) {
			return false;
		}
		
		if (spePrezzoParOnline != _cast.spePrezzoParOnline) {
			return false;
		}
		
		if (spePrezzoParOnlineNull != _cast.spePrezzoParOnlineNull) {
			return false;
		}
		
		if (spePrezzoCenOnline != _cast.spePrezzoCenOnline) {
			return false;
		}
		
		if (spePrezzoCenOnlineNull != _cast.spePrezzoCenOnlineNull) {
			return false;
		}
		
		if (spaColAmericana == null ? _cast.spaColAmericana != spaColAmericana : !spaColAmericana.equals( _cast.spaColAmericana )) {
			return false;
		}
		
		if (spaColSenzaGlutine == null ? _cast.spaColSenzaGlutine != spaColSenzaGlutine : !spaColSenzaGlutine.equals( _cast.spaColSenzaGlutine )) {
			return false;
		}
		
		if (spaColVegetariana == null ? _cast.spaColVegetariana != spaColVegetariana : !spaColVegetariana.equals( _cast.spaColVegetariana )) {
			return false;
		}
		
		if (spaColAsiatica == null ? _cast.spaColAsiatica != spaColAsiatica : !spaColAsiatica.equals( _cast.spaColAsiatica )) {
			return false;
		}
		
		if (spaColHalal == null ? _cast.spaColHalal != spaColHalal : !spaColHalal.equals( _cast.spaColHalal )) {
			return false;
		}
		
		if (spaColVegana == null ? _cast.spaColVegana != spaColVegana : !spaColVegana.equals( _cast.spaColVegana )) {
			return false;
		}
		
		if (spaColBuffet == null ? _cast.spaColBuffet != spaColBuffet : !spaColBuffet.equals( _cast.spaColBuffet )) {
			return false;
		}
		
		if (spaColItaliana == null ? _cast.spaColItaliana != spaColItaliana : !spaColItaliana.equals( _cast.spaColItaliana )) {
			return false;
		}
		
		if (spaColInglese == null ? _cast.spaColInglese != spaColInglese : !spaColInglese.equals( _cast.spaColInglese )) {
			return false;
		}
		
		if (spaColContinentale == null ? _cast.spaColContinentale != spaColContinentale : !spaColContinentale.equals( _cast.spaColContinentale )) {
			return false;
		}
		
		if (spaColKoser == null ? _cast.spaColKoser != spaColKoser : !spaColKoser.equals( _cast.spaColKoser )) {
			return false;
		}
		
		if (strutturaStrId != _cast.strutturaStrId) {
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
		_hashCode = 29 * _hashCode + (int) (spaId ^ (spaId >>> 32));
		if (spaOffreColPraCen != null) {
			_hashCode = 29 * _hashCode + spaOffreColPraCen.hashCode();
		}
		
		if (spaColazioneInclusa != null) {
			_hashCode = 29 * _hashCode + spaColazioneInclusa.hashCode();
		}
		
		if (spaVendoPastiOnline != null) {
			_hashCode = 29 * _hashCode + spaVendoPastiOnline.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(spePrezzoColOnline);
		_hashCode = 29 * _hashCode + (spePrezzoColOnlineNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(spePrezzoParOnline);
		_hashCode = 29 * _hashCode + (spePrezzoParOnlineNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(spePrezzoCenOnline);
		_hashCode = 29 * _hashCode + (spePrezzoCenOnlineNull ? 1 : 0);
		if (spaColAmericana != null) {
			_hashCode = 29 * _hashCode + spaColAmericana.hashCode();
		}
		
		if (spaColSenzaGlutine != null) {
			_hashCode = 29 * _hashCode + spaColSenzaGlutine.hashCode();
		}
		
		if (spaColVegetariana != null) {
			_hashCode = 29 * _hashCode + spaColVegetariana.hashCode();
		}
		
		if (spaColAsiatica != null) {
			_hashCode = 29 * _hashCode + spaColAsiatica.hashCode();
		}
		
		if (spaColHalal != null) {
			_hashCode = 29 * _hashCode + spaColHalal.hashCode();
		}
		
		if (spaColVegana != null) {
			_hashCode = 29 * _hashCode + spaColVegana.hashCode();
		}
		
		if (spaColBuffet != null) {
			_hashCode = 29 * _hashCode + spaColBuffet.hashCode();
		}
		
		if (spaColItaliana != null) {
			_hashCode = 29 * _hashCode + spaColItaliana.hashCode();
		}
		
		if (spaColInglese != null) {
			_hashCode = 29 * _hashCode + spaColInglese.hashCode();
		}
		
		if (spaColContinentale != null) {
			_hashCode = 29 * _hashCode + spaColContinentale.hashCode();
		}
		
		if (spaColKoser != null) {
			_hashCode = 29 * _hashCode + spaColKoser.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return StrutturaPastiPk
	 */
	public StrutturaPastiPk createPk()
	{
		return new StrutturaPastiPk(spaId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.StrutturaPasti: " );
		ret.append( "spaId=" + spaId );
		ret.append( ", spaOffreColPraCen=" + spaOffreColPraCen );
		ret.append( ", spaColazioneInclusa=" + spaColazioneInclusa );
		ret.append( ", spaVendoPastiOnline=" + spaVendoPastiOnline );
		ret.append( ", spePrezzoColOnline=" + spePrezzoColOnline );
		ret.append( ", spePrezzoParOnline=" + spePrezzoParOnline );
		ret.append( ", spePrezzoCenOnline=" + spePrezzoCenOnline );
		ret.append( ", spaColAmericana=" + spaColAmericana );
		ret.append( ", spaColSenzaGlutine=" + spaColSenzaGlutine );
		ret.append( ", spaColVegetariana=" + spaColVegetariana );
		ret.append( ", spaColAsiatica=" + spaColAsiatica );
		ret.append( ", spaColHalal=" + spaColHalal );
		ret.append( ", spaColVegana=" + spaColVegana );
		ret.append( ", spaColBuffet=" + spaColBuffet );
		ret.append( ", spaColItaliana=" + spaColItaliana );
		ret.append( ", spaColInglese=" + spaColInglese );
		ret.append( ", spaColContinentale=" + spaColContinentale );
		ret.append( ", spaColKoser=" + spaColKoser );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		return ret.toString();
	}

}
