package hrapplication.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import hrapplication.model.LoginBean;
import hrapplication.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String defaultPage(LoginBean loginBean,BindingResult bindingResult) {
		//start project
			return "index";
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String addLogin(LoginBean loginBean,BindingResult bindingResult) {
		loginService.addLogin(loginBean);
		return "login";
	}
	
	 @RequestMapping("/login")  
	   public ModelAndView login(HttpServletRequest request,HttpServletResponse response,LoginBean loginBean,BindingResult bindingResult) {
		  loginService.addLogin(loginBean);
		  String loginEmail=request.getParameter("loginEmail");  
		  String loginPassword=request.getParameter("loginPassword");
	      String message;
	      if(loginEmail != null && 
	    		  !loginEmail.equals("") 
	    		  && loginEmail.equals(loginBean.getLoginEmail()) && 
	    		  loginPassword != null && 
	    		  !loginPassword.equals("") && 
	    		  loginPassword.equals(loginBean.getLoginPassword())){
	    	  message = "Welcome " +loginEmail + ".";
		      return new ModelAndView("hrApplicationList");  
	 
	      }else{
	    	  message = "Wrong email or password.";
	    	  return new ModelAndView("login", 
	    			  "message", message);
	      }
	   }
	
	
}
