package hrapplication.dao;

import java.util.List;

import hrapplication.model.ApplicantBean;
import hrapplication.model.HrApplicationBean;

public interface HrApplicationDAO {
	
	public List<HrApplicationBean> getAllHrApplication();
	
	public List<HrApplicationBean> getAllHrApplicationId(HrApplicationBean hrApplicationBean);
	
	public HrApplicationBean getHrApplicationById(int hrApplicationId);
	
	public void addHrApplication(HrApplicationBean hrApplicationBean);
	
	public void deleteHrApplication(int hrApplicationId);
	


}
