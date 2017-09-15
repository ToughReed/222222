package cn.itcast.web;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class Demo03Action extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("继承ActionSupport的Action动作类");
		return SUCCESS;
	}
	public String login(){
		System.out.println("通过通配符配置访问action类");
		return "login_success";
	}
}
