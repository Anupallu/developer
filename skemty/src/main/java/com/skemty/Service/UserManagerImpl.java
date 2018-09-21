package com.skemty.Service;

import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.security.authentication.AuthenticationManager;

import com.skemty.dao.UserDAO;
import com.skemty.entity.AdminDetail;
import com.skemty.entity.Student;
import com.skemty.entity.StudentDetail;
import com.skemty.entity.User;
import com.skemty.entity.WrkDetail;

/**
 * @author s6
 *
 */
/**
 * @author s6
 *
 */
public class UserManagerImpl implements UserManager {

	@Autowired
	UserDAO userDao;


	// ******************************************************************************************
	@Autowired(required = false)
	AuthenticationManager authManager;
	private Logger LOG = Logger.getLogger(UserManager.class);
	Session session = null;
	private static HibernateTemplate ht;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.ht = new HibernateTemplate(sessionFactory);
		session = sessionFactory.openSession();
	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(String username) {
		User user = null;
		List<User> users = ht.find("FROM User u WHERE u.userName = ?", username);

		if (users != null && !users.isEmpty()) {
			user = users.get(0);
		}

		return user;
	}

	@Override
	public void saveDeatil(WrkDetail wrk, AdminDetail admin) {
		ht.save(wrk);
		ht.save(admin);
	}

	@Override
	public void saveDeatilMapping(Student std) {
	Long id=(Long) ht.save(std);
	Student st=ht.get(Student.class,id);
	StudentDetail stdt=ht.get(StudentDetail.class,id);
	}
		



}
