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

public class Camere implements Serializable
{
	/** 
	 * This attribute maps to the column cam_id in the camere table.
	 */
	protected long camId;

	/** 
	 * This attribute maps to the column cam_nome in the camere table.
	 */
	protected String camNome;

	/** 
	 * This attribute maps to the column cam_capienza in the camere table.
	 */
	protected int camCapienza;

	/** 
	 * This attribute maps to the column struttura_str_id in the camere table.
	 */
	protected long strutturaStrId;

	/** 
	 * This attribute maps to the column cam_dimensione in the camere table.
	 */
	protected int camDimensione;

	/** 
	 * This attribute represents whether the primitive attribute camDimensione is null.
	 */
	protected boolean camDimensioneNull = true;

	/** 
	 * This attribute maps to the column tipologia_camere_id in the camere table.
	 */
	protected long tipologiaCamereId;

	/** 
	 * This attribute maps to the column cam_dimensione_um in the camere table.
	 */
	protected long camDimensioneUm;

	/** 
	 * This attribute represents whether the primitive attribute camDimensioneUm is null.
	 */
	protected boolean camDimensioneUmNull = true;

	/** 
	 * This attribute maps to the column cam_fumatori in the camere table.
	 */
	protected String camFumatori;

	/**
	 * Method 'Camere'
	 * 
	 */
	public Camere()
	{
	}

	/**
	 * Method 'getCamId'
	 * 
	 * @return long
	 */
	public long getCamId()
	{
		return camId;
	}

	/**
	 * Method 'setCamId'
	 * 
	 * @param camId
	 */
	public void setCamId(long camId)
	{
		this.camId = camId;
	}

	/**
	 * Method 'getCamNome'
	 * 
	 * @return String
	 */
	public String getCamNome()
	{
		return camNome;
	}

	/**
	 * Method 'setCamNome'
	 * 
	 * @param camNome
	 */
	public void setCamNome(String camNome)
	{
		this.camNome = camNome;
	}

	/**
	 * Method 'getCamCapienza'
	 * 
	 * @return int
	 */
	public int getCamCapienza()
	{
		return camCapienza;
	}

	/**
	 * Method 'setCamCapienza'
	 * 
	 * @param camCapienza
	 */
	public void setCamCapienza(int camCapienza)
	{
		this.camCapienza = camCapienza;
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
	 * Method 'getCamDimensione'
	 * 
	 * @return int
	 */
	public int getCamDimensione()
	{
		return camDimensione;
	}

	/**
	 * Method 'setCamDimensione'
	 * 
	 * @param camDimensione
	 */
	public void setCamDimensione(int camDimensione)
	{
		this.camDimensione = camDimensione;
		this.camDimensioneNull = false;
	}

	/**
	 * Method 'setCamDimensioneNull'
	 * 
	 * @param value
	 */
	public void setCamDimensioneNull(boolean value)
	{
		this.camDimensioneNull = value;
	}

	/**
	 * Method 'isCamDimensioneNull'
	 * 
	 * @return boolean
	 */
	public boolean isCamDimensioneNull()
	{
		return camDimensioneNull;
	}

	/**
	 * Method 'getTipologiaCamereId'
	 * 
	 * @return long
	 */
	public long getTipologiaCamereId()
	{
		return tipologiaCamereId;
	}

	/**
	 * Method 'setTipologiaCamereId'
	 * 
	 * @param tipologiaCamereId
	 */
	public void setTipologiaCamereId(long tipologiaCamereId)
	{
		this.tipologiaCamereId = tipologiaCamereId;
	}

	/**
	 * Method 'getCamDimensioneUm'
	 * 
	 * @return long
	 */
	public long getCamDimensioneUm()
	{
		return camDimensioneUm;
	}

	/**
	 * Method 'setCamDimensioneUm'
	 * 
	 * @param camDimensioneUm
	 */
	public void setCamDimensioneUm(long camDimensioneUm)
	{
		this.camDimensioneUm = camDimensioneUm;
		this.camDimensioneUmNull = false;
	}

	/**
	 * Method 'setCamDimensioneUmNull'
	 * 
	 * @param value
	 */
	public void setCamDimensioneUmNull(boolean value)
	{
		this.camDimensioneUmNull = value;
	}

	/**
	 * Method 'isCamDimensioneUmNull'
	 * 
	 * @return boolean
	 */
	public boolean isCamDimensioneUmNull()
	{
		return camDimensioneUmNull;
	}

	/**
	 * Method 'getCamFumatori'
	 * 
	 * @return String
	 */
	public String getCamFumatori()
	{
		return camFumatori;
	}

	/**
	 * Method 'setCamFumatori'
	 * 
	 * @param camFumatori
	 */
	public void setCamFumatori(String camFumatori)
	{
		this.camFumatori = camFumatori;
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
		
		if (!(_other instanceof Camere)) {
			return false;
		}
		
		final Camere _cast = (Camere) _other;
		if (camId != _cast.camId) {
			return false;
		}
		
		if (camNome == null ? _cast.camNome != camNome : !camNome.equals( _cast.camNome )) {
			return false;
		}
		
		if (camCapienza != _cast.camCapienza) {
			return false;
		}
		
		if (strutturaStrId != _cast.strutturaStrId) {
			return false;
		}
		
		if (camDimensione != _cast.camDimensione) {
			return false;
		}
		
		if (camDimensioneNull != _cast.camDimensioneNull) {
			return false;
		}
		
		if (tipologiaCamereId != _cast.tipologiaCamereId) {
			return false;
		}
		
		if (camDimensioneUm != _cast.camDimensioneUm) {
			return false;
		}
		
		if (camDimensioneUmNull != _cast.camDimensioneUmNull) {
			return false;
		}
		
		if (camFumatori == null ? _cast.camFumatori != camFumatori : !camFumatori.equals( _cast.camFumatori )) {
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
		_hashCode = 29 * _hashCode + (int) (camId ^ (camId >>> 32));
		if (camNome != null) {
			_hashCode = 29 * _hashCode + camNome.hashCode();
		}
		
		_hashCode = 29 * _hashCode + camCapienza;
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		_hashCode = 29 * _hashCode + camDimensione;
		_hashCode = 29 * _hashCode + (camDimensioneNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (tipologiaCamereId ^ (tipologiaCamereId >>> 32));
		_hashCode = 29 * _hashCode + (int) (camDimensioneUm ^ (camDimensioneUm >>> 32));
		_hashCode = 29 * _hashCode + (camDimensioneUmNull ? 1 : 0);
		if (camFumatori != null) {
			_hashCode = 29 * _hashCode + camFumatori.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CamerePk
	 */
	public CamerePk createPk()
	{
		return new CamerePk(camId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.Camere: " );
		ret.append( "camId=" + camId );
		ret.append( ", camNome=" + camNome );
		ret.append( ", camCapienza=" + camCapienza );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		ret.append( ", camDimensione=" + camDimensione );
		ret.append( ", tipologiaCamereId=" + tipologiaCamereId );
		ret.append( ", camDimensioneUm=" + camDimensioneUm );
		ret.append( ", camFumatori=" + camFumatori );
		return ret.toString();
	}

}
