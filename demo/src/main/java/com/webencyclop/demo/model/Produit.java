package com.webencyclop.demo.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Produit {

	private Long proId;
    private String proNom;
    private String proPhoto;
    private String proDesc;
    private float proPrix;
    private String proEtat;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Categorie categorie;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private TypeProduit typeProduit;
    @ManyToMany(mappedBy = "produits")
    private Collection<Genre> genres;
    @OneToMany(mappedBy = "produit")
    private Collection<Avis> avis;
    @ManyToMany(mappedBy = "produits")
    private Collection<Favoris> favoris;
	
    public Produit() {
    	genres = new ArrayList<>();
        avis = new ArrayList<>();
        favoris = new ArrayList<>();
	}

	public Produit(String proNom, String proPhoto, String proDesc, float proPrix, String proEtat, Categorie categorie,
			TypeProduit typeProduit, Collection<Genre> genres, Collection<Avis> avis, Collection<Favoris> favoris) {
	
		this.proNom = proNom;
		this.proPhoto = proPhoto;
		this.proDesc = proDesc;
		this.proPrix = proPrix;
		this.proEtat = proEtat;
		this.categorie = categorie;
		this.typeProduit = typeProduit;
		this.genres = genres;
		this.avis = avis;
		this.favoris = favoris;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getProId() {
		return proId;
	}

	public void setProId(Long proId) {
		this.proId = proId;
	}

	public String getProNom() {
		return proNom;
	}

	public void setProNom(String proNom) {
		this.proNom = proNom;
	}

	public String getProPhoto() {
		return proPhoto;
	}

	public void setProPhoto(String proPhoto) {
		this.proPhoto = proPhoto;
	}

	public String getProDesc() {
		return proDesc;
	}

	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}

	public float getProPrix() {
		return proPrix;
	}

	public void setProPrix(float proPrix) {
		this.proPrix = proPrix;
	}

	public String getProEtat() {
		return proEtat;
	}

	public void setProEtat(String proEtat) {
		this.proEtat = proEtat;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public TypeProduit getTypeProduit() {
		return typeProduit;
	}

	public void setTypeProduit(TypeProduit typeProduit) {
		this.typeProduit = typeProduit;
	}

	public Collection<Genre> getGenres() {
		return genres;
	}

	public void setGenres(Collection<Genre> genres) {
		this.genres = genres;
	}

	public Collection<Avis> getAvis() {
		return avis;
	}

	public void setAvis(Collection<Avis> avis) {
		this.avis = avis;
	}

	public Collection<Favoris> getFavoris() {
		return favoris;
	}

	public void setFavoris(Collection<Favoris> favoris) {
		this.favoris = favoris;
	}

	@Override
	public String toString() {
		return "Produit [proId=" + proId + ", proNom=" + proNom + ", proPhoto=" + proPhoto + ", proDesc=" + proDesc
				+ ", proPrix=" + proPrix + ", proEtat=" + proEtat + ", categorie=" + categorie + ", typeProduit="
				+ typeProduit + ", genres=" + genres + ", avis=" + avis + ", favoris=" + favoris + "]";
	}
    
    

}