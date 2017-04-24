package com.investup.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.investup.dao.RegistrationDAO;
import com.investup.pojo.Investor;
import com.investup.pojo.Startup;
import com.investup.validator.InvestorValidator;
import com.investup.validator.StartupValidator;
@Controller
public class StartupRegistration {
	
	@Autowired
	@Qualifier("registrationDao")
	RegistrationDAO registrationDao;
	
	@Autowired
	@Qualifier("startupValidator")
	StartupValidator validator;
//	
//	
//	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
		
	}
	
	@RequestMapping(value = "startupregister.htm", method = RequestMethod.GET)
	protected ModelAndView registerStartup() throws Exception {
		System.out.print("register startup");

		return new ModelAndView("startupregistration", "startup", new Startup());

	}
	
	@RequestMapping(value = "startupregistration.htm", method = RequestMethod.POST)
	protected String addStartupDetails(HttpServletRequest request, @ModelAttribute("startup") Startup startup, BindingResult result) throws Exception {

		HttpSession session = (HttpSession) request.getSession();
		System.out.println(startup.getUserName());
		System.out.println("startup firstname : " + startup.getStartupFirstName());
		System.out.println("type:"+ startup.getType());
		System.out.println("status:"+ startup.getStatus());
		
		try {
			registrationDao.addStartup(startup);
			
			
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
			session.setAttribute("errorMessage", "error while login");
//			return "error";
			
		}
		return "startup-welcome";
		
	}
	
}
