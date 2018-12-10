package cn.itcast.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.web.context.request.NativeWebRequest;

import com.sun.swing.internal.plaf.basic.resources.basic;

import cn.itcast.bean.User;


// Dao���ʵ��
// �������hibernateTemplate�Ľӿڣ�������ݿ��crud

public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void add() {
	 
		// ���������������ʵ��
//		HibernateTemplate hibernateTemplate = new HibernateTemplate(SessionFactory);
//		hibernateTemplate.save();
		
		System.out.println("userDaoImpl add.....");
		User user = new User();
		user.setAddress("����");
		user.setUsername("laowang");
		 
		hibernateTemplate.save(user);
		
	}

	 	

}
