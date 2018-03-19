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

public class StrutturaServiziAlbergo implements Serializable
{
	/** 
	 * This attribute maps to the column ssa_id in the struttura_servizi_albergo table.
	 */
	protected long ssaId;

	/** 
	 * This attribute maps to the column ssa_pren_risto in the struttura_servizi_albergo table.
	 */
	protected String ssaPrenRisto;

	/** 
	 * This attribute maps to the column ssa_pren_tavolo in the struttura_servizi_albergo table.
	 */
	protected String ssaPrenTavolo;

	/** 
	 * This attribute maps to the column ssa_costo_pren_tav in the struttura_servizi_albergo table.
	 */
	protected float ssaCostoPrenTav;

	/** 
	 * This attribute maps to the column ssa_pren_cibi_part in the struttura_servizi_albergo table.
	 */
	protected String ssaPrenCibiPart;

	/** 
	 * This attribute maps to the column ssa_costo_pren_cibi in the struttura_servizi_albergo table.
	 */
	protected float ssaCostoPrenCibi;

	/** 
	 * This attribute maps to the column ssa_pren_spa in the struttura_servizi_albergo table.
	 */
	protected String ssaPrenSpa;

	/** 
	 * This attribute maps to the column ssa_serv_turi_est in the struttura_servizi_albergo table.
	 */
	protected String ssaServTuriEst;

	/** 
	 * This attribute maps to the column ssa_ric_latecheck in the struttura_servizi_albergo table.
	 */
	protected String ssaRicLatecheck;

	/** 
	 * This attribute maps to the column ssa_tv_giochi_cam in the struttura_servizi_albergo table.
	 */
	protected String ssaTvGiochiCam;

	/** 
	 * This attribute maps to the column ssa_ric_aiuto_bag in the struttura_servizi_albergo table.
	 */
	protected String ssaRicAiutoBag;

	/** 
	 * This attribute maps to the column ssa_pren_serv_sport in the struttura_servizi_albergo table.
	 */
	protected String ssaPrenServSport;

	/** 
	 * This attribute maps to the column ssa_serv_sociali_int in the struttura_servizi_albergo table.
	 */
	protected String ssaServSocialiInt;

	/** 
	 * This attribute maps to the column struttura_str_id in the struttura_servizi_albergo table.
	 */
	protected long strutturaStrId;

	/** 
	 * This attribute maps to the column ssa_servizi_camera in the struttura_servizi_albergo table.
	 */
	protected long ssaServiziCamera;

	/** 
	 * This attribute represents whether the primitive attribute ssaServiziCamera is null.
	 */
	protected boolean ssaServiziCameraNull = true;

	/**
	 * Method 'StrutturaServiziAlbergo'
	 * 
	 */
	public StrutturaServiziAlbergo()
	{
	}

	/**
	 * Method 'getSsaId'
	 * 
	 * @return long
	 */
	public long getSsaId()
	{
		return ssaId;
	}

	/**
	 * Method 'setSsaId'
	 * 
	 * @param ssaId
	 */
	public void setSsaId(long ssaId)
	{
		this.ssaId = ssaId;
	}

	/**
	 * Method 'getSsaPrenRisto'
	 * 
	 * @return String
	 */
	public String getSsaPrenRisto()
	{
		return ssaPrenRisto;
	}

	/**
	 * Method 'setSsaPrenRisto'
	 * 
	 * @param ssaPrenRisto
	 */
	public void setSsaPrenRisto(String ssaPrenRisto)
	{
		this.ssaPrenRisto = ssaPrenRisto;
	}

	/**
	 * Method 'getSsaPrenTavolo'
	 * 
	 * @return String
	 */
	public String getSsaPrenTavolo()
	{
		return ssaPrenTavolo;
	}

	/**
	 * Method 'setSsaPrenTavolo'
	 * 
	 * @param ssaPrenTavolo
	 */
	public void setSsaPrenTavolo(String ssaPrenTavolo)
	{
		this.ssaPrenTavolo = ssaPrenTavolo;
	}

	/**
	 * Method 'getSsaCostoPrenTav'
	 * 
	 * @return float
	 */
	public float getSsaCostoPrenTav()
	{
		return ssaCostoPrenTav;
	}

	/**
	 * Method 'setSsaCostoPrenTav'
	 * 
	 * @param ssaCostoPrenTav
	 */
	public void setSsaCostoPrenTav(float ssaCostoPrenTav)
	{
		this.ssaCostoPrenTav = ssaCostoPrenTav;
	}

	/**
	 * Method 'getSsaPrenCibiPart'
	 * 
	 * @return String
	 */
	public String getSsaPrenCibiPart()
	{
		return ssaPrenCibiPart;
	}

	/**
	 * Method 'setSsaPrenCibiPart'
	 * 
	 * @param ssaPrenCibiPart
	 */
	public void setSsaPrenCibiPart(String ssaPrenCibiPart)
	{
		this.ssaPrenCibiPart = ssaPrenCibiPart;
	}

	/**
	 * Method 'getSsaCostoPrenCibi'
	 * 
	 * @return float
	 */
	public float getSsaCostoPrenCibi()
	{
		return ssaCostoPrenCibi;
	}

	/**
	 * Method 'setSsaCostoPrenCibi'
	 * 
	 * @param ssaCostoPrenCibi
	 */
	public void setSsaCostoPrenCibi(float ssaCostoPrenCibi)
	{
		this.ssaCostoPrenCibi = ssaCostoPrenCibi;
	}

	/**
	 * Method 'getSsaPrenSpa'
	 * 
	 * @return String
	 */
	public String getSsaPrenSpa()
	{
		return ssaPrenSpa;
	}

	/**
	 * Method 'setSsaPrenSpa'
	 * 
	 * @param ssaPrenSpa
	 */
	public void setSsaPrenSpa(String ssaPrenSpa)
	{
		this.ssaPrenSpa = ssaPrenSpa;
	}

	/**
	 * Method 'getSsaServTuriEst'
	 * 
	 * @return String
	 */
	public String getSsaServTuriEst()
	{
		return ssaServTuriEst;
	}

	/**
	 * Method 'setSsaServTuriEst'
	 * 
	 * @param ssaServTuriEst
	 */
	public void setSsaServTuriEst(String ssaServTuriEst)
	{
		this.ssaServTuriEst = ssaServTuriEst;
	}

	/**
	 * Method 'getSsaRicLatecheck'
	 * 
	 * @return String
	 */
	public String getSsaRicLatecheck()
	{
		return ssaRicLatecheck;
	}

	/**
	 * Method 'setSsaRicLatecheck'
	 * 
	 * @param ssaRicLatecheck
	 */
	public void setSsaRicLatecheck(String ssaRicLatecheck)
	{
		this.ssaRicLatecheck = ssaRicLatecheck;
	}

	/**
	 * Method 'getSsaTvGiochiCam'
	 * 
	 * @return String
	 */
	public String getSsaTvGiochiCam()
	{
		return ssaTvGiochiCam;
	}

	/**
	 * Method 'setSsaTvGiochiCam'
	 * 
	 * @param ssaTvGiochiCam
	 */
	public void setSsaTvGiochiCam(String ssaTvGiochiCam)
	{
		this.ssaTvGiochiCam = ssaTvGiochiCam;
	}

	/**
	 * Method 'getSsaRicAiutoBag'
	 * 
	 * @return String
	 */
	public String getSsaRicAiutoBag()
	{
		return ssaRicAiutoBag;
	}

	/**
	 * Method 'setSsaRicAiutoBag'
	 * 
	 * @param ssaRicAiutoBag
	 */
	public void setSsaRicAiutoBag(String ssaRicAiutoBag)
	{
		this.ssaRicAiutoBag = ssaRicAiutoBag;
	}

	/**
	 * Method 'getSsaPrenServSport'
	 * 
	 * @return String
	 */
	public String getSsaPrenServSport()
	{
		return ssaPrenServSport;
	}

	/**
	 * Method 'setSsaPrenServSport'
	 * 
	 * @param ssaPrenServSport
	 */
	public void setSsaPrenServSport(String ssaPrenServSport)
	{
		this.ssaPrenServSport = ssaPrenServSport;
	}

	/**
	 * Method 'getSsaServSocialiInt'
	 * 
	 * @return String
	 */
	public String getSsaServSocialiInt()
	{
		return ssaServSocialiInt;
	}

	/**
	 * Method 'setSsaServSocialiInt'
	 * 
	 * @param ssaServSocialiInt
	 */
	public void setSsaServSocialiInt(String ssaServSocialiInt)
	{
		this.ssaServSocialiInt = ssaServSocialiInt;
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
	 * Method 'getSsaServiziCamera'
	 * 
	 * @return long
	 */
	public long getSsaServiziCamera()
	{
		return ssaServiziCamera;
	}

	/**
	 * Method 'setSsaServiziCamera'
	 * 
	 * @param ssaServiziCamera
	 */
	public void setSsaServiziCamera(long ssaServiziCamera)
	{
		this.ssaServiziCamera = ssaServiziCamera;
		this.ssaServiziCameraNull = false;
	}

	/**
	 * Method 'setSsaServiziCameraNull'
	 * 
	 * @param value
	 */
	public void setSsaServiziCameraNull(boolean value)
	{
		this.ssaServiziCameraNull = value;
	}

	/**
	 * Method 'isSsaServiziCameraNull'
	 * 
	 * @return boolean
	 */
	public boolean isSsaServiziCameraNull()
	{
		return ssaServiziCameraNull;
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
		
		if (!(_other instanceof StrutturaServiziAlbergo)) {
			return false;
		}
		
		final StrutturaServiziAlbergo _cast = (StrutturaServiziAlbergo) _other;
		if (ssaId != _cast.ssaId) {
			return false;
		}
		
		if (ssaPrenRisto == null ? _cast.ssaPrenRisto != ssaPrenRisto : !ssaPrenRisto.equals( _cast.ssaPrenRisto )) {
			return false;
		}
		
		if (ssaPrenTavolo == null ? _cast.ssaPrenTavolo != ssaPrenTavolo : !ssaPrenTavolo.equals( _cast.ssaPrenTavolo )) {
			return false;
		}
		
		if (ssaCostoPrenTav != _cast.ssaCostoPrenTav) {
			return false;
		}
		
		if (ssaPrenCibiPart == null ? _cast.ssaPrenCibiPart != ssaPrenCibiPart : !ssaPrenCibiPart.equals( _cast.ssaPrenCibiPart )) {
			return false;
		}
		
		if (ssaCostoPrenCibi != _cast.ssaCostoPrenCibi) {
			return false;
		}
		
		if (ssaPrenSpa == null ? _cast.ssaPrenSpa != ssaPrenSpa : !ssaPrenSpa.equals( _cast.ssaPrenSpa )) {
			return false;
		}
		
		if (ssaServTuriEst == null ? _cast.ssaServTuriEst != ssaServTuriEst : !ssaServTuriEst.equals( _cast.ssaServTuriEst )) {
			return false;
		}
		
		if (ssaRicLatecheck == null ? _cast.ssaRicLatecheck != ssaRicLatecheck : !ssaRicLatecheck.equals( _cast.ssaRicLatecheck )) {
			return false;
		}
		
		if (ssaTvGiochiCam == null ? _cast.ssaTvGiochiCam != ssaTvGiochiCam : !ssaTvGiochiCam.equals( _cast.ssaTvGiochiCam )) {
			return false;
		}
		
		if (ssaRicAiutoBag == null ? _cast.ssaRicAiutoBag != ssaRicAiutoBag : !ssaRicAiutoBag.equals( _cast.ssaRicAiutoBag )) {
			return false;
		}
		
		if (ssaPrenServSport == null ? _cast.ssaPrenServSport != ssaPrenServSport : !ssaPrenServSport.equals( _cast.ssaPrenServSport )) {
			return false;
		}
		
		if (ssaServSocialiInt == null ? _cast.ssaServSocialiInt != ssaServSocialiInt : !ssaServSocialiInt.equals( _cast.ssaServSocialiInt )) {
			return false;
		}
		
		if (strutturaStrId != _cast.strutturaStrId) {
			return false;
		}
		
		if (ssaServiziCamera != _cast.ssaServiziCamera) {
			return false;
		}
		
		if (ssaServiziCameraNull != _cast.ssaServiziCameraNull) {
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
		_hashCode = 29 * _hashCode + (int) (ssaId ^ (ssaId >>> 32));
		if (ssaPrenRisto != null) {
			_hashCode = 29 * _hashCode + ssaPrenRisto.hashCode();
		}
		
		if (ssaPrenTavolo != null) {
			_hashCode = 29 * _hashCode + ssaPrenTavolo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(ssaCostoPrenTav);
		if (ssaPrenCibiPart != null) {
			_hashCode = 29 * _hashCode + ssaPrenCibiPart.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(ssaCostoPrenCibi);
		if (ssaPrenSpa != null) {
			_hashCode = 29 * _hashCode + ssaPrenSpa.hashCode();
		}
		
		if (ssaServTuriEst != null) {
			_hashCode = 29 * _hashCode + ssaServTuriEst.hashCode();
		}
		
		if (ssaRicLatecheck != null) {
			_hashCode = 29 * _hashCode + ssaRicLatecheck.hashCode();
		}
		
		if (ssaTvGiochiCam != null) {
			_hashCode = 29 * _hashCode + ssaTvGiochiCam.hashCode();
		}
		
		if (ssaRicAiutoBag != null) {
			_hashCode = 29 * _hashCode + ssaRicAiutoBag.hashCode();
		}
		
		if (ssaPrenServSport != null) {
			_hashCode = 29 * _hashCode + ssaPrenServSport.hashCode();
		}
		
		if (ssaServSocialiInt != null) {
			_hashCode = 29 * _hashCode + ssaServSocialiInt.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		_hashCode = 29 * _hashCode + (int) (ssaServiziCamera ^ (ssaServiziCamera >>> 32));
		_hashCode = 29 * _hashCode + (ssaServiziCameraNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return StrutturaServiziAlbergoPk
	 */
	public StrutturaServiziAlbergoPk createPk()
	{
		return new StrutturaServiziAlbergoPk(ssaId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.StrutturaServiziAlbergo: " );
		ret.append( "ssaId=" + ssaId );
		ret.append( ", ssaPrenRisto=" + ssaPrenRisto );
		ret.append( ", ssaPrenTavolo=" + ssaPrenTavolo );
		ret.append( ", ssaCostoPrenTav=" + ssaCostoPrenTav );
		ret.append( ", ssaPrenCibiPart=" + ssaPrenCibiPart );
		ret.append( ", ssaCostoPrenCibi=" + ssaCostoPrenCibi );
		ret.append( ", ssaPrenSpa=" + ssaPrenSpa );
		ret.append( ", ssaServTuriEst=" + ssaServTuriEst );
		ret.append( ", ssaRicLatecheck=" + ssaRicLatecheck );
		ret.append( ", ssaTvGiochiCam=" + ssaTvGiochiCam );
		ret.append( ", ssaRicAiutoBag=" + ssaRicAiutoBag );
		ret.append( ", ssaPrenServSport=" + ssaPrenServSport );
		ret.append( ", ssaServSocialiInt=" + ssaServSocialiInt );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		ret.append( ", ssaServiziCamera=" + ssaServiziCamera );
		return ret.toString();
	}

}