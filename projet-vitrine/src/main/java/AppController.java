

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Produit;
import service.ProduitService;

@Controller
public class AppController {
	@Autowired 
	private ProduitService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Produit> listProduits = service.listAll();
		model.addAttribute("listProduits", listProduits);
		
		return "index";
	}
}
