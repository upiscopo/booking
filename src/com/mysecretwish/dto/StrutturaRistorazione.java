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

public class StrutturaRistorazione implements Serializable
{
	/** 
	 * This attribute maps to the column sri_id in the struttura_ristorazione table.
	 */
	protected long sriId;

	/** 
	 * This attribute maps to the column sri_pasti_bambini in the struttura_ristorazione table.
	 */
	protected String sriPastiBambini;

	/** 
	 * This attribute maps to the column sri_a_la_carte in the struttura_ristorazione table.
	 */
	protected String sriALaCarte;

	/** 
	 * This attribute maps to the column sri_buffet_bambini in the struttura_ristorazione table.
	 */
	protected String sriBuffetBambini;

	/** 
	 * This attribute maps to the column sri_buffet in the struttura_ristorazione table.
	 */
	protected String sriBuffet;

	/** 
	 * This attribute maps to the column sri_vini in the struttura_ristorazione table.
	 */
	protected String sriVini;

	/** 
	 * This attribute maps to the column sri_acqua in the struttura_ristorazione table.
	 */
	protected String sriAcqua;

	/** 
	 * This attribute maps to the column sri_snack_bar in the struttura_ristorazione table.
	 */
	protected String sriSnackBar;

	/** 
	 * This attribute maps to the column sri_frutta in the struttura_ristorazione table.
	 */
	protected String sriFrutta;

	/** 
	 * This attribute maps to the column sri_spesa_dom in the struttura_ristorazione table.
	 */
	protected String sriSpesaDom;

	/** 
	 * This attribute maps to the column sri_cioccolatini in the struttura_ristorazione table.
	 */
	protected String sriCioccolatini;

	/** 
	 * This attribute maps to the column sri_barbecue in the struttura_ristorazione table.
	 */
	protected String sriBarbecue;

	/** 
	 * This attribute maps to the column sri_dist_auto_bev in the struttura_ristorazione table.
	 */
	protected String sriDistAutoBev;

	/** 
	 * This attribute maps to the column sri_serv_camera in the struttura_ristorazione table.
	 */
	protected String sriServCamera;

	/** 
	 * This attribute maps to the column sri_dit_auto_snack in the struttura_ristorazione table.
	 */
	protected String sriDitAutoSnack;

	/** 
	 * This attribute maps to the column sri_col_camera in the struttura_ristorazione table.
	 */
	protected String sriColCamera;

	/** 
	 * This attribute maps to the column sri_menu_diete in the struttura_ristorazione table.
	 */
	protected String sriMenuDiete;

	/** 
	 * This attribute maps to the column sri_nome_rist in the struttura_ristorazione table.
	 */
	protected String sriNomeRist;

	/** 
	 * This attribute maps to the column sri_solo_ospiti in the struttura_ristorazione table.
	 */
	protected String sriSoloOspiti;

	/** 
	 * This attribute maps to the column sri_prenotazione in the struttura_ristorazione table.
	 */
	protected String sriPrenotazione;

	/** 
	 * This attribute maps to the column sri_posti_aperto in the struttura_ristorazione table.
	 */
	protected String sriPostiAperto;

	/** 
	 * This attribute maps to the column sri_aperto_col in the struttura_ristorazione table.
	 */
	protected String sriApertoCol;

	/** 
	 * This attribute maps to the column sri_aperto_brunch in the struttura_ristorazione table.
	 */
	protected String sriApertoBrunch;

	/** 
	 * This attribute maps to the column sri_aperto_aperitivo in the struttura_ristorazione table.
	 */
	protected String sriApertoAperitivo;

	/** 
	 * This attribute maps to the column sri_aperto_hightea in the struttura_ristorazione table.
	 */
	protected String sriApertoHightea;

	/** 
	 * This attribute maps to the column sri_aperto_cena in the struttura_ristorazione table.
	 */
	protected String sriApertoCena;

	/** 
	 * This attribute maps to the column sri_aperto_pranzo in the struttura_ristorazione table.
	 */
	protected String sriApertoPranzo;

	/** 
	 * This attribute maps to the column struttura_str_id in the struttura_ristorazione table.
	 */
	protected long strutturaStrId;

	/** 
	 * This attribute maps to the column sri_tipo_menu in the struttura_ristorazione table.
	 */
	protected long sriTipoMenu;

	/** 
	 * This attribute represents whether the primitive attribute sriTipoMenu is null.
	 */
	protected boolean sriTipoMenuNull = true;

	/** 
	 * This attribute maps to the column sri_cucinia in the struttura_ristorazione table.
	 */
	protected long sriCucinia;

	/** 
	 * This attribute represents whether the primitive attribute sriCucinia is null.
	 */
	protected boolean sriCuciniaNull = true;

	/** 
	 * This attribute maps to the column sri_opioni_dietetiche in the struttura_ristorazione table.
	 */
	protected long sriOpioniDietetiche;

	/** 
	 * This attribute represents whether the primitive attribute sriOpioniDietetiche is null.
	 */
	protected boolean sriOpioniDieteticheNull = true;

	/** 
	 * This attribute maps to the column sri_atmosfera in the struttura_ristorazione table.
	 */
	protected long sriAtmosfera;

	/** 
	 * This attribute represents whether the primitive attribute sriAtmosfera is null.
	 */
	protected boolean sriAtmosferaNull = true;

	/**
	 * Method 'StrutturaRistorazione'
	 * 
	 */
	public StrutturaRistorazione()
	{
	}

	/**
	 * Method 'getSriId'
	 * 
	 * @return long
	 */
	public long getSriId()
	{
		return sriId;
	}

	/**
	 * Method 'setSriId'
	 * 
	 * @param sriId
	 */
	public void setSriId(long sriId)
	{
		this.sriId = sriId;
	}

	/**
	 * Method 'getSriPastiBambini'
	 * 
	 * @return String
	 */
	public String getSriPastiBambini()
	{
		return sriPastiBambini;
	}

	/**
	 * Method 'setSriPastiBambini'
	 * 
	 * @param sriPastiBambini
	 */
	public void setSriPastiBambini(String sriPastiBambini)
	{
		this.sriPastiBambini = sriPastiBambini;
	}

	/**
	 * Method 'getSriALaCarte'
	 * 
	 * @return String
	 */
	public String getSriALaCarte()
	{
		return sriALaCarte;
	}

	/**
	 * Method 'setSriALaCarte'
	 * 
	 * @param sriALaCarte
	 */
	public void setSriALaCarte(String sriALaCarte)
	{
		this.sriALaCarte = sriALaCarte;
	}

	/**
	 * Method 'getSriBuffetBambini'
	 * 
	 * @return String
	 */
	public String getSriBuffetBambini()
	{
		return sriBuffetBambini;
	}

	/**
	 * Method 'setSriBuffetBambini'
	 * 
	 * @param sriBuffetBambini
	 */
	public void setSriBuffetBambini(String sriBuffetBambini)
	{
		this.sriBuffetBambini = sriBuffetBambini;
	}

	/**
	 * Method 'getSriBuffet'
	 * 
	 * @return String
	 */
	public String getSriBuffet()
	{
		return sriBuffet;
	}

	/**
	 * Method 'setSriBuffet'
	 * 
	 * @param sriBuffet
	 */
	public void setSriBuffet(String sriBuffet)
	{
		this.sriBuffet = sriBuffet;
	}

	/**
	 * Method 'getSriVini'
	 * 
	 * @return String
	 */
	public String getSriVini()
	{
		return sriVini;
	}

	/**
	 * Method 'setSriVini'
	 * 
	 * @param sriVini
	 */
	public void setSriVini(String sriVini)
	{
		this.sriVini = sriVini;
	}

	/**
	 * Method 'getSriAcqua'
	 * 
	 * @return String
	 */
	public String getSriAcqua()
	{
		return sriAcqua;
	}

	/**
	 * Method 'setSriAcqua'
	 * 
	 * @param sriAcqua
	 */
	public void setSriAcqua(String sriAcqua)
	{
		this.sriAcqua = sriAcqua;
	}

	/**
	 * Method 'getSriSnackBar'
	 * 
	 * @return String
	 */
	public String getSriSnackBar()
	{
		return sriSnackBar;
	}

	/**
	 * Method 'setSriSnackBar'
	 * 
	 * @param sriSnackBar
	 */
	public void setSriSnackBar(String sriSnackBar)
	{
		this.sriSnackBar = sriSnackBar;
	}

	/**
	 * Method 'getSriFrutta'
	 * 
	 * @return String
	 */
	public String getSriFrutta()
	{
		return sriFrutta;
	}

	/**
	 * Method 'setSriFrutta'
	 * 
	 * @param sriFrutta
	 */
	public void setSriFrutta(String sriFrutta)
	{
		this.sriFrutta = sriFrutta;
	}

	/**
	 * Method 'getSriSpesaDom'
	 * 
	 * @return String
	 */
	public String getSriSpesaDom()
	{
		return sriSpesaDom;
	}

	/**
	 * Method 'setSriSpesaDom'
	 * 
	 * @param sriSpesaDom
	 */
	public void setSriSpesaDom(String sriSpesaDom)
	{
		this.sriSpesaDom = sriSpesaDom;
	}

	/**
	 * Method 'getSriCioccolatini'
	 * 
	 * @return String
	 */
	public String getSriCioccolatini()
	{
		return sriCioccolatini;
	}

	/**
	 * Method 'setSriCioccolatini'
	 * 
	 * @param sriCioccolatini
	 */
	public void setSriCioccolatini(String sriCioccolatini)
	{
		this.sriCioccolatini = sriCioccolatini;
	}

	/**
	 * Method 'getSriBarbecue'
	 * 
	 * @return String
	 */
	public String getSriBarbecue()
	{
		return sriBarbecue;
	}

	/**
	 * Method 'setSriBarbecue'
	 * 
	 * @param sriBarbecue
	 */
	public void setSriBarbecue(String sriBarbecue)
	{
		this.sriBarbecue = sriBarbecue;
	}

	/**
	 * Method 'getSriDistAutoBev'
	 * 
	 * @return String
	 */
	public String getSriDistAutoBev()
	{
		return sriDistAutoBev;
	}

	/**
	 * Method 'setSriDistAutoBev'
	 * 
	 * @param sriDistAutoBev
	 */
	public void setSriDistAutoBev(String sriDistAutoBev)
	{
		this.sriDistAutoBev = sriDistAutoBev;
	}

	/**
	 * Method 'getSriServCamera'
	 * 
	 * @return String
	 */
	public String getSriServCamera()
	{
		return sriServCamera;
	}

	/**
	 * Method 'setSriServCamera'
	 * 
	 * @param sriServCamera
	 */
	public void setSriServCamera(String sriServCamera)
	{
		this.sriServCamera = sriServCamera;
	}

	/**
	 * Method 'getSriDitAutoSnack'
	 * 
	 * @return String
	 */
	public String getSriDitAutoSnack()
	{
		return sriDitAutoSnack;
	}

	/**
	 * Method 'setSriDitAutoSnack'
	 * 
	 * @param sriDitAutoSnack
	 */
	public void setSriDitAutoSnack(String sriDitAutoSnack)
	{
		this.sriDitAutoSnack = sriDitAutoSnack;
	}

	/**
	 * Method 'getSriColCamera'
	 * 
	 * @return String
	 */
	public String getSriColCamera()
	{
		return sriColCamera;
	}

	/**
	 * Method 'setSriColCamera'
	 * 
	 * @param sriColCamera
	 */
	public void setSriColCamera(String sriColCamera)
	{
		this.sriColCamera = sriColCamera;
	}

	/**
	 * Method 'getSriMenuDiete'
	 * 
	 * @return String
	 */
	public String getSriMenuDiete()
	{
		return sriMenuDiete;
	}

	/**
	 * Method 'setSriMenuDiete'
	 * 
	 * @param sriMenuDiete
	 */
	public void setSriMenuDiete(String sriMenuDiete)
	{
		this.sriMenuDiete = sriMenuDiete;
	}

	/**
	 * Method 'getSriNomeRist'
	 * 
	 * @return String
	 */
	public String getSriNomeRist()
	{
		return sriNomeRist;
	}

	/**
	 * Method 'setSriNomeRist'
	 * 
	 * @param sriNomeRist
	 */
	public void setSriNomeRist(String sriNomeRist)
	{
		this.sriNomeRist = sriNomeRist;
	}

	/**
	 * Method 'getSriSoloOspiti'
	 * 
	 * @return String
	 */
	public String getSriSoloOspiti()
	{
		return sriSoloOspiti;
	}

	/**
	 * Method 'setSriSoloOspiti'
	 * 
	 * @param sriSoloOspiti
	 */
	public void setSriSoloOspiti(String sriSoloOspiti)
	{
		this.sriSoloOspiti = sriSoloOspiti;
	}

	/**
	 * Method 'getSriPrenotazione'
	 * 
	 * @return String
	 */
	public String getSriPrenotazione()
	{
		return sriPrenotazione;
	}

	/**
	 * Method 'setSriPrenotazione'
	 * 
	 * @param sriPrenotazione
	 */
	public void setSriPrenotazione(String sriPrenotazione)
	{
		this.sriPrenotazione = sriPrenotazione;
	}

	/**
	 * Method 'getSriPostiAperto'
	 * 
	 * @return String
	 */
	public String getSriPostiAperto()
	{
		return sriPostiAperto;
	}

	/**
	 * Method 'setSriPostiAperto'
	 * 
	 * @param sriPostiAperto
	 */
	public void setSriPostiAperto(String sriPostiAperto)
	{
		this.sriPostiAperto = sriPostiAperto;
	}

	/**
	 * Method 'getSriApertoCol'
	 * 
	 * @return String
	 */
	public String getSriApertoCol()
	{
		return sriApertoCol;
	}

	/**
	 * Method 'setSriApertoCol'
	 * 
	 * @param sriApertoCol
	 */
	public void setSriApertoCol(String sriApertoCol)
	{
		this.sriApertoCol = sriApertoCol;
	}

	/**
	 * Method 'getSriApertoBrunch'
	 * 
	 * @return String
	 */
	public String getSriApertoBrunch()
	{
		return sriApertoBrunch;
	}

	/**
	 * Method 'setSriApertoBrunch'
	 * 
	 * @param sriApertoBrunch
	 */
	public void setSriApertoBrunch(String sriApertoBrunch)
	{
		this.sriApertoBrunch = sriApertoBrunch;
	}

	/**
	 * Method 'getSriApertoAperitivo'
	 * 
	 * @return String
	 */
	public String getSriApertoAperitivo()
	{
		return sriApertoAperitivo;
	}

	/**
	 * Method 'setSriApertoAperitivo'
	 * 
	 * @param sriApertoAperitivo
	 */
	public void setSriApertoAperitivo(String sriApertoAperitivo)
	{
		this.sriApertoAperitivo = sriApertoAperitivo;
	}

	/**
	 * Method 'getSriApertoHightea'
	 * 
	 * @return String
	 */
	public String getSriApertoHightea()
	{
		return sriApertoHightea;
	}

	/**
	 * Method 'setSriApertoHightea'
	 * 
	 * @param sriApertoHightea
	 */
	public void setSriApertoHightea(String sriApertoHightea)
	{
		this.sriApertoHightea = sriApertoHightea;
	}

	/**
	 * Method 'getSriApertoCena'
	 * 
	 * @return String
	 */
	public String getSriApertoCena()
	{
		return sriApertoCena;
	}

	/**
	 * Method 'setSriApertoCena'
	 * 
	 * @param sriApertoCena
	 */
	public void setSriApertoCena(String sriApertoCena)
	{
		this.sriApertoCena = sriApertoCena;
	}

	/**
	 * Method 'getSriApertoPranzo'
	 * 
	 * @return String
	 */
	public String getSriApertoPranzo()
	{
		return sriApertoPranzo;
	}

	/**
	 * Method 'setSriApertoPranzo'
	 * 
	 * @param sriApertoPranzo
	 */
	public void setSriApertoPranzo(String sriApertoPranzo)
	{
		this.sriApertoPranzo = sriApertoPranzo;
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
	 * Method 'getSriTipoMenu'
	 * 
	 * @return long
	 */
	public long getSriTipoMenu()
	{
		return sriTipoMenu;
	}

	/**
	 * Method 'setSriTipoMenu'
	 * 
	 * @param sriTipoMenu
	 */
	public void setSriTipoMenu(long sriTipoMenu)
	{
		this.sriTipoMenu = sriTipoMenu;
		this.sriTipoMenuNull = false;
	}

	/**
	 * Method 'setSriTipoMenuNull'
	 * 
	 * @param value
	 */
	public void setSriTipoMenuNull(boolean value)
	{
		this.sriTipoMenuNull = value;
	}

	/**
	 * Method 'isSriTipoMenuNull'
	 * 
	 * @return boolean
	 */
	public boolean isSriTipoMenuNull()
	{
		return sriTipoMenuNull;
	}

	/**
	 * Method 'getSriCucinia'
	 * 
	 * @return long
	 */
	public long getSriCucinia()
	{
		return sriCucinia;
	}

	/**
	 * Method 'setSriCucinia'
	 * 
	 * @param sriCucinia
	 */
	public void setSriCucinia(long sriCucinia)
	{
		this.sriCucinia = sriCucinia;
		this.sriCuciniaNull = false;
	}

	/**
	 * Method 'setSriCuciniaNull'
	 * 
	 * @param value
	 */
	public void setSriCuciniaNull(boolean value)
	{
		this.sriCuciniaNull = value;
	}

	/**
	 * Method 'isSriCuciniaNull'
	 * 
	 * @return boolean
	 */
	public boolean isSriCuciniaNull()
	{
		return sriCuciniaNull;
	}

	/**
	 * Method 'getSriOpioniDietetiche'
	 * 
	 * @return long
	 */
	public long getSriOpioniDietetiche()
	{
		return sriOpioniDietetiche;
	}

	/**
	 * Method 'setSriOpioniDietetiche'
	 * 
	 * @param sriOpioniDietetiche
	 */
	public void setSriOpioniDietetiche(long sriOpioniDietetiche)
	{
		this.sriOpioniDietetiche = sriOpioniDietetiche;
		this.sriOpioniDieteticheNull = false;
	}

	/**
	 * Method 'setSriOpioniDieteticheNull'
	 * 
	 * @param value
	 */
	public void setSriOpioniDieteticheNull(boolean value)
	{
		this.sriOpioniDieteticheNull = value;
	}

	/**
	 * Method 'isSriOpioniDieteticheNull'
	 * 
	 * @return boolean
	 */
	public boolean isSriOpioniDieteticheNull()
	{
		return sriOpioniDieteticheNull;
	}

	/**
	 * Method 'getSriAtmosfera'
	 * 
	 * @return long
	 */
	public long getSriAtmosfera()
	{
		return sriAtmosfera;
	}

	/**
	 * Method 'setSriAtmosfera'
	 * 
	 * @param sriAtmosfera
	 */
	public void setSriAtmosfera(long sriAtmosfera)
	{
		this.sriAtmosfera = sriAtmosfera;
		this.sriAtmosferaNull = false;
	}

	/**
	 * Method 'setSriAtmosferaNull'
	 * 
	 * @param value
	 */
	public void setSriAtmosferaNull(boolean value)
	{
		this.sriAtmosferaNull = value;
	}

	/**
	 * Method 'isSriAtmosferaNull'
	 * 
	 * @return boolean
	 */
	public boolean isSriAtmosferaNull()
	{
		return sriAtmosferaNull;
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
		
		if (!(_other instanceof StrutturaRistorazione)) {
			return false;
		}
		
		final StrutturaRistorazione _cast = (StrutturaRistorazione) _other;
		if (sriId != _cast.sriId) {
			return false;
		}
		
		if (sriPastiBambini == null ? _cast.sriPastiBambini != sriPastiBambini : !sriPastiBambini.equals( _cast.sriPastiBambini )) {
			return false;
		}
		
		if (sriALaCarte == null ? _cast.sriALaCarte != sriALaCarte : !sriALaCarte.equals( _cast.sriALaCarte )) {
			return false;
		}
		
		if (sriBuffetBambini == null ? _cast.sriBuffetBambini != sriBuffetBambini : !sriBuffetBambini.equals( _cast.sriBuffetBambini )) {
			return false;
		}
		
		if (sriBuffet == null ? _cast.sriBuffet != sriBuffet : !sriBuffet.equals( _cast.sriBuffet )) {
			return false;
		}
		
		if (sriVini == null ? _cast.sriVini != sriVini : !sriVini.equals( _cast.sriVini )) {
			return false;
		}
		
		if (sriAcqua == null ? _cast.sriAcqua != sriAcqua : !sriAcqua.equals( _cast.sriAcqua )) {
			return false;
		}
		
		if (sriSnackBar == null ? _cast.sriSnackBar != sriSnackBar : !sriSnackBar.equals( _cast.sriSnackBar )) {
			return false;
		}
		
		if (sriFrutta == null ? _cast.sriFrutta != sriFrutta : !sriFrutta.equals( _cast.sriFrutta )) {
			return false;
		}
		
		if (sriSpesaDom == null ? _cast.sriSpesaDom != sriSpesaDom : !sriSpesaDom.equals( _cast.sriSpesaDom )) {
			return false;
		}
		
		if (sriCioccolatini == null ? _cast.sriCioccolatini != sriCioccolatini : !sriCioccolatini.equals( _cast.sriCioccolatini )) {
			return false;
		}
		
		if (sriBarbecue == null ? _cast.sriBarbecue != sriBarbecue : !sriBarbecue.equals( _cast.sriBarbecue )) {
			return false;
		}
		
		if (sriDistAutoBev == null ? _cast.sriDistAutoBev != sriDistAutoBev : !sriDistAutoBev.equals( _cast.sriDistAutoBev )) {
			return false;
		}
		
		if (sriServCamera == null ? _cast.sriServCamera != sriServCamera : !sriServCamera.equals( _cast.sriServCamera )) {
			return false;
		}
		
		if (sriDitAutoSnack == null ? _cast.sriDitAutoSnack != sriDitAutoSnack : !sriDitAutoSnack.equals( _cast.sriDitAutoSnack )) {
			return false;
		}
		
		if (sriColCamera == null ? _cast.sriColCamera != sriColCamera : !sriColCamera.equals( _cast.sriColCamera )) {
			return false;
		}
		
		if (sriMenuDiete == null ? _cast.sriMenuDiete != sriMenuDiete : !sriMenuDiete.equals( _cast.sriMenuDiete )) {
			return false;
		}
		
		if (sriNomeRist == null ? _cast.sriNomeRist != sriNomeRist : !sriNomeRist.equals( _cast.sriNomeRist )) {
			return false;
		}
		
		if (sriSoloOspiti == null ? _cast.sriSoloOspiti != sriSoloOspiti : !sriSoloOspiti.equals( _cast.sriSoloOspiti )) {
			return false;
		}
		
		if (sriPrenotazione == null ? _cast.sriPrenotazione != sriPrenotazione : !sriPrenotazione.equals( _cast.sriPrenotazione )) {
			return false;
		}
		
		if (sriPostiAperto == null ? _cast.sriPostiAperto != sriPostiAperto : !sriPostiAperto.equals( _cast.sriPostiAperto )) {
			return false;
		}
		
		if (sriApertoCol == null ? _cast.sriApertoCol != sriApertoCol : !sriApertoCol.equals( _cast.sriApertoCol )) {
			return false;
		}
		
		if (sriApertoBrunch == null ? _cast.sriApertoBrunch != sriApertoBrunch : !sriApertoBrunch.equals( _cast.sriApertoBrunch )) {
			return false;
		}
		
		if (sriApertoAperitivo == null ? _cast.sriApertoAperitivo != sriApertoAperitivo : !sriApertoAperitivo.equals( _cast.sriApertoAperitivo )) {
			return false;
		}
		
		if (sriApertoHightea == null ? _cast.sriApertoHightea != sriApertoHightea : !sriApertoHightea.equals( _cast.sriApertoHightea )) {
			return false;
		}
		
		if (sriApertoCena == null ? _cast.sriApertoCena != sriApertoCena : !sriApertoCena.equals( _cast.sriApertoCena )) {
			return false;
		}
		
		if (sriApertoPranzo == null ? _cast.sriApertoPranzo != sriApertoPranzo : !sriApertoPranzo.equals( _cast.sriApertoPranzo )) {
			return false;
		}
		
		if (strutturaStrId != _cast.strutturaStrId) {
			return false;
		}
		
		if (sriTipoMenu != _cast.sriTipoMenu) {
			return false;
		}
		
		if (sriTipoMenuNull != _cast.sriTipoMenuNull) {
			return false;
		}
		
		if (sriCucinia != _cast.sriCucinia) {
			return false;
		}
		
		if (sriCuciniaNull != _cast.sriCuciniaNull) {
			return false;
		}
		
		if (sriOpioniDietetiche != _cast.sriOpioniDietetiche) {
			return false;
		}
		
		if (sriOpioniDieteticheNull != _cast.sriOpioniDieteticheNull) {
			return false;
		}
		
		if (sriAtmosfera != _cast.sriAtmosfera) {
			return false;
		}
		
		if (sriAtmosferaNull != _cast.sriAtmosferaNull) {
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
		_hashCode = 29 * _hashCode + (int) (sriId ^ (sriId >>> 32));
		if (sriPastiBambini != null) {
			_hashCode = 29 * _hashCode + sriPastiBambini.hashCode();
		}
		
		if (sriALaCarte != null) {
			_hashCode = 29 * _hashCode + sriALaCarte.hashCode();
		}
		
		if (sriBuffetBambini != null) {
			_hashCode = 29 * _hashCode + sriBuffetBambini.hashCode();
		}
		
		if (sriBuffet != null) {
			_hashCode = 29 * _hashCode + sriBuffet.hashCode();
		}
		
		if (sriVini != null) {
			_hashCode = 29 * _hashCode + sriVini.hashCode();
		}
		
		if (sriAcqua != null) {
			_hashCode = 29 * _hashCode + sriAcqua.hashCode();
		}
		
		if (sriSnackBar != null) {
			_hashCode = 29 * _hashCode + sriSnackBar.hashCode();
		}
		
		if (sriFrutta != null) {
			_hashCode = 29 * _hashCode + sriFrutta.hashCode();
		}
		
		if (sriSpesaDom != null) {
			_hashCode = 29 * _hashCode + sriSpesaDom.hashCode();
		}
		
		if (sriCioccolatini != null) {
			_hashCode = 29 * _hashCode + sriCioccolatini.hashCode();
		}
		
		if (sriBarbecue != null) {
			_hashCode = 29 * _hashCode + sriBarbecue.hashCode();
		}
		
		if (sriDistAutoBev != null) {
			_hashCode = 29 * _hashCode + sriDistAutoBev.hashCode();
		}
		
		if (sriServCamera != null) {
			_hashCode = 29 * _hashCode + sriServCamera.hashCode();
		}
		
		if (sriDitAutoSnack != null) {
			_hashCode = 29 * _hashCode + sriDitAutoSnack.hashCode();
		}
		
		if (sriColCamera != null) {
			_hashCode = 29 * _hashCode + sriColCamera.hashCode();
		}
		
		if (sriMenuDiete != null) {
			_hashCode = 29 * _hashCode + sriMenuDiete.hashCode();
		}
		
		if (sriNomeRist != null) {
			_hashCode = 29 * _hashCode + sriNomeRist.hashCode();
		}
		
		if (sriSoloOspiti != null) {
			_hashCode = 29 * _hashCode + sriSoloOspiti.hashCode();
		}
		
		if (sriPrenotazione != null) {
			_hashCode = 29 * _hashCode + sriPrenotazione.hashCode();
		}
		
		if (sriPostiAperto != null) {
			_hashCode = 29 * _hashCode + sriPostiAperto.hashCode();
		}
		
		if (sriApertoCol != null) {
			_hashCode = 29 * _hashCode + sriApertoCol.hashCode();
		}
		
		if (sriApertoBrunch != null) {
			_hashCode = 29 * _hashCode + sriApertoBrunch.hashCode();
		}
		
		if (sriApertoAperitivo != null) {
			_hashCode = 29 * _hashCode + sriApertoAperitivo.hashCode();
		}
		
		if (sriApertoHightea != null) {
			_hashCode = 29 * _hashCode + sriApertoHightea.hashCode();
		}
		
		if (sriApertoCena != null) {
			_hashCode = 29 * _hashCode + sriApertoCena.hashCode();
		}
		
		if (sriApertoPranzo != null) {
			_hashCode = 29 * _hashCode + sriApertoPranzo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		_hashCode = 29 * _hashCode + (int) (sriTipoMenu ^ (sriTipoMenu >>> 32));
		_hashCode = 29 * _hashCode + (sriTipoMenuNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (sriCucinia ^ (sriCucinia >>> 32));
		_hashCode = 29 * _hashCode + (sriCuciniaNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (sriOpioniDietetiche ^ (sriOpioniDietetiche >>> 32));
		_hashCode = 29 * _hashCode + (sriOpioniDieteticheNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (int) (sriAtmosfera ^ (sriAtmosfera >>> 32));
		_hashCode = 29 * _hashCode + (sriAtmosferaNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return StrutturaRistorazionePk
	 */
	public StrutturaRistorazionePk createPk()
	{
		return new StrutturaRistorazionePk(sriId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.StrutturaRistorazione: " );
		ret.append( "sriId=" + sriId );
		ret.append( ", sriPastiBambini=" + sriPastiBambini );
		ret.append( ", sriALaCarte=" + sriALaCarte );
		ret.append( ", sriBuffetBambini=" + sriBuffetBambini );
		ret.append( ", sriBuffet=" + sriBuffet );
		ret.append( ", sriVini=" + sriVini );
		ret.append( ", sriAcqua=" + sriAcqua );
		ret.append( ", sriSnackBar=" + sriSnackBar );
		ret.append( ", sriFrutta=" + sriFrutta );
		ret.append( ", sriSpesaDom=" + sriSpesaDom );
		ret.append( ", sriCioccolatini=" + sriCioccolatini );
		ret.append( ", sriBarbecue=" + sriBarbecue );
		ret.append( ", sriDistAutoBev=" + sriDistAutoBev );
		ret.append( ", sriServCamera=" + sriServCamera );
		ret.append( ", sriDitAutoSnack=" + sriDitAutoSnack );
		ret.append( ", sriColCamera=" + sriColCamera );
		ret.append( ", sriMenuDiete=" + sriMenuDiete );
		ret.append( ", sriNomeRist=" + sriNomeRist );
		ret.append( ", sriSoloOspiti=" + sriSoloOspiti );
		ret.append( ", sriPrenotazione=" + sriPrenotazione );
		ret.append( ", sriPostiAperto=" + sriPostiAperto );
		ret.append( ", sriApertoCol=" + sriApertoCol );
		ret.append( ", sriApertoBrunch=" + sriApertoBrunch );
		ret.append( ", sriApertoAperitivo=" + sriApertoAperitivo );
		ret.append( ", sriApertoHightea=" + sriApertoHightea );
		ret.append( ", sriApertoCena=" + sriApertoCena );
		ret.append( ", sriApertoPranzo=" + sriApertoPranzo );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		ret.append( ", sriTipoMenu=" + sriTipoMenu );
		ret.append( ", sriCucinia=" + sriCucinia );
		ret.append( ", sriOpioniDietetiche=" + sriOpioniDietetiche );
		ret.append( ", sriAtmosfera=" + sriAtmosfera );
		return ret.toString();
	}

}
