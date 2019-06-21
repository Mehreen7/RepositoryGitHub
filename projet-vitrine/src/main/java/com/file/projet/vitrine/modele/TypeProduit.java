package com.file.projet.vitrine.modele;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TYPEPRODUIT")
public class TypeProduit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long typProId;
    private String typProNom;
    private String typProDesc;
    @OneToMany(mappedBy="typeProduit")
    private Collection <Produit> produits;

    public TypeProduit() {
        produits = new ArrayList<>();
    }

	public TypeProduit(String typProNom, String typProDesc, Collection<Produit> produits) {
		super();
		this.typProNom = typProNom;
		this.typProDesc = typProDesc;
		this.produits = produits;
	}

	public Long getTypProId() {
		return typProId;
	}

	public void setTypProId(Long typProId) {
		this.typProId = typProId;
	}

	public String getTypProNom() {
		return typProNom;
	}

	public void setTypProNom(String typProNom) {
		this.typProNom = typProNom;
	}

	public String getTypProDesc() {
		return typProDesc;
	}

	public void setTypProDesc(String typProDesc) {
		this.typProDesc = typProDesc;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "TypeProduit [typProId=" + typProId + ", typProNom=" + typProNom + ", typProDesc=" + typProDesc
				+ ", produits=" + produits + "]";
	} 
	
}
