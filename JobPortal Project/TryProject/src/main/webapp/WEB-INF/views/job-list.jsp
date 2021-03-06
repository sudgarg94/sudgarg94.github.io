<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.css">
		<!-- <link rel="stylesheet" type="text/css" href="jobboard.css"> --> 
		<!-- Website CSS style -->
		<link rel="stylesheet" type="text/css" href="assets/css/main.css">

		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
		
		

		<title>JobBoard</title>
		<style>


.centered-form {
    margin-top: 120px;
    margin-bottom: 120px;
}
</style>
	</head>
	<body data-spy="scroll" data-target="#my-navbar">
		
		<c:set var="contextPath" value="${pageContext.request.contextPath}" />

		<!-- Navbar -->
	<nav class="navbar navbar-inverse navbar-fixed-top" id="my-navbar">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a href="/main" class="navbar-brand"><img src="/images/logo-jobboard.png"></a>
			</div> <!-- Nav Header Ends here -->

			<div class="collapse navbar-collapse" id="navbar-collapse">
					<a href="${contextPath}/user/logout" class="btn btn-warning navbar-btn navbar-right">Logout</a>
					<a href="${contextPath}/user/home" class="btn btn-info navbar-btn navbar-right">Home</a>
			</div>

				

		</div> <!-- Container Ends here -->
	</nav> <!-- NavBar Ends here -->
		<!--  FORM -->

		 <div class="container" id="container1">
        <div class="row centered-form">
       		<c:if test="${empty jobs}">
       			<h3>No such jobs</h3>
			</c:if>
			<c:if test="${not empty jobs}">
			
        		<c:if test="${(user.role=='JobSeeker') || (empty user.role)}">
				<form method="get" action="${contextPath}/job/apply">
					<table class="table table-striped">
						<thead>
						<tr>
							<th>Job TITLE</th>
							<th>Job Message</th>
							<th>Company Name</th>
							<th>Status</th>
							<th>Select</th>
							
							
						</tr>
					</thead>
						<c:forEach var="job" items="${jobs}">
						<tbody>
							<tr>
								<td>${job.title}</td>
								<td>${job.message}</td>
								<td>${job.company.companyName}</td>
								<td>${job.status}</td>
								<td><button type="submit" name="checkboxgroup" value="${job.id}"/>Apply</button></td>
							</tr>
						</tbody>
						</c:forEach>
					</table>
					</form>
</c:if>

<!--  -->
<c:if test="${user.role=='Company'}">
	<form method="get" action="${contextPath}/job/viewAndDeleteApplications">
	<table class="table table-striped">
		<thead>
		<tr>
			<tr>
			<th>Job TITLE</th>
			<th>Job Description</th>
			<th>Posted By</th>
			<th>Status</th>
			<th>View</th>
			<th>Change</th>
		</tr>
	</thead>
			
		<c:forEach var="job" items="${jobs}">
		<tbody>
			<tr>
				<td>${job.title}</td>
				<td>${job.message}</td>
				<td>${job.company.username}</td>
				<td>${job.status}</td>
				<td><button type="submit" name="viewJobID" value="${job.id}"/>View Applications</button></td>
				<td>
				<select name="${job.id}">
     			<option value="Available">Available</option>
     			<option value="Not Available">Not Available</option>
   				</select>
				<button type="submit" name="deleteJobID" value="${job.id}"/>Change Status</button></td>
				</tr>
			</tbody>
		</c:forEach>
		</table>
		</form>
	</c:if>
</c:if>
<!--  -->
        </div>
    </div>


		<script type="text/javascript" src="assets/js/bootstrap.js"></script>
</body>
</html>