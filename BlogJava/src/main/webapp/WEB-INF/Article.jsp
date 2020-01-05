<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

      <!-- Post Content Column -->
      <div class="col-lg-8">

        <!-- Title -->
        <h1 class="mt-4"><c:out value="${ article.getTitre() }" /></h1>

        <!-- Author -->
        <p class="lead">
          by
          <a href="#"><c:out value="${ article.getAuteur() }" /></a>
        </p>

        <hr>

        <!-- Date/Time -->
        <p>Poster <c:out value="${ article.getDate() }" /></p>

        <hr>

        <!-- Preview Image -->
        <img class="img-fluid rounded" src="http://placehold.it/900x300" alt="">

        <hr>

        <!-- Post Content -->
        <p class="lead"><c:out value="${ article.getTexte() }" /></p>

        <hr>
      </div>
    </div>
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