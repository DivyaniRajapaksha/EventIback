<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>

    <style>
        .bigcon{
            padding: 5%;
            margin-top: 3%;
        } 
        
        .profcard{
          
          margin-top: 10%;
        }

        .logodiv{
         align: center;
         width: 400px;
        }


        .titleup{

  font-size: 45px;
}
        </style>  

  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../assets/img/favicon.png">
  <title>
   Your Profile
  </title>
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
  <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
  <!-- Nucleo Icons -->
  <link href="../assets/css/nucleo-icons.css" rel="stylesheet" />
  <!-- CSS Files -->
  <link href="../assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="../assets/demo/demo.css" rel="stylesheet" />
</head>

<body onload="myFunctionE()">
    <center><div class="logodiv"> <img class="" src="assets/img/logo3.png" alt="..."></div></center>
    <div class="main-panel">
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-absolute navbar-transparent">
        <div class="container-fluid">
           
          <div class="navbar-wrapper">
            
            <div class="navbar-toggle d-inline">
              
            
            </div>
            
            <p class="titleup">User Profile</p>
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
            <span class="navbar-toggler-bar navbar-kebab"></span>
          </button>

          <div class="collapse navbar-collapse" id="navigation">
            <ul class="navbar-nav ml-auto">
             <!-- <li class="search-bar input-group">
                <button class="btn btn-link" id="search-button" data-toggle="modal" data-target="#searchModal"><i class="tim-icons icon-zoom-split" ></i>
                  <span class="d-lg-none d-md-block">Search</span>
                </button>
              </li>-->
              
              <li class="dropdown nav-item">
                <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                  <div class="photo">
                    <img src="../assets/img/anime3.png" alt="Profile Photo">
                  </div>
                  <b class="caret d-none d-lg-block d-xl-block"></b>
                  <p class="d-lg-none">
                    Log out
                  </p>
                </a>
                <ul class="dropdown-menu dropdown-navbar">
           
                  <li class="dropdown-divider"></li>
                  <li class="nav-link"><a href="index.jsp" class="nav-item dropdown-item">Log out</a></li>
                </ul>
              </li>
              <li class="separator d-lg-none"></li>
            </ul>
          </div>
        </div>
      </nav>
     
      <!-- End Navbar -->
      <div class="bigcon">
      <div class="content">
        <div class="row">
          <div class="col-md-8">
            <div class="card">
              <div class="card-header">
                <h5 class="title">Edit Profile</h5>
              </div>
              <div class="card-body">
                <form action="updateCustomer/${cust.nic}">
                  <div class="row">
                    <div class="col-md-5 pr-md-1">
                      <div class="form-group">
                        <label>National Identity Card No</label>
                        <input type="text" class="form-control" readonly placeholder="NIC" name="nic" value=${cust.nic}>
                      </div>
                    </div>
                    <div class="col-md-3 px-md-1">
                      <div class="form-group">
                        <label>Username</label>
                        <input type="text" class="form-control" placeholder="Username"  name="username" value=${cust.username}>
                      </div>
                    </div>
                    
                  </div>
              <div class="row" style=" margin-left: 1px;">
                    <div class="col-md-4 pl-md-1">
                        <div class="form-group">
                          <label for="exampleInputEmail1">Email address</label>
                          <input type="email" class="form-control"  placeholder="mike@email.com" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" value=${cust.email}>
                        </div>
                      </div>
                    <div class="col-md-3 px-md-1">
                        <div class="form-group">
                          <label>Password</label>
                          <input type="password" class="form-control" placeholder="password"  name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" value=${cust.password}>
                        </div>
                      </div>
  				</div>
                  
                  <div class="row">
                    <div class="col-md-6 pr-md-1">
                      <div class="form-group">
                        <label>First Name</label>
                        <input type="text" class="form-control" placeholder="First Name"  name="fName" value=${cust.fName}>
                      </div>
                    </div>
                    <div class="col-md-6 pl-md-1">
                      <div class="form-group">
                        <label>Last Name</label>
                        <input type="text" class="form-control" placeholder="Last Name" name="lName" value=${cust.lName}>
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <div class="form-group">
                        <label>Address</label>
                        <input type="text" class="form-control" placeholder="Home Address" name="address" value=${cust.address}>
                      </div>
                    </div>
                  </div>

                  <div class="row">
                    <div class="col-md-6 pr-md-1">
                      <div class="form-group">
                        <label>Company</label>
                        <input type="text" class="form-control" placeholder="Company Name"  name="company" value=${cust.company}>
                      </div>
                    </div>
                    <div class="col-md-6 pl-md-1">
                      <div class="form-group">
                        <label>Position</label>
                        <input type="text" class="form-control" placeholder="Position or Designation" name="post" value=${cust.post}>
                        <input type="hidden" class="form-control" placeholder="Position or Designation" name="hidden" id="hidden" value="user">
                      </div>
                    </div>
                  </div>
                 
                
              </div>
              <div class="card-footer">
                <button type="submit" class="btn btn-fill btn-primary">Save</button></form>
              </div>
            </div>
          </div>
          
          <div class="col-md-4">
            <div class="profcard">
            <div class="card card-user">
              <div class="card-body">
                <p class="card-text">
                  <div class="author">
                    <div class="block block-one"></div>
                    <div class="block block-two"></div>
                    <div class="block block-three"></div>
                    <div class="block block-four"></div>
                    <a href="javascript:void(0)">
                      <img class="avatar" src="../assets/img/emilyz.jpg" alt="...">
                     
                      <h5 class="title" name="namedesc">${cust.fName} &nbsp ${cust.lName}</h5>
                    </a>
                    <p class="description" name="positionDesc">
                      ${cust.post}
                    </p>
                    <p class="description" name="companyDesc">
                      ${cust.company}
                    </p>
                    <p class="description" name="EmailDesc">
                     ${cust.email}
                    </p>
                    
                  </div>
                </p>
                
            </div>
          </div>
        </div>
      </div>


      </div>
     

      <div class="content">

  <!--Stats-->
         <div class="content">
           <div class="row"  style="margin-left: 20% ;margin-bottom:4%; margin-top:4%;">
              <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="card card-stats">
                  <div class="card-body ">
                    <div class="row">
                      <div class="col-5 col-md-4">
                        <div class="icon-big text-center icon-warning">
                          <i class="nc-icon nc-globe text-warning"></i>
                        </div>
                      </div>
                      <div class="col-7 col-md-8">
                        <div class="numbers">
                          <p class="card-category">Total My Events</p>
                          <p class="card-title" id="demo1">
                            <p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="card-footer ">
                    <hr>
                    <div class="stats">
                      <i class="fa fa-refresh"></i> 
             
                      <br>
          
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="card card-stats">
                  <div class="card-body ">
                    <div class="row">
                      <div class="col-5 col-md-4">
                        <div class="icon-big text-center icon-warning">
                          <i class="nc-icon nc-money-coins text-success"></i>
                        </div>
                      </div>
                      <div class="col-7 col-md-8">
                        <div class="numbers">
                          <p class="card-category">Pending Events </p>
                          <p class="card-title" id="demo2">
                            <p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="card-footer ">
                    <hr>
                    <div class="stats">
                      <i class="fa fa-calendar-o"></i>
                    
                         <br>
                      
                    </div>
                  </div>
                </div>
              </div>
              <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="card card-stats">
                  <div class="card-body ">
                    <div class="row">
                      <div class="col-5 col-md-4">
                        <div class="icon-big text-center icon-warning">
                          <i class="nc-icon nc-vector text-danger"></i>
                        </div>
                      </div>
                      <div class="col-7 col-md-8">
                        <div class="numbers">
                          <p class="card-category" >Confirmed Events</p>
                          <p class="card-title" id="demo3">
                            <p>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="card-footer ">
                    <hr>
                    <div class="stats">
                      <i class="fa fa-clock-o"></i> 
           
                      <br>
               
                    </div>
                  </div>
                </div>
              </div>
             
            </div></div>

        <!--table-->
      	<c:choose>
           <!--Customer Table-->
          
            <div class="content">
                    <div class="row" id="requestTable">
                      <div class="col-md-12">
                        <div class="card" style="display: none;">
                          <div class="card-header" id="hed-t">
                            <h4 class="card-title"> Request Events</h4>
                          </div>
                           <c:when test="${mode=='eventManagement' }">
                          <div class="card-body">
                            <div class="table-responsive">
                              <table class="table tablesorter " >
                                <thead class=" text-primary">
                                  <tr>
                                    <th>
                                      id
                        				</th>
                                    <th>
                                      ename
                                    </th>
                                    <th>
                                      elocation
                                    </th>
                                     <th>
                                     ephoneNo
                                    </th>
                                     <th>
                                     edate
                                    </th>
                                     <th>
                                      etime
                                   	</th>
                                    <th class="text-center">
                                      etype
                                    </th>
                                  </tr>
                                </thead>
                                <tbody id="reqtbl">
                               <!-- c:forEach var="ev" items="${ev }">
                                  <tr>
                                    <td>${ev.id}</td>
                                    <td>${ev.ename}</td>
                                    <td> ${ev.elocation}</td>
                                    <td>${ev.ephoneNo}</td>
                                     <td> ${ev.edate}</td>
                                    <td> ${ev.etime}</td>
                                     <td class="text-center">${ev.etype}</td>
                                       
                                     </tr>
                                   </c:forEach-->
                                       
                                    
                              
                                </tbody>         
                                      
                               </table>
                            </div>
                          </div>
                        </div>
                      </div>
					</c:when>
                      <!--Event Table-->
	</c:choose>       


          <div class="copyright">
            �
            <script>
              document.write(new Date().getFullYear())
            </script> IBACK Entertainment All Rights Reserved 
          </div>
        </div>
      </footer>
    </div>
  </div>
</div>
 
  <!--   Core JS Files   -->
  <script src="../assets/js/core/jquery.min.js"></script>
  <script src="../assets/js/core/popper.min.js"></script>
  <script src="../assets/js/core/bootstrap.min.js"></script>
  <script src="../assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!--  Google Maps Plugin    -->
  <!-- Place this tag in your head or just before your close body tag. -->
  <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
  <!-- Chart JS -->
  <script src="../assets/js/plugins/chartjs.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="../assets/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Black Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="../assets/js/black-dashboard.min.js?v=1.0.0"></script><!-- Black Dashboard DEMO methods, don't include it in your project! -->
  <script src="../assets/demo/demo.js"></script>
  <script>
    $(document).ready(function() {
      $().ready(function() {
        $sidebar = $('.sidebar');
        $navbar = $('.navbar');
        $main_panel = $('.main-panel');

        $full_page = $('.full-page');

        $sidebar_responsive = $('body > .navbar-collapse');
        sidebar_mini_active = true;
        white_color = false;

        window_width = $(window).width();

        fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();



        $('.fixed-plugin a').click(function(event) {
          if ($(this).hasClass('switch-trigger')) {
            if (event.stopPropagation) {
              event.stopPropagation();
            } else if (window.event) {
              window.event.cancelBubble = true;
            }
          }
        });

        $('.fixed-plugin .background-color span').click(function() {
          $(this).siblings().removeClass('active');
          $(this).addClass('active');

          var new_color = $(this).data('color');

          if ($sidebar.length != 0) {
            $sidebar.attr('data', new_color);
          }

          if ($main_panel.length != 0) {
            $main_panel.attr('data', new_color);
          }

          if ($full_page.length != 0) {
            $full_page.attr('filter-color', new_color);
          }

          if ($sidebar_responsive.length != 0) {
            $sidebar_responsive.attr('data', new_color);
          }
        });

        $('.switch-sidebar-mini input').on("switchChange.bootstrapSwitch", function() {
          var $btn = $(this);

          if (sidebar_mini_active == true) {
            $('body').removeClass('sidebar-mini');
            sidebar_mini_active = false;
            blackDashboard.showSidebarMessage('Sidebar mini deactivated...');
          } else {
            $('body').addClass('sidebar-mini');
            sidebar_mini_active = true;
            blackDashboard.showSidebarMessage('Sidebar mini activated...');
          }

          // we simulate the window Resize so the charts will get updated in realtime.
          var simulateWindowResize = setInterval(function() {
            window.dispatchEvent(new Event('resize'));
          }, 180);

          // we stop the simulation of Window Resize after the animations are completed
          setTimeout(function() {
            clearInterval(simulateWindowResize);
          }, 1000);
        });

        $('.switch-change-color input').on("switchChange.bootstrapSwitch", function() {
          var $btn = $(this);

          if (white_color == true) {

            $('body').addClass('change-background');
            setTimeout(function() {
              $('body').removeClass('change-background');
              $('body').removeClass('white-content');
            }, 900);
            white_color = false;
          } else {

            $('body').addClass('change-background');
            setTimeout(function() {
              $('body').removeClass('change-background');
              $('body').addClass('white-content');
            }, 900);

            white_color = true;
          }


        });

        $('.light-badge').click(function() {
          $('body').addClass('white-content');
        });

        $('.dark-badge').click(function() {
          $('body').removeClass('white-content');
        });
      });
    });
    
  </script>
  
  
  <script>

	function myFunctionE(){

		myFunctionS();
		console.log("HIIIIII R");
	 	var tes="test";
  	 	jQuery.ajax({
  	        type: "GET",
  	        url: "http://localhost:8080/selectEventCus/${cust.nic}",
  	        data: { "id": "getStatus" }
  	    }).done(function(msg) {
  	    	showUsers(msg)
  	    });
  	  
  	  
  	
   function showUsers(msg) {    	   
		var trHTML = '';
		$.each(msg, function (i, item) {
		    trHTML += '<tr><td>' + item.id + '</td><td>' + item.ename + '</td><td>' + item.elocation + '</td><td>' + item.ephoneNo +'</td><td>' + item.edate +'</td><td>' + item.etime + '</td><td>' + item.etype +'</td><td><a class="btn btn-primary" href = "/EventDetails/{'+item.ename+'}">View Event</a></td></tr>';
		});
		$("#reqtbl tr").detach();
		$('#reqtbl').append(trHTML);
		$( ".card" ).show();
   }
   
}
	
  </script>
  <script src="https://cdn.trackjs.com/agent/v3/latest/t.js"></script>
  <script>
    window.TrackJS &&
      TrackJS.install({
        token: "ee6fab19c5a04ac1a32a645abde4613a",
        application: "black-dashboard-free"
      });
  </script>
  
  <script>




  
  

  













  function myFunctionS(){
	
   	
   	 var tes="test1";
   	 jQuery.ajax({
   	        type: "GET",
   	        url: "http://localhost:8080/countTotCusEvent",
   	        data: { "id": "getStatus" }
   	    }).done(function(msg) {
   	    	document.getElementById("demo1").innerHTML = msg;
   	    });
   	function showUsers(msg) {    	   
			var trHTML = '';
			$.each(msg, function (i, item) {
			    document.getElementById("demo").innerHTML = "Paragraph changed!";
			});$("#reqtbl tr").detach();
			$('#reqtbl').append(trHTML);
			$( ".card" ).show();
			
			
    }
   	
   	 var tes="test2";
   	 jQuery.ajax({
   	        type: "GET",
   	        url: "http://localhost:8080/countPendCusEvent",
   	        data: { "id": "getStatus" }
   	    }).done(function(msg) {
   	    	document.getElementById("demo2").innerHTML = msg;
   	    });
   	function showUsers(msg) {    	   
			var trHTML = '';
			$.each(msg, function (i, item) {
			    document.getElementById("demo").innerHTML = "Paragraph changed!";
			});$("#reqtbl tr").detach();
			$('#reqtbl').append(trHTML);
			$( ".card" ).show();
			
			
    }
   	
   	var tes="test3";
  	 jQuery.ajax({
  		 
  		 //total customers
  	        type: "GET",
  	        url: "http://localhost:8080/countConCusEvent",
  	        data: { "id": "getStatus" }
  	    }).done(function(msg) {
  	    	document.getElementById("demo3").innerHTML = msg;
  	    });
  	function showUsers(msg) {    	   
			var trHTML = '';
			$.each(msg, function (i, item) {
			    document.getElementById("demo").innerHTML = "Paragraph changed!";
			});$("#reqtbl tr").detach();
			$('#reqtbl').append(trHTML);
			$( ".card" ).show();
			
			
   }
   		
   	  
   	
	}





</script>












  
  </script>
</body>

</html>