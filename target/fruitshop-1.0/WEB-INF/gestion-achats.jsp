<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous" />

<title>Gestion achats</title>

</head>
<body>
	<%@ include file="header.jsp"%>

	<div class="container">
	   <%
        String username = (String)session.getAttribute("username");
        if(username==null)  {
    %>            
        <p> username is null</p> //html code
    <%
        } else {
    %>
        <p> username is not null</p> //html code
    <%
        }
    %>

	</div>



	<a class="btn btn-danger" href="logout"> Se Deconnecter </a>


</body>
</html>