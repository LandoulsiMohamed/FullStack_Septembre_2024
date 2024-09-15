package com.sip.ams.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.ams.entities.Session;

@Controller
@RequestMapping("/sessions")
public class SessionController {
	
	public static List<Session> sessions;
	
	static {
		Session s1 = new Session("OCA","oca.png","C'est une formation permettant aux stagiaires d'avoir un niveau confirmé en tant que développeur Java, ce niveau vous permet de passer l'examen Oracle 1Z0-808 et de se plonger dans les framework tel que Spring.");
		Session s2 = new Session("OCP","ocp.png","Ce niveau professionnel permet d'avoir  les compétences nécessaires pour être un développer senior en Java et capable de passer les certifications (Java 8) 1Z0-809, (Java 11)  1Z0-819 et (Java 17)  1Z0-829, Pour démarrer ce niveau, il faut avoir la formation OCA 1Z0-808.");
		Session s3 = new Session("FullStack","fullstack.png","C'est une formation 100% pratique assurée un formateur expert de plus de 15% d'expérience en développement web et sous la supervision de 3 coaches. L'objectif de cette formation est de permettre au stagiaire de maîtriser les 3 fameux frameworks Spring, Angular et React Native.");
		sessions = new ArrayList<>();
		sessions.add(s1);
		sessions.add(s2);
		sessions.add(s3);
	}
	
	@GetMapping("/list")
	public String listSession(Model model) {
		
		model.addAttribute("sessions", sessions);
		
		return "sessions/listSessions";
	}
	
	@GetMapping("/showAddSessionForm")
	public String addSession(Model model) {
		//Session temp = new Session("a","b","c");
		Session temp = new Session();
		model.addAttribute("temp",temp);
		return "sessions/addSession";
	}
	
	@PostMapping("/saveSession")
	//@ResponseBody
	public String saveSession(Session temp) {
		temp.setLogo("oca.png");
		sessions.add(temp);
		//return temp.toString();
		return "redirect:list";
	}

}
