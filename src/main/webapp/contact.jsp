
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
<head>
<title>Contact</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Events Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, Sony Ericsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Custom Theme files -->
<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
<link href="css/style.css" type="text/css" rel="stylesheet" media="all">  
<link href="css/font-awesome.css" rel="stylesheet">		<!-- font-awesome icons -->
<!-- //Custom Theme files --> 
<!-- js -->
<script src="js/jquery-2.2.3.min.js"></script>  
<!-- //js -->
<!-- web-fonts -->  
<link href="//fonts.googleapis.com/css?family=Josefin+Sans:300,400,600,700" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
<!-- //web-fonts -->
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">  
	<!-- banner -->
	<div class="w3ls-banner-1"> 
		<!-- banner-text --> 
	
	<!-- //banner --> 
			<!-- header -->
				
				    <%
	          String link,linkdash="index.jsp",visi="block",visil="block",visij="bloack",lo="none";
	          
	          if(session.getAttribute( "nic" )==null){
	        	  
	        	  
	        	  visil="block";
	        	  lo="none";
	        	  
	        	  
	          
	          }
	          
	          else{
	        	  
	        	  visil="none";
	        	  lo="block";
	        	  
	          }
	          %>
	          
	          
			<div class="header-w3layouts"> 
				<!-- Navigation -->
				<nav class="navbar navbar-default navbar-fixed-top">
					<div class="container">
						<div class="navbar-header page-scroll">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
								<span class="sr-only">Events</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
							<a href="index.jsp"><div class="logodiv" style="width: 50px"> <img class="" src="assets/img/logo3.png" alt="..." style="width: 350px"></div></a>
						</div> 
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse navbar-ex1-collapse" style="margin-top: 2%; margin-right: -30%;" >
							<ul class="nav navbar-nav navbar-right">
								<!-- Hidden li included to remove active class from about link when scrolled up past about section -->
								<li class="hidden"><a class="page-scroll" href="#page-top"></a>	</li>
								<li><a class="hvr-sweep-to-right" href="index.jsp">Home</a></li>
								<li><a class="hvr-sweep-to-right" href="about.jsp">About</a></li>
								
								<li><a class="hvr-sweep-to-right" href="gallery.jsp">Gallery</a></li>
								<li><a class="hvr-sweep-to-right" href="contact.jsp">Contact</a></li>
								<li><a class="hvr-sweep-to-right" href="login.html" style="display:<%=visil %>;">Login</a></li>
								<li><a class="hvr-sweep-to-right" href="Customer SignUp.html" style="display:<%=visil %>;">Sign Up</a></li>
								<li><a class="hvr-sweep-to-right" style="display:<%=lo %>;" href="customerProfile/<%=session.getAttribute( "nic" )%>"><%=session.getAttribute( "username" )%> 's Profile</a></li>
								<li><a class="hvr-sweep-to-right" href="logout" style="display:<%=lo %>;">Log Out</a></li>
								
							</ul>
						</div>
						<!-- /.navbar-collapse -->
					</div>
					<!-- /.container -->
				</nav>  
			</div>	
		<!-- //header -->
	</div>	
<!-- contact -->	
	<div class="w3ls_address_mail_footer_grids">
	<div class="container">
	<h2 class="heading-agileinfo">Contact<span></span></h2>
		<div class="map">
			<iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3539.812628729253!2d153.014155!3d-27.4750921!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x6b915a0835840a2f%3A0xdd5e3f5c208dc0e1!2sMelbourne+St%2C+South+Brisbane+QLD+4101%2C+Australia!5e0!3m2!1sen!2sin!4v1492257477691"></iframe>
		</div>
		<div class="col-md-6 contact-form">
				<h4 class="white-w3ls">Contact Form</h4>
				<form action="#" method="post">
					<div class="styled-input agile-styled-input-top">
						<input type="text" name="Name" required="">
						<label>Name</label>
						<span></span>
					</div>
					<div class="styled-input">
						<input type="email" name="Email" required=""> 
						<label>Email</label>
						<span></span>
					</div> 
					<div class="styled-input">
						<input type="text" name="Subject" required="">
						<label>Subject</label>
						<span></span>
					</div>
					<div class="styled-input">
						<textarea name="Message" required=""></textarea>
						<label>Message</label>
						<span></span>
					</div>	 
					<input type="submit" value="SEND">
				</form>
			</div>
			<div class="col-md-6 contactright">
				
				<div class="w3ls_footer_grid_left">
					<div class="wthree_footer_grid_left">
						<i class="fa fa-phone" aria-hidden="true"></i>
					</div>
					<p>076 56 52 530 <span>011 28 57 539</span></p>
				</div>
				<div class="w3ls_footer_grid_left">
					<div class="wthree_footer_grid_left">
						<i class="fa fa-envelope-o" aria-hidden="true"></i>
					</div>
					<p><a href="mailto:info@example.com">ibackevents@gmail.com</a> 
						<span><a href="mailto:info@example.com">ibackstd@gmail.com</a></span></p>
				</div>
			</div>
			<div class="clearfix"> </div>
	</div>
</div>
<!-- //contact -->	
<!-- footer-top -->	
	<div class="footer-top">
		<div class="container">
			<div class="col-md-3 foot-left">
				<h3>About Us</h3>
			
				<p>

Best Service for the Best Price.

We have many bearable packages which can be easily customize according to your requirements.<bt>

Event Planning and Management.<br>
Graphic Designing and online Publishing.<br>
Online Solutions and Web designing.<br>
Event Photography and Videography.<br>

</p>
			</div>
			<div class="col-md-3 foot-left">
					<h3>Get In Touch</h3>
					<p> </p>
				
						
						<div class="contact-btm">
							<span class="glyphicon glyphicon-earphone" aria-hidden="true"></span>
							<p>076 56 52 530</p>
						<div class="contact-btm">
						</div>
							<span class="fa fa-envelope-o" aria-hidden="true"></span>
							<p><a href="mailto:example@email.com">ibackevents@gmail.com</a></p>
						</div>
						<div class="clearfix"></div>

			</div>
			<div class="col-md-3 foot-left">
				<h3>Latest Events</h3>
				<ul>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img src="images/g1.jpg" alt="" class="img-responsive"></a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img src="images/g2.jpg" alt="" class="img-responsive"></a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img src="images/g3.jpg" alt="" class="img-responsive"></a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal"><img src="images/g4.jpg" alt="" class="img-responsive"></a></li>
				</ul>
				<div class="clearfix"></div>
			</div>
			<div class="col-md-3 foot-left">
			<h3>Subscribe</h3>
			<p>Subscribe to receive offers and other notifications</p>
			<form action="#" method="post">	
					<input type="email" Name="Enter Your Email" placeholder="Enter Your Email" required="">
				<input type="submit" value="Subscribe">
			</form>
			</div>
				<div class="clearfix"></div>
		</div>
	</div>
<!-- /footer-top -->							

<!-- footer -->
			<div class="copy-right">
				<div class="container">
				<div class="col-md-6 col-sm-6 col-xs-6 copy-right-grids">
						<div class="copy-left">
						<p>&copy; 2019 IBACK Events. All rights reserved | </p>
						</div>
					</div>
				<div class="col-md-6 col-sm-6 col-xs-6 top-middle">
						<ul>
							<li><a href="https://www.facebook.com/IBACKentertainment/"><i class="fa fa-facebook"></i></a></li>
							
							
							<li><a href="https://www.youtube.com/channel/UCQQt9TkWdmuycS2mFxe-HPQ"><i class="fa fa-youtube"></i></a></li>
						</ul>
					</div>
					<div class="clearfix"></div>
					</div>
			</div>
			
<!-- //footer -->
<!-- bootstrap-modal-pop-up -->
	<div class="modal video-modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					Events
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
				</div>
					<div class="modal-body">
						<img src="images/g8.jpg" alt=" " class="img-responsive" />
						<p>Ut enim ad minima veniam, quis nostrum 
							exercitationem ullam corporis suscipit laboriosam, 
							nisi ut aliquid ex ea commodi consequatur? Quis autem 
							vel eum iure reprehenderit qui in ea voluptate velit 
							esse quam nihil molestiae consequatur, vel illum qui 
							dolorem eum fugiat quo voluptas nulla pariatur.
							<i>" Quis autem vel eum iure reprehenderit qui in ea voluptate velit 
								esse quam nihil molestiae consequatur.</i></p>
					</div>
			</div>
		</div>
	</div>
<!-- //bootstrap-modal-pop-up --> 
<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

<script src="js/jquery-2.2.3.min.js"></script> 
	
<!-- skills -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smoth-scrolling -->
	<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
</body>
</html>