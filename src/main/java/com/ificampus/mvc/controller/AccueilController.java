package com.ificampus.mvc.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.ificampus.mvc.entities.Candidat;
import com.ificampus.mvc.entities.Dossier;
import com.ificampus.mvc.entities.Etat;
import com.ificampus.mvc.entities.Pays;
import com.ificampus.mvc.entities.Personne;
import com.ificampus.mvc.entities.Role;
import com.ificampus.mvc.services.IPaysService;
import com.ificampus.mvc.services.IPersonneService;
import com.ificampus.mvc.services.ICandidatService;
import com.ificampus.mvc.services.IDossierService;
import com.ificampus.mvc.services.IEtatService;
import com.ificampus.mvc.services.IRoleService;
import com.ificampus.mvc.services.impl.DossierServiceImpl;

@Controller
@RequestMapping(value="/signup")
public class AccueilController {
	
	
	 @Autowired 
	 private IPaysService paysService;
	  
	 @Autowired
	 private IRoleService roleservice;
	 
	 @Autowired
	 private IPersonneService personneService;
	  
	 @Autowired
	 private ICandidatService candidatService;
	 @Autowired
	 private IEtatService etatService;
	 @Autowired
	 private IDossierService dossierService;
	 @Autowired
	 ServletContext context;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String nouveau(Model model) {
		Candidat candidat = new Candidat();
		model.addAttribute("candidat",candidat);
		 // Il faut construire les objet à passer au prochain controlleur 
		//à travers la vue signup
		//pays pour afficher la liste des pays ds la vue
		return "signup/signup";
	}
	
	@RequestMapping(value = "/info")
	public String enregistrer(Model model, Candidat candidat) {
		
		
		
		List<Pays> listPays = paysService.selectAll();
		if(listPays==null) { 
			listPays=new ArrayList<Pays>();
		}
		model.addAttribute("candidat",candidat);
		model.addAttribute("listPays", listPays);
		return "signup/signuptwo";
	}
	
	@RequestMapping(value="/fileUpload", method=RequestMethod.POST)
	public @ResponseBody Map<String, Object>fileupload(MultipartHttpServletRequest request, HttpServletResponse response){
	
		
		Map<String,Object> map = new HashMap<String,Object>();
		List<String> list = new ArrayList<String>();
		
		Iterator<String> itr = request.getFileNames();
		MultipartFile mpf = null;
		while(itr.hasNext()) {
			mpf = request.getFile(itr.next());
			try {
				
				FileCopyUtils.copy(mpf.getBytes(), new FileOutputStream(context.getRealPath("/resources")+"/"+mpf.getOriginalFilename().replace(" ", "-")));
				FileCopyUtils.copy(mpf.getBytes(), new FileOutputStream("D:"+"/"+mpf.getOriginalFilename().replace(" ", "-")));
				list.add(mpf.getOriginalFilename().replace(" ", "-"));
				
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
		
		map.put("Status", 200);
		map.put("SucessfulList", list);
		
		return map;
	}
	
	
	@RequestMapping(value = "/enregistrer")
	public ModelAndView inforegister(Model model, Candidat candidat) {
		
		
		
		Role role = new Role();
		Dossier dossier = new Dossier();
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		//System.out.println(dateFormat.format(date));
		
		if(candidat!=null) { 
			if(candidat.getPersonne_id() != 0) {
					personneService.update(candidat);			
			}else { 
				
				
				role.setRole_name("ROLE_USER");
				role.setPersonne(candidat);
				dossier.setDossier_candidat(candidat);
				dossier.setCreate_date(date);
				dossier.setModif_date(date);
				dossier.setDossier_etat(etatService.getById(1));
				personneService.save(candidat);
				roleservice.save(role);
				dossierService.save(dossier);
			} 
		}
		String loginUrl = "/";
		return new ModelAndView("redirect:" + loginUrl);
	}

	

}
