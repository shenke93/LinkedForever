<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
    <div id="wrapper"> 
			
			<div id="header"> 
				
				<div class="top_banner"> <h1>Welcome to Linked Forever</h1>
					<p>The new social network to keep in touch with your former friends !</p>
					
				</div>
				
				<div class="navigation">
					<ul>
						<li><a href="/LinkedForever/homepage.do?flag=tohomepage">Home</a></li>
						<li><a href="/LinkedForever/homepage.do?flag=tosearchFriend">Find a friend</a></li>
						<li><a href="/LinkedForever/homepage.do?flag=Myprofile">My profile</a></li>
						<li><a href="/LinkedForever/homepage.do?flag=friendList">Friends list</a></li>
						<li><a href="/LinkedForever/login.do?flag=logout">Log Out</a></li>
					</ul>
				</div>
				
			</div>
			
			<div id="page_content"> 
				
				<div class="col-md-12">
					<div class="common_content">
					</div>
						<div class="listTitle">
      						<h3><c:out value="${userProfile.name}" /></h3>

										</div>
           				 				
           				 					<div class="alert alert-warning">
           				 						<strong> E-mail : </strong> <c:out value="${userProfile.email}" /> <br>
              									<strong> Country : </strong> <c:out value="${userProfile.homeCountry.name}" /> <br>
              									<strong> Province : </strong> <c:out value="${userProfile.homePro.name}" /> <br>
              									<strong> City : </strong> <c:out value="${userProfile.homeCity.name}" /> <br>  
              									<strong> University : </strong> <c:out value="${userProfile.university.name}" /> <br>             	
       										</div>
       							
       										<c:choose>
    										<c:when test="${showAdd}">
        										<a href="/LinkedForever/homepage.do?flag=addFriend&friendId=${userProfile.id}" class="btn btn-default">Add Friend</a>
    										</c:when>    
    										<c:otherwise>
    											<c:if test="${isfriend}">
        											<div class="alert alert-success">
  													<strong>Already followed !</strong>
													</div>
												</c:if> 
											</c:otherwise>	
										</c:choose>
					
					<div class="clear"></div>
					
				</div>
				
				<!--start footer from here-->
				<div id="footer">Copyright &copy; 2014. Design by <a href="http://www.htmltemplates.net/" target="_blank">HTML Templates</a><br>
						
				<!--DO NOT remove footer link-->
				<!--Template designed by-->
				<a href="http://www.htmltemplates.net/"><img src="images/footnote.gif" class="copyright" alt="www.htmltemplates.net"></a>
				</div>
					
				<!--/. end footer from here-->
			</div>
		</div>
  </body>
</html>
