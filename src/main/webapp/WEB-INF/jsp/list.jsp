<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>用户登录页面</title>
    <!-- Bootstrap css-->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
   
   	<!--Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    
    <!-- Propeller css -->
    <link href="resource/propeller/css/propeller.min.css" rel="stylesheet">
</head>
<body>
<h1 align="center">登录页面</h1>
<form action="/logincheck.jsp" method="post">
<div class="col-md-6">
								<div class="pmd-card pmd-z-depth pmd-card-custom-form">
									<div class="pmd-card-body"> 
										<!-- User name with floating label -->
										<div class="form-group pmd-textfield pmd-textfield-floating-label">
											<label for="inputError1" class="control-label pmd-input-group-label">Username</label>
											<div class="input-group">
												<div class="input-group-addon"><i class="material-icons md-dark pmd-sm">perm_identity</i></div>
												<input type="text" class="form-control" id="exampleInputAmount">
											</div>
										</div>
										<!-- Password with floating label -->
										<div class="form-group pmd-textfield pmd-textfield-floating-label">
											<label for="inputError1" class="control-label pmd-input-group-label">Password</label>
											<div class="input-group">
												<div class="input-group-addon"><i class="material-icons md-dark pmd-sm">https</i></div>
												<input type="password" class="form-control" id="exampleInputAmount">
											</div>
										</div>
									</div>
								</div>

</form>
    <!-- jQuery before Propeller.js -->
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	
    <!-- Include all compiled plugins (below), or include individual files as needed -->
	<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="resource/propeller/js/propeller.min.js"></script>
</body>
</html>