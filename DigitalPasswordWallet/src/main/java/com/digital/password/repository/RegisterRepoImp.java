package com.digital.password.repository;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.digital.password.entity.RegisterBean;

@Repository
public class RegisterRepoImp implements RegisterRepo {

	@Autowired
	private SessionFactory sessionFactory;

	public RegisterRepoImp() {
		System.out.println(this.getClass().getName());
	}

	public void registerMethod(RegisterBean register) {

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(register);
			tx.commit();
		} catch (Exception e) {
			System.err.println(e);
			tx.rollback();
		} finally {
			session.close();
		}

	}

	public Long getUser(String email) {
		System.out.println("Inside getUser() of LoginRepositoryImpl");
		Session session = sessionFactory.openSession();
		
		String hql = "select count(reg.email) from RegisterBean reg where reg.email=:EmailId";
		Query query = session.createQuery(hql);
		query.setParameter("EmailId", email);
		Long count =  (Long) query.uniqueResult();
		System.out.println("User Count" + " " + count);

		return count;

	}

}
