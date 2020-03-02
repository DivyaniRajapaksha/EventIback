
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
<head>
<title>About</title>
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
<!-- about -->
<!-- about -->
	<div class="about">
		<div class="container">
		<h2 class="heading-agileinfo">About Us<span>Who We Are</span></h2>
			<div class="about-grids-1">
				<div class="col-md-5 wthree-about-left">
					<div class="wthree-about-left-info">
						<img src="images/g11.jpg" alt="" />
					</div>
				</div>
				<div class="col-md-7 agileits-about-right">
					<h5>IBACK Evets is a company which is operated by the IBACK Entertainment. IBACK Entertainment is a renowned company provide all Events needs for the best price with the best Quality</h5>
					<p>Weare capable to full fill your all event needs. Our Partners are well recognized by most of the customers as the better service provides by them.
					<span>Join with us to Make your event un-forgettable. We will create your event while you will celebrate. </span>
					</p>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!-- //about -->
	<!-- offers -->
	<div class="offers">
		<div class="container">
			
			<h3 class="heading-agileinfo white-w3ls">Our Services<span class="black-w3ls">We offer Best Services for you</span></h3>
			<div class="offers-grids">
				<div class="col-md-6 wthree-offers-left">
					<div class="offers-left-heading">
						<h4>Providing the Best Service to You is Our Happiness</h4>
					</div>
					<div class="offers-left-grids">
						<div class="offers-number">
							<p>1</p>
						</div>
						<div class="offers-text">
							<p>Easy Onilne Event Booking System<br> IBACK Events provides you with a online Event booking system which easily customizable to your requirements.</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="offers-left-grids offers-left-middle">
						<div class="offers-number">
							<p>2</p>
						</div>
						<div class="offers-text">
							<p>24/7 Customer Care Service<br> We are always here to help you with all event solutions 24/7.</p>
						</div>
						<div class="clearfix"> </div>
					</div>
					<div class="offers-left-grids">
						<div class="offers-number">
							<p>3</p>
						</div>
						<div class="offers-text">
							<p>Easy Payment Methods<br> You Don't need to worry about payments. It is very easy and flexible. We accept all kind of payment methods to make it much easier for you. </p>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
				<div class="col-md-6 wthree-offers-right">
					<h5>Here Are Main Services provides to fullfill your Event Needs</h5>
					<p></p>
					<ul>
						<li><a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right" aria-hidden="true"></i> Event Managament</a></li>
						<li><a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right" aria-hidden="true"></i> Event Coverage </a></li>
						<li><a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right" aria-hidden="true"></i> Graphic Designing</a></li>
						<li><a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right" aria-hidden="true"></i> Advertising</a></li>
						<li><a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right" aria-hidden="true"></i> Web Solutions</a></li>
						<li><a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right" aria-hidden="true"></i> Decorations</a></li>
						<li><a href="#" data-toggle="modal" data-target="#myModal"><i class="fa fa-angle-right" aria-hidden="true"></i> LightAnd Sound Solutions</a></li>
					</ul>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
	<!-- offers -->
		<!-- about-team -->
	<!--<div class="team">		
		<div class="container">
			<h3 class="heading-agileinfo">Our Team<span>Events is a professionally managed Event</span></h3>			
			<div class="team-row-agileinfo">
				<div class="col-md-3 col-xs-6 team-grids">
					<div class="thumbnail team-agileits">
						<img src="images/t2.jpg" class="img-responsive" alt=""/>
						<div class="w3agile-caption ">
							<h4>Vaura Tegsner</h4>
							<p>Lorem</p>
							<div class="social-icon social-w3lsicon">
								<a href="#" class="social-button twit"><i class="fa fa-twitter"></i></a>
								<a href="#" class="social-button fb"><i class="fa fa-facebook"></i></a> 
								<a href="#" class="social-button in"><i class="fa fa-linkedin"></i></a>  
							</div>	
						</div> 
					</div>
				</div>
				<div class="col-md-3 col-xs-6 team-grids">
					<div class="thumbnail team-agileits">
						<img src="images/t1.jpg" class="img-responsive" alt=""/>
						<div class="w3agile-caption">
							<h4>Jark Kohnson</h4>
							<p>Lorem</p>
							<div class="social-icon social-w3lsicon">
								<a href="#" class="social-button twit"><i class="fa fa-twitter"></i></a>
								<a href="#" class="social-button fb"><i class="fa fa-facebook"></i></a> 
								<a href="#" class="social-button in"><i class="fa fa-linkedin"></i></a>  
							</div>	
						</div> 
					</div>
				</div>
				<div class="col-md-3 col-xs-6 team-grids">
					<div class="thumbnail team-agileits">
						<img src="images/t3.jpg" class="img-responsive" alt=""/>
						<div class="w3agile-caption">
							<h4>Chunk Erson</h4>
							<p>Lorem</p>				
							<div class="social-icon social-w3lsicon">
								<a href="#" class="social-button twit"><i class="fa fa-twitter"></i></a>
								<a href="#" class="social-button fb"><i class="fa fa-facebook"></i></a> 
								<a href="#" class="social-button in"><i class="fa fa-linkedin"></i></a>  
							</div>	
						</div> 
					</div>
				</div>
				<div class="col-md-3 col-xs-6 team-grids">
					<div class="thumbnail team-agileits">
						<img src="images/t4.jpg" class="img-responsive" alt=""/>
						<div class="w3agile-caption">
							<h4>Goes Mehak</h4>
							<p>Lorem</p>						
							<div class="social-icon social-w3lsicon">
								<a href="#" class="social-button twit"><i class="fa fa-twitter"></i></a>
								<a href="#" class="social-button fb"><i class="fa fa-facebook"></i></a> 
								<a href="#" class="social-button in"><i class="fa fa-linkedin"></i></a>  
							</div>	
						</div> 
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>-->
	<!-- //about-team -->
<!-- about -->
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