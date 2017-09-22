<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OpenClose</title>
</head>
<body>
	<div class = "container">
<div class="row" >
			<div class = "col-12">
				<form:form action="/admin/openclose" method="POST" modelAttribute="openclose">
				<div class="form-group row">
					<label class="col-2 col-form-label" for="time">Time:</label> 
					<div class="col-10">
						<form:input class="form-control" id="time" path="time"/>
					</div>
				</div>
					<div class="form-group row">
					<div class="col-10 mr-left">
					<button class="btn btn-sm btn-outline-success">Save</button>
					<button class="btn btn-sm btn-outline-warning">Cancel</button>
					</div>
					</div>
				</form:form>
			</div>
		</div>
	<div class="row" >
		<div class = "col-12">
			<table class= "table table-bordered">
				<tr>
					<th class = "text-center">Time</th>
					<th class = "text-center">Option</th>
				</tr>
					<c:forEach var="openclose"  items="${opencloses}">
				<tr>
					<td>${openclose.time}</td>
					<td>
					<a href = "/admin/open_close/update/${openclose.id }"  class="btn btn-outline-danger btn-sm">Update</a>
						<a href = "/admin/open_close/delete/${openclose.id }" class="btn btn-outline-warning btn-sm">Delete</a>
					</td>
				</tr>
					</c:forEach>
			</table>
		</div>
	
	</div>
</div>
</body>
</html>