<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome</h1>
<div>
	
	<button id="request"  >Show table</button>
	   <table id="request_table">
            <tr>
               <th>EID</th>
               <th>Event Name</th>
               <th>Event Location</th>
               <th>Event Type</th>
               <th>PhoneNo</th>
               <th>Event Date</th>
               <th>EID</th>
               </tr>
        </table>
</div>	
	
	</form>
		
</body>
</html>
 <script src="../assets/js/core/jquery.min.js"></script>
<script>

$("#request").on('click', function(){
	
	console.log("FFFFFFFFFFFF");
   /* var username = $("#username").val();
    var password = $("#password").val();
    if(username == ""){
        $('#messageDiv').css("display","none");
        alert("Username is required");
        return;
    }
    if(password == ""){
        $('#messageDiv').css("display","none");
        alert("Password is required");
        return;
    }*/

   $.ajax({
        url : "/selectRequestEvents",
        method :"get",
        data : {
           /* username : username,
            password : password*/
        },
       success : function(results){
           console.log("HHHHH");
            if(results != null && results != ""){
                showMessage(results);
            	var event_results=' ';
            	$.each(results,function(key,value){
            		
            		event_results += '<tr>';
            		event_results += '<td>'+value.id+'</td>';
            		event_results += '<td>'+value.elocation+'</td>';
            		event_results += '<td>'+value.etype+'</td>';
            		event_results += '<td>'+value.ephoneNo+'</td>';
            		event_results += '<td>'+value.edate+'</td>';
            		event_results += '<td>'+value.etime+'</td>';
            		event_results += '</tr>';
            	});
            	$('#request_table').append(event_results);
            		
            		
            	
                $('#messageDiv').css("display","block");
            }else{
                $('#messageDiv').css("display","none");
                $('#messageDiv').html("");
                alert("Some exception occurred! Please try again.");
            }
        
    }

   });
});
	

</script>