package hrapplication.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import hrapplication.model.ApplicantBean;
import hrapplication.model.HrApplicationBean;
import hrapplication.service.ApplicantService;
import hrapplication.service.HrApplicationService;

@Controller
@RequestMapping("/applicants")
public class ApplicantController {

	@Autowired
	private ApplicantService applicantService;
	
	@Autowired
	private HrApplicationService hrApplicationService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView addApplicant(@ModelAttribute("newApplicant") ApplicantBean applicantBean,BindingResult bindingResult) {
		Map<String, Object> model = new HashMap<String,Object>();
		model.put("hrApplications",  hrApplicationService.getAllHrApplication());
		return new ModelAndView("applicantAdd",model);
	}
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveApplicant(@ModelAttribute("newApplicant") ApplicantBean applicantBean,BindingResult bindingResult, HrApplicationBean hrApplicationBean){

		applicantService.save(applicantBean);
		applicantService.update(applicantBean,hrApplicationService.getAllHrApplicationId(hrApplicationBean));
		
		return "redirect:/hrApplications";
	}
	
	
	


}
