<%-- 
    Document   : display
    Created on : 29-Mar-2020, 9:22:29 PM
    Author     : dishi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
      th {
          background-color: dodgerblue;
      }
  </style>
</head>
<body>
<h4>${error}</h4>
<div class="container">
  <h2>List of Movies and TV Shows in the database</h2>
  
  <table class="table table-hover table-dark">
    <thead>
      <tr>
        <th>Content ID</th>
        <th>Category</th>
        <th>Title</th>
        <th>Genre</th> 
        <th>Description</th>
        <th>Producer</th>
        <th>Director</th>
        <th>Duration</th>
        <th>Date Published</th>
        <th>Thumbnail Image</th>
        <th>Season</th>
        <th>Episode</th>
        <th>Episode title</th>
      </tr>
    </thead>
    <tbody>
       <c:forEach var="movie" items="${movieList}">
      <tr class="info">
        <td>${movie.contentId}</td>
        <td>${movie.category}</td>
        <td>${movie.title}</td>
        <td>${movie.genre}</td>
        <td>${movie.description}</td>
        <td>${movie.producer}</td>
        <td>${movie.director}</td>
        <td>${movie.duration}</td>
        <td>${movie.dataPublished}</td>
        <td>${movie.thumbnail}</td>
        <td>${movie.seasonNo}</td>
        <td>${movie.episodeNo}</td>
        <td>${movie.episodeTitle}</td>
      </tr>      
      </c:forEach>
    </tbody>
  </table>
</div>
    
</body>
</html>
