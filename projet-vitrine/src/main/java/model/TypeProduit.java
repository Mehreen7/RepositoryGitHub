package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeProduit {

	private Long typProId;
    private String typProNom;
    private String TypProDesc;
    @OneToMany(mappedBy="typeProduit")
    private Collection <Produit> produits;

    public TypeProduit() {
        produits = new ArrayList<>();
    }

    public TypeProduit(String typProNom, String TypProDesc) {
        this.typProNom = typProNom;
        this.TypProDesc = TypProDesc;
    }

    public TypeProduit(String typProNom, String TypProDesc, Collection<Produit> produits) {
        this.typProNom = typProNom;
        this.TypProDesc = TypProDesc;
        this.produits = produits;
    
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
		return TypProDesc;
	}

	public void setTypProDesc(String typProDesc) {
		TypProDesc = typProDesc;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "TypeProduit [typProId=" + typProId + ", typProNom=" + typProNom + ", TypProDesc=" + TypProDesc
				+ ", produits=" + produits + "]";
	}
	
	
	
}
