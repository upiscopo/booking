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

public class GiudiziEsperienze implements Serializable
{
	/** 
	 * This attribute maps to the column giu_id in the giudizi_esperienze table.
	 */
	protected long giuId;

	/** 
	 * This attribute maps to the column giu_staff in the giudizi_esperienze table.
	 */
	protected int giuStaff;

	/** 
	 * This attribute represents whether the primitive attribute giuStaff is null.
	 */
	protected boolean giuStaffNull = true;

	/** 
	 * This attribute maps to the column giu_servizi in the giudizi_esperienze table.
	 */
	protected int giuServizi;

	/** 
	 * This attribute represents whether the primitive attribute giuServizi is null.
	 */
	protected boolean giuServiziNull = true;

	/** 
	 * This attribute maps to the column giu_pulizia in the giudizi_esperienze table.
	 */
	protected int giuPulizia;

	/** 
	 * This attribute represents whether the primitive attribute giuPulizia is null.
	 */
	protected boolean giuPuliziaNull = true;

	/** 
	 * This attribute maps to the column giu_confort in the giudizi_esperienze table.
	 */
	protected int giuConfort;

	/** 
	 * This attribute represents whether the primitive attribute giuConfort is null.
	 */
	protected boolean giuConfortNull = true;

	/** 
	 * This attribute maps to the column giu_posizione in the giudizi_esperienze table.
	 */
	protected int giuPosizione;

	/** 
	 * This attribute represents whether the primitive attribute giuPosizione is null.
	 */
	protected boolean giuPosizioneNull = true;

	/** 
	 * This attribute maps to the column giu_qual_prez in the giudizi_esperienze table.
	 */
	protected int giuQualPrez;

	/** 
	 * This attribute represents whether the primitive attribute giuQualPrez is null.
	 */
	protected boolean giuQualPrezNull = true;

	/** 
	 * This attribute maps to the column pre_categoria in the giudizi_esperienze table.
	 */
	protected long preCategoria;

	/** 
	 * This attribute represents whether the primitive attribute preCategoria is null.
	 */
	protected boolean preCategoriaNull = true;

	/** 
	 * This attribute maps to the column pre_commento in the giudizi_esperienze table.
	 */
	protected String preCommento;

	/** 
	 * This attribute maps to the column prenotazioni_pre_id in the giudizi_esperienze table.
	 */
	protected long prenotazioniPreId;

	/**
	 * Method 'GiudiziEsperienze'
	 * 
	 */
	public GiudiziEsperienze()
	{
	}

	/**
	 * Method 'getGiuId'
	 * 
	 * @return long
	 */
	public long getGiuId()
	{
		return giuId;
	}

	/**
	 * Method 'setGiuId'
	 * 
	 * @param giuId
	 */
	public void setGiuId(long giuId)
	{
		this.giuId = giuId;
	}

	/**
	 * Method 'getGiuStaff'
	 * 
	 * @return int
	 */
	public int getGiuStaff()
	{
		return giuStaff;
	}

	/**
	 * Method 'setGiuStaff'
	 * 
	 * @param giuStaff
	 */
	public void setGiuStaff(int giuStaff)
	{
		this.giuStaff = giuStaff;
		this.giuStaffNull = false;
	}

	/**
	 * Method 'setGiuStaffNull'
	 * 
	 * @param value
	 */
	public void setGiuStaffNull(boolean value)
	{
		this.giuStaffNull = value;
	}

	/**
	 * Method 'isGiuStaffNull'
	 * 
	 * @return boolean
	 */
	public boolean isGiuStaffNull()
	{
		return giuStaffNull;
	}

	/**
	 * Method 'getGiuServizi'
	 * 
	 * @return int
	 */
	public int getGiuServizi()
	{
		return giuServizi;
	}

	/**
	 * Method 'setGiuServizi'
	 * 
	 * @param giuServizi
	 */
	public void setGiuServizi(int giuServizi)
	{
		this.giuServizi = giuServizi;
		this.giuServiziNull = false;
	}

	/**
	 * Method 'setGiuServiziNull'
	 * 
	 * @param value
	 */
	public void setGiuServiziNull(boolean value)
	{
		this.giuServiziNull = value;
	}

	/**
	 * Method 'isGiuServiziNull'
	 * 
	 * @return boolean
	 */
	public boolean isGiuServiziNull()
	{
		return giuServiziNull;
	}

	/**
	 * Method 'getGiuPulizia'
	 * 
	 * @return int
	 */
	public int getGiuPulizia()
	{
		return giuPulizia;
	}

	/**
	 * Method 'setGiuPulizia'
	 * 
	 * @param giuPulizia
	 */
	public void setGiuPulizia(int giuPulizia)
	{
		this.giuPulizia = giuPulizia;
		this.giuPuliziaNull = false;
	}

	/**
	 * Method 'setGiuPuliziaNull'
	 * 
	 * @param value
	 */
	public void setGiuPuliziaNull(boolean value)
	{
		this.giuPuliziaNull = value;
	}

	/**
	 * Method 'isGiuPuliziaNull'
	 * 
	 * @return boolean
	 */
	public boolean isGiuPuliziaNull()
	{
		return giuPuliziaNull;
	}

	/**
	 * Method 'getGiuConfort'
	 * 
	 * @return int
	 */
	public int getGiuConfort()
	{
		return giuConfort;
	}

	/**
	 * Method 'setGiuConfort'
	 * 
	 * @param giuConfort
	 */
	public void setGiuConfort(int giuConfort)
	{
		this.giuConfort = giuConfort;
		this.giuConfortNull = false;
	}

	/**
	 * Method 'setGiuConfortNull'
	 * 
	 * @param value
	 */
	public void setGiuConfortNull(boolean value)
	{
		this.giuConfortNull = value;
	}

	/**
	 * Method 'isGiuConfortNull'
	 * 
	 * @return boolean
	 */
	public boolean isGiuConfortNull()
	{
		return giuConfortNull;
	}

	/**
	 * Method 'getGiuPosizione'
	 * 
	 * @return int
	 */
	public int getGiuPosizione()
	{
		return giuPosizione;
	}

	/**
	 * Method 'setGiuPosizione'
	 * 
	 * @param giuPosizione
	 */
	public void setGiuPosizione(int giuPosizione)
	{
		this.giuPosizione = giuPosizione;
		this.giuPosizioneNull = false;
	}

	/**
	 * Method 'setGiuPosizioneNull'
	 * 
	 * @param value
	 */
	public void setGiuPosizioneNull(boolean value)
	{
		this.giuPosizioneNull = value;
	}

	/**
	 * Method 'isGiuPosizioneNull'
	 * 
	 * @return boolean
	 */
	public boolean isGiuPosizioneNull()
	{
		return giuPosizioneNull;
	}

	/**
	 * Method 'getGiuQualPrez'
	 * 
	 * @return int
	 */
	public int getGiuQualPrez()
	{
		return giuQualPrez;
	}

	/**
	 * Method 'setGiuQualPrez'
	 * 
	 * @param giuQualPrez
	 */
	public void setGiuQualPrez(int giuQualPrez)
	{
		this.giuQualPrez = giuQualPrez;
		this.giuQualPrezNull = false;
	}

	/**
	 * Method 'setGiuQualPrezNull'
	 * 
	 * @param value
	 */
	public void setGiuQualPrezNull(boolean value)
	{
		this.giuQualPrezNull = value;
	}

	/**
	 * Method 'isGiuQualPrezNull'
	 * 
	 * @return boolean
	 */
	public boolean isGiuQualPrezNull()
	{
		return giuQualPrezNull;
	}

	/**
	 * Method 'getPreCategoria'
	 * 
	 * @return long
	 */
	public long getPreCategoria()
	{
		return preCategoria;
	}

	/**
	 * Method 'setPreCategoria'
	 * 
	 * @param preCategoria
	 */
	public void setPreCategoria(long preCategoria)
	{
		this.preCategoria = preCategoria;
		this.preCategoriaNull = false;
	}

	/**
	 * Method 'setPreCategoriaNull'
	 * 
	 * @param value
	 */
	public void setPreCategoriaNull(boolean value)
	{
		this.preCategoriaNull = value;
	}

	/**
	 * Method 'isPreCategoriaNull'
	 * 
	 * @return boolean
	 */
	public boolean isPreCategoriaNull()
	{
		return preCategoriaNull;
	}

	/**
	 * Method 'getPreCommento'
	 * 
	 * @return String
	 */
	public String getPreCommento()
	{
		return preCommento;
	}

	/**
	 * Method 'setPreCommento'
	 * 
	 * @param preCommento
	 */
	public void setPreCommento(String preCommento)
	{
		this.preCommento = preCommento;
	}

	/**
	 * Method 'getPrenotazioniPreId'
	 * 
	 * @return long
	 */
	public long getPrenotazioniPreId()
	{
		return prenotazioniPreId;
	}

	/**
	 * Method 'setPrenotazioniPreId'
	 * 
	 * @param prenotazioniPreId
	 */
	public void setPrenotazioniPreId(long prenotazioniPreId)
	{
		this.prenotazioniPreId = prenotazioniPreId;
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
		
		if (!(_other instanceof GiudiziEsperienze)) {
			return false;
		}
		
		final GiudiziEsperienze _cast = (GiudiziEsperienze) _other;
		if (giuId != _cast.giuId) {
			return false;
		}
		
		if (giuStaff != _cast.giuStaff) {
			return false;
		}
		
		if (giuStaffNull != _cast.giuStaffNull) {
			return false;
		}
		
		if (giuServizi != _cast.giuServizi) {
			return false;
		}
		
		if (giuServiziNull != _cast.giuServiziNull) {
			return false;
		}
		
		if (giuPulizia != _cast.giuPulizia) {
			return false;
		}
		
		if (giuPuliziaNull != _cast.giuPuliziaNull) {
			return false;
		}
		
		if (giuConfort != _cast.giuConfort) {
			return false;
		}
		
		if (giuConfortNull != _cast.giuConfortNull) {
			return false;
		}
		
		if (giuPosizione != _cast.giuPosizione) {
			return false;
		}
		
		if (giuPosizioneNull != _cast.giuPosizioneNull) {
			return false;
		}
		
		if (giuQualPrez != _cast.giuQualPrez) {
			return false;
		}
		
		if (giuQualPrezNull != _cast.giuQualPrezNull) {
			return false;
		}
		
		if (preCategoria != _cast.preCategoria) {
			return false;
		}
		
		if (preCategoriaNull != _cast.preCategoriaNull) {
			return false;
		}
		
		if (preCommento == null ? _cast.preCommento != preCommento : !preCommento.equals( _cast.preCommento )) {
			return false;
		}
		
		if (prenotazioniPreId != _cast.prenotazioniPreId) {
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
		_hashCode = 29 * _hashCode + (int) (giuId ^ (giuId >>> 32));
		_hashCode = 29 * _hashCode + giuStaff;
		_hashCode = 29 * _hashCode + (giuStaffNull ? 1 : 0);
		_hashCode = 29 * _hashCode + giuServizi;
		_hashCode = 29 * _hashCode + (giuServiziNull ? 1 : 0);
		_hashCode = 29 * _hashCode + giuPulizia;
		_hashCode = 29 * _hashCode + (giuPuliziaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + giuConfort;
		_hashCode = 29 * _hashCode + (giuConfortNull ? 1 : 0);
		_hashCode = 29 * _hashCode + giuPosizione;
		_hashCode = 29 * _hashCode + (giuPosizioneNull ? 1 : 0);
		_hashCode = 29 * _hashCode + giuQualPrez;
		_hashCode = 29 * _hashCode + (giuQualPrezNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (preCategoria ^ (preCategoria >>> 32));
		_hashCode = 29 * _hashCode + (preCategoriaNull ? 1 : 0);
		if (preCommento != null) {
			_hashCode = 29 * _hashCode + preCommento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (prenotazioniPreId ^ (prenotazioniPreId >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return GiudiziEsperienzePk
	 */
	public GiudiziEsperienzePk createPk()
	{
		return new GiudiziEsperienzePk(giuId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.GiudiziEsperienze: " );
		ret.append( "giuId=" + giuId );
		ret.append( ", giuStaff=" + giuStaff );
		ret.append( ", giuServizi=" + giuServizi );
		ret.append( ", giuPulizia=" + giuPulizia );
		ret.append( ", giuConfort=" + giuConfort );
		ret.append( ", giuPosizione=" + giuPosizione );
		ret.append( ", giuQualPrez=" + giuQualPrez );
		ret.append( ", preCategoria=" + preCategoria );
		ret.append( ", preCommento=" + preCommento );
		ret.append( ", prenotazioniPreId=" + prenotazioniPreId );
		return ret.toString();
	}

}
