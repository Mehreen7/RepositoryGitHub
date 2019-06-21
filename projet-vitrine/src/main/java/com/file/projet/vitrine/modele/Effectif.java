package com.file.projet.vitrine.modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="EFFECTIF")
public class Effectif implements Serializable , UserDetails{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long effId;
    private String effNom;
    private String effPrenom;
    private String effEmail;
    private String effMdp;
    private String effTel;
    private String effEtat;
    private String effFonct;
    @OneToMany(mappedBy = "effectif")
    private Collection<Avis> avis;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Societe societe;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Adresse adresse;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private DroitAcces droitAcces;
    
	public Effectif() {
		avis = new ArrayList<>();
	}

	public Effectif(String effNom, String effPrenom, String effEmail, String effMdp, String effTel, String effEtat,
			String effFonct, Collection<Avis> avis, Societe societe, Adresse adresse, DroitAcces droitAcces) {
		this.effNom = effNom;
		this.effPrenom = effPrenom;
		this.effEmail = effEmail;
		this.effMdp = effMdp;
		this.effTel = effTel;
		this.effEtat = effEtat;
		this.effFonct = effFonct;
		this.avis = avis;
		this.societe = societe;
		this.adresse = adresse;
		this.droitAcces = droitAcces;
	}
	
	public Long getEffId() {
		return effId;
	}

	public void setEffId(Long effId) {
		this.effId = effId;
	}

	public String getEffNom() {
		return effNom;
	}

	public void setEffNom(String effNom) {
		this.effNom = effNom;
	}

	public String getEffPrenom() {
		return effPrenom;
	}

	public void setEffPrenom(String effPrenom) {
		this.effPrenom = effPrenom;
	}

	public String getEffEmail() {
		return effEmail;
	}

	public void setEffEmail(String effEmail) {
		this.effEmail = effEmail;
	}

	public String getEffMdp() {
		return effMdp;
	}

	public void setEffMdp(String effMdp) {
		this.effMdp = effMdp;
	}

	public String getEffTel() {
		return effTel;
	}

	public void setEffTel(String effTel) {
		this.effTel = effTel;
	}

	public String getEffEtat() {
		return effEtat;
	}

	public void setEffEtat(String effEtat) {
		this.effEtat = effEtat;
	}

	public String getEffFonct() {
		return effFonct;
	}

	public void setEffFonct(String effFonct) {
		this.effFonct = effFonct;
	}

	public Collection<Avis> getAvis() {
		return avis;
	}

	public void setAvis(Collection<Avis> avis) {
		this.avis = avis;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public DroitAcces getDroitAcces() {
		return droitAcces;
	}

	public void setDroitAcces(DroitAcces droitAcces) {
		this.droitAcces = droitAcces;
	}

	@Override
	public String toString() {
		return "Effectif [effId=" + effId + ", effNom=" + effNom + ", effPrenom=" + effPrenom + ", effEmail=" + effEmail
				+ ", effMdp=" + effMdp + ", effTel=" + effTel + ", effEtat=" + effEtat + ", effFonct=" + effFonct
				+ ", avis=" + avis + ", societe=" + societe + ", adresse=" + adresse + ", droitAcces=" + droitAcces
				+ "]";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
    
    

}
