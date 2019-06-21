package com.file.projet.vitrine.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.file.projet.vitrine.modele.*;
import com.file.projet.vitrine.service.*;

@Controller
public class AppController {
	@Autowired 
	private AdresseService adrService;
	@Autowired 
	private AvisService avisService;
	@Autowired 
	private CategorieService catService;
	@Autowired 
	private ClientService cltService;
	@Autowired 
	private DroitAccesService drtService;
	@Autowired 
	private EffectifService effService;
	@Autowired 
	private EvenementService evntService;
	@Autowired 
	private FavorisService favService;
	@Autowired 
	private GenreService gnrService;
	@Autowired 
	private ProduitService proService;
	@Autowired 
	private SocieteService socService;
	@Autowired 
	private TypeEvenementService typEvService;
	@Autowired 
	private TypeProduitService typPService;
	
	@RequestMapping(value= {"/index"},method = RequestMethod.GET)
	public String viewHomePage(Model model) {
		
		List<Adresse> listAdresses = adrService.findAll();
		model.addAttribute("listAdresses", listAdresses);

		List<Avis> listAvis = avisService.findAll();
		model.addAttribute("listAvis", listAvis);
		
		List<Categorie> listcategories = catService.findAll();
		model.addAttribute("listcategories", listcategories);
		
		List<Client> listClients = cltService.findAll();
		model.addAttribute("listClients", listClients);
		
		List<DroitAcces> listDroits = drtService.findAll();
		model.addAttribute("listDroits", listDroits);
		
		List<Effectif> listEffectifs = effService.findAll();
		model.addAttribute("listEffectifs", listEffectifs);
		
		List<Evenement> listevnts = evntService.findAll();
		model.addAttribute("listevnts", listevnts);
		
		List<Favoris> listFavoris = favService.findAll();
		model.addAttribute("listFavoris", listFavoris);
		
		List<Genre> listGenres = gnrService.findAll();
		model.addAttribute("listGenres", listGenres);
		
		List<Produit> listProduits = proService.findAll();
		model.addAttribute("listProduits", listProduits);

		List<Societe> listSocietes = socService.findAll();
		model.addAttribute("listSocietes", listSocietes);
		
		List<TypeEvenement> listTypeEv = typEvService.findAll();
		model.addAttribute("listTypeEv", listTypeEv);
		
		List<TypeProduit> listTypePr = typPService.findAll();
		model.addAttribute("listTypePr", listTypePr);
		
		return "index";
		
	}
	
	@RequestMapping(value = {"/DonneesForm"}, method = RequestMethod.GET)
	public String viewPage(Model model) {
		
		return "DonneesForm";
		
	}
	
	/*@GetMapping("/adresse")
	  public String personneForm(Model model) {
	    model.addAttribute("adresse", new Adresse());
	    return "DonneesForm";
	  }
	  @PostMapping("/adresse")
	  public String personneSubmit(@ModelAttribute("adresse")
	     Adresse adresse, Model model) {
		  
	    Adresse a1 =  new AdresseRepository.save(adresse);
	    model.addAttribute("adresse",a1);
	    return "DonneesForm";
	} */
	
}
