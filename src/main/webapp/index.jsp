
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en" >
<head>


		
	<style>
		
		li
{
display: inline;
list-style-type: none;
padding-right: 20px;
}
		
		</style>
<title>IBACK EVENTS</title>
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
<!--<link href="assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />-->
<script src="assets\js\core\bootstrap.min.js"></script>
<script src="assets\js\jquery.min.js"></script>
</head>


<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top" style="background-color: #232b2b">  
		<!-- banner -->
		<div id="home" class="w3ls-banner"> 
	
			<!-- banner-text -->
			<div class="slider">
				<div class="callbacks_container">
					<ul class="rslides callbacks callbacks1" id="slider4">
						<li>
							<div class="w3layouts-banner-top">
	
								<div class="container">
									<div class="agileits-banner-info">
										<h3>We Create  <span>Amazazing Graphics</span></h3>
													<p>IBACK Events provides its customers with the best Eye catching contents which are created by Professionals</p>
										<div class="agileits_w3layouts_more menu__item">
												<input class="btn btn-danger" type="button" value="Book Your Event Now" id="booknow1">
												<input class="btn btn-warning" type="button" value="Sign In" id="sign2" onclick="location.href = 'Customer SignUp.html';">
				</div>
									</div>	
								</div>
							</div>
						</li>
						<li>
							<div class="w3layouts-banner-top w3layouts-banner-top1">
								<div class="container">
									<div class="agileits-banner-info">
										<h3>We Celebrate  <span>Your Parties</span></h3>
											<p>Why worry? We will make your event the best</p>
										<div class="agileits_w3layouts_more menu__item">
												<input class="btn btn-danger" type="button" value="Book Your Event Now" id="booknow2">
												<input class="btn btn-warning" type="button" value="Sign In" id="sign2" onclick="location.href = 'Customer SignUp.html';">
				</div>
									</div>	
								</div>
							</div>
						</li>
						<li>
							<div class="w3layouts-banner-top w3layouts-banner-top2">
								<div class="container">
									<div class="agileits-banner-info">
									<h3>We Capture  <span>Every Memories</span></h3>
											<p>We do not let you to miss even a single moment.</p>
										<div class="agileits_w3layouts_more menu__item">
												<input class="btn btn-danger" type="button" value="Book Your Event Now" id="booknow3">
												<input class="btn btn-warning" type="button" value="Sign In" id="sign2" onclick="location.href = 'Customer SignUp.html';">
									</div>
									
								</div>
							</div>
						</li>
					</ul>
				</div>
				<div class="clearfix"> </div>
				
				<!--banner Slider starts Here-->
			</div>
			   
	      
	 
		</div>	
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
		<!-- ser_agile -->
		<div class="ser_agile">
			<div class="container">
			<h2 class="heading-agileinfo">Welcome<span style="color: #FF73B9;  font-family: SFMono-Regular, Menlo, Monaco, Consolas">Events is a professionally managed Event</span></h2>
			<p style="color: #FF73B9;  font-family: SFMono-Regular, Menlo, Monaco, Consolas">Masagni dolores eoquie int Basmodi temporant, ut laboreas dolore magnam aliquam kuytase uaeraquis autem vel eum iure reprehend.Unicmquam eius, Basmodi temurer sehsMunim.Masagni dolores eoquie int Basmodi temporant, ut laboreas dolore magnam aliquam kuytase uaeraquis autem vel eum iure reprehend.</p>
			<div class="ser_w3l">  
			  <div class="outer-wrapper">
				<div class="inner-wrapper">
				  <div class="icon-wrapper">
					<i class="fa fa-birthday-cake" aria-hidden="true"></i>
				  </div>
				  <div class="content-wrapper">
					<h4>Graphic designing</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugiat, magni.</p>
				  </div>
				</div>
			  </div>
			  <div class="outer-wrapper">
				<div class="inner-wrapper">
				  <div class="icon-wrapper">
					<i class="fa fa-headphones" aria-hidden="true"></i>
				  </div>
				  <div class="content-wrapper">
					<h4>Audiography</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugiat, magni.</p>
				  </div>
				</div>
			  </div>
			  <div class="outer-wrapper">
				<div class="inner-wrapper">
				  <div class="icon-wrapper">
					<i class="fa fa-globe" aria-hidden="true"></i>
				  </div>
				  <div class="content-wrapper">
					<h4>Decorations</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugiat, magni.</p>
				  </div>
				</div>
			  </div>
			  <div class="outer-wrapper">
				<div class="inner-wrapper">
				  <div class="icon-wrapper">
					<i class="fa fa-camera" aria-hidden="true"></i>
				  </div>
				  <div class="content-wrapper">
					<h4>Photography</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugiat, magni.</p>
				  </div>
				</div>
			  </div>
			  <div class="outer-wrapper">
				<div class="inner-wrapper">
				  <div class="icon-wrapper">
					<i class="fa fa-cutlery" aria-hidden="true"></i>
				  </div>
				  <div class="content-wrapper">
					<h4>Catering</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugiat, magni.</p>
				  </div>
				</div>
			  </div>
			  <div class="outer-wrapper">
				<div class="inner-wrapper">
				  <div class="icon-wrapper">
					<i class="fa fa-tasks" aria-hidden="true"></i>
				  </div>
				  <div class="content-wrapper">
					<h4>Promotions</h4>
					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugiat, magni.</p>
				  </div>
				</div>
			  </div>
			  <div class="clearfix"></div>
			  </div>
			</div>
		</div>
	<!-- //ser_agile -->
<!-- Stats -->
	<div class="stats-agileits">
	<div class="container">
		<h3 class="heading-agileinfo white-w3ls">We Have Something To Be Proud Of<span  style="color: #FF73B9;  font-family: SFMono-Regular, Menlo, Monaco, Consolas">Our Achievements</span></h3>
	</div>
		<div class="stats-info agileits w3layouts">
		<div class="container">
			<div class="col-md-4 col-sm-4agileits w3layouts stats-grid stats-grid-1">
				<i class="fa fa-users" aria-hidden="true"></i>
				<div class="numscroller agileits-w3layouts" data-slno='1' data-min='0' data-max='250' data-delay='3' data-increment="2">25</div>
				<div class="stat-info-w3ls">
					<h4 class="agileits w3layouts">Happy Clients</h4>
				</div>
			</div>
			<div class="col-md-4 col-sm-4 agileits w3layouts stats-grid stats-grid-2">
				<i class="fa fa-lightbulb-o" aria-hidden="true"></i>
				<div class="numscroller agileits-w3layouts" data-slno='1' data-min='0' data-max='100' data-delay='3' data-increment="2">10</div>
				<div class="stat-info-w3ls">
					<h4 class="agileits w3layouts">Events</h4>
				</div>
			</div>
			<div class="col-md-4 col-sm-4 stats-grid agileits w3layouts stats-grid-3">
			<i class="fa fa-cog" aria-hidden="true"></i>
				<div class="numscroller agileits-w3layouts" data-slno='1' data-min='0' data-max='342' data-delay='3' data-increment="2">34</div>
				<div class="stat-info-w3ls">
					<h4 class="agileits w3layouts">Services</h4>
				</div>
			</div>
			<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //Stats -->
	
	<!-- showcase_w3layouts -->	
	<div class="showcase_w3layouts">
		<div class="container">
		<h3 class="heading-agileinfo">Services<span style="color: #FF73B9;  font-family: SFMono-Regular, Menlo, Monaco, Consolas"> Our Services</span></h3>
			<div class="our_agile-info">
			<div class="showcase">
				<div class="thumbnail thumbnail--awesome">
					<div class="thumbnail__overlay">
						
					</div>
				</div>
				<div class="desc">
				
					<h4>Birthday</h4>
					<p>
					</p>
				</div>
			</div>
			
			<div class="showcase showcase--inverted">
				<div class="desc">
					
					<h4>Conference</h4>
					<p>
					</p>
				</div>
				<div class="thumbnail thumbnail--awesome1">
					<div class="thumbnail__overlay">
						
					</div>
				</div>
			</div>
			<div class="showcase">
				<div class="thumbnail thumbnail--awesome2">
					<div class="thumbnail__overlay">
						
					</div>
				</div>
				<div class="desc">
				
					<h4>Meetups</h4>
					<p>
					</p>
				</div>
			</div>
			<div class="showcase showcase--inverted">
				<div class="desc">
					
					<h4>Musical Show</h4>
					<p>
					</p>
				</div>
				<div class="thumbnail thumbnail--awesome3">
					<div class="thumbnail__overlay">
					
					</div>
				</div>
			</div>
			<div class="clearfix"></div>
			</div>
		</div>
	</div>
<!-- //showcase_w3layouts -->	
<section class="about_agile">
		<div class="container">	
					<h3 class="heading-agileinfo white-w3ls" id="ebook">Event Booking<span class="black-w3ls" style="color: #FF73B9;  font-family: SFMono-Regular, Menlo, Monaco, Consolas">Book Your Event Now</span></h3>
			<div class="about-grids">
				
				<div class="abt-rt-grid">
					<div class="w3ls-grid-head text-center">
						<h3>online event booking </h3>
					</div>
					<div class="abt-form text-center">
						<form action="addEvent">
							<div class="col-sm-4 col-xs-4 w3ls-lt-form">
								<div class="w3ls-pr">
								<input type="text" placeholder="Name" name=ename>
									<select class="sel"  name=etype>
										<option value="Indoor Musical Show">Indoor Musical Show</option>
										<option value="Formal Parties">Formal Parties</option>
										<option value="Birthday Parties">Birthday Parties</option>
										<option value="MeetUps">MeetUps</option>
										<option value="Outdoor Musical Show">Outdoor Musical Show</option>
										<option value="Conference">Conference</option>
										<option value="DJ parties">DJ parties</option>
									</select>
									
								</div>
							</div>
							<div class="col-sm-4 col-xs-4 w3ls-lt-form">
								<div class="w3ls-pr">
									<input type="tel" name=ephoneNo placeholder="Phone no" required="required">
									<input type="date" id="date" name=edate required="required" placeholder="Select Date" onchange="checkDate()">
									
								</div>
							</div>
							<div class="col-sm-4 col-xs-4 w3ls-lt-form">
								<div class="w3ls-pr">
									<input type="text" name=elocation placeholder="Location" required="required" >
									<input type="text" name=etime required="required"  placeholder=" starting time">
									<input type="hidden" id="hidden" name=cusId value="<%=session.getAttribute( "nic" )%>" >
									
								</div>
							</div>
							<div class="clearfix"></div>
							<input type="submit" value="Book Now" >

						</form>
						</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--testimonials-->
<div class="testimonials">
	<div class="container">
		<h3 class="heading-agileinfo">What People Say<span style="color: #FF73B9;  font-family: SFMono-Regular, Menlo, Monaco, Consolas">IBACK Events recieves hundreads of Positive feedbacks</span></h3>
		<div class="flex-slider">
			<ul id="flexiselDemo1">			
				<li>
					<div class="laptop">
						<div class="col-md-8 team-right">
							<p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur,
								adipisci velit, sed quia non numquam.</p>
							<div class="name-w3ls">
								<h5>Federer</h5>
								<span>lorem ipsum</span>
							</div>
						</div>
						<div class="col-md-4 team-left">
							<img class="img-responsive" src="images/t1.jpg" alt=" " />
						</div>
						<div class="clearfix"></div>
					</div>
				</li>
				<li>
					<div class="laptop">
						<div class="col-md-8 team-right">
							<p>Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur,
								adipisci velit, sed quia non numquam.</p>
							<div class="name-w3ls">
								<h5>Thompson</h5>
								<span>lorem ipsum</span>
							</div>
						</div>
						<div class="col-md-4 team-left">
							<img class="img-responsive" src="images/t2.jpg" alt=" " />
						</div>
						<div class="clearfix"></div>
					</div>
				</li>
			</ul>
			
		</div>

	</div>
</div>


       

       







<!--//testimonials-->

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
			<br><br><br>
			<a class="hvr-sweep-to-right" href="Supplier Registeration.html" style="display:<%=visil %>;">Register As Supplier</a>
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

						<script src="js/responsiveslides.min.js"></script>
			<script>
						// You can also use "$(window).load(function() {"
						$(function () {
						  // Slideshow 4
						  $("#slider4").responsiveSlides({
							auto: true,
							pager:true,
							nav:false,
							speed: 500,
							namespace: "callbacks",
							before: function () {
							  $('.events').append("<li>before event fired.</li>");
							},
							after: function () {
							  $('.events').append("<li>after event fired.</li>");
							}
						  });
					
						});
			</script>
			<script>
								// You can also use "$(window).load(function() {"
								$(function () {
								  // Slideshow 4
								  $("#slider3").responsiveSlides({
									auto: true,
									pager:false,
									nav:true,
									speed: 500,
									namespace: "callbacks",
									before: function () {
									  $('.events').append("<li>before event fired.</li>");
									},
									after: function () {
									  $('.events').append("<li>after event fired.</li>");
									}
								  });
							
								});
							 </script>

<!-- start-smoth-scrolling -->
<!-- OnScroll-Number-Increase-JavaScript -->
	<script type="text/javascript" src="js/numscroller-1.0.js"></script>
<!-- //OnScroll-Number-Increase-JavaScript -->
<!--flexiselDemo1 -->
 <script type="text/javascript">
							$(window).load(function() {
								$("#flexiselDemo1").flexisel({
									visibleItems: 2,
									animationSpeed: 1000,
									autoPlay: true,
									autoPlaySpeed: 3000,    		
									pauseOnHover: true,
									enableResponsiveBreakpoints: true,
									responsiveBreakpoints: { 
										portrait: { 
											changePoint:480,
											visibleItems: 1
										}, 
										landscape: { 
											changePoint:640,
											visibleItems: 1
										},
										tablet: { 
											changePoint:991,
											visibleItems: 1
										}
									}
								});
								
							});
			</script>
			<script type="text/javascript" src="js/jquery.flexisel.js"></script>
<!--//flexiselDemo1 -->

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

<script>
$("#booknow1").click(function() {
    $('html, body').animate({
        scrollTop: $("#ebook").offset().top
	}, 2000);
	
	
});

$("#booknow2").click(function() {
    $('html, body').animate({
        scrollTop: $("#ebook").offset().top
	}, 2000);
	
	
});

$("#booknow3").click(function() {
    $('html, body').animate({
        scrollTop: $("#ebook").offset().top
	}, 2000);
	
	
});


</script>
<script type="text/javascript">
function checkDate(){
    var idate = $('#date').val();
    	var today = new Date();
    	var date = today.get+'.'+(today.getMonth()+1)+'.'+today.getDate();

    	var today = new Date();
    	var dd = String(today.getDate()).padStart(2, '0');
    	var mm = String(today.getMonth() + 1).padStart(2, '0'); //January is 0!
    	var yyyy = today.getFullYear();

    	today = mm + '-' + dd + '-' + yyyy;
    	today =dd+'/'+mm+'/'+yyyy;
    	//alert(today);
    	var date = new Date(idate);
    	//alert(date);
		var month = date.getMonth();
		var day = date.getDate();
		var year = date.getFullYear();

		idate=day+'/'+month+'/'+year;
		
    	var d2   = new Date(today).getTime();
        var d3   = new Date(idate).getTime();
        
        if(d2>=d3){
            alert('Please enter valid date');
            $("#date").val('');
        	return false;
        }
        	
    
}


    

</script>





</body>
</html>