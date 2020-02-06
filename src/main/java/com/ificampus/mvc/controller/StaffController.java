package com.ificampus.mvc.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ificampus.mvc.entities.Candidat;
import com.ificampus.mvc.entities.Dossier;
import com.ificampus.mvc.entities.Personne;
import com.ificampus.mvc.services.ICandidatService;
import com.ificampus.mvc.services.IDossierService;
import com.ificampus.mvc.services.IMembreStaffService;
import com.ificampus.mvc.services.IPersonneService;

//import com.ificampus.mvc.entities.Personne;

@Controller
@RequestMapping(value="/staff")
public class StaffController {
	
	/*
	 * @Autowired private ILevelService levelService;
	 */
	@Autowired
	private IPersonneService personneservice;
	
	@Autowired
	private ICandidatService candidatservice;
	
	@Autowired
	private IMembreStaffService membrestaffservice;
	
	@Autowired
	private IDossierService dossierservice;
	
	@RequestMapping(value="/listcandidat")
	public String candidatHome(Model model) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		List <Dossier> dossiers = new ArrayList<Dossier>();
		
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			Personne personne = personneservice.getByMail(user.getUsername());
			
			model.addAttribute("personne", personne);
			if (personne.getPersonne_id()!=0) {
				try {
					 
					//dossier = dossierservice.getByCandidat(personne.getPersonne_id());
					dossiers = dossierservice.selectAll();
					
				}catch(NoResultException nre){
					
				}
				
				model.addAttribute("dossiers", dossiers);
				
				System.out.println(dossiers.get(0).getDossier_candidat().getNom());
				
				
			}
			
			
			
			int candidatures = dossierservice.countAll();
			model.addAttribute("candidatures", candidatures);
	
			return "staff/listCandidat";
			
		}else {
			
			return "redirect:/";
		}
		
	}
	
	@RequestMapping(value="/info")
	public String candidatInfo (Model model) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//Dossier dossier = new Dossier();
		
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			Personne personne = personneservice.getByMail(user.getUsername());
			Candidat candidat = candidatservice.getById(personne.getPersonne_id());
			
			model.addAttribute("candidat",candidat);
			/*
			 * if(dossier==null) {
			 * model.addAttribute("message","Veuiller completer votre dossier"); }else {
			 * model.addAttribute("dossier", dossier); }
			 */
			
			

			

		 }
		
		return "candidat/info";
	}
	
	
	@RequestMapping(value="/formation")
	public String candidatFormatioon () {
		
		return "candidat/formation";
	}
	
	
	@RequestMapping(value="/dossier")
	public String candidatdossier () {
		
		return "candidat/dossier";
	}
	
}
