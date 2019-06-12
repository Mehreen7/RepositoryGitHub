package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Adresse {

    private Long adrId;
    private String adrNum;
    private String adrNom;
    private String adrVille;
    private String adrCodeP;
    private String adrPays;
    
    @OneToMany(mappedBy="adresse")
    private Collection <Societe> societes;

    @OneToMany(mappedBy="adresse")
    private Collection <Evenement> evenements;
    
    @OneToMany(mappedBy = "adresse")
    private Collection<Effectif> effectifs;
    
	public Adresse() {
        effectifs = new ArrayList<>();
        societes = new ArrayList<>();
        evenements = new ArrayList<>();
	}


	public Adresse(String adrNum, String adrNom, String adrVille, String adrCodeP, String adrPays) {
		
		this.adrNum = adrNum;
		this.adrNom = adrNom;
		this.adrVille = adrVille;
		this.adrCodeP = adrCodeP;
		this.adrPays = adrPays;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getAdrId() {
		return adrId;
	}


	public void setAdrId(Long adrId) {
		this.adrId = adrId;
	}


	public String getAdrNum() {
		return adrNum;
	}


	public void setAdrNum(String adrNum) {
		this.adrNum = adrNum;
	}


	public String getAdrNom() {
		return adrNom;
	}


	public void setAdrNom(String adrNom) {
		this.adrNom = adrNom;
	}


	public String getAdrVille() {
		return adrVille;
	}


	public void setAdrVille(String adrVille) {
		this.adrVille = adrVille;
	}


	public String getAdrCodeP() {
		return adrCodeP;
	}


	public void setAdrCodeP(String adrCodeP) {
		this.adrCodeP = adrCodeP;
	}


	public String getAdrPays() {
		return adrPays;
	}


	public void setAdrPays(String adrPays) {
		this.adrPays = adrPays;
	}


	@Override
	public String toString() {
		return "Adresse [adrId=" + adrId + ", adrNum=" + adrNum + ", adrNom=" + adrNom + ", adrVille=" + adrVille
				+ ", adrCodeP=" + adrCodeP + ", adrPays=" + adrPays + "]";
	}
    
	
    
	
}
