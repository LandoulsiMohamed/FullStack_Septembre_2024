package com.sip.ams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.ams.entities.Provider;
import com.sip.ams.repositories.ProviderRepository;

@Controller
@RequestMapping("/provider/")

public class ProviderController {
	
private ProviderRepository providerRepository; //interface
	
    @Autowired // iOC = inversion de control (injection de dépendance)
    
   
    public ProviderController(ProviderRepository providerRepository) { //paramètre de type interface
        this.providerRepository = providerRepository;
    }

    
    @GetMapping("list")
    @ResponseBody
    public String listProviders(Model model) {
    	Provider p = new Provider("Toshiba3","Japon","Toshiba@gmail.com");
    	Provider res = this.providerRepository.save(p);
    	System.out.println(res.toString());
    	System.out.println(this.providerRepository.count());
    	System.out.println(this.providerRepository.findAll());
    	return "Liste de providers";
    }


}
