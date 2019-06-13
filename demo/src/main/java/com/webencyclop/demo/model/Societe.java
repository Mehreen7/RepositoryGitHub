package com.webencyclop.demo.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Societe {
	
	private Long socId;
    private String socSiret;
    private String socNom;
    private String socEmail;  
    private String socLogo;    
    private String socTel;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Adresse adresse;
    @OneToMany(mappedBy = "societe")
    private Collection<Effectif> effectifs;

    public Societe() {
        effectifs = new ArrayList<>();
    }

    public Societe(String socSiret, String socNom, String socEmail, String socLogo, String socTel) {
        this.socSiret = socSiret;
        this.socNom = socNom;
        this.socEmail = socEmail;
        this.socLogo = socLogo;
        this.socTel = socTel;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getSocId() {
		return socId;
	}

	public void setSocId(Long socId) {
		this.socId = socId;
	}

	public String getSocSiret() {
		return socSiret;
	}

	public void setSocSiret(String socSiret) {
		this.socSiret = socSiret;
	}

	public String getSocNom() {
		return socNom;
	}

	public void setSocNom(String socNom) {
		this.socNom = socNom;
	}

	public String getSocEmail() {
		return socEmail;
	}

	public void setSocEmail(String socEmail) {
		this.socEmail = socEmail;
	}

	public String getSocLogo() {
		return socLogo;
	}

	public void setSocLogo(String socLogo) {
		this.socLogo = socLogo;
	}

	public String getSocTel() {
		return socTel;
	}

	public void setSocTel(String socTel) {
		this.socTel = socTel;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Collection<Effectif> getEffectifs() {
		return effectifs;
	}

	public void setEffectifs(Collection<Effectif> effectifs) {
		this.effectifs = effectifs;
	}

	@Override
	public String toString() {
		return "Societe [socId=" + socId + ", socSiret=" + socSiret + ", socNom=" + socNom + ", socEmail=" + socEmail
				+ ", socLogo=" + socLogo + ", socTel=" + socTel + ", adresse=" + adresse + ", effectifs=" + effectifs
				+ "]";
	}
    
    

}
