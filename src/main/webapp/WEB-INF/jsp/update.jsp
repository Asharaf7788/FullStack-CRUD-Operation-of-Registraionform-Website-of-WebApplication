<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Update Page</title>
	<style type="text/css">
		#center{
			margin: 70px;
			margin-left: 375px;

		}

	   .label{

			margin-bottom:10px; 
			color: black;
		}

		input{
			border-block-start-color: black;
		}

		button{

			margin-left: 150px; 
			margin-top: 5px; 
			background-color: green;

		}
		h1{
			color: blue; 
			margin-top: 100px; 
			margin-left: 380px
		}
		
		h3{
		color:green;
		margin-left:475px;
		}
		



	</style>
</head>
<body bgcolor="lightgrey">


	<h1>Welcome to Update Page</h1>
	<h3>${res4}</h3>
  <div id="center">
<form action="updateprocess" method="post">
	<div>
	<label class="label">Change Name:</label><br>
	<input type="text" name="newname" size="50">
	</div><br>
	<div>
	<label class="label">Change Email:</label><br>
	<input type="email" name="newemail" size="50">
    </div><br>
	<div>
	<label  class="label">Change Password:</label><br>
	<input type="password" name="newpassword" size="50">	
	</div><br>
	<button type="submit">Submit</button>
</form>
</div>
</body>
</html>