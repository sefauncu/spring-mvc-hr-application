<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>HOME</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>HR Application</h1>
				<p>${message}</p>
			</div>		
		</div>
	</section>
		<section class="container">
		
		<form action="/SimpleHRApplication/login" method="post">
		  <label class="control-label col-lg-2" for="loginEmail">Email</label>
   <input type="text" name="loginEmail"/>
    <br/><br/>  
    <label class="control-label col-lg-2" for="loginPassword">Password</label>
    <input name="loginPassword" type="password"/>
    <br/><br/>  
    <input type="submit" value="login"/>  
    </form>  
</section>

</body>
</html>


		
		
	
 