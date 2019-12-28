<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Upload File Request Page</title>
</head>
<body>
 <br><br><br>
 <div align="center">
    <form method="POST" action="upload" enctype="multipart/form-data">
        File to upload: <input type="file" name="file"><br><br> 
        Name: <input type="text" name="name"> 
        <input type="submit" value="Upload"> Press here to upload the file!
    </form>
    </div>
    <div>
    <a href="getstudent">getAll student</a>
    </div>
     
</body>
</html>
