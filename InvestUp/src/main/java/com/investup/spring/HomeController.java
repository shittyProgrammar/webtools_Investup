package com.investup.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.investup.dao.RegistrationDAO;
import com.investup.pojo.Investor;
import com.investup.pojo.Startup;
//import com.my.spring.dao.CategoryDAO;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
//	
//	@Autowired
//	@Qualifier("registrationDAO")
//	RegistrationDAO registrationDAO;
	
//	@Autowired
//	@Qualifier("investorDAO")
//	UserDAO investorDAO;
//	
////	@Autowired
////	@Qualifier("startupDAO")
////	StartupDAO startupDAO;
//
//	
//	
//	@RequestMapping(value = "/investor/add.htm", method = RequestMethod.POST)
//	public ModelAndView showInvestorSuccesPage(HttpServletRequest request) {
//	
//	
//	
//	String investorFirstName= request.getParameter("investorFirstName");
//	String investorLastName= request.getParameter("investorLastName");
//	String investorContact= request.getParameter("investorContact");
//	String investorStreet= request.getParameter("investorStreet");
//	String investorCity= request.getParameter("investorCity");
//	String investorState= request.getParameter("investorState");
//	String investorCountry= request.getParameter("investorCountry");
//	String zip= request.getParameter("zip");
//	
//	Investor investor=new Investor(investorFirstName, investorLastName, investorContact, investorStreet, investorCity, investorState, investorCountry, zip);
//	try {				
//		investor = UserDAO.createInvestor(investor);
//	} catch (Exception e) {
//		System.out.println(e.getMessage());
//		return new ModelAndView("error", "errorMessage", "error while login");
//	}
//	
//	return new ModelAndView("investoradded","investor",investor);
//	}
//	
//	@RequestMapping(value = "/startup/add.htm", method = RequestMethod.POST)
//	public ModelAndView showStartupSuccesPage(HttpServletRequest request) {
//	
//	
//	String startupName= request.getParameter("startupName");
//	String startupDescription= request.getParameter("startupDescription");
//	String startupLicenseNumber= request.getParameter("startupLicenseNumber");
//	String startupEquity= request.getParameter("startupEquity");	
//	String startupContact= request.getParameter("startupContact");
//	String startupFirstName= request.getParameter("startupFirstName");
//	String startupLastName= request.getParameter("startupLastName");
////	String startupContact= request.getParameter("startupContact");
//	String startupStreet= request.getParameter("startupStreet");
//	String startupCity= request.getParameter("startupCity");
//	String startupState= request.getParameter("startupState");
//	String startupCountry= request.getParameter("startupCountry");
//	String zip= request.getParameter("zip");
//	
//	
//	
//	Startup startup=new Startup(startupName, startupDescription, startupLicenseNumber, startupEquity, startupContact, startupFirstName, startupLastName, startupStreet, startupCity, startupState, startupCountry, zip);
//	try {				
//		startup = UserDAO.createStartup(startup);
//	} catch (Exception e) {
//		System.out.println(e.getMessage());
//		return new ModelAndView("error", "errorMessage", "error while login");
//	}
//	
//	return new ModelAndView("startupadd","startup",startup);
//	}
//	
//	@RequestMapping(value = "/investor/add", method = RequestMethod.POST)
//	public ModelAndView addCategory(@ModelAttribute("investor") Investor investor, BindingResult result) throws Exception {

//		try {	
			
			
//			
//			User u = userDao.get(advert.getPostedBy());
//			advert.setUser(u);
//			advert = advertDao.create(advert);
//			
//            
//            for(Category c: advert.getCategories()){
//            	c = categoryDAO.get(c.getTitle());
//            	c.getAdverts().add(advert);
//            	categoryDAO.update(c); //to maintain many to many relationship
//            }
//			
//			return new ModelAndView("advert-success", "advert", advert);
//			
//		} catch (AdvertException e) {
//			System.out.println(e.getMessage());
//			return new ModelAndView("error", "errorMessage", "error while login");
//		}
		
		
//	}
	
	
//	@Autowired
//	@Qualifier("userDao")
//	UserDAO userDao;
//	
//
//	@RequestMapping(value = "/advert/add", method = RequestMethod.POST)
//	public ModelAndView addCategory(@ModelAttribute("advert") Advert advert, BindingResult result) throws Exception {
//
//		try {			
//			
//			User u = userDao.get(advert.getPostedBy());
//			advert.setUser(u);
//			advert = advertDao.create(advert);
//			
//            
//            for(Category c: advert.getCategories()){
//            	c = categoryDAO.get(c.getTitle());
//            	c.getAdverts().add(advert);
//            	categoryDAO.update(c); //to maintain many to many relationship
//            }
//			
//			return new ModelAndView("advert-success", "advert", advert);
//			
//		} catch (AdvertException e) {
//			System.out.println(e.getMessage());
//			return new ModelAndView("error", "errorMessage", "error while login");
//		}
//		
//		
//	}
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
	
	
	
	
}
