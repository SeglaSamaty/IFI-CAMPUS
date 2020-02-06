package com.ificampus.mvc;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ificampus.mvc.entities.Personne;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)//ici c'est la racine de l'url
	public String home(Locale locale) {
		
		
		return "login/login";
	}
	
	
	@RequestMapping(value = "/staff", method = RequestMethod.GET)//specifie le lien à utiliser dans le navigateur
	public String staff(Locale locale, Model model) {
		return "login/stafflogin";
	}
	
	@RequestMapping(value="/failedLogin")
	public String failedLogin() {
		
		System.out.println();
		
		return "login/login";
	}
	
	
}
