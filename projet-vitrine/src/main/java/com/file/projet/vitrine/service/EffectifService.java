package com.file.projet.vitrine.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.file.projet.vitrine.modele.Effectif;
import com.file.projet.vitrine.repository.EffectifRepository;

@Service
public class EffectifService implements UserDetailsService{
	
	@Autowired
	private EffectifRepository repo;
	private List<GrantedAuthority> list;	
	public List<Effectif> findAll(){
		return repo.findAll();
	}
	public void saveEffectif(Effectif effectif) {
		repo.save(effectif);
	}
	
	public Effectif get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Effectif e = repo.findByEffEmail("effEmail");
		userName = repo.findByEffEmail("effEmail").toString() ;
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(e.getDroitAcces().getDrtNom());
		list.add(authority);
		return new User(userName, e.getEffMdp(), list);
	}
}