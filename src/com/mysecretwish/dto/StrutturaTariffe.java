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

public class StrutturaTariffe implements Serializable
{
	/** 
	 * This attribute maps to the column tar_id in the struttura_tariffe table.
	 */
	protected long tarId;

	/** 
	 * This attribute maps to the column tar_data_inizio in the struttura_tariffe table.
	 */
	protected Date tarDataInizio;

	/** 
	 * This attribute maps to the column tar_data_fine in the struttura_tariffe table.
	 */
	protected Date tarDataFine;

	/** 
	 * This attribute maps to the column tar_lunedi in the struttura_tariffe table.
	 */
	protected String tarLunedi;

	/** 
	 * This attribute maps to the column tar_martedi in the struttura_tariffe table.
	 */
	protected String tarMartedi;

	/** 
	 * This attribute maps to the column tar_mercoledi in the struttura_tariffe table.
	 */
	protected String tarMercoledi;

	/** 
	 * This attribute maps to the column tar_giovedi in the struttura_tariffe table.
	 */
	protected String tarGiovedi;

	/** 
	 * This attribute maps to the column tar_venerdi in the struttura_tariffe table.
	 */
	protected String tarVenerdi;

	/** 
	 * This attribute maps to the column tar_sabato in the struttura_tariffe table.
	 */
	protected String tarSabato;

	/** 
	 * This attribute maps to the column tar_domenica in the struttura_tariffe table.
	 */
	protected String tarDomenica;

	/** 
	 * This attribute maps to the column tar_tariffa_uso_sing in the struttura_tariffe table.
	 */
	protected float tarTariffaUsoSing;

	/** 
	 * This attribute represents whether the primitive attribute tarTariffaUsoSing is null.
	 */
	protected boolean tarTariffaUsoSingNull = true;

	/** 
	 * This attribute maps to the column tar_tariffa_minima in the struttura_tariffe table.
	 */
	protected float tarTariffaMinima;

	/** 
	 * This attribute represents whether the primitive attribute tarTariffaMinima is null.
	 */
	protected boolean tarTariffaMinimaNull = true;

	/** 
	 * This attribute maps to the column tar_tariffa_standard in the struttura_tariffe table.
	 */
	protected float tarTariffaStandard;

	/** 
	 * This attribute represents whether the primitive attribute tarTariffaStandard is null.
	 */
	protected boolean tarTariffaStandardNull = true;

	/** 
	 * This attribute maps to the column struttura_str_id in the struttura_tariffe table.
	 */
	protected long strutturaStrId;

	/** 
	 * This attribute maps to the column categorie_cat_id in the struttura_tariffe table.
	 */
	protected long categorieCatId;

	/** 
	 * This attribute maps to the column tipologia_camere_tpc_id in the struttura_tariffe table.
	 */
	protected long tipologiaCamereTpcId;

	/**
	 * Method 'StrutturaTariffe'
	 * 
	 */
	public StrutturaTariffe()
	{
	}

	/**
	 * Method 'getTarId'
	 * 
	 * @return long
	 */
	public long getTarId()
	{
		return tarId;
	}

	/**
	 * Method 'setTarId'
	 * 
	 * @param tarId
	 */
	public void setTarId(long tarId)
	{
		this.tarId = tarId;
	}

	/**
	 * Method 'getTarDataInizio'
	 * 
	 * @return Date
	 */
	public Date getTarDataInizio()
	{
		return tarDataInizio;
	}

	/**
	 * Method 'setTarDataInizio'
	 * 
	 * @param tarDataInizio
	 */
	public void setTarDataInizio(Date tarDataInizio)
	{
		this.tarDataInizio = tarDataInizio;
	}

	/**
	 * Method 'getTarDataFine'
	 * 
	 * @return Date
	 */
	public Date getTarDataFine()
	{
		return tarDataFine;
	}

	/**
	 * Method 'setTarDataFine'
	 * 
	 * @param tarDataFine
	 */
	public void setTarDataFine(Date tarDataFine)
	{
		this.tarDataFine = tarDataFine;
	}

	/**
	 * Method 'getTarLunedi'
	 * 
	 * @return String
	 */
	public String getTarLunedi()
	{
		return tarLunedi;
	}

	/**
	 * Method 'setTarLunedi'
	 * 
	 * @param tarLunedi
	 */
	public void setTarLunedi(String tarLunedi)
	{
		this.tarLunedi = tarLunedi;
	}

	/**
	 * Method 'getTarMartedi'
	 * 
	 * @return String
	 */
	public String getTarMartedi()
	{
		return tarMartedi;
	}

	/**
	 * Method 'setTarMartedi'
	 * 
	 * @param tarMartedi
	 */
	public void setTarMartedi(String tarMartedi)
	{
		this.tarMartedi = tarMartedi;
	}

	/**
	 * Method 'getTarMercoledi'
	 * 
	 * @return String
	 */
	public String getTarMercoledi()
	{
		return tarMercoledi;
	}

	/**
	 * Method 'setTarMercoledi'
	 * 
	 * @param tarMercoledi
	 */
	public void setTarMercoledi(String tarMercoledi)
	{
		this.tarMercoledi = tarMercoledi;
	}

	/**
	 * Method 'getTarGiovedi'
	 * 
	 * @return String
	 */
	public String getTarGiovedi()
	{
		return tarGiovedi;
	}

	/**
	 * Method 'setTarGiovedi'
	 * 
	 * @param tarGiovedi
	 */
	public void setTarGiovedi(String tarGiovedi)
	{
		this.tarGiovedi = tarGiovedi;
	}

	/**
	 * Method 'getTarVenerdi'
	 * 
	 * @return String
	 */
	public String getTarVenerdi()
	{
		return tarVenerdi;
	}

	/**
	 * Method 'setTarVenerdi'
	 * 
	 * @param tarVenerdi
	 */
	public void setTarVenerdi(String tarVenerdi)
	{
		this.tarVenerdi = tarVenerdi;
	}

	/**
	 * Method 'getTarSabato'
	 * 
	 * @return String
	 */
	public String getTarSabato()
	{
		return tarSabato;
	}

	/**
	 * Method 'setTarSabato'
	 * 
	 * @param tarSabato
	 */
	public void setTarSabato(String tarSabato)
	{
		this.tarSabato = tarSabato;
	}

	/**
	 * Method 'getTarDomenica'
	 * 
	 * @return String
	 */
	public String getTarDomenica()
	{
		return tarDomenica;
	}

	/**
	 * Method 'setTarDomenica'
	 * 
	 * @param tarDomenica
	 */
	public void setTarDomenica(String tarDomenica)
	{
		this.tarDomenica = tarDomenica;
	}

	/**
	 * Method 'getTarTariffaUsoSing'
	 * 
	 * @return float
	 */
	public float getTarTariffaUsoSing()
	{
		return tarTariffaUsoSing;
	}

	/**
	 * Method 'setTarTariffaUsoSing'
	 * 
	 * @param tarTariffaUsoSing
	 */
	public void setTarTariffaUsoSing(float tarTariffaUsoSing)
	{
		this.tarTariffaUsoSing = tarTariffaUsoSing;
		this.tarTariffaUsoSingNull = false;
	}

	/**
	 * Method 'setTarTariffaUsoSingNull'
	 * 
	 * @param value
	 */
	public void setTarTariffaUsoSingNull(boolean value)
	{
		this.tarTariffaUsoSingNull = value;
	}

	/**
	 * Method 'isTarTariffaUsoSingNull'
	 * 
	 * @return boolean
	 */
	public boolean isTarTariffaUsoSingNull()
	{
		return tarTariffaUsoSingNull;
	}

	/**
	 * Method 'getTarTariffaMinima'
	 * 
	 * @return float
	 */
	public float getTarTariffaMinima()
	{
		return tarTariffaMinima;
	}

	/**
	 * Method 'setTarTariffaMinima'
	 * 
	 * @param tarTariffaMinima
	 */
	public void setTarTariffaMinima(float tarTariffaMinima)
	{
		this.tarTariffaMinima = tarTariffaMinima;
		this.tarTariffaMinimaNull = false;
	}

	/**
	 * Method 'setTarTariffaMinimaNull'
	 * 
	 * @param value
	 */
	public void setTarTariffaMinimaNull(boolean value)
	{
		this.tarTariffaMinimaNull = value;
	}

	/**
	 * Method 'isTarTariffaMinimaNull'
	 * 
	 * @return boolean
	 */
	public boolean isTarTariffaMinimaNull()
	{
		return tarTariffaMinimaNull;
	}

	/**
	 * Method 'getTarTariffaStandard'
	 * 
	 * @return float
	 */
	public float getTarTariffaStandard()
	{
		return tarTariffaStandard;
	}

	/**
	 * Method 'setTarTariffaStandard'
	 * 
	 * @param tarTariffaStandard
	 */
	public void setTarTariffaStandard(float tarTariffaStandard)
	{
		this.tarTariffaStandard = tarTariffaStandard;
		this.tarTariffaStandardNull = false;
	}

	/**
	 * Method 'setTarTariffaStandardNull'
	 * 
	 * @param value
	 */
	public void setTarTariffaStandardNull(boolean value)
	{
		this.tarTariffaStandardNull = value;
	}

	/**
	 * Method 'isTarTariffaStandardNull'
	 * 
	 * @return boolean
	 */
	public boolean isTarTariffaStandardNull()
	{
		return tarTariffaStandardNull;
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
	 * Method 'getCategorieCatId'
	 * 
	 * @return long
	 */
	public long getCategorieCatId()
	{
		return categorieCatId;
	}

	/**
	 * Method 'setCategorieCatId'
	 * 
	 * @param categorieCatId
	 */
	public void setCategorieCatId(long categorieCatId)
	{
		this.categorieCatId = categorieCatId;
	}

	/**
	 * Method 'getTipologiaCamereTpcId'
	 * 
	 * @return long
	 */
	public long getTipologiaCamereTpcId()
	{
		return tipologiaCamereTpcId;
	}

	/**
	 * Method 'setTipologiaCamereTpcId'
	 * 
	 * @param tipologiaCamereTpcId
	 */
	public void setTipologiaCamereTpcId(long tipologiaCamereTpcId)
	{
		this.tipologiaCamereTpcId = tipologiaCamereTpcId;
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
		
		if (!(_other instanceof StrutturaTariffe)) {
			return false;
		}
		
		final StrutturaTariffe _cast = (StrutturaTariffe) _other;
		if (tarId != _cast.tarId) {
			return false;
		}
		
		if (tarDataInizio == null ? _cast.tarDataInizio != tarDataInizio : !tarDataInizio.equals( _cast.tarDataInizio )) {
			return false;
		}
		
		if (tarDataFine == null ? _cast.tarDataFine != tarDataFine : !tarDataFine.equals( _cast.tarDataFine )) {
			return false;
		}
		
		if (tarLunedi == null ? _cast.tarLunedi != tarLunedi : !tarLunedi.equals( _cast.tarLunedi )) {
			return false;
		}
		
		if (tarMartedi == null ? _cast.tarMartedi != tarMartedi : !tarMartedi.equals( _cast.tarMartedi )) {
			return false;
		}
		
		if (tarMercoledi == null ? _cast.tarMercoledi != tarMercoledi : !tarMercoledi.equals( _cast.tarMercoledi )) {
			return false;
		}
		
		if (tarGiovedi == null ? _cast.tarGiovedi != tarGiovedi : !tarGiovedi.equals( _cast.tarGiovedi )) {
			return false;
		}
		
		if (tarVenerdi == null ? _cast.tarVenerdi != tarVenerdi : !tarVenerdi.equals( _cast.tarVenerdi )) {
			return false;
		}
		
		if (tarSabato == null ? _cast.tarSabato != tarSabato : !tarSabato.equals( _cast.tarSabato )) {
			return false;
		}
		
		if (tarDomenica == null ? _cast.tarDomenica != tarDomenica : !tarDomenica.equals( _cast.tarDomenica )) {
			return false;
		}
		
		if (tarTariffaUsoSing != _cast.tarTariffaUsoSing) {
			return false;
		}
		
		if (tarTariffaUsoSingNull != _cast.tarTariffaUsoSingNull) {
			return false;
		}
		
		if (tarTariffaMinima != _cast.tarTariffaMinima) {
			return false;
		}
		
		if (tarTariffaMinimaNull != _cast.tarTariffaMinimaNull) {
			return false;
		}
		
		if (tarTariffaStandard != _cast.tarTariffaStandard) {
			return false;
		}
		
		if (tarTariffaStandardNull != _cast.tarTariffaStandardNull) {
			return false;
		}
		
		if (strutturaStrId != _cast.strutturaStrId) {
			return false;
		}
		
		if (categorieCatId != _cast.categorieCatId) {
			return false;
		}
		
		if (tipologiaCamereTpcId != _cast.tipologiaCamereTpcId) {
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
		_hashCode = 29 * _hashCode + (int) (tarId ^ (tarId >>> 32));
		if (tarDataInizio != null) {
			_hashCode = 29 * _hashCode + tarDataInizio.hashCode();
		}
		
		if (tarDataFine != null) {
			_hashCode = 29 * _hashCode + tarDataFine.hashCode();
		}
		
		if (tarLunedi != null) {
			_hashCode = 29 * _hashCode + tarLunedi.hashCode();
		}
		
		if (tarMartedi != null) {
			_hashCode = 29 * _hashCode + tarMartedi.hashCode();
		}
		
		if (tarMercoledi != null) {
			_hashCode = 29 * _hashCode + tarMercoledi.hashCode();
		}
		
		if (tarGiovedi != null) {
			_hashCode = 29 * _hashCode + tarGiovedi.hashCode();
		}
		
		if (tarVenerdi != null) {
			_hashCode = 29 * _hashCode + tarVenerdi.hashCode();
		}
		
		if (tarSabato != null) {
			_hashCode = 29 * _hashCode + tarSabato.hashCode();
		}
		
		if (tarDomenica != null) {
			_hashCode = 29 * _hashCode + tarDomenica.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(tarTariffaUsoSing);
		_hashCode = 29 * _hashCode + (tarTariffaUsoSingNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(tarTariffaMinima);
		_hashCode = 29 * _hashCode + (tarTariffaMinimaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + Float.floatToIntBits(tarTariffaStandard);
		_hashCode = 29 * _hashCode + (tarTariffaStandardNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		_hashCode = 29 * _hashCode + (int) (categorieCatId ^ (categorieCatId >>> 32));
		_hashCode = 29 * _hashCode + (int) (tipologiaCamereTpcId ^ (tipologiaCamereTpcId >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return StrutturaTariffePk
	 */
	public StrutturaTariffePk createPk()
	{
		return new StrutturaTariffePk(tarId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.StrutturaTariffe: " );
		ret.append( "tarId=" + tarId );
		ret.append( ", tarDataInizio=" + tarDataInizio );
		ret.append( ", tarDataFine=" + tarDataFine );
		ret.append( ", tarLunedi=" + tarLunedi );
		ret.append( ", tarMartedi=" + tarMartedi );
		ret.append( ", tarMercoledi=" + tarMercoledi );
		ret.append( ", tarGiovedi=" + tarGiovedi );
		ret.append( ", tarVenerdi=" + tarVenerdi );
		ret.append( ", tarSabato=" + tarSabato );
		ret.append( ", tarDomenica=" + tarDomenica );
		ret.append( ", tarTariffaUsoSing=" + tarTariffaUsoSing );
		ret.append( ", tarTariffaMinima=" + tarTariffaMinima );
		ret.append( ", tarTariffaStandard=" + tarTariffaStandard );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		ret.append( ", categorieCatId=" + categorieCatId );
		ret.append( ", tipologiaCamereTpcId=" + tipologiaCamereTpcId );
		return ret.toString();
	}

}
