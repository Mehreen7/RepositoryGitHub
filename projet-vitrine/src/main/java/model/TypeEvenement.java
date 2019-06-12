package model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeEvenement {

	private Long typEvtId;   
    private String typEvtNom;    
    @OneToMany(mappedBy = "typeevenement")
    private Collection<Evenement>evenements;

    public TypeEvenement() {
        evenements = new ArrayList<>();
    }

    public TypeEvenement(String typEvtNom, Collection<Evenement> evenements) {
        this.typEvtNom = typEvtNom;
        this.evenements = evenements;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getTypEvtId() {
		return typEvtId;
	}

	public void setTypEvtId(Long typEvtId) {
		this.typEvtId = typEvtId;
	}

	public String getTypEvtNom() {
		return typEvtNom;
	}

	public void setTypEvtNom(String typEvtNom) {
		this.typEvtNom = typEvtNom;
	}

	public Collection<Evenement> getEvenements() {
		return evenements;
	}

	public void setEvenements(Collection<Evenement> evenements) {
		this.evenements = evenements;
	}

	@Override
	public String toString() {
		return "TypeEvenement [typEvtId=" + typEvtId + ", typEvtNom=" + typEvtNom + ", evenements=" + evenements + "]";
	}
    
}
