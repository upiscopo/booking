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

public class StrutturaPulizie implements Serializable
{
	/** 
	 * This attribute maps to the column spu_id in the struttura_pulizie table.
	 */
	protected long spuId;

	/** 
	 * This attribute maps to the column spu_lav_secco in the struttura_pulizie table.
	 */
	protected String spuLavSecco;

	/** 
	 * This attribute maps to the column spu_serv_stireria in the struttura_pulizie table.
	 */
	protected String spuServStireria;

	/** 
	 * This attribute maps to the column spu_serv_lavand in the struttura_pulizie table.
	 */
	protected String spuServLavand;

	/** 
	 * This attribute maps to the column spu_serv_giorn in the struttura_pulizie table.
	 */
	protected String spuServGiorn;

	/** 
	 * This attribute maps to the column spu_lustrascarpe in the struttura_pulizie table.
	 */
	protected String spuLustrascarpe;

	/** 
	 * This attribute maps to the column spu_stira_pant in the struttura_pulizie table.
	 */
	protected String spuStiraPant;

	/** 
	 * This attribute maps to the column struttura_str_id in the struttura_pulizie table.
	 */
	protected long strutturaStrId;

	/**
	 * Method 'StrutturaPulizie'
	 * 
	 */
	public StrutturaPulizie()
	{
	}

	/**
	 * Method 'getSpuId'
	 * 
	 * @return long
	 */
	public long getSpuId()
	{
		return spuId;
	}

	/**
	 * Method 'setSpuId'
	 * 
	 * @param spuId
	 */
	public void setSpuId(long spuId)
	{
		this.spuId = spuId;
	}

	/**
	 * Method 'getSpuLavSecco'
	 * 
	 * @return String
	 */
	public String getSpuLavSecco()
	{
		return spuLavSecco;
	}

	/**
	 * Method 'setSpuLavSecco'
	 * 
	 * @param spuLavSecco
	 */
	public void setSpuLavSecco(String spuLavSecco)
	{
		this.spuLavSecco = spuLavSecco;
	}

	/**
	 * Method 'getSpuServStireria'
	 * 
	 * @return String
	 */
	public String getSpuServStireria()
	{
		return spuServStireria;
	}

	/**
	 * Method 'setSpuServStireria'
	 * 
	 * @param spuServStireria
	 */
	public void setSpuServStireria(String spuServStireria)
	{
		this.spuServStireria = spuServStireria;
	}

	/**
	 * Method 'getSpuServLavand'
	 * 
	 * @return String
	 */
	public String getSpuServLavand()
	{
		return spuServLavand;
	}

	/**
	 * Method 'setSpuServLavand'
	 * 
	 * @param spuServLavand
	 */
	public void setSpuServLavand(String spuServLavand)
	{
		this.spuServLavand = spuServLavand;
	}

	/**
	 * Method 'getSpuServGiorn'
	 * 
	 * @return String
	 */
	public String getSpuServGiorn()
	{
		return spuServGiorn;
	}

	/**
	 * Method 'setSpuServGiorn'
	 * 
	 * @param spuServGiorn
	 */
	public void setSpuServGiorn(String spuServGiorn)
	{
		this.spuServGiorn = spuServGiorn;
	}

	/**
	 * Method 'getSpuLustrascarpe'
	 * 
	 * @return String
	 */
	public String getSpuLustrascarpe()
	{
		return spuLustrascarpe;
	}

	/**
	 * Method 'setSpuLustrascarpe'
	 * 
	 * @param spuLustrascarpe
	 */
	public void setSpuLustrascarpe(String spuLustrascarpe)
	{
		this.spuLustrascarpe = spuLustrascarpe;
	}

	/**
	 * Method 'getSpuStiraPant'
	 * 
	 * @return String
	 */
	public String getSpuStiraPant()
	{
		return spuStiraPant;
	}

	/**
	 * Method 'setSpuStiraPant'
	 * 
	 * @param spuStiraPant
	 */
	public void setSpuStiraPant(String spuStiraPant)
	{
		this.spuStiraPant = spuStiraPant;
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
		
		if (!(_other instanceof StrutturaPulizie)) {
			return false;
		}
		
		final StrutturaPulizie _cast = (StrutturaPulizie) _other;
		if (spuId != _cast.spuId) {
			return false;
		}
		
		if (spuLavSecco == null ? _cast.spuLavSecco != spuLavSecco : !spuLavSecco.equals( _cast.spuLavSecco )) {
			return false;
		}
		
		if (spuServStireria == null ? _cast.spuServStireria != spuServStireria : !spuServStireria.equals( _cast.spuServStireria )) {
			return false;
		}
		
		if (spuServLavand == null ? _cast.spuServLavand != spuServLavand : !spuServLavand.equals( _cast.spuServLavand )) {
			return false;
		}
		
		if (spuServGiorn == null ? _cast.spuServGiorn != spuServGiorn : !spuServGiorn.equals( _cast.spuServGiorn )) {
			return false;
		}
		
		if (spuLustrascarpe == null ? _cast.spuLustrascarpe != spuLustrascarpe : !spuLustrascarpe.equals( _cast.spuLustrascarpe )) {
			return false;
		}
		
		if (spuStiraPant == null ? _cast.spuStiraPant != spuStiraPant : !spuStiraPant.equals( _cast.spuStiraPant )) {
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
		_hashCode = 29 * _hashCode + (int) (spuId ^ (spuId >>> 32));
		if (spuLavSecco != null) {
			_hashCode = 29 * _hashCode + spuLavSecco.hashCode();
		}
		
		if (spuServStireria != null) {
			_hashCode = 29 * _hashCode + spuServStireria.hashCode();
		}
		
		if (spuServLavand != null) {
			_hashCode = 29 * _hashCode + spuServLavand.hashCode();
		}
		
		if (spuServGiorn != null) {
			_hashCode = 29 * _hashCode + spuServGiorn.hashCode();
		}
		
		if (spuLustrascarpe != null) {
			_hashCode = 29 * _hashCode + spuLustrascarpe.hashCode();
		}
		
		if (spuStiraPant != null) {
			_hashCode = 29 * _hashCode + spuStiraPant.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return StrutturaPuliziePk
	 */
	public StrutturaPuliziePk createPk()
	{
		return new StrutturaPuliziePk(spuId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.StrutturaPulizie: " );
		ret.append( "spuId=" + spuId );
		ret.append( ", spuLavSecco=" + spuLavSecco );
		ret.append( ", spuServStireria=" + spuServStireria );
		ret.append( ", spuServLavand=" + spuServLavand );
		ret.append( ", spuServGiorn=" + spuServGiorn );
		ret.append( ", spuLustrascarpe=" + spuLustrascarpe );
		ret.append( ", spuStiraPant=" + spuStiraPant );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		return ret.toString();
	}

}
