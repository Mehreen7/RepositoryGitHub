package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {
	
    private Long catId;
    private String catNom;
    private String catDesc;
    @OneToMany(mappedBy="categorie")
    private Collection<Produit> produits;
    
    
	public Categorie() {
		produits = new ArrayList<>();
	}


	public Categorie(String catNom, String catDesc, Collection<Produit> produits) {
	
		this.catNom = catNom;
		this.catDesc = catDesc;
		this.produits = produits;
	}

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCatId() {
		return catId;
	}


	public void setCatId(Long catId) {
		this.catId = catId;
	}


	public String getCatNom() {
		return catNom;
	}


	public void setCatNom(String catNom) {
		this.catNom = catNom;
	}


	public String getCatDesc() {
		return catDesc;
	}


	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}


	public Collection<Produit> getProduits() {
		return produits;
	}


	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}


	@Override
	public String toString() {
		return "Categorie [catId=" + catId + ", catNom=" + catNom + ", catDesc=" + catDesc + ", produits=" + produits
				+ "]";
	}

	
	
    
}
