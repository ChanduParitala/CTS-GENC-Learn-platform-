<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*,com.hit.utility.DBUtil"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Tender Management System</title>

<style type="text/css">
#hidden_div1{
	display: none;
	width: auto;
	height: auto;
	background-color: #0000b3;
	color: white;
	font-family: 'Candara';
	font-weight: bold;
}

#hidden_div2{
	display: none;
	width: auto;
	height: auto;
	background-color: #0000b3;
	color: white;
	font-family: 'Candara';
	font-weight: bold;
}

#hidden_div3{
	display: none;
	width: auto;
	height: auto;
	background-color: #0000b3;
	color: white;
	font-family: 'Candara';
	font-weight: bold;
}

#hidden_div4{
	display: none;
	width: auto;
	height: auto;
	background-color: #0000b3;
	color: white;
	font-family: 'Candara';
	font-weight: bold;
}

#test1{
	width: auto;
	height: 30px;
	background-color: #66a3ff;
	color: white;
	font-family: 'Candara';
	font-weight: bolder;
	margin-right: 75%;
}

#test1 a{
color: white;
}

#test1:hover{
background-color: #0052cc;
}

#test1 a:active{
background: white;
color: black;
font-weight: bold;
}
</style>

<script type="text/javascript">
	function showDiv1() {
		if (document.getElementById("hidden_div1").style.display !== 'none') {
			document.getElementById("hidden_div1").style.display = 'none';
		} else {
			document.getElementById("hidden_div1").style.display = 'block';
		}
	}

	function showDiv2() {
		if (document.getElementById("hidden_div2").style.display !== 'none') {
			document.getElementById("hidden_div2").style.display = 'none';
		} else {
			document.getElementById("hidden_div2").style.display = 'block';
		}
	}
	
	function showDiv3() {
		if (document.getElementById("hidden_div3").style.display !== 'none') {
			document.getElementById("hidden_div3").style.display = 'none';
		} else {
			document.getElementById("hidden_div3").style.display = 'block';
		}
	}
	
	function showDiv4() {
		if (document.getElementById("hidden_div4").style.display !== 'none') {
			document.getElementById("hidden_div4").style.display = 'none';
		} else {
			document.getElementById("hidden_div4").style.display = 'block';
		}
	}
</script>
</head>
<body bgcolor="white">

	<center style="background-color: white; height: auto; width: auto">

		<div id="test1" >
			<span onclick="showDiv1()"><a href="#"><h4>Project Background</h4></a></span>
		</div>
		<div id="hidden_div1">
			In modern days, many huge enterprises
			handle a large amount of projects from government and other private
			enterprises. In all such projects thousands of employees would be
			working on them. Such an enterprise requires purchases from various
			vendors for different purposes. The employees would float tenders
			globally by advertising in reputed newspapers. Advertising in
			newspapers involves a lot of cost, searching in newspapers is
			time-consuming, communication gap between buyers and suppliers (only
			way is through phone or mail), receiving bids and finalizing tenders
			takes a lot of time. So we make this whole process of tendering
			online which is efficient and consumes very less time. And this is
			now adapted all around the globe ever since the advent of the Web.
		</div>
	<hr/>

		<div id="test1">
			<span onclick="showDiv2()"><a href="#"><h4>Project Idea</h4></a></span>
		</div>
		<div id="hidden_div2">
			This Project revolves around the same
			conceptuality and idea that Tenders can be managed online.Involving
			many other revisions about security, feasibility and usability.
		</div>
	<hr/>

	<div id="test1">
				<span onclick="showDiv3()"><a href="#"><h4>Proposed System Design</h4></a></span>
			</div>
			<div id="hidden_div3">
				In the existing system there were not enough implemented usability
			features to the end user, so in this project we will be mainly
			focusing on the User Services like Help, FeedBack, Reviews and
			intuitively understandable designs. And for the security of
			transactions, Access Control and avoidance of malicious users we have
			a verification process through submission of Provisional documents.
			</div>
		<hr/>
		

<div id="test1">
				<span onclick="showDiv4()"><a href="#"><h4>System Functionalities</h4></a></span>
			</div>
			<div id="hidden_div4">
				The proposed System avails Vendors to create tenders, view them,
		download a report of the tender and from contractors side it avails to
		View tender, bid them, check the bid-status, download a report of the
		tender.
			</div>
		<hr/>
		
	</center>

</body>
</html>


