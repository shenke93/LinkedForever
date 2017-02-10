<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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
    
    <title>My JSP 'homepage.jsp' starting page</title>
    
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
	<link href=" <c:url value= "/resources/css/style.css" />" rel="stylesheet" type="text/css">
	<link href=" <c:url value= "/resources/css/bootstrap.css" />" rel="stylesheet" type="text/css">
	<link href=" <c:url value= "/resources/css/bootstrap-theme.css" />" rel="stylesheet" type="text/css">
  </head>
  
  <body>
    <div id="wrapper"> 
			<div id="header"> 
				
				<div class="top_banner"> <h1>Welcome to Linked Forever</h1>
					<p>The new social network to keep in touch with your former friends !</p>	
				</div>
				
				<div class="navigation">
					<ul>
						<li><a href="<c:url value="/" />">Home</a></li>
						<li><a href="/LinkedForever/homepage.do?flag=tosearchFriend">Find a friend</a></li>
						<li><a href="<c:url value="/" />">My profile</a></li>
						<li><a href="/LinkedForever/homepage.do?flag=friendList">Friends list</a></li>
						<li><a href="/LinkedForever/login.do?flag=logout">Log Out</a></li>
					</ul>
				</div>
			</div>
			
			<div id="page_content"> 
				<div>
					<div class="common_content">
					</div>
						<div class="listTitle">
      						<h3>Welcome!</h3>
      						
      						<form method="post">
      						<div class="form-group">
      						<input type="hidden" name="latitude">
        					<input type="hidden" name="longitude">
    						<textarea name="message" rows="3" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="What's on your mind ?"></textarea>
   							</div>
  							<button type="submit" class="btn btn-default">Post</button>
							</form>				
      						<br>
      						
      						
      						<div class="panel-group">
        						<c:forEach items="${spittleList}" var="spittle" >
          						
          							<div class="panel panel-warning">
            							</div>
              								<div class="panel-body"><c:out value="${spittle.message}" /></div>
              								<span class="spittleTime"><c:out value="${spittle.time}" /></span>
            							</div>   						
        						</c:forEach>
      						</div>
      				
      						
    					</div>
					
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
