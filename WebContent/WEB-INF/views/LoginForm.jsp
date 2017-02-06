<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
    <div align="center">
        <h1>LinkedForever</h1>
        <h2>Users Login</h2>
        <s:form action="login" method="post">
            <s:textfield label="Email/Tel" name="student.email" />
            <s:password label="Password" name="student.pwd" />
            <s:submit value="Login" />
        </s:form>            
    </div>   
</body>
</html>