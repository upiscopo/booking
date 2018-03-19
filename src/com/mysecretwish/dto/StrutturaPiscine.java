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

public class StrutturaPiscine implements Serializable
{
	/** 
	 * This attribute maps to the column spi_id in the struttura_piscine table.
	 */
	protected long spiId;

	/** 
	 * This attribute maps to the column spi_scivolo in the struttura_piscine table.
	 */
	protected String spiScivolo;

	/** 
	 * This attribute maps to the column spi_spa in the struttura_piscine table.
	 */
	protected String spiSpa;

	/** 
	 * This attribute maps to the column spi_teli in the struttura_piscine table.
	 */
	protected String spiTeli;

	/** 
	 * This attribute maps to the column spi_bagno_turco in the struttura_piscine table.
	 */
	protected String spiBagnoTurco;

	/** 
	 * This attribute maps to the column spi_lettini in the struttura_piscine table.
	 */
	protected String spiLettini;

	/** 
	 * This attribute maps to the column spi_area_relax in the struttura_piscine table.
	 */
	protected String spiAreaRelax;

	/** 
	 * This attribute maps to the column spi_ombrelloni in the struttura_piscine table.
	 */
	protected String spiOmbrelloni;

	/** 
	 * This attribute maps to the column spi_pediluvio in the struttura_piscine table.
	 */
	protected String spiPediluvio;

	/** 
	 * This attribute maps to the column spi_servizi_bellezza in the struttura_piscine table.
	 */
	protected String spiServiziBellezza;

	/** 
	 * This attribute maps to the column spi_pacchetti_spa in the struttura_piscine table.
	 */
	protected String spiPacchettiSpa;

	/** 
	 * This attribute maps to the column spi_poltra_massag in the struttura_piscine table.
	 */
	protected String spiPoltraMassag;

	/** 
	 * This attribute maps to the column spi_fitness in the struttura_piscine table.
	 */
	protected String spiFitness;

	/** 
	 * This attribute maps to the column spi_lezioni_yoga in the struttura_piscine table.
	 */
	protected String spiLezioniYoga;

	/** 
	 * This attribute maps to the column spi_lezioni_fitness in the struttura_piscine table.
	 */
	protected String spiLezioniFitness;

	/** 
	 * This attribute maps to the column spi_personal_trainer in the struttura_piscine table.
	 */
	protected String spiPersonalTrainer;

	/** 
	 * This attribute maps to the column spi_piscina_bamb in the struttura_piscine table.
	 */
	protected String spiPiscinaBamb;

	/** 
	 * This attribute maps to the column spi_armadietti_spa in the struttura_piscine table.
	 */
	protected String spiArmadiettiSpa;

	/** 
	 * This attribute maps to the column spi_piscina in the struttura_piscine table.
	 */
	protected String spiPiscina;

	/** 
	 * This attribute maps to the column spi_giochi_acqua in the struttura_piscine table.
	 */
	protected String spiGiochiAcqua;

	/** 
	 * This attribute maps to the column spi_pisc_ultimo_piano in the struttura_piscine table.
	 */
	protected String spiPiscUltimoPiano;

	/** 
	 * This attribute maps to the column spi_pisc_sfioro in the struttura_piscine table.
	 */
	protected String spiPiscSfioro;

	/** 
	 * This attribute maps to the column spi_riscaldata in the struttura_piscine table.
	 */
	protected String spiRiscaldata;

	/** 
	 * This attribute maps to the column spi_pisc_vista in the struttura_piscine table.
	 */
	protected String spiPiscVista;

	/** 
	 * This attribute maps to the column spi_pisc_salata in the struttura_piscine table.
	 */
	protected String spiPiscSalata;

	/** 
	 * This attribute maps to the column spi_vasca_imm_fredda in the struttura_piscine table.
	 */
	protected String spiVascaImmFredda;

	/** 
	 * This attribute maps to the column spi_bar_bordo in the struttura_piscine table.
	 */
	protected String spiBarBordo;

	/** 
	 * This attribute maps to the column spi_recinto in the struttura_piscine table.
	 */
	protected String spiRecinto;

	/** 
	 * This attribute maps to the column spi_pisc_coperta in the struttura_piscine table.
	 */
	protected String spiPiscCoperta;

	/** 
	 * This attribute maps to the column spi_pisc_coperta_stag in the struttura_piscine table.
	 */
	protected String spiPiscCopertaStag;

	/** 
	 * This attribute maps to the column spi_pisc_coperta_anno in the struttura_piscine table.
	 */
	protected String spiPiscCopertaAnno;

	/** 
	 * This attribute maps to the column spi_pisc_aperto in the struttura_piscine table.
	 */
	protected String spiPiscAperto;

	/** 
	 * This attribute maps to the column spi_pisc_aperto_stag in the struttura_piscine table.
	 */
	protected String spiPiscApertoStag;

	/** 
	 * This attribute maps to the column spi_pisc_aperto_anno in the struttura_piscine table.
	 */
	protected String spiPiscApertoAnno;

	/** 
	 * This attribute maps to the column spi_costo in the struttura_piscine table.
	 */
	protected float spiCosto;

	/** 
	 * This attribute maps to the column struttura_str_id in the struttura_piscine table.
	 */
	protected long strutturaStrId;

	/**
	 * Method 'StrutturaPiscine'
	 * 
	 */
	public StrutturaPiscine()
	{
	}

	/**
	 * Method 'getSpiId'
	 * 
	 * @return long
	 */
	public long getSpiId()
	{
		return spiId;
	}

	/**
	 * Method 'setSpiId'
	 * 
	 * @param spiId
	 */
	public void setSpiId(long spiId)
	{
		this.spiId = spiId;
	}

	/**
	 * Method 'getSpiScivolo'
	 * 
	 * @return String
	 */
	public String getSpiScivolo()
	{
		return spiScivolo;
	}

	/**
	 * Method 'setSpiScivolo'
	 * 
	 * @param spiScivolo
	 */
	public void setSpiScivolo(String spiScivolo)
	{
		this.spiScivolo = spiScivolo;
	}

	/**
	 * Method 'getSpiSpa'
	 * 
	 * @return String
	 */
	public String getSpiSpa()
	{
		return spiSpa;
	}

	/**
	 * Method 'setSpiSpa'
	 * 
	 * @param spiSpa
	 */
	public void setSpiSpa(String spiSpa)
	{
		this.spiSpa = spiSpa;
	}

	/**
	 * Method 'getSpiTeli'
	 * 
	 * @return String
	 */
	public String getSpiTeli()
	{
		return spiTeli;
	}

	/**
	 * Method 'setSpiTeli'
	 * 
	 * @param spiTeli
	 */
	public void setSpiTeli(String spiTeli)
	{
		this.spiTeli = spiTeli;
	}

	/**
	 * Method 'getSpiBagnoTurco'
	 * 
	 * @return String
	 */
	public String getSpiBagnoTurco()
	{
		return spiBagnoTurco;
	}

	/**
	 * Method 'setSpiBagnoTurco'
	 * 
	 * @param spiBagnoTurco
	 */
	public void setSpiBagnoTurco(String spiBagnoTurco)
	{
		this.spiBagnoTurco = spiBagnoTurco;
	}

	/**
	 * Method 'getSpiLettini'
	 * 
	 * @return String
	 */
	public String getSpiLettini()
	{
		return spiLettini;
	}

	/**
	 * Method 'setSpiLettini'
	 * 
	 * @param spiLettini
	 */
	public void setSpiLettini(String spiLettini)
	{
		this.spiLettini = spiLettini;
	}

	/**
	 * Method 'getSpiAreaRelax'
	 * 
	 * @return String
	 */
	public String getSpiAreaRelax()
	{
		return spiAreaRelax;
	}

	/**
	 * Method 'setSpiAreaRelax'
	 * 
	 * @param spiAreaRelax
	 */
	public void setSpiAreaRelax(String spiAreaRelax)
	{
		this.spiAreaRelax = spiAreaRelax;
	}

	/**
	 * Method 'getSpiOmbrelloni'
	 * 
	 * @return String
	 */
	public String getSpiOmbrelloni()
	{
		return spiOmbrelloni;
	}

	/**
	 * Method 'setSpiOmbrelloni'
	 * 
	 * @param spiOmbrelloni
	 */
	public void setSpiOmbrelloni(String spiOmbrelloni)
	{
		this.spiOmbrelloni = spiOmbrelloni;
	}

	/**
	 * Method 'getSpiPediluvio'
	 * 
	 * @return String
	 */
	public String getSpiPediluvio()
	{
		return spiPediluvio;
	}

	/**
	 * Method 'setSpiPediluvio'
	 * 
	 * @param spiPediluvio
	 */
	public void setSpiPediluvio(String spiPediluvio)
	{
		this.spiPediluvio = spiPediluvio;
	}

	/**
	 * Method 'getSpiServiziBellezza'
	 * 
	 * @return String
	 */
	public String getSpiServiziBellezza()
	{
		return spiServiziBellezza;
	}

	/**
	 * Method 'setSpiServiziBellezza'
	 * 
	 * @param spiServiziBellezza
	 */
	public void setSpiServiziBellezza(String spiServiziBellezza)
	{
		this.spiServiziBellezza = spiServiziBellezza;
	}

	/**
	 * Method 'getSpiPacchettiSpa'
	 * 
	 * @return String
	 */
	public String getSpiPacchettiSpa()
	{
		return spiPacchettiSpa;
	}

	/**
	 * Method 'setSpiPacchettiSpa'
	 * 
	 * @param spiPacchettiSpa
	 */
	public void setSpiPacchettiSpa(String spiPacchettiSpa)
	{
		this.spiPacchettiSpa = spiPacchettiSpa;
	}

	/**
	 * Method 'getSpiPoltraMassag'
	 * 
	 * @return String
	 */
	public String getSpiPoltraMassag()
	{
		return spiPoltraMassag;
	}

	/**
	 * Method 'setSpiPoltraMassag'
	 * 
	 * @param spiPoltraMassag
	 */
	public void setSpiPoltraMassag(String spiPoltraMassag)
	{
		this.spiPoltraMassag = spiPoltraMassag;
	}

	/**
	 * Method 'getSpiFitness'
	 * 
	 * @return String
	 */
	public String getSpiFitness()
	{
		return spiFitness;
	}

	/**
	 * Method 'setSpiFitness'
	 * 
	 * @param spiFitness
	 */
	public void setSpiFitness(String spiFitness)
	{
		this.spiFitness = spiFitness;
	}

	/**
	 * Method 'getSpiLezioniYoga'
	 * 
	 * @return String
	 */
	public String getSpiLezioniYoga()
	{
		return spiLezioniYoga;
	}

	/**
	 * Method 'setSpiLezioniYoga'
	 * 
	 * @param spiLezioniYoga
	 */
	public void setSpiLezioniYoga(String spiLezioniYoga)
	{
		this.spiLezioniYoga = spiLezioniYoga;
	}

	/**
	 * Method 'getSpiLezioniFitness'
	 * 
	 * @return String
	 */
	public String getSpiLezioniFitness()
	{
		return spiLezioniFitness;
	}

	/**
	 * Method 'setSpiLezioniFitness'
	 * 
	 * @param spiLezioniFitness
	 */
	public void setSpiLezioniFitness(String spiLezioniFitness)
	{
		this.spiLezioniFitness = spiLezioniFitness;
	}

	/**
	 * Method 'getSpiPersonalTrainer'
	 * 
	 * @return String
	 */
	public String getSpiPersonalTrainer()
	{
		return spiPersonalTrainer;
	}

	/**
	 * Method 'setSpiPersonalTrainer'
	 * 
	 * @param spiPersonalTrainer
	 */
	public void setSpiPersonalTrainer(String spiPersonalTrainer)
	{
		this.spiPersonalTrainer = spiPersonalTrainer;
	}

	/**
	 * Method 'getSpiPiscinaBamb'
	 * 
	 * @return String
	 */
	public String getSpiPiscinaBamb()
	{
		return spiPiscinaBamb;
	}

	/**
	 * Method 'setSpiPiscinaBamb'
	 * 
	 * @param spiPiscinaBamb
	 */
	public void setSpiPiscinaBamb(String spiPiscinaBamb)
	{
		this.spiPiscinaBamb = spiPiscinaBamb;
	}

	/**
	 * Method 'getSpiArmadiettiSpa'
	 * 
	 * @return String
	 */
	public String getSpiArmadiettiSpa()
	{
		return spiArmadiettiSpa;
	}

	/**
	 * Method 'setSpiArmadiettiSpa'
	 * 
	 * @param spiArmadiettiSpa
	 */
	public void setSpiArmadiettiSpa(String spiArmadiettiSpa)
	{
		this.spiArmadiettiSpa = spiArmadiettiSpa;
	}

	/**
	 * Method 'getSpiPiscina'
	 * 
	 * @return String
	 */
	public String getSpiPiscina()
	{
		return spiPiscina;
	}

	/**
	 * Method 'setSpiPiscina'
	 * 
	 * @param spiPiscina
	 */
	public void setSpiPiscina(String spiPiscina)
	{
		this.spiPiscina = spiPiscina;
	}

	/**
	 * Method 'getSpiGiochiAcqua'
	 * 
	 * @return String
	 */
	public String getSpiGiochiAcqua()
	{
		return spiGiochiAcqua;
	}

	/**
	 * Method 'setSpiGiochiAcqua'
	 * 
	 * @param spiGiochiAcqua
	 */
	public void setSpiGiochiAcqua(String spiGiochiAcqua)
	{
		this.spiGiochiAcqua = spiGiochiAcqua;
	}

	/**
	 * Method 'getSpiPiscUltimoPiano'
	 * 
	 * @return String
	 */
	public String getSpiPiscUltimoPiano()
	{
		return spiPiscUltimoPiano;
	}

	/**
	 * Method 'setSpiPiscUltimoPiano'
	 * 
	 * @param spiPiscUltimoPiano
	 */
	public void setSpiPiscUltimoPiano(String spiPiscUltimoPiano)
	{
		this.spiPiscUltimoPiano = spiPiscUltimoPiano;
	}

	/**
	 * Method 'getSpiPiscSfioro'
	 * 
	 * @return String
	 */
	public String getSpiPiscSfioro()
	{
		return spiPiscSfioro;
	}

	/**
	 * Method 'setSpiPiscSfioro'
	 * 
	 * @param spiPiscSfioro
	 */
	public void setSpiPiscSfioro(String spiPiscSfioro)
	{
		this.spiPiscSfioro = spiPiscSfioro;
	}

	/**
	 * Method 'getSpiRiscaldata'
	 * 
	 * @return String
	 */
	public String getSpiRiscaldata()
	{
		return spiRiscaldata;
	}

	/**
	 * Method 'setSpiRiscaldata'
	 * 
	 * @param spiRiscaldata
	 */
	public void setSpiRiscaldata(String spiRiscaldata)
	{
		this.spiRiscaldata = spiRiscaldata;
	}

	/**
	 * Method 'getSpiPiscVista'
	 * 
	 * @return String
	 */
	public String getSpiPiscVista()
	{
		return spiPiscVista;
	}

	/**
	 * Method 'setSpiPiscVista'
	 * 
	 * @param spiPiscVista
	 */
	public void setSpiPiscVista(String spiPiscVista)
	{
		this.spiPiscVista = spiPiscVista;
	}

	/**
	 * Method 'getSpiPiscSalata'
	 * 
	 * @return String
	 */
	public String getSpiPiscSalata()
	{
		return spiPiscSalata;
	}

	/**
	 * Method 'setSpiPiscSalata'
	 * 
	 * @param spiPiscSalata
	 */
	public void setSpiPiscSalata(String spiPiscSalata)
	{
		this.spiPiscSalata = spiPiscSalata;
	}

	/**
	 * Method 'getSpiVascaImmFredda'
	 * 
	 * @return String
	 */
	public String getSpiVascaImmFredda()
	{
		return spiVascaImmFredda;
	}

	/**
	 * Method 'setSpiVascaImmFredda'
	 * 
	 * @param spiVascaImmFredda
	 */
	public void setSpiVascaImmFredda(String spiVascaImmFredda)
	{
		this.spiVascaImmFredda = spiVascaImmFredda;
	}

	/**
	 * Method 'getSpiBarBordo'
	 * 
	 * @return String
	 */
	public String getSpiBarBordo()
	{
		return spiBarBordo;
	}

	/**
	 * Method 'setSpiBarBordo'
	 * 
	 * @param spiBarBordo
	 */
	public void setSpiBarBordo(String spiBarBordo)
	{
		this.spiBarBordo = spiBarBordo;
	}

	/**
	 * Method 'getSpiRecinto'
	 * 
	 * @return String
	 */
	public String getSpiRecinto()
	{
		return spiRecinto;
	}

	/**
	 * Method 'setSpiRecinto'
	 * 
	 * @param spiRecinto
	 */
	public void setSpiRecinto(String spiRecinto)
	{
		this.spiRecinto = spiRecinto;
	}

	/**
	 * Method 'getSpiPiscCoperta'
	 * 
	 * @return String
	 */
	public String getSpiPiscCoperta()
	{
		return spiPiscCoperta;
	}

	/**
	 * Method 'setSpiPiscCoperta'
	 * 
	 * @param spiPiscCoperta
	 */
	public void setSpiPiscCoperta(String spiPiscCoperta)
	{
		this.spiPiscCoperta = spiPiscCoperta;
	}

	/**
	 * Method 'getSpiPiscCopertaStag'
	 * 
	 * @return String
	 */
	public String getSpiPiscCopertaStag()
	{
		return spiPiscCopertaStag;
	}

	/**
	 * Method 'setSpiPiscCopertaStag'
	 * 
	 * @param spiPiscCopertaStag
	 */
	public void setSpiPiscCopertaStag(String spiPiscCopertaStag)
	{
		this.spiPiscCopertaStag = spiPiscCopertaStag;
	}

	/**
	 * Method 'getSpiPiscCopertaAnno'
	 * 
	 * @return String
	 */
	public String getSpiPiscCopertaAnno()
	{
		return spiPiscCopertaAnno;
	}

	/**
	 * Method 'setSpiPiscCopertaAnno'
	 * 
	 * @param spiPiscCopertaAnno
	 */
	public void setSpiPiscCopertaAnno(String spiPiscCopertaAnno)
	{
		this.spiPiscCopertaAnno = spiPiscCopertaAnno;
	}

	/**
	 * Method 'getSpiPiscAperto'
	 * 
	 * @return String
	 */
	public String getSpiPiscAperto()
	{
		return spiPiscAperto;
	}

	/**
	 * Method 'setSpiPiscAperto'
	 * 
	 * @param spiPiscAperto
	 */
	public void setSpiPiscAperto(String spiPiscAperto)
	{
		this.spiPiscAperto = spiPiscAperto;
	}

	/**
	 * Method 'getSpiPiscApertoStag'
	 * 
	 * @return String
	 */
	public String getSpiPiscApertoStag()
	{
		return spiPiscApertoStag;
	}

	/**
	 * Method 'setSpiPiscApertoStag'
	 * 
	 * @param spiPiscApertoStag
	 */
	public void setSpiPiscApertoStag(String spiPiscApertoStag)
	{
		this.spiPiscApertoStag = spiPiscApertoStag;
	}

	/**
	 * Method 'getSpiPiscApertoAnno'
	 * 
	 * @return String
	 */
	public String getSpiPiscApertoAnno()
	{
		return spiPiscApertoAnno;
	}

	/**
	 * Method 'setSpiPiscApertoAnno'
	 * 
	 * @param spiPiscApertoAnno
	 */
	public void setSpiPiscApertoAnno(String spiPiscApertoAnno)
	{
		this.spiPiscApertoAnno = spiPiscApertoAnno;
	}

	/**
	 * Method 'getSpiCosto'
	 * 
	 * @return float
	 */
	public float getSpiCosto()
	{
		return spiCosto;
	}

	/**
	 * Method 'setSpiCosto'
	 * 
	 * @param spiCosto
	 */
	public void setSpiCosto(float spiCosto)
	{
		this.spiCosto = spiCosto;
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
		
		if (!(_other instanceof StrutturaPiscine)) {
			return false;
		}
		
		final StrutturaPiscine _cast = (StrutturaPiscine) _other;
		if (spiId != _cast.spiId) {
			return false;
		}
		
		if (spiScivolo == null ? _cast.spiScivolo != spiScivolo : !spiScivolo.equals( _cast.spiScivolo )) {
			return false;
		}
		
		if (spiSpa == null ? _cast.spiSpa != spiSpa : !spiSpa.equals( _cast.spiSpa )) {
			return false;
		}
		
		if (spiTeli == null ? _cast.spiTeli != spiTeli : !spiTeli.equals( _cast.spiTeli )) {
			return false;
		}
		
		if (spiBagnoTurco == null ? _cast.spiBagnoTurco != spiBagnoTurco : !spiBagnoTurco.equals( _cast.spiBagnoTurco )) {
			return false;
		}
		
		if (spiLettini == null ? _cast.spiLettini != spiLettini : !spiLettini.equals( _cast.spiLettini )) {
			return false;
		}
		
		if (spiAreaRelax == null ? _cast.spiAreaRelax != spiAreaRelax : !spiAreaRelax.equals( _cast.spiAreaRelax )) {
			return false;
		}
		
		if (spiOmbrelloni == null ? _cast.spiOmbrelloni != spiOmbrelloni : !spiOmbrelloni.equals( _cast.spiOmbrelloni )) {
			return false;
		}
		
		if (spiPediluvio == null ? _cast.spiPediluvio != spiPediluvio : !spiPediluvio.equals( _cast.spiPediluvio )) {
			return false;
		}
		
		if (spiServiziBellezza == null ? _cast.spiServiziBellezza != spiServiziBellezza : !spiServiziBellezza.equals( _cast.spiServiziBellezza )) {
			return false;
		}
		
		if (spiPacchettiSpa == null ? _cast.spiPacchettiSpa != spiPacchettiSpa : !spiPacchettiSpa.equals( _cast.spiPacchettiSpa )) {
			return false;
		}
		
		if (spiPoltraMassag == null ? _cast.spiPoltraMassag != spiPoltraMassag : !spiPoltraMassag.equals( _cast.spiPoltraMassag )) {
			return false;
		}
		
		if (spiFitness == null ? _cast.spiFitness != spiFitness : !spiFitness.equals( _cast.spiFitness )) {
			return false;
		}
		
		if (spiLezioniYoga == null ? _cast.spiLezioniYoga != spiLezioniYoga : !spiLezioniYoga.equals( _cast.spiLezioniYoga )) {
			return false;
		}
		
		if (spiLezioniFitness == null ? _cast.spiLezioniFitness != spiLezioniFitness : !spiLezioniFitness.equals( _cast.spiLezioniFitness )) {
			return false;
		}
		
		if (spiPersonalTrainer == null ? _cast.spiPersonalTrainer != spiPersonalTrainer : !spiPersonalTrainer.equals( _cast.spiPersonalTrainer )) {
			return false;
		}
		
		if (spiPiscinaBamb == null ? _cast.spiPiscinaBamb != spiPiscinaBamb : !spiPiscinaBamb.equals( _cast.spiPiscinaBamb )) {
			return false;
		}
		
		if (spiArmadiettiSpa == null ? _cast.spiArmadiettiSpa != spiArmadiettiSpa : !spiArmadiettiSpa.equals( _cast.spiArmadiettiSpa )) {
			return false;
		}
		
		if (spiPiscina == null ? _cast.spiPiscina != spiPiscina : !spiPiscina.equals( _cast.spiPiscina )) {
			return false;
		}
		
		if (spiGiochiAcqua == null ? _cast.spiGiochiAcqua != spiGiochiAcqua : !spiGiochiAcqua.equals( _cast.spiGiochiAcqua )) {
			return false;
		}
		
		if (spiPiscUltimoPiano == null ? _cast.spiPiscUltimoPiano != spiPiscUltimoPiano : !spiPiscUltimoPiano.equals( _cast.spiPiscUltimoPiano )) {
			return false;
		}
		
		if (spiPiscSfioro == null ? _cast.spiPiscSfioro != spiPiscSfioro : !spiPiscSfioro.equals( _cast.spiPiscSfioro )) {
			return false;
		}
		
		if (spiRiscaldata == null ? _cast.spiRiscaldata != spiRiscaldata : !spiRiscaldata.equals( _cast.spiRiscaldata )) {
			return false;
		}
		
		if (spiPiscVista == null ? _cast.spiPiscVista != spiPiscVista : !spiPiscVista.equals( _cast.spiPiscVista )) {
			return false;
		}
		
		if (spiPiscSalata == null ? _cast.spiPiscSalata != spiPiscSalata : !spiPiscSalata.equals( _cast.spiPiscSalata )) {
			return false;
		}
		
		if (spiVascaImmFredda == null ? _cast.spiVascaImmFredda != spiVascaImmFredda : !spiVascaImmFredda.equals( _cast.spiVascaImmFredda )) {
			return false;
		}
		
		if (spiBarBordo == null ? _cast.spiBarBordo != spiBarBordo : !spiBarBordo.equals( _cast.spiBarBordo )) {
			return false;
		}
		
		if (spiRecinto == null ? _cast.spiRecinto != spiRecinto : !spiRecinto.equals( _cast.spiRecinto )) {
			return false;
		}
		
		if (spiPiscCoperta == null ? _cast.spiPiscCoperta != spiPiscCoperta : !spiPiscCoperta.equals( _cast.spiPiscCoperta )) {
			return false;
		}
		
		if (spiPiscCopertaStag == null ? _cast.spiPiscCopertaStag != spiPiscCopertaStag : !spiPiscCopertaStag.equals( _cast.spiPiscCopertaStag )) {
			return false;
		}
		
		if (spiPiscCopertaAnno == null ? _cast.spiPiscCopertaAnno != spiPiscCopertaAnno : !spiPiscCopertaAnno.equals( _cast.spiPiscCopertaAnno )) {
			return false;
		}
		
		if (spiPiscAperto == null ? _cast.spiPiscAperto != spiPiscAperto : !spiPiscAperto.equals( _cast.spiPiscAperto )) {
			return false;
		}
		
		if (spiPiscApertoStag == null ? _cast.spiPiscApertoStag != spiPiscApertoStag : !spiPiscApertoStag.equals( _cast.spiPiscApertoStag )) {
			return false;
		}
		
		if (spiPiscApertoAnno == null ? _cast.spiPiscApertoAnno != spiPiscApertoAnno : !spiPiscApertoAnno.equals( _cast.spiPiscApertoAnno )) {
			return false;
		}
		
		if (spiCosto != _cast.spiCosto) {
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
		_hashCode = 29 * _hashCode + (int) (spiId ^ (spiId >>> 32));
		if (spiScivolo != null) {
			_hashCode = 29 * _hashCode + spiScivolo.hashCode();
		}
		
		if (spiSpa != null) {
			_hashCode = 29 * _hashCode + spiSpa.hashCode();
		}
		
		if (spiTeli != null) {
			_hashCode = 29 * _hashCode + spiTeli.hashCode();
		}
		
		if (spiBagnoTurco != null) {
			_hashCode = 29 * _hashCode + spiBagnoTurco.hashCode();
		}
		
		if (spiLettini != null) {
			_hashCode = 29 * _hashCode + spiLettini.hashCode();
		}
		
		if (spiAreaRelax != null) {
			_hashCode = 29 * _hashCode + spiAreaRelax.hashCode();
		}
		
		if (spiOmbrelloni != null) {
			_hashCode = 29 * _hashCode + spiOmbrelloni.hashCode();
		}
		
		if (spiPediluvio != null) {
			_hashCode = 29 * _hashCode + spiPediluvio.hashCode();
		}
		
		if (spiServiziBellezza != null) {
			_hashCode = 29 * _hashCode + spiServiziBellezza.hashCode();
		}
		
		if (spiPacchettiSpa != null) {
			_hashCode = 29 * _hashCode + spiPacchettiSpa.hashCode();
		}
		
		if (spiPoltraMassag != null) {
			_hashCode = 29 * _hashCode + spiPoltraMassag.hashCode();
		}
		
		if (spiFitness != null) {
			_hashCode = 29 * _hashCode + spiFitness.hashCode();
		}
		
		if (spiLezioniYoga != null) {
			_hashCode = 29 * _hashCode + spiLezioniYoga.hashCode();
		}
		
		if (spiLezioniFitness != null) {
			_hashCode = 29 * _hashCode + spiLezioniFitness.hashCode();
		}
		
		if (spiPersonalTrainer != null) {
			_hashCode = 29 * _hashCode + spiPersonalTrainer.hashCode();
		}
		
		if (spiPiscinaBamb != null) {
			_hashCode = 29 * _hashCode + spiPiscinaBamb.hashCode();
		}
		
		if (spiArmadiettiSpa != null) {
			_hashCode = 29 * _hashCode + spiArmadiettiSpa.hashCode();
		}
		
		if (spiPiscina != null) {
			_hashCode = 29 * _hashCode + spiPiscina.hashCode();
		}
		
		if (spiGiochiAcqua != null) {
			_hashCode = 29 * _hashCode + spiGiochiAcqua.hashCode();
		}
		
		if (spiPiscUltimoPiano != null) {
			_hashCode = 29 * _hashCode + spiPiscUltimoPiano.hashCode();
		}
		
		if (spiPiscSfioro != null) {
			_hashCode = 29 * _hashCode + spiPiscSfioro.hashCode();
		}
		
		if (spiRiscaldata != null) {
			_hashCode = 29 * _hashCode + spiRiscaldata.hashCode();
		}
		
		if (spiPiscVista != null) {
			_hashCode = 29 * _hashCode + spiPiscVista.hashCode();
		}
		
		if (spiPiscSalata != null) {
			_hashCode = 29 * _hashCode + spiPiscSalata.hashCode();
		}
		
		if (spiVascaImmFredda != null) {
			_hashCode = 29 * _hashCode + spiVascaImmFredda.hashCode();
		}
		
		if (spiBarBordo != null) {
			_hashCode = 29 * _hashCode + spiBarBordo.hashCode();
		}
		
		if (spiRecinto != null) {
			_hashCode = 29 * _hashCode + spiRecinto.hashCode();
		}
		
		if (spiPiscCoperta != null) {
			_hashCode = 29 * _hashCode + spiPiscCoperta.hashCode();
		}
		
		if (spiPiscCopertaStag != null) {
			_hashCode = 29 * _hashCode + spiPiscCopertaStag.hashCode();
		}
		
		if (spiPiscCopertaAnno != null) {
			_hashCode = 29 * _hashCode + spiPiscCopertaAnno.hashCode();
		}
		
		if (spiPiscAperto != null) {
			_hashCode = 29 * _hashCode + spiPiscAperto.hashCode();
		}
		
		if (spiPiscApertoStag != null) {
			_hashCode = 29 * _hashCode + spiPiscApertoStag.hashCode();
		}
		
		if (spiPiscApertoAnno != null) {
			_hashCode = 29 * _hashCode + spiPiscApertoAnno.hashCode();
		}
		
		_hashCode = 29 * _hashCode + Float.floatToIntBits(spiCosto);
		_hashCode = 29 * _hashCode + (int) (strutturaStrId ^ (strutturaStrId >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return StrutturaPiscinePk
	 */
	public StrutturaPiscinePk createPk()
	{
		return new StrutturaPiscinePk(spiId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mysecretwish.dto.StrutturaPiscine: " );
		ret.append( "spiId=" + spiId );
		ret.append( ", spiScivolo=" + spiScivolo );
		ret.append( ", spiSpa=" + spiSpa );
		ret.append( ", spiTeli=" + spiTeli );
		ret.append( ", spiBagnoTurco=" + spiBagnoTurco );
		ret.append( ", spiLettini=" + spiLettini );
		ret.append( ", spiAreaRelax=" + spiAreaRelax );
		ret.append( ", spiOmbrelloni=" + spiOmbrelloni );
		ret.append( ", spiPediluvio=" + spiPediluvio );
		ret.append( ", spiServiziBellezza=" + spiServiziBellezza );
		ret.append( ", spiPacchettiSpa=" + spiPacchettiSpa );
		ret.append( ", spiPoltraMassag=" + spiPoltraMassag );
		ret.append( ", spiFitness=" + spiFitness );
		ret.append( ", spiLezioniYoga=" + spiLezioniYoga );
		ret.append( ", spiLezioniFitness=" + spiLezioniFitness );
		ret.append( ", spiPersonalTrainer=" + spiPersonalTrainer );
		ret.append( ", spiPiscinaBamb=" + spiPiscinaBamb );
		ret.append( ", spiArmadiettiSpa=" + spiArmadiettiSpa );
		ret.append( ", spiPiscina=" + spiPiscina );
		ret.append( ", spiGiochiAcqua=" + spiGiochiAcqua );
		ret.append( ", spiPiscUltimoPiano=" + spiPiscUltimoPiano );
		ret.append( ", spiPiscSfioro=" + spiPiscSfioro );
		ret.append( ", spiRiscaldata=" + spiRiscaldata );
		ret.append( ", spiPiscVista=" + spiPiscVista );
		ret.append( ", spiPiscSalata=" + spiPiscSalata );
		ret.append( ", spiVascaImmFredda=" + spiVascaImmFredda );
		ret.append( ", spiBarBordo=" + spiBarBordo );
		ret.append( ", spiRecinto=" + spiRecinto );
		ret.append( ", spiPiscCoperta=" + spiPiscCoperta );
		ret.append( ", spiPiscCopertaStag=" + spiPiscCopertaStag );
		ret.append( ", spiPiscCopertaAnno=" + spiPiscCopertaAnno );
		ret.append( ", spiPiscAperto=" + spiPiscAperto );
		ret.append( ", spiPiscApertoStag=" + spiPiscApertoStag );
		ret.append( ", spiPiscApertoAnno=" + spiPiscApertoAnno );
		ret.append( ", spiCosto=" + spiCosto );
		ret.append( ", strutturaStrId=" + strutturaStrId );
		return ret.toString();
	}

}
