package cn.itcast.action;

import java.awt.print.Printable;

import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.regexp.internal.recompile;

import cn.itcast.service.UserService;

// web�㣬����ͻ��˷�����������

public class UserAction extends ActionSupport {

	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("hello");
		System.out.println(userService);
		userService.add();
		//System.out.println("end action");
		return NONE;
	}

}
