<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Template 2</title>
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
						<li><a href="<c:url value="/" />"> Home</a></li>
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
					<h3>Sign Up</h3>
					<form method="post">
						<div class="form-group">
    						<label for="exampleInputEmail1">Firstname</label>
   							<input name="firstName" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Firstname">
  						</div>
  						<div class="form-group">
    						<label for="exampleInputPassword1">Lastname</label>
    						<input name="lastName" class="form-control" id="exampleInputPassword1" placeholder="Lastname">
  						</div>
  						<div class="form-group">
    						<label for="exampleInputEmail1">Email address</label>
   							<input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Email">
    						<small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  						</div>
   						<div class="form-group">
    						<label for="exampleInputPassword1">Username</label>
    						<input name="username" class="form-control" id="exampleInputPassword1" placeholder="Username">
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
