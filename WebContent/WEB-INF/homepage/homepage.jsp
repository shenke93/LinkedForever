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
				<div>
					<div class="common_content">
					</div>
					
						<div class="listTitle">
							
      						<h3>Welcome ${userInfo.name}</h3>
      						
      						<form action="/LinkedForever/homepage.do?flag=post" method="post">
  							<div class="form-group">
    						<label for="exampleInputEmail1">Create a post</label></br>
    						
    						<c:if test="${errInfo}">
       						<small id="emailHelp" class="form-text text-muted">Attention : This post appears to be blank. Please write something !</small>
       						</c:if> 
    						
    						<textarea name="content_post" rows="3" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="What's on your mind ?"></textarea>
   							</div>
  							<button type="submit" class="btn btn-default">Post</button>
							</form>				
      						<br>
      						
      						<div class="panel-group">
        						<c:forEach items="${showPosts}" var="spittle" >
          						
          							<div class="panel panel-warning">
            							<div class="panel-heading" style="color:orange;"><strong><c:out value="${spittle.student.name}" /></strong>
            							</div>
           				 				<div>
              								<div class="panel-body"><c:out value="${spittle.content}" /></div>
              								
              								<form action="/LinkedForever/homepage.do?flag=comment&postId=${spittle.id}" method="post">
              									<a href="/LinkedForever/homepage.do?flag=like&postId=${spittle.id}" class="btn btn-success" style="color:white;">like <c:out value="${spittle.numLike}" />
              									</a> 
              									<a href="/LinkedForever/homepage.do?flag=hate&postId=${spittle.id}" class="btn btn-danger" style="color:white;">hate <c:out value="${spittle.numHate}" />
              									</a>
              									<button type="submit" class="btn btn-info" style="color:white;">comment</button>
              									
              									
              									<c:forEach items="${spittle.comments}" var="spittle1" >
              									<div class="panel panel-warning">
              										<div class="panel-body"><c:out value="${spittle1.student.name}" /> : <c:out value="${spittle1.content}" /></div>
              									</div>
              									</c:forEach>
              									     									
              									<textarea name="content_comment" rows="1" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Write a comment ......"></textarea>
              									<c:if test="${commenterr}">
              										<c:if test="${postnum == spittle.id}">
       													<small id="emailHelp" class="form-text text-muted">Attention : This comment appears to be blank. Please write something !</small>
       												</c:if> 
       											</c:if> 
              								</form>
            							</div>
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
