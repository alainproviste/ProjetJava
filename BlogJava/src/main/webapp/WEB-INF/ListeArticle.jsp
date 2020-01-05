<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Articles</title>
  <!-- Bootstrap core CSS -->
  <link href="https://blackrockdigital.github.io/startbootstrap-blog-post/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="https://blackrockdigital.github.io/startbootstrap-blog-post/css/blog-post.css" rel="stylesheet">
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
            <a class="nav-link" href="/BlogJava/AddArticle">Création Article</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/BlogJava/AddAuteur">Création Auteur</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <!-- Blog Entries Column -->
      <div class="col-md-8">

        <h1 class="my-4">Listes des articles</h1>

        <!-- Blog Post -->
        
        <c:forEach items="${article}" var="article">
        <div class="card mb-4">
          <img class="card-img-top" src="http://placehold.it/750x300" alt="Card image cap">
          <div class="card-body">
            <h2 class="card-title"><c:out value="${ article.getTitre() }" /></h2>
            <p class="card-text"><c:out value="${ article.getDesc() }" /></p>
            <a href="#" class="btn btn-primary">Read More &rarr;</a>
            <a href="#" class="btn btn-primary">Update &rarr;</a>
            <a href="#" class="btn btn-primary">Supprimer &rarr;</a>
          </div>
          <div class="card-footer text-muted">
            Poster le <c:out value="${ article.getDate() }" /> par <c:out value="${ article.getAuteur() }" />
          </div>
        </div>
        </c:forEach>
        
      </div>

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
    <!-- /.container -->
  </footer>

</body>
</html>