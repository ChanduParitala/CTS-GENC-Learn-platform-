<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.sql.*, com.hit.utility.DBUtil, javax.servlet.annotation.WebServlet" errorPage="errorpage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <link rel="shortcut icon" type="image/png" href="images/Banner_Hit.png">
    <!--link rel="shortcut icon" type="image/ico" href="images/hit_fevicon.ico"-->
	
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tender Management System</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/annimate.css">
    <link href="css/font-awesome.min.css" type="text/css" rel="stylesheet">
    <link href="css/SpryTabbedPanels.css" type="text/css" rel="stylesheet">
    <!--link rel="stylesheet" href="css/styles.css"-->
    <link href="https://fonts.googleapis.com/css?family=Black+Ops+One" rel="stylesheet">
    <link href="css/bootstrap-dropdownhover.min.css">
    <link rel="stylesheet" href="css/style2.css">
  </head>
<body>

	<%
		String user = (String)session.getAttribute("user");
		String uname = (String)session.getAttribute("username");
		String pword = (String)session.getAttribute("password");
		
		if(!user.equalsIgnoreCase("admin") || uname.equals("") || pword.equals("")){
			
			response.sendRedirect("loginFailed.jsp");
			
		}
	
	%>


	<!-- Including the header of the page  -->
	
	<jsp:include page="header.jsp"></jsp:include>
	
	<jsp:include page="adminMenu.jsp"></jsp:include>
	
	<div class="clearfix hidden-sm hidden-xs"
		style="color: white; background-color: #002db3; margin-top: -15px; margin-bottom: 12px; font-family: 'Comic Sans MS', 'Comic Sans'; font-weight: bold;">
		<marquee>
			Welcome to Tender Management System, Admin.
		</marquee>
	</div>
     <div class="container-fluid">
     
     	<div class="notice">
        <div class="col-md-3"style="margin-left:2%">
     		<% Connection con = DBUtil.provideConnection(); %>
     		
          <!-- Next marquee starting-->
          <jsp:include page="approved.jsp"></jsp:include><br>
          
        </div>  <!-- End of col-md-3-->
      </div> <!-- End of notice class-->
      
      
      <!-- Next part of same container-fluid in which galary or other information will be shown-->
      
          
   <div class="col-md-8">

						<table style="background-color: white; width: 100%;">
							<tr>
								<td
									style="color: #002b80; background-color: #cce6ff; font-size: 20px; font-family: 'Candara'; font-weight: bolder; text-align: center; height: 35px; border: 2px solid #002b80; border-radius: 2px">
									Logged-In Successfully!!</td>
							</tr>
						</table>
					
						<table style="background-color: #f9f9f9; width: 100%;">
						
							
								<tr class="col-md-12" style="margin-left: 0%; margin-top: 15px;">
									<td><h1 style="text-align: center;color: #003d66;">Welcome Back Admin!</h1>
									<img alt="Hello" src="images/hello.jpg" style="align-self: center; margin-left: 130px;">
									<center><h4 style="color: #004080; background-color: #f9f9f9; font-size: 22px; font-weight:bold; font-family: 'Candara'">
									Welcome to Tender Management system, you are the SuperUser of System.
									</h4></center></td>
									</tr>
								
								</table>

							</div>
      
    </div> <!-- End of container-fluid-->

<!-- Now from here the footer section starts-->
                      
<!-- Including the footer of the page -->
    
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
