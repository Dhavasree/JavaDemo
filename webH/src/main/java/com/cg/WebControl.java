package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebControl {
	@Autowired
	webDao dao;
@RequestMapping("hello")
public ModelAndView login()
{
	return new ModelAndView("bean","command",new Bean());
	
}
@RequestMapping("added")
public String addDetails(@ModelAttribute("bean") Bean bean,Model model)
{  
	Bean bean1=dao.add(bean);
	
	model.addAttribute("bean",bean1);
	return "result";
}
}
