package hrapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrapplication.dao.HrApplicationDAO;
import hrapplication.model.ApplicantBean;
import hrapplication.model.HrApplicationBean;


@Service
public class HrApplicationServiceImpl implements HrApplicationService {

	@Autowired
	private HrApplicationDAO hrApplicationDAO;
	
	@Override
	public List<HrApplicationBean> getAllHrApplication() {
		
		return hrApplicationDAO.getAllHrApplication();
	}

	@Override
	public HrApplicationBean getHrApplicationById(int hrApplicationId) {
		
		return hrApplicationDAO.getHrApplicationById(hrApplicationId);
	}

	@Override
	public void addHrApplication(HrApplicationBean hrApplicationBean) {
	
		hrApplicationDAO.addHrApplication(hrApplicationBean);
		
	}

	@Override
	public void deleteHrApplication(int hrApplicationId) {
		
		hrApplicationDAO.deleteHrApplication(hrApplicationId);
		
	}

	@Override
	public List<HrApplicationBean> getAllHrApplicationId(HrApplicationBean hrApplicationBean) {

		return hrApplicationDAO.getAllHrApplicationId(hrApplicationBean);
	}


	

}
