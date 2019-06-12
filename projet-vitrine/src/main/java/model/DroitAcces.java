package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DroitAcces {
	
	private Long drtId;
    private String drtNom;
    private String drtDesc;
    @OneToMany(mappedBy = "droitAcces")
    private Collection<Effectif> effectifs;
    
	public DroitAcces() {
		effectifs = new ArrayList<>();
	}

	public DroitAcces(String drtNom, String drtDesc, Collection<Effectif> effectifs) {
		
		this.drtNom = drtNom;
		this.drtDesc = drtDesc;
		this.effectifs = effectifs;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getDrtId() {
		return drtId;
	}

	public void setDrtId(Long drtId) {
		this.drtId = drtId;
	}

	public String getDrtNom() {
		return drtNom;
	}

	public void setDrtNom(String drtNom) {
		this.drtNom = drtNom;
	}

	public String getDrtDesc() {
		return drtDesc;
	}
	public void setDrtDesc(String drtDesc) {
		this.drtDesc = drtDesc;
	}
	public Collection<Effectif> getEffectifs() {
		return effectifs;
	}
	public void setEffectifs(Collection<Effectif> effectifs) {
		this.effectifs = effectifs;
	}

	@Override
	public String toString() {
		return "DroitAcces [drtId=" + drtId + ", drtNom=" + drtNom + ", drtDesc=" + drtDesc + ", effectifs=" + effectifs
				+ "]";
	}
		
    
}
