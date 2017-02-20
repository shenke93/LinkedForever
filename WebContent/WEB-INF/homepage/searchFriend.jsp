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
				
				<div class="col-md-6"> 
					
					<div class="col_1">
						<form action="/LinkedForever/homepage.do?flag=searchFriend" method="post">
							<h4>Are you looking for :</h4>
							<div class="box">
								<div class="form-group">
    								<label for="exampleInputEmail1"></label>
   									<input name="friendname" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Find Your Friend ,">
  								</div>
							</div>
							<button type="submit" class="btn btn-default">Done</button>
						</form>
					</div>
				</div>
				
				<div class="col-md-6">
					<div class="common_content">
					</div>
						<div class="listTitle">
      						<h3>Results</h3>
      						<div class="panel-group">
      						<div class="panel panel-warning">
      							<c:if test="${friendInfo == null}">
      								Can not find this person !
      							</c:if>
        						<c:forEach items="${friendInfo}" var="spittle" >
          		
            							<div class="panel-heading" style="color:orange;"><strong><a href="/LinkedForever/homepage.do?flag=Friendprofile&friendId=${spittle.id}"><c:out value="${spittle.name}" /></a></strong>
										</div>
           				 				<div class="panel-body">
              								Country : <c:out value="${spittle.homeCountry.name}" /> <br>Province : <c:out value="${spittle.homePro.name}" /> <br>City : <c:out value="${spittle.homeCity.name}" />        	
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
