package cn.itcast.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.web.context.request.NativeWebRequest;

import com.sun.swing.internal.plaf.basic.resources.basic;

import cn.itcast.bean.User;


// Dao层的实现
// 这里调用hibernateTemplate的接口，完成数据库的crud

public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Override
	public void add() {
	 
		// 把这个过程用配置实现
//		HibernateTemplate hibernateTemplate = new HibernateTemplate(SessionFactory);
//		hibernateTemplate.save();
		
		System.out.println("userDaoImpl add.....");
		User user = new User();
		user.setAddress("东北");
		user.setUsername("laowang");
		 
		hibernateTemplate.save(user);
		
	}

	 	

}
