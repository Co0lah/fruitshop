<%@page import="com.fruit.metier.Article"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous" />
<meta charset="ISO-8859-1">
<title>Gestion des articles</title>
</head>
<body>

	<%@ include file="header.jsp"%>

	<div class="container">

		<h1>Gestion des articles</h1>

		<div class="my-2">

			<h3>Liste des articles</h3>


			<%
        List<Article> articles = (List)request.getAttribute("articles");
        if(articles==null)  {
    %>
			<h5>Pas d'articles</h5>
			//html code
			<%
        } else {
        	
     	
    %>
    <c:forEach items="${articles}" var="article">
    <tr>
        <td><c:out value="${article.nom}" /></td>
        <td><c:out value="${article.categorie}" /></td>
        <td><c:out value="${article.prix}" /></td>
    </tr>
	</c:forEach>

			<%
        }
     
    %>




		</div>

		<div class="my-5">
			<h4>Ajouter un article</h4>


			<form action="addArticle">

				<div class="form-group">
					<label for="nom">Nom</label>
					 <input type="text" class="form-control" name="nom" required>
				</div>

				<div class="form-group">
					<label for="description">Description</label>
					 <input type="text" class="form-control" name="description" required>
				</div>
				
				<div class="form-group">
					<label for="prix">Prix</label>
					 <input type="number" class="form-control" name="prix" required>
				</div>
				
				<div class="form-group">
					<label for="stock">Stock</label>
					 <input type="text" class="form-control" name="stock" required>
				</div>
				
				<button type="submit" class="btn btn-secondary"> Ajouter l'article</button>

			</form>

		</div>


	<a class="btn btn-danger" href="logout"> Se Deconnecter </a>

	</div>


</body>
</html>