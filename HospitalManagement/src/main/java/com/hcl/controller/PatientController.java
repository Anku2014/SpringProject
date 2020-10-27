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

import com.hcl.entity.Patient;
import com.hcl.service.PatientService;

@Controller
@RequestMapping("/registerpatient")
public class PatientController {
   
    @Autowired
    private PatientService patientService;
    @GetMapping("/form")
    public String showPersonsForm(Model model) {
        Patient patient=new Patient();
        model.addAttribute(patient);
        return "registerpatient";
    }
    @PostMapping("/processpatient")
    public String processForm(@ModelAttribute("patient") @Valid Patient patient,BindingResult result) {
        if(result.hasErrors())
        return "registerpatient";
        patientService.insertPatient(patient);
        return "confirmation";
    }
}

       