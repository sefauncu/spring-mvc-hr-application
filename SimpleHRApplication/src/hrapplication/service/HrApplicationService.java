package hrapplication.service;

import java.util.List;

import hrapplication.model.ApplicantBean;
import hrapplication.model.HrApplicationBean;

public interface HrApplicationService {

	public List<HrApplicationBean> getAllHrApplication();
	
	public HrApplicationBean getHrApplicationById(int hrApplicationId);
	
	public void addHrApplication(HrApplicationBean hrApplicationBean);
	
	public void deleteHrApplication(int hrApplicationId);
	
	public List<HrApplicationBean> getAllHrApplicationId(HrApplicationBean hrApplicationBean);
	
	
}
