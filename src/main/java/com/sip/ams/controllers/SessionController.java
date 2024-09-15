package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sessions")
public class SessionController {
	
	@RequestMapping("/list")
	public String listSession() {
		
		return "sessions/listSessions";
	}
	
	public String addSession() {
		
		return "";
	}

}
