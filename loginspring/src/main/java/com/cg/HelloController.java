package com.cg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("hello")
	public ModelAndView create()
	{
		return new ModelAndView("login");
	}
	@RequestMapping("register")
	public ModelAndView login()
	{
		return new ModelAndView("register");
	}
	@RequestMapping("details")
	public ModelAndView register()
	{
		return new ModelAndView("details");
	}
	@RequestMapping("view")
	public ModelAndView click(@RequestParam("name")String name,@RequestParam("email")String email,@RequestParam("gender")String gender,@RequestParam("num")String num)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", name);
		mv.addObject("email",email);
		mv.addObject("gender",gender);
		mv.addObject("num",num);
		mv.setViewName("display");
		return mv;	}
	@RequestMapping("logout")
	public ModelAndView register1()
	{
		return new ModelAndView("login");
	}
}
