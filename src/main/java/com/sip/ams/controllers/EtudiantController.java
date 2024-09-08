package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EtudiantController {
	
	@RequestMapping("list") // route sur navigateur
	//@ResponseBody
	public String listEtudiants() //action
	{
	 return "listEtudiants"; //nom du fichier(template) View
	}
	
	@RequestMapping("add")
	//@ResponseBody
	public String addEtudiant()
	{
	 return "addEtudiant";
	}

}
