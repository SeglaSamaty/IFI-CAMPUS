package com.ificampus.mvc.controller;
import java.util.Set;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.ificampus.mvc.entities.Candidat;
import com.ificampus.mvc.entities.Document;
import com.ificampus.mvc.entities.Dossier;
import com.ificampus.mvc.entities.Personne;
import com.ificampus.mvc.services.ICandidatService;
import com.ificampus.mvc.services.IDocumentService;
import com.ificampus.mvc.services.IDossierService;
import com.ificampus.mvc.services.IPersonneService;

//import com.ificampus.mvc.entities.Personne;

@Controller
@RequestMapping(value="/candidat")
public class CandidatController {
	
	/*
	 * @Autowired private ILevelService levelService;
	 */
	@Autowired
	private IPersonneService personneservice;
	
	@Autowired
	private ICandidatService candidatservice;
	
	@Autowired
	private IDossierService dossierservice;
	
	@Autowired
	private IDocumentService docservice;
	
	@RequestMapping(value="/")
	public String candidatHome(Model model) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Dossier dossier = new Dossier();
		
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			
			Set<String> roles = AuthorityUtils.authorityListToSet(auth.getAuthorities());
			
			if(roles.contains("ROLE_ADMIN")) {
				UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
				Personne personne = personneservice.getByMail(user.getUsername());
				model.addAttribute("personne", personne);
				int candidatures = dossierservice.countAll();
				model.addAttribute("candidatures", candidatures);
				return "blank/admin";
				
			}else {
				
				UserDetails user = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
				Personne personne = personneservice.getByMail(user.getUsername());
				
				model.addAttribute("personne", personne);
				if (personne.getPersonne_id()!=0) {
						try {
							 
							dossier = dossierservice.getByCandidat(personne.getPersonne_id());
							
						}catch(NoResultException nre){
							
						}
						
						model.addAttribute("dossier", dossier);
					}
					int candidatures = dossierservice.countAll();
					model.addAttribute("candidatures", candidatures);
					return "blank/blank";
			}
			
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
	@RequestMapping(value="/doUpload")
	public String upload(HttpServletRequest request,
            @RequestParam CommonsMultipartFile[] fileUpload)throws Exception {
		if (fileUpload != null && fileUpload.length > 0) {
			 for (CommonsMultipartFile aFile : fileUpload){
				 System.out.println("Saving file: " + aFile.getOriginalFilename());
				 Document uploadFile = new Document();
	                uploadFile.setFileName(aFile.getOriginalFilename());
	                uploadFile.setFileData(aFile.getBytes());
	                System.out.println(uploadFile.getFileName());
	                docservice.save(uploadFile);
	                //fileUploadDao.save(uploadFile); 
			 }	
		}
		return "candidat/success";
		
	}
	 
	
	
	
	
	
}
