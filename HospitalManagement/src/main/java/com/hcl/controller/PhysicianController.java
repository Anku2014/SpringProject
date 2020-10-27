package com.hcl.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hcl.entity.Physician;
import com.hcl.service.PhysicianService;

@Controller
@RequestMapping("/registerphysician")
public class PhysicianController {
	 @Autowired
	    private PhysicianService physicianService;
	    @GetMapping("/form")
	    public String showPersonsForm(Model model) {
	       Physician physician=new Physician();
	        model.addAttribute(physician);
	        return "registerphysician";
	    }
	    @PostMapping("/processphysician")
	    public String processForm(@ModelAttribute("physician") @Valid Physician physician,BindingResult result) {
	        if(result.hasErrors())
	        return "registerphysician";
	        physicianService.insertPhysician(physician);
	        return "confirmation";
	    }
}
