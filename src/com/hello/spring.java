package com.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vo.regVo;

@Controller
public class spring {
	@RequestMapping(value="/hello.do",method=RequestMethod.GET)
	public ModelAndView helloWorld()
	{
		String msg="hey, my first spring helloword...";
		return new ModelAndView("hello","hi",msg);
	}
	@RequestMapping(value="/reg.do",method=RequestMethod.GET)
	public ModelAndView reg()
	{
		return new ModelAndView("reg","reg",new regVo());
	}
	@RequestMapping(value="/insertreg.do",method=RequestMethod.POST)
	public ModelAndView insertreg(@ModelAttribute regVo obj)
	{
		return new ModelAndView("hello","print",obj);
	}
	

}