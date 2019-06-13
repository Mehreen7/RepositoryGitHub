package com.webencyclop.demo.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Avis {

	private Long avisId;
	private String avisCommentaire;
	private Date avisDate;
	private String avisEtat;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private Client client;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private Produit produit;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private Effectif effectif;

	
	public Avis() {

	}

	public Avis(String avisCommentaire, Date avisDate, String avisEtat, Client client, Produit produit,
			Effectif effectif) {
		
		this.avisCommentaire = avisCommentaire;
		this.avisDate = avisDate;
		this.avisEtat = avisEtat;
		this.client = client;
		this.produit = produit;
		this.effectif = effectif;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getAvisId() {
		return avisId;
	}

	public void setAvisId(Long avisId) {
		this.avisId = avisId;
	}

	public String getAvisCommentaire() {
		return avisCommentaire;
	}

	public void setAvisCommentaire(String avisCommentaire) {
		this.avisCommentaire = avisCommentaire;
	}

	public Date getAvisDate() {
		return avisDate;
	}

	public void setAvisDate(Date avisDate) {
		this.avisDate = avisDate;
	}

	public String getAvisEtat() {
		return avisEtat;
	}

	public void setAvisEtat(String avisEtat) {
		this.avisEtat = avisEtat;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Effectif getEffectif() {
		return effectif;
	}

	public void setEffectif(Effectif effectif) {
		this.effectif = effectif;
	}




	@Override
	public String toString() {
		return "Avis [avisId=" + avisId + ", avisCommentaire=" + avisCommentaire + ", avisDate=" + avisDate
				+ ", avisEtat=" + avisEtat + ", client=" + client + ", produit=" + produit + ", effectif=" + effectif
				+ "]";
	}
	
	
	
}
