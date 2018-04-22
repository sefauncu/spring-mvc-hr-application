package hrapplication.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrapplication.model.LoginBean;

@Repository
public class LoginDAOImpl implements LoginDAO {


	private EntityManager entityManager;

	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	@Override
	public void addLogin(LoginBean loginBean) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		loginBean.setLoginId(1);
		loginBean.setLoginEmail("deneme@gmail.com");
		loginBean.setLoginPassword("1a2b3c");
		entityManager.merge(loginBean);
		entityTransaction.commit();
		
	}

}
