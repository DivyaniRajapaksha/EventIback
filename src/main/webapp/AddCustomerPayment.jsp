<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login V13</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/customerSignUpicons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/CustomerSignuputil.css">
	<link rel="stylesheet" type="text/css" href="css/CustomerSignupmain.css">
<!--===============================================================================================-->

</head>
<body style="background-color: #999999;">
	
	<div class="limiter">
		<div class="container-login100">

<div class="wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50">
				<form class="login100-form validate-form" action="addCustomerPayment">
					<span class="login100-form-title p-b-59">
						Customer Payment
					</span>

					<div class="wrap-input100 validate-input" data-validate="customer Name is required">
						<span class="label-input100">Customer Name</span>
						<input class="input100" type="text" name="customerName" value=${event.customerName }>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input" data-validate="event Name is required">
						<span class="label-input100">Event Name</span>
						<input class="input100" type="text" name="eventName" value=${event.eventName }>
						<span class="focus-input100"></span>
					</div>

					<!-- <div class="wrap-input100 validate-input" data-validate = " Price is required">
						<span class="label-input100"> Price</span>
						<input class="input100" type="text" name="customerPrice" value=${event.customerPrice }>
						<span class="focus-input100"></span>
					</div> -->

					<!--  <div class="wrap-input100 validate-input" data-validate="payment Type is required">
					    <span class="label-input100"> Payment Type</span>
					    
						    
				      <select>
                         <option value="cash">Cash</option>
                         <option value="paypal">Pay Pal</option>
                         <option value="visa">Visa</option>
                         <option value="master">Master</option>
                         <option value="american express">American Express</option>
                         
                      </select>
                      
						
						<span class="focus-input100"></span>
					</div>-->
					
					
                    

                     <lable class="label-input100" id="div1">Payment Type</lable>
					<select >
                         <option value="cash">Cash</option>
                         <option value="paypal">Pay Pal</option>
                         <option value="visa">Visa</option>
                         <option value="master">Master</option>
                         <option value="american express">American Express</option>
                         
                      </select>
                      <br><br>

					<div class="wrap-input100 validate-input" data-validate = " Discount is required">
						<span class="label-input100">Discount</span>
						<input class="input100" type="text" id="custerDiscount" name="customerDiscount" value=${event.customerDiscount }>
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = " Total Price is required">
						<span class="label-input100">Total Price</span>
						<input class="input100" type="text" id="custerTotalPrice" name="customerTotalPrice" value=${event.customerPrice }>
						<span class="focus-input100"></span>
					</div>

					
					






					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn"><a href="paymentDashboard">Back to dashboard</a>
								
							</button>
						</div>


					</div>
				</form>
			</div>
			
			
							<div class="login100-more" style="background-image: url('images/payment.png11111111111111111111111111111.png');">
			<div class="logoIBACK" style="background-image: url('images/payment.png11111111111111111111111111111ibackeventslogopngwhite.png');">
			
			
			
			</div>
			
			</div>
			
		</div>
	</div>
<!-- yyy -->	
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/CustomerSignupmain.js"></script>

<!-- 	<script>
	var password = document.getElementById("password")
		, confirm_password = document.getElementById("confirm_password");
	  
	  function validatePassword(){
		if(password.value != confirm_password.value) {
		  confirm_password.setCustomValidity("Passwords Don't Match");
		} else {
		  confirm_password.setCustomValidity('');
		}
	  }
	  
	  password.onchange = validatePassword;
	  confirm_password.onkeyup = validatePassword;</script> -->

</body>
</html>



