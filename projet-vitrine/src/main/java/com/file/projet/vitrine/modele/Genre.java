package com.file.projet.vitrine.modele;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="GENRE")
public class Genre {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long gnrId;
    private String gnrNom;
    private String gnrDesc;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Collection<Produit> produits;
    
	public Genre() {
		produits = new ArrayList<>();
	}

	public Genre(String gnrNom, String gnrDesc, Collection<Produit> produits) {
		this.gnrNom = gnrNom;
		this.gnrDesc = gnrDesc;
		this.produits = produits;
	}

	public Long getGnrId() {
		return gnrId;
	}

	public void setGnrId(Long gnrId) {
		this.gnrId = gnrId;
	}

	public String getGnrNom() {
		return gnrNom;
	}

	public void setGnrNom(String gnrNom) {
		this.gnrNom = gnrNom;
	}

	public String getGnrDesc() {
		return gnrDesc;
	}

	public void setGnrDesc(String gnrDesc) {
		this.gnrDesc = gnrDesc;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Genre [gnrId=" + gnrId + ", gnrNom=" + gnrNom + ", gnrDesc=" + gnrDesc + ", produits=" + produits + "]";
	}
    
}
