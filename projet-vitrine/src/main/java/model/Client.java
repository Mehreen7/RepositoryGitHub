package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Client {

	private Long cltId;
    private String cltNom;
    private String cltPrenom;
    private String cltEmail;
    private String cltMdp;
    @OneToOne(mappedBy = "client")
    private Favoris favoris;
    @OneToMany(mappedBy="client")
    private Collection<Avis>avis;
    
	public Client() {
        avis = new ArrayList<>();
	}

	public Client(String cltNom, String cltPrenom, String cltEmail, String cltMdp, Favoris favoris,
			Collection<Avis> avis) {
		
		this.cltNom = cltNom;
		this.cltPrenom = cltPrenom;
		this.cltEmail = cltEmail;
		this.cltMdp = cltMdp;
		this.favoris = favoris;
		this.avis = avis;
	}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCltId() {
		return cltId;
	}

	public void setCltId(Long cltId) {
		this.cltId = cltId;
	}

	public String getCltNom() {
		return cltNom;
	}

	public void setCltNom(String cltNom) {
		this.cltNom = cltNom;
	}

	public String getCltPrenom() {
		return cltPrenom;
	}

	public void setCltPrenom(String cltPrenom) {
		this.cltPrenom = cltPrenom;
	}

	public String getCltEmail() {
		return cltEmail;
	}

	public void setCltEmail(String cltEmail) {
		this.cltEmail = cltEmail;
	}

	public String getCltMdp() {
		return cltMdp;
	}

	public void setCltMdp(String cltMdp) {
		this.cltMdp = cltMdp;
	}

	public Favoris getFavoris() {
		return favoris;
	}

	public void setFavoris(Favoris favoris) {
		this.favoris = favoris;
	}

	public Collection<Avis> getAvis() {
		return avis;
	}

	public void setAvis(Collection<Avis> avis) {
		this.avis = avis;
	}

	@Override
	public String toString() {
		return "Client [cltId=" + cltId + ", cltNom=" + cltNom + ", cltPrenom=" + cltPrenom + ", cltEmail=" + cltEmail
				+ ", cltMdp=" + cltMdp + ", favoris=" + favoris + ", avis=" + avis + "]";
	}
    
}
