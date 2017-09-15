package cn.itcast.web;

import com.opensymphony.xwork2.Action;

public class Demo02Action implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("实现接口的 Action动作类");
		return SUCCESS;
	}
	public String login() throws Exception {
		System.out.println("通过method属性配置");
		return SUCCESS;
	}
	
}
