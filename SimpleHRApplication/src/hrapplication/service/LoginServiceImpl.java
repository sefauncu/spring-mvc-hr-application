package hrapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrapplication.dao.LoginDAO;
import hrapplication.model.LoginBean;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;
	

	@Override
	public void addLogin(LoginBean loginBean) {
		
		loginDAO.addLogin(loginBean);
		
	}

}
