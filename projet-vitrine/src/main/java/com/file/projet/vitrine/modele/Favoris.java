package com.file.projet.vitrine.modele;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="FAVORIS")
public class Favoris {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long favId;
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Collection<Produit> produits;
	@OneToOne
	private Client client;
	 	 
	public Favoris() {
		produits = new ArrayList<>();
	}

	
	public Favoris(Long favId, Collection<Produit> produits, Client client) {
		this.favId = favId;
		this.produits = produits;
		this.client = client;
	}

	public Long getFavId() {
		return favId;
	}

	public void setFavId(Long favId) {
		this.favId = favId;
	}


	public Collection<Produit> getProduits() {
		return produits;
	}


	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Favoris [favId=" + favId + ", produits=" + produits + ", client=" + client + "]";
	}

	
	
}
