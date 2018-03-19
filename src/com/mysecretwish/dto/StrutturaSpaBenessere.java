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

public class StrutturaSpaBenessere implements Serializable
{
	/** 
	 * This attribute maps to the column ssp_id in the struttura_spa_benessere table.
	 */
	protected long sspId;

	/** 
	 * This attribute maps to the column ssp_spa_ben in the struttura_spa_benessere table.
	 */
	protected String sspSpaBen;

	/** 
	 * This attribute maps to the column ssp_costo in the struttura_spa_benessere table.
	 */
	protected float sspCosto;

	/** 
	 * This attribute maps to the column ssp_sauna in the struttura_spa_benessere table.
	 */
	protected String sspSauna;

	/** 
	 * This attribute maps to the column ssp_hammam in the struttura_spa_benessere table.
	 */
	protected String sspHammam;

	/** 
	 * This attribute maps to the column ssp_vasca_idro in the struttura_spa_benessere table.
	 */
	protected String sspVascaIdro;

	/** 
	 * This attribute maps to the column ssp_palestra in the struttura_spa_benessere table.
	 */
	protected String sspPalestra;

	/** 
	 * This attribute maps to the column ssp_solarium in the struttura_spa_benessere table.
	 */
	protected String sspSolarium;

	/** 
	 * This attribute maps to the column ssp_vasca_term in the struttura_spa_benessere table.
	 */
	protected String sspVascaTerm;

	/** 
	 * This attribute maps to the column ssp_massaggi in the struttura_spa_benessere table.
	 */
	protected String sspMassaggi;

	/** 
	 * This attribute maps to the column ssp_costo_mass in the struttura_spa_benessere table.
	 */
	protected float sspCostoMass;

	/** 
	 * This attribute maps to the column ssp_mass_schiena in the struttura_spa_benessere table.
	 */
	protected String sspMassSchiena;

	/** 
	 * This attribute maps to the column ssp_mass_collo in the struttura_spa_benessere table.
	 */
	protected String sspMassCollo;

	/** 
	 * This attribute maps to the column ssp_mass_testa in the struttura_spa_benessere table.
	 */
	protected String sspMassTesta;

	/** 
	 * This attribute maps to the column ssp_mass_coppia in the struttura_spa_benessere table.
	 */
	protected String sspMassCoppia;

	/** 
	 * This attribute maps to the column ssp_mass_corpo in the struttura_spa_benessere table.
	 */
	protected String sspMassCorpo;

	/** 
	 * This attribute maps to the column ssp_mass_mani in the struttura_spa_benessere table.
	 */
	protected String sspMassMani;

	/** 
	 * This attribute maps to the column ssp_vasca_com in the struttura_spa_benessere table.
	 */
	protected String sspVascaCom;

	/** 
	 * This attribute maps to the column ssp_vasca_aperto in the struttura_spa_benessere table.
	 */
	protected String sspVascaAperto;

	/** 
	 * This attribute maps to the column struttura_str_id in the struttura_spa_benessere table.
	 */
	protected long strutturaStrId;

	/**
	 * Method 'StrutturaSpaBenessere'
	 * 
	 */
	public StrutturaSpaBenessere()
	{
	}

	/**
	 * Method 'getSspId'
	 * 
	 * @return long
	 */
	public long getSspId()
	{
		return sspId;
	}

	/**
	 * Method 'setSspId'
	 * 
	 * @param sspId
	 */
	public void setSspId(long sspId)
	{
		this.sspId = sspId;
	}

	/**
	 * Method 'getSspSpaBen'
	 * 
	 * @return String
	 */
	public String getSspSpaBen()
	{
		return sspSpaBen;
	}

	/**
	 * Method 'setSspSpaBen'
	 * 
	 * @param sspSpaBen
	 */
	public void setSspSpaBen(String sspSpaBen)
	{
		this.sspSpaBen = sspSpaBen;
	}

	/**
	 * Method 'getSspCosto'
	 * 
	 * @return float
	 */
	public float getSspCosto()
	{
		return sspCosto;
	}

	/**
	 * Method 'setSspCosto'
	 * 
	 * @param sspCosto
	 */
	public void setSspCosto(float sspCosto)
	{
		this.sspCosto = sspCosto;
	}

	/**
	 * Method 'getSspSauna'
	 * 
	 * @return String
	 */
	public String getSspSauna()
	{
		return sspSauna;
	}

	/**
	 * Method 'setSspSauna'
	 * 
	 * @param sspSauna
	 */
	public void setSspSauna(String sspSauna)
	{
		this.sspSauna = sspSauna;
	}

	/**
	 * Method 'getSspHammam'
	 * 
	 * @return String
	 */
	public String getSspHammam()
	{
		return sspHammam;
	}

	/**
	 * Method 'setSspHammam'
	 * 
	 * @param sspHammam
	 */
	public void setSspHammam(String sspHammam)
	{
		this.sspHammam = sspHammam;
	}

	/**
	 * Method 'getSspVascaIdro'
	 * 
	 * @return String
	 */
	public String getSspVascaIdro()
	{
		return sspVascaIdro;
	}

	/**
	 * Method 'setSspVascaIdro'
	 * 
	 * @param sspVascaIdro
	 */
	public void setSspVascaIdro(String sspVascaIdro)
	{
		this.sspVascaIdro = sspVascaIdro;
	}

	/**
	 * Method 'getSspPalestra'
	 * 
	 * @return String
	 */
	public String getSspPalestra()
	{
		return sspPalestra;
	}

	/**
	 * Method 'setSspPalestra'
	 * 
	 * @param sspPalestra
	 */
	public void setSspPalestra(String sspPalestra)
	{
		this.sspPalestra = sspPalestra;
	}

	/**
	 * Method 'getSspSolarium'
	 * 
	 * @return String
	 */
	public String getSspSolarium()
	{
		return sspSolarium;
	}

	/**
	 * Method 'setSspSolarium'
	 * 
	 * @param sspSolarium
	 */
	public void setSspSolarium(String sspSolarium)
	{
		this.sspSolarium = sspSolarium;
	}

	/**
	 * Method 'getSspVascaTerm'
	 * 
	 * @return String
	 */
	public String getSspVascaTerm()
	{
		return sspVascaTerm;
	}

	/**
	 * Method 'setSspVascaTerm'
	 * 
	 * @param sspVascaTerm
	 */
	public void setSspVascaTerm(String sspVascaTerm)
	{
		this.sspVascaTerm = sspVascaTerm;
	}

	/**
	 * Method 'getSspMassaggi'
	 * 
	 * @return String
	 */
	public String getSspMassaggi()
	{
		return sspMassaggi;
	}

	/**
	 * Method 'setSspMassaggi'
	 * 
	 * @param sspMassaggi
	 */
	public void setSspMassaggi(String sspMassaggi)
	{
		this.sspMassaggi = sspMassaggi;
	}

	/**
	 * Method 'getSspCostoMass'
	 * 
	 * @return float
	 */
	public float getSspCostoMass()
	{
		return sspCostoMass;
	}

	/**
	 * Method 'setSspCostoMass'
	 * 
	 * @param sspCostoMass
	 */
	public void setSspCostoMass(float sspCostoMass)
	{
		this.sspCostoMass = sspCostoMass;
	}

	/**
	 * Method 'getSspMassSchiena'
	 * 
	 * @return String
	 */
	public String getSspMassSchiena()
	{
		return sspMassSchiena;
	}

	/**
	 * Method 'setSspMassSchiena'
	 * 
	 * @param sspMassSchiena
	 */
	public void setSspMassSchiena(String sspMassSchiena)
	{
		this.sspMassSchiena = sspMassSchiena;
	}

	/**
	 * Method 'getSspMassCollo'
	 * 
	 * @return String
	 */
	public String getSspMassCollo()
	{
		return sspMassCollo;
	}

	/**
	 * Method 'setSspMassCollo'
	 * 
	 * @param sspMassCollo
	 */
	public void setSspMassCollo(String sspMassCollo)
	{
		this.sspMassCollo = sspMassCollo;
	}

	/**
	 * Method 'getSspMassTesta'
	 * 
	 * @return String
	 */
	public String getSspMassTesta()
	{
		return sspMassTesta;
	}

	/**
	 * Method 'setSspMassTesta'
	 * 
	 * @param sspMassTesta
	 */
	public void setSspMassTesta(String sspMassTesta)
	{
		this.sspMassTesta = sspMassTesta;
	}

	/**
	 * Method 'getSspMassCoppia'
	 * 
	 * @return String
	 */
	public String getSspMassCoppia()
	{
		return sspMassCoppia;
	}

	/**
	 * Method 'setSspMassCoppia'
	 * 
	 * @param sspMassCoppia
	 */
	public void setSspMassCoppia(String sspMassCoppia)
	{
		this.sspMassCoppia = sspMassCoppia;
	}

	/**
	 * Method 'getSspMassCorpo'
	 * 
	 * @return String
	 */
	public String getSspMassCorpo()
	{
		return sspMassCorpo;
	}

	/**
	 * Method 'setSspMassCorpo'
	 * 
	 * @param sspMassCorpo
	 */
	public void setSspMassCorpo(String sspMassCorpo)
	{
		this.sspMassCorpo = sspMassCorpo;
	}

	/**
	 * Method 'getSspMassMani'
	 * 
	 * @return String
	 */
	public String getSspMassMani()
	{
		return sspMassMani;
	}

	/**
	 * Method 'setSspMassMani'
	 * 
	 * @param sspMassMani
	 */
	public void setSspMassMani(String sspMassMani)
	{
		this.sspMassMani = sspMassMani;
	}

	/**
	 * Method 'getSspVascaCom'
	 * 
	 * @return String
	 */
	public String getSspVascaCom()
	{
		return sspVascaCom;
	}

	/**
	 * Method 'setSspVascaCom'
	 * 
	 * @param sspVascaCom
	 */
	public void setSspVascaCom(String sspVascaCom)
	{
		this.sspVascaCom = sspVascaCom;
	}

	/**
	 * Method 'getSspVascaAperto'
	 * 
	 * @return String
	 */
	public String getSspVascaAperto()
	{
		return sspVascaAperto;
	}

	/**
	 * Method 'setSspVascaAperto'
	 * 
	 * @param sspVascaAperto
	 */
	public void setSspVascaAperto(String sspVascaAperto)
	{
		this.sspVascaAperto = sspVascaAperto;
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
		
		if (!(_other instanceof StrutturaSpaBenessere)) {
			return false;
		}
		
		final StrutturaSpaBenessere _cast = (StrutturaSpaBenessere) _other;
		if (sspId != _cast.sspId) {
			return false;
		}
		
		if (sspSpaBen == null ? _cast.sspSpaBen != sspSpaBen : !sspSpaBen.equals( _cast.sspSpaBen )) {
			return false;
		}
		
		if (sspCosto != _cast.sspCosto) {
			return false;
		}
		
		if (sspSauna == null ? _cast.sspSauna != sspSauna : !sspSauna.equals( _cast.sspSauna )) {
			return false;
		}
		
		if (sspHammam == null ? _cast.sspHammam != sspHammam : !sspHammam.equals( _cast.sspHammam )) {
			return false;
		}
		
		if (sspVascaIdro == null ? _cast.sspVascaIdro != sspVascaIdro : !sspVascaIdro.equals( _cast.sspVascaIdro )) {
			return false;
		}
		
		if (sspPalestra == null ? _cast.sspPalestra != sspPalestra : !sspPalestra.equals( _cast.sspPalestra )) {
			return false;
		}
		
		if (sspSolarium == null ? _cast.sspSolarium != sspSolarium : !sspSolarium.equals( _cast.sspSolarium )) {
			return false;
		}
		
		if (sspVascaTerm == null ? _cast.sspVascaTerm != sspVascaTerm : !sspVascaTerm.equals( _cast.sspVascaTerm )) {
			return false;
		}
		
		if (sspMassaggi == null ? _cast.sspMassaggi != sspMassaggi : !sspMassaggi.equals( _cast.sspMassaggi )) {
			return false;
		}
		
		if (sspCostoMass != _cast.sspCostoMass) {
			return false;
		}
		
		if (sspMassSchiena == null ? _cast.sspMassSchiena != sspMassSchiena : !sspMassSchiena.equals( _cast.sspMassSchiena )) {
			return false;
		}
		
		if (sspMassCollo == null ? _cast.sspMassCollo != sspMassCollo : !sspMassCollo.equals( _cast.sspMassCollo )) {
			return false;
		}
		
		if (sspMassTesta == null ? _cast.sspMassTesta != sspMassTesta : !sspMassTesta.equals( _cast.sspMassTesta )) {
			return false;
		}
		
		if (sspMassCoppia == null ? _cast.sspMassCoppia != sspMassCoppia : !sspMassCoppia.equals( _cast.sspMassCoppia )) {
			return false;
		}
		
		if (sspMassCorpo == null ? _cast.sspMassCorpo != sspMassCorpo : !sspMassCorpo.equals( _cast.sspMassCorpo )) {
			return false;
		}
		
		if (sspMassMani == null ? _cast.sspMassMani != sspMassMani : !sspMassMani.equals( _cast.sspMassMani )) {
			return false;
		}
		
		if (sspVascaCom == null ? _cast.sspVascaCom != sspVascaCom : !sspVascaCom.equals( _cast.sspVascaCom )) {
			return false;
		}
		
		if (sspVascaAperto == null ? _cast.sspVascaAperto != sspVascaAperto : !sspVascaAperto.equals( _cast.sspVascaAperto )) {
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
		_hashCode = 29 * _hashCode + (int) (sspId ^ (sspId >>> 32));
		if (sspSpaBen != null) {
			_hashCode = 29 * _hashCode + sspSpaBen.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(sspCosto);
		if (sspSauna != null) {
			_hashCode = 29 * _hashCode + sspSauna.hashCode();
		}
		
		if (sspHammam != null) {
			_hashCode = 29 * _hashCode + sspHammam.hashCode();
		}
		
		if (sspVascaIdro != null) {
			_hashCode = 29 * _hashCode + sspVascaIdro.hashCode();
		}
		
		if (sspPalestra != null) {
			_hashCode = 29 * _hashCode + sspPalestra.hashCode();
		}
		
		if (sspSolarium != null) {
			_hashCode = 29 * _hashCode + sspSolarium.hashCode();
		}
		
		if (sspVascaTerm != null) {
			_hashCode = 29 * _hashCode + sspVascaTerm.hashCode();
		}
		
		if (sspMassaggi != null) {
			_hashCode = 29 * _hashCode + sspMassaggi.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(sspCostoMass);
		if (sspMassSchiena != null) {
			_hashCode = 29 * _hashCode + sspMassSchiena.hashCode();
		}
		
		if (sspMassCollo != null) {
			_hashCode = 29 * _hashCode + sspMassCollo.hashCode();
		}
		
		if (sspMassTesta != null) {
			_hashCode = 29 * _hashCode + sspMassTesta.hashCode();
		}
		
		if (sspMassCoppia != null) {
			_hashCode = 29 * _hashCode + sspMassCoppia.hashCode();
		}
		
		if (sspMassCorpo != null) {
			_hashCode = 29 * _hashCode + sspMassCorpo.hashCode();
		}
		
		if (sspMassMani != null) {
			_hashCode = 29 * _hashCode + sspMassMani.hashCode();
		}
		
		if (sspVascaCom != null) {
			_hashCode = 29 * _hashCode + sspVascaCom.hashCode();
		}
		
		if (sspVascaAperto != null) {
			_hashCode = 29 * _hashCode + sspVascaAperto.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return StrutturaSpaBenesserePk
	 */
	public StrutturaSpaBenesserePk createPk()
	{
		return new StrutturaSpaBenesserePk(sspId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.StrutturaSpaBenessere: " );
		ret.append( "sspId=" + sspId );
		ret.append( ", sspSpaBen=" + sspSpaBen );
		ret.append( ", sspCosto=" + sspCosto );
		ret.append( ", sspSauna=" + sspSauna );
		ret.append( ", sspHammam=" + sspHammam );
		ret.append( ", sspVascaIdro=" + sspVascaIdro );
		ret.append( ", sspPalestra=" + sspPalestra );
		ret.append( ", sspSolarium=" + sspSolarium );
		ret.append( ", sspVascaTerm=" + sspVascaTerm );
		ret.append( ", sspMassaggi=" + sspMassaggi );
		ret.append( ", sspCostoMass=" + sspCostoMass );
		ret.append( ", sspMassSchiena=" + sspMassSchiena );
		ret.append( ", sspMassCollo=" + sspMassCollo );
		ret.append( ", sspMassTesta=" + sspMassTesta );
		ret.append( ", sspMassCoppia=" + sspMassCoppia );
		ret.append( ", sspMassCorpo=" + sspMassCorpo );
		ret.append( ", sspMassMani=" + sspMassMani );
		ret.append( ", sspVascaCom=" + sspVascaCom );
		ret.append( ", sspVascaAperto=" + sspVascaAperto );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		return ret.toString();
	}

}