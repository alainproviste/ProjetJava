<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cr�ation auteur</title>
  <!-- Bootstrap core CSS -->
  <link href="https://blackrockdigital.github.io/startbootstrap-blog-post/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="https://blackrockdigital.github.io/startbootstrap-blog-post/css/blog-post.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="/BlogJava">Blog java</a>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="/BlogJava">Menu<span class="sr-only"></span></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/BlogJava/ListArticle">Articles</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/BlogJava/ListAuteur">Auteurs</a>
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
	<form class="text-center border border-light p-5" action="AddAuteur" method="post">
	    <div class="form-group">
	        <label>Nom d'auteur :</label>
	        <input class="form-control mb-4" type="text" name="nom" required>
	    </div>
	    <div class="form-group">
	        <label>Identifiant :</label>
	        <input class="form-control" type="text" name="identifiant" required>
	    </div>
	    <div class="form-group">
	        <label>Mot de passe :</label>
	        <textarea class="form-control" name="mdp" rows="3" required></textarea>
	    </div>
	    <button type="submit" class="btn btn-primary">Envoyer</button>
	</form>
	</div>

  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
    <!-- /.container -->
  </footer>
</body>
</html>