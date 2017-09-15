<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/user!register.action">实现Action动作类第一种方式+动态访问action类</a><br/>
	<a href="${pageContext.request.contextPath}/login.action">实现Action接口的动作类+通过method属性配置访问action类</a><br/>
	<a href="${pageContext.request.contextPath}/login_User.action">继承ActionSupport的Action动作类+通过通配符的配置访问action</a>
	<a href="${pageContext.request.contextPath}/add_Product.action">继承ActionSupport的Action动作类+通过通配符的配置访问action</a>
	
	
</body>
</html>