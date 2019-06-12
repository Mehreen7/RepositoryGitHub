package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.Produit;
import repository.ProduitRepository;;

@Service
public class ProduitService {
	@Autowired
	private ProduitRepository repo;

	public List<Produit> listAll() {
		return repo.findAll();
	}

	public void saveProduit(Produit produit) {
		repo.save(produit);
	}

	public Produit get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

	public void changerStatut(Long id, Produit produit) {
		String etatDeBase = produit.getProEtat();
		if (etatDeBase.equalsIgnoreCase("actif")) {
			produit.setProEtat("inactif");
		}
		if (etatDeBase.equalsIgnoreCase("inactif")) {
			produit.setProEtat("actif");
		}
		repo.saveAndFlush(produit);
	}

}
