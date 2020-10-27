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

import com.hcl.entity.PatientDiagnosis;
import com.hcl.entity.Physician;
import com.hcl.service.PatientDiagnosisService;
import com.hcl.service.PhysicianService;

@Controller
@RequestMapping("/patientdiagnosisview")
public class PatientDiagnosisController {
	 @Autowired
	    private PatientDiagnosisService patientDiagnosisService;
	    @GetMapping("/form")
	    public String showPersonsForm(Model model) {
	    	PatientDiagnosis patientDiagnosis=new PatientDiagnosis();
	        model.addAttribute(patientDiagnosis);
	        return "patientdiagnosisview";
	    }
	    @PostMapping("/processpatientdiagnosis")
	    public String processForm(@ModelAttribute("patientDiagnosis") @Valid PatientDiagnosis patientDiagnosis,BindingResult result) {
	        if(result.hasErrors())
	        return "patientdiagnosisview";
	        patientDiagnosisService.insertPatientDiagnosis(patientDiagnosis);
	        return "confirmation";
	    }
}
