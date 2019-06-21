package com.file.projet.vitrine.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.file.projet.vitrine.modele.Adresse;
import com.file.projet.vitrine.service.AdresseService;

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