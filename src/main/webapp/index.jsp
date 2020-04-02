<%-- 
    Document   : index
    Created on : 25-Mar-2020, 1:49:49 PM
    Author     : dishi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            h3,h4,h5{
                text-align: center;
            }
            body {font-family: Arial, Helvetica, sans-serif; background-color: lightskyblue}
            * {box-sizing: border-box;}
            
            input[type=text], select, textarea {
                width:100%;
              padding: 12px;
              border: 1px solid #ccc;
              border-radius: 4px;
              box-sizing: border-box;
              margin-top: 6px;
              margin-bottom: 16px;
              resize: vertical;
            }

            input[type=submit] {
              background-color: #4CAF50;
              color: white;
              padding: 12px 20px;
              border: none;
              border-radius: 4px;
              cursor: pointer;
            }

            input[type=submit]:hover {
              background-color: #45a049;
            }

            .container {
              border-radius: 5px;
              background-color: #f2f2f2;
              padding: 20px;
              margin-right: 20%;
              margin-left: 20%;
            }
        </style>
    </head>
    <body>
        <h3>Admin Dashboard</h3>
        <h4>Supported Operations: View, Add, Update, Delete</h4>
        <h4> Form to add a new item </h4>

        <div class="container">
        <form action="/MoviesClientWebJSP/DisplayServlet" method="post" >
            <input type="submit" value="View all items" name="display" style="float:right;"><br><br>
        </form>
        <form action="/MoviesClientWebJSP/SOAPClientServlet" method="post" enctype="multipart/form-data">
        <label for="category">Category</label>
        <select id="category" name="category">
          <option value="movie">Movie</option>
          <option value="tvShow">Tv Show</option>
        </select><br><br>
        <label for="title">Title</label>
        <input type="text" id="title" name="title" placeholder="Enter the title here"><br><br>

        <label for="description">Description</label>
        <textarea id="description" name="description" placeholder="Enter description here" style="height:50px"></textarea>
        <br><br>
        <label for="genre">Genre</label>
        <input type="text" id="genre" name="genre" placeholder="Enter the genre here">
        <br><br>
        <label for="producer">Producer</label>
        <input type="text" id="producer" name="producer" placeholder="Enter the producer here">
        <br><br>
        <label for="director">Director</label>
        <input type="text" id="director" name="director" placeholder="Enter the director here">
        <br><br>
        <label for="duration">Duration</label>
        <input type="text" id="duration" name="duration" placeholder="Enter the duration here">
        <br><br>
        <label for="season">Season</label>
        <input type="text" id="season" name="season" placeholder="Enter the season here">
        <br><br>
        <label for="episode">Episode</label>
        <input type="text" id="episode" name="episode" placeholder="Enter the episode here">
        <br><br>
        <label for="episodeTitle">Episode Title</label>
        <input type="text" id="episodeTitle" name="episodeTitle" placeholder="Enter the episode title here">
        <br><br>
        <label for="img">Upload image</label>
        <input type="file" id="img" name="img" accept="image/*">
        <br><br>
        <input type="submit" value="Add a new item" name="add">&nbsp;&nbsp;
        <input type="submit" value="Update an item" name="update"><br>
      </form>
        <br><br>
        <form action="/MoviesClientWebJSP/DeleteServlet" method="post">
            <label for="id">Enter item id</label>
            <input type="text" id="id" name="id" placeholder="Enter the id of the item to delete">
        <br><br>
            <input type="submit" value="Delete an item" name="delete">
        </form>

    </div>
<h3>${error}</h3>
</body>
</html>
