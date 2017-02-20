<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>LinkedForever</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta name="description" content="A description of your website">
	<meta name="keywords" content="keyword1, keyword2, keyword3">
	<link href="css/style.css" rel="stylesheet" type="text/css">
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css">
	<link href="css/bootstrap-theme.css" rel="stylesheet" type="text/css">

  </head>
  
  <body>
    <body>
		
		<div id="wrapper"> 
			
			<div id="header"> 
				
				<div class="top_banner"> <h1>Welcome to Linked Forever</h1>
					<p>The new social network to keep in touch with your former friends !</p>
					
				</div>
				
				<div class="navigation">
					<ul>
						<li><a href="/LinkedForever/welcome.do?flag=welcome">Home</a></li>
						<li><a href="#">What's Linked Forever ?</a></li>
        				<li><a href="#">Questions & Answers</a></li>
        				<li><a href="#">About</a></li>
					</ul>
				</div>
				
			</div>
			
			<div id="page_content"> 
				
				<div class="left_side_bar"> 
					
					<div class="col_1">
						<h1>My groups</h1>
						<div class="box">
							<ul>
								<li><a href="#">Primary school</a></li>
								<li><a href="#">Secondary school</a></li>
								<li><a href="#">University</a></li>
								<li><a href="#">Other</a></li>
							</ul>
						</div>
					</div>
					
					<div class="col_1">
						<h1>Block</h1>
						<div class="box">
							<p>Enter Block content here...</p>
							<br>
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. 
								Aenean commodo Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
							Aenean commodo</p>
						</div>
					</div>
					
				</div>
				
				<div class="right_section">
					<div class="common_content">
					</div>
					<h3>Sign Up Step One</h3>
					
					<c:if test="${errInfo}">
       					<small id="emailHelp" class="form-text text-muted">Attention : This Email address is already used !</small>
       				</c:if> 
					
					<form action="/LinkedForever/signup.do?flag=signups1" method="post">
  						<div class="form-group">
    						<label for="exampleInputEmail1">Email address</label>
   							<input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    						<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  						</div>
 					 	<div class="form-group">
    						<label for="exampleInputPassword1">Telephone</label>
    						<input name="tel" class="form-control" id="exampleInputPassword1" placeholder="Telephone">
  						</div>
  						<div class="form-group">
    						<label for="exampleInputPassword1">Password</label>
    						<input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  						</div>
  						<button type="submit" class="btn btn-default">Next</button>
					</form>
					
					<div class="clear"></div>
					
					<!--start footer from here-->
					<div id="footer">Copyright &copy; 2014. Design by <a href="http://www.htmltemplates.net/" target="_blank">HTML Templates</a><br>
						
						<!--DO NOT remove footer link-->
					<!--Template designed by--><a href="http://www.htmltemplates.net/"><img src="images/footnote.gif" class="copyright" alt="www.htmltemplates.net"></a></div>
					
					<!--/. end footer from here-->
				</div>
				
			</div>
		</div>
  </body>
</html>
