package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.entity.Patient;
import com.hcl.service.PatientService;

@Controller
@RequestMapping("/viewpatient")
public class ViewController {
    
    @Autowired
    private PatientService patientService;
    @GetMapping("/form")

 

    public String getMyPatient(Model model) 
    {
      
    List<Patient> viewpatient=patientService.getAllPatient();
    model.addAttribute("viewpatient", viewpatient);
    return "viewpatient";
           
        
    }
}