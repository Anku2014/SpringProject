package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.dao.SearchPhysicianDao;
import com.hcl.entity.Physician;

@Controller
@RequestMapping("/searchphysician")
public class SearchController {
	@Autowired
	SearchPhysicianDao dao;
	@GetMapping("/form")
	@RequestMapping(value="/search", method = RequestMethod.POST)
	public ModelAndView searchName(@RequestParam("state")String state)
	{
		return null;
}
}
