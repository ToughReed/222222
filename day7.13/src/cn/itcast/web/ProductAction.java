package cn.itcast.web;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("...");
		return SUCCESS;
	}
	public String add() throws Exception {
		System.out.println("通过通配符配置访问action类");
		return "add_success";
	}
	
}
