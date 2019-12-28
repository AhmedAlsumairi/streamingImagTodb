<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Insert title here</title>
<style>
ul {
	list-style-type: none;
	position: relative;
}

ul li {
	list-style-type: none;
	text-decoration: none;
	padding: 4px 4px 4px 4px;
}

#ll {
margin: 0 auto;
	width: 600px;
	height: 400px;
	background:#aab;
	position: relative;
}

#book {
	position: relative;
}
</style>
</head>
<body>
	<div id="ll">
	
		<c:forEach items="${student}" var="student">	
			   <div>  <img
		       src="/imagSpringMvc/getstudentimag?id=${student.id}" width="250px"
						height="180px" border="2px" /></div>
					 ${student.name}
				     ${student.id}
					${student.name}
				
		</c:forEach>
		
	</div>
	<%-- <table align="center">
<tr><td colspan="4"><img src="/imagSpringMvc/getstudentimag?id=${student.id}" width="250px" height="180px" border="2px"/></td></tr>
<tr><td width="20px">${student.name}</td>
<td width="20px" >${student.id}</td>
<td width="20px" >${student.name}</td>
<td width="20px" >${student.id}</td></tr>
</table> --%>
</body>
</html>