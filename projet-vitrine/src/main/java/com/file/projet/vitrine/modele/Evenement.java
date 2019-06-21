package com.file.projet.vitrine.modele;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EVENEMENT")
public class Evenement {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long evtId;
    private String evtNom;
    @Temporal(TemporalType.TIMESTAMP)
    private Date evtDateDebut;
    @Temporal(TemporalType.TIMESTAMP)
    private Date evtDateFin;
    private String evtDesc;
    private String evtEtat;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private TypeEvenement typeevenement;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Adresse adresse;

    public Evenement() {

	}

	public Evenement(String evtNom, Date evtDateDebut, Date evtDateFin, String evtDesc, String evtEtat,
			TypeEvenement typeevenement, Adresse adresse) {
		this.evtNom = evtNom;
		this.evtDateDebut = evtDateDebut;
		this.evtDateFin = evtDateFin;
		this.evtDesc = evtDesc;
		this.evtEtat = evtEtat;
		this.typeevenement = typeevenement;
		this.adresse = adresse;
	}

	public Long getEvtId() {
		return evtId;
	}

	public void setEvtId(Long evtId) {
		this.evtId = evtId;
	}

	public String getEvtNom() {
		return evtNom;
	}

	public void setEvtNom(String evtNom) {
		this.evtNom = evtNom;
	}

	public Date getEvtDateDebut() {
		return evtDateDebut;
	}

	public void setEvtDateDebut(Date evtDateDebut) {
		this.evtDateDebut = evtDateDebut;
	}

	public Date getEvtDateFin() {
		return evtDateFin;
	}

	public void setEvtDateFin(Date evtDateFin) {
		this.evtDateFin = evtDateFin;
	}

	public String getEvtDesc() {
		return evtDesc;
	}

	public void setEvtDesc(String evtDesc) {
		this.evtDesc = evtDesc;
	}

	public String getEvtEtat() {
		return evtEtat;
	}

	public void setEvtEtat(String evtEtat) {
		this.evtEtat = evtEtat;
	}

	public TypeEvenement getTypeevenement() {
		return typeevenement;
	}

	public void setTypeevenement(TypeEvenement typeevenement) {
		this.typeevenement = typeevenement;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Evenement [evtId=" + evtId + ", evtNom=" + evtNom + ", evtDateDebut=" + evtDateDebut + ", evtDateFin="
				+ evtDateFin + ", evtDesc=" + evtDesc + ", evtEtat=" + evtEtat + ", typeevenement=" + typeevenement
				+ ", adresse=" + adresse + "]";
	}
    
    

}
