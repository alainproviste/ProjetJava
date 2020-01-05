<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- Bootstrap core CSS -->
  <link href="https://blackrockdigital.github.io/startbootstrap-blog-post/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="https://blackrockdigital.github.io/startbootstrap-blog-post/css/blog-post.css" rel="stylesheet">
<title>Cr�ation article</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="/BlogJava/">Blog Java</a>
      <div>
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="/BlogJava/">Menu<span class="sr-only">(current)</span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/BlogJava/ListeArticle">Articles</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/BlogJava/ListeAuteur">Auteurs</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/BlogJava/AddArticle">Cr�ation Article</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/BlogJava/AddAuteur">Cr�ation Auteur</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  
  <div class="container">
	<form class="text-center border border-light p-5" action="AddArticle" method="post">
	    <div class="form-group">
	        <label>Auteur :</label>
	        <input class="form-control mb-4" type="text" name="auteur" value="${sessionScope.utilisateur}" required>
	    </div>
	    <div class="form-group">
	        <label>Titre :</label>
	        <input class="form-control" type="text" name="titre" required>
	    </div>
	    <div class="form-group">
	        <label>Description :</label>
	        <textarea class="form-control" name="description" rows="3" required></textarea>
	    </div>
	    <div class="form-group">
	        <label>Article :</label>
	        <textarea class="form-control" name="texte" rows="5" required></textarea>
	    </div>
	    <button type="submit" class="btn btn-primary">Envoyer</button>
	</form>
	</div>
	
</body>
</html>