package com.file.projet.vitrine.controller;

import org.springframework.stereotype.Controller;

@Controller
public class FormController {
	/*@Autowired 
	private AdresseService adrService;

	
	List<Adresse> listAdresses = new ArrayList<>();

	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView showForm(Model model) {
        return new ModelAndView("DonneeForm", "index", new Adresse());
    }
	@GetMapping("/adresse")
	  public String personneForm(Model model) {
	    model.addAttribute("adresse", new Adresse());
	    return "DonneesForm";
	  }

    @RequestMapping(value = "/DonneesForm", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("adresse") final Adresse adresse, 
    		final BindingResult result, final ModelMap model) {
        if (result.hasErrors()){
            return "index";
        }
   
        model.addAttribute("adrPays", adresse.getAdrPays());
        model.addAttribute("adrVille", adresse.getAdrVille());
        model.addAttribute("adrCodeP", adresse.getAdrCodeP());
        model.addAttribute("adrNum", adresse.getAdrNum());
        model.addAttribute("adrNom", adresse.getAdrNom());
        
        return "index";
    }	*/
}