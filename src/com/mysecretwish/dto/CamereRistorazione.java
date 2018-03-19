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

public class CamereRistorazione implements Serializable
{
	/** 
	 * This attribute maps to the column scr_id in the camere_ristorazione table.
	 */
	protected long scrId;

	/** 
	 * This attribute maps to the column scr_zona_pran in the camere_ristorazione table.
	 */
	protected String scrZonaPran;

	/** 
	 * This attribute maps to the column scr_tavolo_pran in the camere_ristorazione table.
	 */
	protected String scrTavoloPran;

	/** 
	 * This attribute maps to the column scr_calici_vin in the camere_ristorazione table.
	 */
	protected String scrCaliciVin;

	/** 
	 * This attribute maps to the column scr_bottiglia_acq in the camere_ristorazione table.
	 */
	protected String scrBottigliaAcq;

	/** 
	 * This attribute maps to the column scr_bott_acq_cam in the camere_ristorazione table.
	 */
	protected String scrBottAcqCam;

	/** 
	 * This attribute maps to the column scr_cioccolatini in the camere_ristorazione table.
	 */
	protected String scrCioccolatini;

	/** 
	 * This attribute maps to the column scr_biscotti in the camere_ristorazione table.
	 */
	protected String scrBiscotti;

	/** 
	 * This attribute maps to the column scr_ciocc_bisc_cam in the camere_ristorazione table.
	 */
	protected String scrCioccBiscCam;

	/** 
	 * This attribute maps to the column scr_frutta in the camere_ristorazione table.
	 */
	protected String scrFrutta;

	/** 
	 * This attribute maps to the column scr_frutta_cam in the camere_ristorazione table.
	 */
	protected String scrFruttaCam;

	/** 
	 * This attribute maps to the column scr_vino_champ in the camere_ristorazione table.
	 */
	protected String scrVinoChamp;

	/** 
	 * This attribute maps to the column scr_vino_champ_str in the camere_ristorazione table.
	 */
	protected String scrVinoChampStr;

	/** 
	 * This attribute maps to the column scr_barbecue in the camere_ristorazione table.
	 */
	protected String scrBarbecue;

	/** 
	 * This attribute maps to the column scr_forno in the camere_ristorazione table.
	 */
	protected String scrForno;

	/** 
	 * This attribute maps to the column scr_piano_cott in the camere_ristorazione table.
	 */
	protected String scrPianoCott;

	/** 
	 * This attribute maps to the column scr_tostapane in the camere_ristorazione table.
	 */
	protected String scrTostapane;

	/** 
	 * This attribute maps to the column scr_lavatov in the camere_ristorazione table.
	 */
	protected String scrLavatov;

	/** 
	 * This attribute maps to the column scr_bollitore_elet in the camere_ristorazione table.
	 */
	protected String scrBollitoreElet;

	/** 
	 * This attribute maps to the column scr_zona_pran_aper in the camere_ristorazione table.
	 */
	protected String scrZonaPranAper;

	/** 
	 * This attribute maps to the column scr_arred_est in the camere_ristorazione table.
	 */
	protected String scrArredEst;

	/** 
	 * This attribute maps to the column scr_minibar in the camere_ristorazione table.
	 */
	protected String scrMinibar;

	/** 
	 * This attribute maps to the column scr_cucina in the camere_ristorazione table.
	 */
	protected String scrCucina;

	/** 
	 * This attribute maps to the column scr_ang_cott in the camere_ristorazione table.
	 */
	protected String scrAngCott;

	/** 
	 * This attribute maps to the column scr_utensili_cuc in the camere_ristorazione table.
	 */
	protected String scrUtensiliCuc;

	/** 
	 * This attribute maps to the column scr_microonde in the camere_ristorazione table.
	 */
	protected String scrMicroonde;

	/** 
	 * This attribute maps to the column scr_frigorifero in the camere_ristorazione table.
	 */
	protected String scrFrigorifero;

	/** 
	 * This attribute maps to the column scr_macc_caffe in the camere_ristorazione table.
	 */
	protected String scrMaccCaffe;

	/** 
	 * This attribute maps to the column scr_bollitore in the camere_ristorazione table.
	 */
	protected String scrBollitore;

	/** 
	 * This attribute maps to the column scr_seggiolone in the camere_ristorazione table.
	 */
	protected String scrSeggiolone;

	/** 
	 * This attribute maps to the column scr_serv_extra in the camere_ristorazione table.
	 */
	protected String scrServExtra;

	/** 
	 * This attribute maps to the column scr_acc_executive in the camere_ristorazione table.
	 */
	protected String scrAccExecutive;

	/** 
	 * This attribute maps to the column scr_sveglia in the camere_ristorazione table.
	 */
	protected String scrSveglia;

	/** 
	 * This attribute maps to the column scr_sveglia_tel in the camere_ristorazione table.
	 */
	protected String scrSvegliaTel;

	/** 
	 * This attribute maps to the column scr_svelia_o_tel in the camere_ristorazione table.
	 */
	protected String scrSveliaOTel;

	/** 
	 * This attribute maps to the column scr_biancheria_casa in the camere_ristorazione table.
	 */
	protected String scrBiancheriaCasa;

	/** 
	 * This attribute maps to the column scr_asciug_lenz_pag in the camere_ristorazione table.
	 */
	protected String scrAsciugLenzPag;

	/** 
	 * This attribute maps to the column scr_asciugamani in the camere_ristorazione table.
	 */
	protected String scrAsciugamani;

	/** 
	 * This attribute maps to the column camere_cam_id in the camere_ristorazione table.
	 */
	protected long camereCamId;

	/**
	 * Method 'CamereRistorazione'
	 * 
	 */
	public CamereRistorazione()
	{
	}

	/**
	 * Method 'getScrId'
	 * 
	 * @return long
	 */
	public long getScrId()
	{
		return scrId;
	}

	/**
	 * Method 'setScrId'
	 * 
	 * @param scrId
	 */
	public void setScrId(long scrId)
	{
		this.scrId = scrId;
	}

	/**
	 * Method 'getScrZonaPran'
	 * 
	 * @return String
	 */
	public String getScrZonaPran()
	{
		return scrZonaPran;
	}

	/**
	 * Method 'setScrZonaPran'
	 * 
	 * @param scrZonaPran
	 */
	public void setScrZonaPran(String scrZonaPran)
	{
		this.scrZonaPran = scrZonaPran;
	}

	/**
	 * Method 'getScrTavoloPran'
	 * 
	 * @return String
	 */
	public String getScrTavoloPran()
	{
		return scrTavoloPran;
	}

	/**
	 * Method 'setScrTavoloPran'
	 * 
	 * @param scrTavoloPran
	 */
	public void setScrTavoloPran(String scrTavoloPran)
	{
		this.scrTavoloPran = scrTavoloPran;
	}

	/**
	 * Method 'getScrCaliciVin'
	 * 
	 * @return String
	 */
	public String getScrCaliciVin()
	{
		return scrCaliciVin;
	}

	/**
	 * Method 'setScrCaliciVin'
	 * 
	 * @param scrCaliciVin
	 */
	public void setScrCaliciVin(String scrCaliciVin)
	{
		this.scrCaliciVin = scrCaliciVin;
	}

	/**
	 * Method 'getScrBottigliaAcq'
	 * 
	 * @return String
	 */
	public String getScrBottigliaAcq()
	{
		return scrBottigliaAcq;
	}

	/**
	 * Method 'setScrBottigliaAcq'
	 * 
	 * @param scrBottigliaAcq
	 */
	public void setScrBottigliaAcq(String scrBottigliaAcq)
	{
		this.scrBottigliaAcq = scrBottigliaAcq;
	}

	/**
	 * Method 'getScrBottAcqCam'
	 * 
	 * @return String
	 */
	public String getScrBottAcqCam()
	{
		return scrBottAcqCam;
	}

	/**
	 * Method 'setScrBottAcqCam'
	 * 
	 * @param scrBottAcqCam
	 */
	public void setScrBottAcqCam(String scrBottAcqCam)
	{
		this.scrBottAcqCam = scrBottAcqCam;
	}

	/**
	 * Method 'getScrCioccolatini'
	 * 
	 * @return String
	 */
	public String getScrCioccolatini()
	{
		return scrCioccolatini;
	}

	/**
	 * Method 'setScrCioccolatini'
	 * 
	 * @param scrCioccolatini
	 */
	public void setScrCioccolatini(String scrCioccolatini)
	{
		this.scrCioccolatini = scrCioccolatini;
	}

	/**
	 * Method 'getScrBiscotti'
	 * 
	 * @return String
	 */
	public String getScrBiscotti()
	{
		return scrBiscotti;
	}

	/**
	 * Method 'setScrBiscotti'
	 * 
	 * @param scrBiscotti
	 */
	public void setScrBiscotti(String scrBiscotti)
	{
		this.scrBiscotti = scrBiscotti;
	}

	/**
	 * Method 'getScrCioccBiscCam'
	 * 
	 * @return String
	 */
	public String getScrCioccBiscCam()
	{
		return scrCioccBiscCam;
	}

	/**
	 * Method 'setScrCioccBiscCam'
	 * 
	 * @param scrCioccBiscCam
	 */
	public void setScrCioccBiscCam(String scrCioccBiscCam)
	{
		this.scrCioccBiscCam = scrCioccBiscCam;
	}

	/**
	 * Method 'getScrFrutta'
	 * 
	 * @return String
	 */
	public String getScrFrutta()
	{
		return scrFrutta;
	}

	/**
	 * Method 'setScrFrutta'
	 * 
	 * @param scrFrutta
	 */
	public void setScrFrutta(String scrFrutta)
	{
		this.scrFrutta = scrFrutta;
	}

	/**
	 * Method 'getScrFruttaCam'
	 * 
	 * @return String
	 */
	public String getScrFruttaCam()
	{
		return scrFruttaCam;
	}

	/**
	 * Method 'setScrFruttaCam'
	 * 
	 * @param scrFruttaCam
	 */
	public void setScrFruttaCam(String scrFruttaCam)
	{
		this.scrFruttaCam = scrFruttaCam;
	}

	/**
	 * Method 'getScrVinoChamp'
	 * 
	 * @return String
	 */
	public String getScrVinoChamp()
	{
		return scrVinoChamp;
	}

	/**
	 * Method 'setScrVinoChamp'
	 * 
	 * @param scrVinoChamp
	 */
	public void setScrVinoChamp(String scrVinoChamp)
	{
		this.scrVinoChamp = scrVinoChamp;
	}

	/**
	 * Method 'getScrVinoChampStr'
	 * 
	 * @return String
	 */
	public String getScrVinoChampStr()
	{
		return scrVinoChampStr;
	}

	/**
	 * Method 'setScrVinoChampStr'
	 * 
	 * @param scrVinoChampStr
	 */
	public void setScrVinoChampStr(String scrVinoChampStr)
	{
		this.scrVinoChampStr = scrVinoChampStr;
	}

	/**
	 * Method 'getScrBarbecue'
	 * 
	 * @return String
	 */
	public String getScrBarbecue()
	{
		return scrBarbecue;
	}

	/**
	 * Method 'setScrBarbecue'
	 * 
	 * @param scrBarbecue
	 */
	public void setScrBarbecue(String scrBarbecue)
	{
		this.scrBarbecue = scrBarbecue;
	}

	/**
	 * Method 'getScrForno'
	 * 
	 * @return String
	 */
	public String getScrForno()
	{
		return scrForno;
	}

	/**
	 * Method 'setScrForno'
	 * 
	 * @param scrForno
	 */
	public void setScrForno(String scrForno)
	{
		this.scrForno = scrForno;
	}

	/**
	 * Method 'getScrPianoCott'
	 * 
	 * @return String
	 */
	public String getScrPianoCott()
	{
		return scrPianoCott;
	}

	/**
	 * Method 'setScrPianoCott'
	 * 
	 * @param scrPianoCott
	 */
	public void setScrPianoCott(String scrPianoCott)
	{
		this.scrPianoCott = scrPianoCott;
	}

	/**
	 * Method 'getScrTostapane'
	 * 
	 * @return String
	 */
	public String getScrTostapane()
	{
		return scrTostapane;
	}

	/**
	 * Method 'setScrTostapane'
	 * 
	 * @param scrTostapane
	 */
	public void setScrTostapane(String scrTostapane)
	{
		this.scrTostapane = scrTostapane;
	}

	/**
	 * Method 'getScrLavatov'
	 * 
	 * @return String
	 */
	public String getScrLavatov()
	{
		return scrLavatov;
	}

	/**
	 * Method 'setScrLavatov'
	 * 
	 * @param scrLavatov
	 */
	public void setScrLavatov(String scrLavatov)
	{
		this.scrLavatov = scrLavatov;
	}

	/**
	 * Method 'getScrBollitoreElet'
	 * 
	 * @return String
	 */
	public String getScrBollitoreElet()
	{
		return scrBollitoreElet;
	}

	/**
	 * Method 'setScrBollitoreElet'
	 * 
	 * @param scrBollitoreElet
	 */
	public void setScrBollitoreElet(String scrBollitoreElet)
	{
		this.scrBollitoreElet = scrBollitoreElet;
	}

	/**
	 * Method 'getScrZonaPranAper'
	 * 
	 * @return String
	 */
	public String getScrZonaPranAper()
	{
		return scrZonaPranAper;
	}

	/**
	 * Method 'setScrZonaPranAper'
	 * 
	 * @param scrZonaPranAper
	 */
	public void setScrZonaPranAper(String scrZonaPranAper)
	{
		this.scrZonaPranAper = scrZonaPranAper;
	}

	/**
	 * Method 'getScrArredEst'
	 * 
	 * @return String
	 */
	public String getScrArredEst()
	{
		return scrArredEst;
	}

	/**
	 * Method 'setScrArredEst'
	 * 
	 * @param scrArredEst
	 */
	public void setScrArredEst(String scrArredEst)
	{
		this.scrArredEst = scrArredEst;
	}

	/**
	 * Method 'getScrMinibar'
	 * 
	 * @return String
	 */
	public String getScrMinibar()
	{
		return scrMinibar;
	}

	/**
	 * Method 'setScrMinibar'
	 * 
	 * @param scrMinibar
	 */
	public void setScrMinibar(String scrMinibar)
	{
		this.scrMinibar = scrMinibar;
	}

	/**
	 * Method 'getScrCucina'
	 * 
	 * @return String
	 */
	public String getScrCucina()
	{
		return scrCucina;
	}

	/**
	 * Method 'setScrCucina'
	 * 
	 * @param scrCucina
	 */
	public void setScrCucina(String scrCucina)
	{
		this.scrCucina = scrCucina;
	}

	/**
	 * Method 'getScrAngCott'
	 * 
	 * @return String
	 */
	public String getScrAngCott()
	{
		return scrAngCott;
	}

	/**
	 * Method 'setScrAngCott'
	 * 
	 * @param scrAngCott
	 */
	public void setScrAngCott(String scrAngCott)
	{
		this.scrAngCott = scrAngCott;
	}

	/**
	 * Method 'getScrUtensiliCuc'
	 * 
	 * @return String
	 */
	public String getScrUtensiliCuc()
	{
		return scrUtensiliCuc;
	}

	/**
	 * Method 'setScrUtensiliCuc'
	 * 
	 * @param scrUtensiliCuc
	 */
	public void setScrUtensiliCuc(String scrUtensiliCuc)
	{
		this.scrUtensiliCuc = scrUtensiliCuc;
	}

	/**
	 * Method 'getScrMicroonde'
	 * 
	 * @return String
	 */
	public String getScrMicroonde()
	{
		return scrMicroonde;
	}

	/**
	 * Method 'setScrMicroonde'
	 * 
	 * @param scrMicroonde
	 */
	public void setScrMicroonde(String scrMicroonde)
	{
		this.scrMicroonde = scrMicroonde;
	}

	/**
	 * Method 'getScrFrigorifero'
	 * 
	 * @return String
	 */
	public String getScrFrigorifero()
	{
		return scrFrigorifero;
	}

	/**
	 * Method 'setScrFrigorifero'
	 * 
	 * @param scrFrigorifero
	 */
	public void setScrFrigorifero(String scrFrigorifero)
	{
		this.scrFrigorifero = scrFrigorifero;
	}

	/**
	 * Method 'getScrMaccCaffe'
	 * 
	 * @return String
	 */
	public String getScrMaccCaffe()
	{
		return scrMaccCaffe;
	}

	/**
	 * Method 'setScrMaccCaffe'
	 * 
	 * @param scrMaccCaffe
	 */
	public void setScrMaccCaffe(String scrMaccCaffe)
	{
		this.scrMaccCaffe = scrMaccCaffe;
	}

	/**
	 * Method 'getScrBollitore'
	 * 
	 * @return String
	 */
	public String getScrBollitore()
	{
		return scrBollitore;
	}

	/**
	 * Method 'setScrBollitore'
	 * 
	 * @param scrBollitore
	 */
	public void setScrBollitore(String scrBollitore)
	{
		this.scrBollitore = scrBollitore;
	}

	/**
	 * Method 'getScrSeggiolone'
	 * 
	 * @return String
	 */
	public String getScrSeggiolone()
	{
		return scrSeggiolone;
	}

	/**
	 * Method 'setScrSeggiolone'
	 * 
	 * @param scrSeggiolone
	 */
	public void setScrSeggiolone(String scrSeggiolone)
	{
		this.scrSeggiolone = scrSeggiolone;
	}

	/**
	 * Method 'getScrServExtra'
	 * 
	 * @return String
	 */
	public String getScrServExtra()
	{
		return scrServExtra;
	}

	/**
	 * Method 'setScrServExtra'
	 * 
	 * @param scrServExtra
	 */
	public void setScrServExtra(String scrServExtra)
	{
		this.scrServExtra = scrServExtra;
	}

	/**
	 * Method 'getScrAccExecutive'
	 * 
	 * @return String
	 */
	public String getScrAccExecutive()
	{
		return scrAccExecutive;
	}

	/**
	 * Method 'setScrAccExecutive'
	 * 
	 * @param scrAccExecutive
	 */
	public void setScrAccExecutive(String scrAccExecutive)
	{
		this.scrAccExecutive = scrAccExecutive;
	}

	/**
	 * Method 'getScrSveglia'
	 * 
	 * @return String
	 */
	public String getScrSveglia()
	{
		return scrSveglia;
	}

	/**
	 * Method 'setScrSveglia'
	 * 
	 * @param scrSveglia
	 */
	public void setScrSveglia(String scrSveglia)
	{
		this.scrSveglia = scrSveglia;
	}

	/**
	 * Method 'getScrSvegliaTel'
	 * 
	 * @return String
	 */
	public String getScrSvegliaTel()
	{
		return scrSvegliaTel;
	}

	/**
	 * Method 'setScrSvegliaTel'
	 * 
	 * @param scrSvegliaTel
	 */
	public void setScrSvegliaTel(String scrSvegliaTel)
	{
		this.scrSvegliaTel = scrSvegliaTel;
	}

	/**
	 * Method 'getScrSveliaOTel'
	 * 
	 * @return String
	 */
	public String getScrSveliaOTel()
	{
		return scrSveliaOTel;
	}

	/**
	 * Method 'setScrSveliaOTel'
	 * 
	 * @param scrSveliaOTel
	 */
	public void setScrSveliaOTel(String scrSveliaOTel)
	{
		this.scrSveliaOTel = scrSveliaOTel;
	}

	/**
	 * Method 'getScrBiancheriaCasa'
	 * 
	 * @return String
	 */
	public String getScrBiancheriaCasa()
	{
		return scrBiancheriaCasa;
	}

	/**
	 * Method 'setScrBiancheriaCasa'
	 * 
	 * @param scrBiancheriaCasa
	 */
	public void setScrBiancheriaCasa(String scrBiancheriaCasa)
	{
		this.scrBiancheriaCasa = scrBiancheriaCasa;
	}

	/**
	 * Method 'getScrAsciugLenzPag'
	 * 
	 * @return String
	 */
	public String getScrAsciugLenzPag()
	{
		return scrAsciugLenzPag;
	}

	/**
	 * Method 'setScrAsciugLenzPag'
	 * 
	 * @param scrAsciugLenzPag
	 */
	public void setScrAsciugLenzPag(String scrAsciugLenzPag)
	{
		this.scrAsciugLenzPag = scrAsciugLenzPag;
	}

	/**
	 * Method 'getScrAsciugamani'
	 * 
	 * @return String
	 */
	public String getScrAsciugamani()
	{
		return scrAsciugamani;
	}

	/**
	 * Method 'setScrAsciugamani'
	 * 
	 * @param scrAsciugamani
	 */
	public void setScrAsciugamani(String scrAsciugamani)
	{
		this.scrAsciugamani = scrAsciugamani;
	}

	/**
	 * Method 'getCamereCamId'
	 * 
	 * @return long
	 */
	public long getCamereCamId()
	{
		return camereCamId;
	}

	/**
	 * Method 'setCamereCamId'
	 * 
	 * @param camereCamId
	 */
	public void setCamereCamId(long camereCamId)
	{
		this.camereCamId = camereCamId;
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
		
		if (!(_other instanceof CamereRistorazione)) {
			return false;
		}
		
		final CamereRistorazione _cast = (CamereRistorazione) _other;
		if (scrId != _cast.scrId) {
			return false;
		}
		
		if (scrZonaPran == null ? _cast.scrZonaPran != scrZonaPran : !scrZonaPran.equals( _cast.scrZonaPran )) {
			return false;
		}
		
		if (scrTavoloPran == null ? _cast.scrTavoloPran != scrTavoloPran : !scrTavoloPran.equals( _cast.scrTavoloPran )) {
			return false;
		}
		
		if (scrCaliciVin == null ? _cast.scrCaliciVin != scrCaliciVin : !scrCaliciVin.equals( _cast.scrCaliciVin )) {
			return false;
		}
		
		if (scrBottigliaAcq == null ? _cast.scrBottigliaAcq != scrBottigliaAcq : !scrBottigliaAcq.equals( _cast.scrBottigliaAcq )) {
			return false;
		}
		
		if (scrBottAcqCam == null ? _cast.scrBottAcqCam != scrBottAcqCam : !scrBottAcqCam.equals( _cast.scrBottAcqCam )) {
			return false;
		}
		
		if (scrCioccolatini == null ? _cast.scrCioccolatini != scrCioccolatini : !scrCioccolatini.equals( _cast.scrCioccolatini )) {
			return false;
		}
		
		if (scrBiscotti == null ? _cast.scrBiscotti != scrBiscotti : !scrBiscotti.equals( _cast.scrBiscotti )) {
			return false;
		}
		
		if (scrCioccBiscCam == null ? _cast.scrCioccBiscCam != scrCioccBiscCam : !scrCioccBiscCam.equals( _cast.scrCioccBiscCam )) {
			return false;
		}
		
		if (scrFrutta == null ? _cast.scrFrutta != scrFrutta : !scrFrutta.equals( _cast.scrFrutta )) {
			return false;
		}
		
		if (scrFruttaCam == null ? _cast.scrFruttaCam != scrFruttaCam : !scrFruttaCam.equals( _cast.scrFruttaCam )) {
			return false;
		}
		
		if (scrVinoChamp == null ? _cast.scrVinoChamp != scrVinoChamp : !scrVinoChamp.equals( _cast.scrVinoChamp )) {
			return false;
		}
		
		if (scrVinoChampStr == null ? _cast.scrVinoChampStr != scrVinoChampStr : !scrVinoChampStr.equals( _cast.scrVinoChampStr )) {
			return false;
		}
		
		if (scrBarbecue == null ? _cast.scrBarbecue != scrBarbecue : !scrBarbecue.equals( _cast.scrBarbecue )) {
			return false;
		}
		
		if (scrForno == null ? _cast.scrForno != scrForno : !scrForno.equals( _cast.scrForno )) {
			return false;
		}
		
		if (scrPianoCott == null ? _cast.scrPianoCott != scrPianoCott : !scrPianoCott.equals( _cast.scrPianoCott )) {
			return false;
		}
		
		if (scrTostapane == null ? _cast.scrTostapane != scrTostapane : !scrTostapane.equals( _cast.scrTostapane )) {
			return false;
		}
		
		if (scrLavatov == null ? _cast.scrLavatov != scrLavatov : !scrLavatov.equals( _cast.scrLavatov )) {
			return false;
		}
		
		if (scrBollitoreElet == null ? _cast.scrBollitoreElet != scrBollitoreElet : !scrBollitoreElet.equals( _cast.scrBollitoreElet )) {
			return false;
		}
		
		if (scrZonaPranAper == null ? _cast.scrZonaPranAper != scrZonaPranAper : !scrZonaPranAper.equals( _cast.scrZonaPranAper )) {
			return false;
		}
		
		if (scrArredEst == null ? _cast.scrArredEst != scrArredEst : !scrArredEst.equals( _cast.scrArredEst )) {
			return false;
		}
		
		if (scrMinibar == null ? _cast.scrMinibar != scrMinibar : !scrMinibar.equals( _cast.scrMinibar )) {
			return false;
		}
		
		if (scrCucina == null ? _cast.scrCucina != scrCucina : !scrCucina.equals( _cast.scrCucina )) {
			return false;
		}
		
		if (scrAngCott == null ? _cast.scrAngCott != scrAngCott : !scrAngCott.equals( _cast.scrAngCott )) {
			return false;
		}
		
		if (scrUtensiliCuc == null ? _cast.scrUtensiliCuc != scrUtensiliCuc : !scrUtensiliCuc.equals( _cast.scrUtensiliCuc )) {
			return false;
		}
		
		if (scrMicroonde == null ? _cast.scrMicroonde != scrMicroonde : !scrMicroonde.equals( _cast.scrMicroonde )) {
			return false;
		}
		
		if (scrFrigorifero == null ? _cast.scrFrigorifero != scrFrigorifero : !scrFrigorifero.equals( _cast.scrFrigorifero )) {
			return false;
		}
		
		if (scrMaccCaffe == null ? _cast.scrMaccCaffe != scrMaccCaffe : !scrMaccCaffe.equals( _cast.scrMaccCaffe )) {
			return false;
		}
		
		if (scrBollitore == null ? _cast.scrBollitore != scrBollitore : !scrBollitore.equals( _cast.scrBollitore )) {
			return false;
		}
		
		if (scrSeggiolone == null ? _cast.scrSeggiolone != scrSeggiolone : !scrSeggiolone.equals( _cast.scrSeggiolone )) {
			return false;
		}
		
		if (scrServExtra == null ? _cast.scrServExtra != scrServExtra : !scrServExtra.equals( _cast.scrServExtra )) {
			return false;
		}
		
		if (scrAccExecutive == null ? _cast.scrAccExecutive != scrAccExecutive : !scrAccExecutive.equals( _cast.scrAccExecutive )) {
			return false;
		}
		
		if (scrSveglia == null ? _cast.scrSveglia != scrSveglia : !scrSveglia.equals( _cast.scrSveglia )) {
			return false;
		}
		
		if (scrSvegliaTel == null ? _cast.scrSvegliaTel != scrSvegliaTel : !scrSvegliaTel.equals( _cast.scrSvegliaTel )) {
			return false;
		}
		
		if (scrSveliaOTel == null ? _cast.scrSveliaOTel != scrSveliaOTel : !scrSveliaOTel.equals( _cast.scrSveliaOTel )) {
			return false;
		}
		
		if (scrBiancheriaCasa == null ? _cast.scrBiancheriaCasa != scrBiancheriaCasa : !scrBiancheriaCasa.equals( _cast.scrBiancheriaCasa )) {
			return false;
		}
		
		if (scrAsciugLenzPag == null ? _cast.scrAsciugLenzPag != scrAsciugLenzPag : !scrAsciugLenzPag.equals( _cast.scrAsciugLenzPag )) {
			return false;
		}
		
		if (scrAsciugamani == null ? _cast.scrAsciugamani != scrAsciugamani : !scrAsciugamani.equals( _cast.scrAsciugamani )) {
			return false;
		}
		
		if (camereCamId != _cast.camereCamId) {
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
		_hashCode = 29 * _hashCode + (int) (scrId ^ (scrId >>> 32));
		if (scrZonaPran != null) {
			_hashCode = 29 * _hashCode + scrZonaPran.hashCode();
		}
		
		if (scrTavoloPran != null) {
			_hashCode = 29 * _hashCode + scrTavoloPran.hashCode();
		}
		
		if (scrCaliciVin != null) {
			_hashCode = 29 * _hashCode + scrCaliciVin.hashCode();
		}
		
		if (scrBottigliaAcq != null) {
			_hashCode = 29 * _hashCode + scrBottigliaAcq.hashCode();
		}
		
		if (scrBottAcqCam != null) {
			_hashCode = 29 * _hashCode + scrBottAcqCam.hashCode();
		}
		
		if (scrCioccolatini != null) {
			_hashCode = 29 * _hashCode + scrCioccolatini.hashCode();
		}
		
		if (scrBiscotti != null) {
			_hashCode = 29 * _hashCode + scrBiscotti.hashCode();
		}
		
		if (scrCioccBiscCam != null) {
			_hashCode = 29 * _hashCode + scrCioccBiscCam.hashCode();
		}
		
		if (scrFrutta != null) {
			_hashCode = 29 * _hashCode + scrFrutta.hashCode();
		}
		
		if (scrFruttaCam != null) {
			_hashCode = 29 * _hashCode + scrFruttaCam.hashCode();
		}
		
		if (scrVinoChamp != null) {
			_hashCode = 29 * _hashCode + scrVinoChamp.hashCode();
		}
		
		if (scrVinoChampStr != null) {
			_hashCode = 29 * _hashCode + scrVinoChampStr.hashCode();
		}
		
		if (scrBarbecue != null) {
			_hashCode = 29 * _hashCode + scrBarbecue.hashCode();
		}
		
		if (scrForno != null) {
			_hashCode = 29 * _hashCode + scrForno.hashCode();
		}
		
		if (scrPianoCott != null) {
			_hashCode = 29 * _hashCode + scrPianoCott.hashCode();
		}
		
		if (scrTostapane != null) {
			_hashCode = 29 * _hashCode + scrTostapane.hashCode();
		}
		
		if (scrLavatov != null) {
			_hashCode = 29 * _hashCode + scrLavatov.hashCode();
		}
		
		if (scrBollitoreElet != null) {
			_hashCode = 29 * _hashCode + scrBollitoreElet.hashCode();
		}
		
		if (scrZonaPranAper != null) {
			_hashCode = 29 * _hashCode + scrZonaPranAper.hashCode();
		}
		
		if (scrArredEst != null) {
			_hashCode = 29 * _hashCode + scrArredEst.hashCode();
		}
		
		if (scrMinibar != null) {
			_hashCode = 29 * _hashCode + scrMinibar.hashCode();
		}
		
		if (scrCucina != null) {
			_hashCode = 29 * _hashCode + scrCucina.hashCode();
		}
		
		if (scrAngCott != null) {
			_hashCode = 29 * _hashCode + scrAngCott.hashCode();
		}
		
		if (scrUtensiliCuc != null) {
			_hashCode = 29 * _hashCode + scrUtensiliCuc.hashCode();
		}
		
		if (scrMicroonde != null) {
			_hashCode = 29 * _hashCode + scrMicroonde.hashCode();
		}
		
		if (scrFrigorifero != null) {
			_hashCode = 29 * _hashCode + scrFrigorifero.hashCode();
		}
		
		if (scrMaccCaffe != null) {
			_hashCode = 29 * _hashCode + scrMaccCaffe.hashCode();
		}
		
		if (scrBollitore != null) {
			_hashCode = 29 * _hashCode + scrBollitore.hashCode();
		}
		
		if (scrSeggiolone != null) {
			_hashCode = 29 * _hashCode + scrSeggiolone.hashCode();
		}
		
		if (scrServExtra != null) {
			_hashCode = 29 * _hashCode + scrServExtra.hashCode();
		}
		
		if (scrAccExecutive != null) {
			_hashCode = 29 * _hashCode + scrAccExecutive.hashCode();
		}
		
		if (scrSveglia != null) {
			_hashCode = 29 * _hashCode + scrSveglia.hashCode();
		}
		
		if (scrSvegliaTel != null) {
			_hashCode = 29 * _hashCode + scrSvegliaTel.hashCode();
		}
		
		if (scrSveliaOTel != null) {
			_hashCode = 29 * _hashCode + scrSveliaOTel.hashCode();
		}
		
		if (scrBiancheriaCasa != null) {
			_hashCode = 29 * _hashCode + scrBiancheriaCasa.hashCode();
		}
		
		if (scrAsciugLenzPag != null) {
			_hashCode = 29 * _hashCode + scrAsciugLenzPag.hashCode();
		}
		
		if (scrAsciugamani != null) {
			_hashCode = 29 * _hashCode + scrAsciugamani.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (int) (camereCamId ^ (camereCamId >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CamereRistorazionePk
	 */
	public CamereRistorazionePk createPk()
	{
		return new CamereRistorazionePk(scrId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.CamereRistorazione: " );
		ret.append( "scrId=" + scrId );
		ret.append( ", scrZonaPran=" + scrZonaPran );
		ret.append( ", scrTavoloPran=" + scrTavoloPran );
		ret.append( ", scrCaliciVin=" + scrCaliciVin );
		ret.append( ", scrBottigliaAcq=" + scrBottigliaAcq );
		ret.append( ", scrBottAcqCam=" + scrBottAcqCam );
		ret.append( ", scrCioccolatini=" + scrCioccolatini );
		ret.append( ", scrBiscotti=" + scrBiscotti );
		ret.append( ", scrCioccBiscCam=" + scrCioccBiscCam );
		ret.append( ", scrFrutta=" + scrFrutta );
		ret.append( ", scrFruttaCam=" + scrFruttaCam );
		ret.append( ", scrVinoChamp=" + scrVinoChamp );
		ret.append( ", scrVinoChampStr=" + scrVinoChampStr );
		ret.append( ", scrBarbecue=" + scrBarbecue );
		ret.append( ", scrForno=" + scrForno );
		ret.append( ", scrPianoCott=" + scrPianoCott );
		ret.append( ", scrTostapane=" + scrTostapane );
		ret.append( ", scrLavatov=" + scrLavatov );
		ret.append( ", scrBollitoreElet=" + scrBollitoreElet );
		ret.append( ", scrZonaPranAper=" + scrZonaPranAper );
		ret.append( ", scrArredEst=" + scrArredEst );
		ret.append( ", scrMinibar=" + scrMinibar );
		ret.append( ", scrCucina=" + scrCucina );
		ret.append( ", scrAngCott=" + scrAngCott );
		ret.append( ", scrUtensiliCuc=" + scrUtensiliCuc );
		ret.append( ", scrMicroonde=" + scrMicroonde );
		ret.append( ", scrFrigorifero=" + scrFrigorifero );
		ret.append( ", scrMaccCaffe=" + scrMaccCaffe );
		ret.append( ", scrBollitore=" + scrBollitore );
		ret.append( ", scrSeggiolone=" + scrSeggiolone );
		ret.append( ", scrServExtra=" + scrServExtra );
		ret.append( ", scrAccExecutive=" + scrAccExecutive );
		ret.append( ", scrSveglia=" + scrSveglia );
		ret.append( ", scrSvegliaTel=" + scrSvegliaTel );
		ret.append( ", scrSveliaOTel=" + scrSveliaOTel );
		ret.append( ", scrBiancheriaCasa=" + scrBiancheriaCasa );
		ret.append( ", scrAsciugLenzPag=" + scrAsciugLenzPag );
		ret.append( ", scrAsciugamani=" + scrAsciugamani );
		ret.append( ", camereCamId=" + camereCamId );
		return ret.toString();
	}

}
