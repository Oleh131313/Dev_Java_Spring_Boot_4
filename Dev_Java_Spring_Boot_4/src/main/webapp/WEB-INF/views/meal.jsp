<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<title>Meal</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<form action="/admin/meal" method="POST">
					<div class="form-group row">
						<label class="col-2 col-form-label" for="title">Title:</label>
						<div class="col-10">
							<input class="form-control" id="title" name="title">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label" for="description">Description:</label>
						<div class="col-10">
							<textarea class="form-control" id="description" name="description" rows="5"></textarea>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label" for="price">Price:</label>
						<div class="col-10">
							<input class="form-control" id="price" name="price">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label" for="weight">Weight:</label>
						<div class="col-10">
							<input class="form-control" id="weight" name="weight">
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label" for="cuisine">Cuisine:</label>
						<div class="col-10">
							<select class="form-control" id="cuisine" name="cuisine">
								<c:forEach var="cuisine" items="${cuisines}">
									<option value="${cuisine}">${cuisine}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<label class="col-2 col-form-label" for="ingredients">Ingredients:</label>
						<div class="col-10">
							<select class="form-control" id="ingredients" name="ingredients" multiple>
								<c:forEach var="ingredient" items="${ingredients}">
									<option value="${ingredient}">${ingredient}</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-10 mr-left">
							<button class="btn btn-sm btn-outline-success">Save</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<div class="row">
			<div class="col-12">
				<table class="table table-bordered">
					<tr>
						<td class="text-center">Title</td>
						<td class="text-center">Description</td>
						<td class="text-center">Price</td>
						<td class="text-center">Cuisine</td>
						<td class="text-center">Weight</td>
						<td class="text-center">Ingredient</td>
						<td class="text-center">Option</td>
					</tr>
					<c:forEach var="meal" items="${meals}">
						<tr>
							<td>${meal.title}</td>
							<td>${meal.description}</td>
							<td>${meal.price}</td>
							<td>${meal.cuisine}</td>
							<td>${meal.weight}</td>
							<td>
								<c:forEach var="ingredient" items="${meal.ingredients}">
									${ingredient} 
								</c:forEach>
							</td>
							<td class="text-center">
								<a href="/admin/meal/update/${meal.id}" class="btn btn-outline-warning btn-sm">Update</a>
								<a href="/admin/meal/delete/${meal.id}" class="btn btn-outline-danger btn-sm">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>