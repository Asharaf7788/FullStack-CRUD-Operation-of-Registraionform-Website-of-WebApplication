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
			border-color: darkblue;
		}

		button{

			margin-left: 125px; 
			margin-top: 5px; 
			background-color: blue;

		}
		h1{
			color: blue; 
			margin-top: 100px; 
			margin-left: 450px;
		}
		
</style>
</head>
<body bgcolor="lightYellow">

 <h1>SignIn Page</h1>
  <div id="center">
 <form action="signprocess" method="post">
	<div>
	<label class="label">Email:</label><br>
	<input type="email" name="email" size="50">
	<div Style="color:red">${res5}</div>
	</div><br>
	<div>
	<label class="label">Password:</label><br>
	<input type="password" name="password" size="50">
	<div style="color:red">${res6}</div>
    </div><br>
	<button type="submit">Submit</button>
</form>
</div>
</body>
</html>