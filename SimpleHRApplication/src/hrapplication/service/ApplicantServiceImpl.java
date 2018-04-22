package hrapplication.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrapplication.dao.ApplicantDAO;
import hrapplication.model.ApplicantBean;
import hrapplication.model.HrApplicationBean;

@Service
public class ApplicantServiceImpl implements ApplicantService{

	@Autowired
	private ApplicantDAO applicantDAO;
	
	
	@Override
	public void save(ApplicantBean applicantBean) {
		
		applicantDAO.save(applicantBean);
		
	}

	@Override
	public List<ApplicantBean> list() {
	
		return applicantDAO.list();
	}

	@Override
	public void remove(int applicantId) {
		
		applicantDAO.remove(applicantId);
		
	}

	@Override
	public ApplicantBean get(int applicantId) {
		
		return applicantDAO.get(applicantId);
	}


	@Override
	public void update(ApplicantBean applicantBean,List<HrApplicationBean> hrApplicationBeans) {
		applicantDAO.update(applicantBean, hrApplicationBeans);
		
	}

	

	

}
