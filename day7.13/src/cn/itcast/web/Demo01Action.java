package cn.itcast.web;

public class Demo01Action {
	public String execute(){
		System.out.println("demo01");
		return "success";
	}
	public String register() throws Exception {
		System.out.println("动态方法访问action类");
		return "success";
	}
}
