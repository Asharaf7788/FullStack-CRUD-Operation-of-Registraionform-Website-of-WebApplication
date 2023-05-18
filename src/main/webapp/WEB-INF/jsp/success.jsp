<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>CRUDOPERATION</title>
	<style type="text/css">
       
          .split {
         height: 100%;
         width: 50%;
        position: fixed;
        z-index: 1;
        top: 0;
        overflow-x: hidden;
        padding-top: 20px;
                }

           .left {
              left: 0;
  
              }
           .right {
             right: 0;
  
             }


      .centered {
               position: absolute;
              top: 50%;
             left: 50%;
            transform: translate(-50%, -50%);
            text-align: center;
           }

		#update{

             max-height: 200px;
			margin-left: 150px;
			margin-top: 150px;
			padding: 50px;
			border: 2px solid lightgrey;
			max-width: 200px;
			background-color: skyblue;
		
		}
		#form{
			margin: 10px;
			padding: 10px;
		}

		#delete{
			max-height: 200px;
			margin-right: 150px;
			margin-top: 150px;
			padding: 50px;
			border: 2px solid black;
			max-width: 200px;
			background-color: skyblue;
		}

	</style>
</head>
<body bgcolor="black">
<center><h1 class="text-center" style="color:white">Hi ${nm} Welcome to Website</h1></center>
<div class="split left" id="update" style="border: 2px solid white">
	<div class="centered">
	<h2 style="margin-left: 5px; color: darkblue;">UPDATE</h2>
<form id="form" action="searchprocess" method="post">
	<label style="font-weight: bold; margin-bottom: 5px; margin-right: 80px;">Enter Email:</label><br>
	<input type="email" name="email" size="20" required><br>
	<button type="submit" style="margin-left: 5px; margin-top: 5px; background-color: green;">Submit</button>
</form>
<div style="color:red">${res2}</div>
</div>
</div>
<div id="delete" class="split right" style="border: 2px solid white">
<div class="centered">
	<h2 style="margin-left: 5px; color: black;">DELETE</h2>
<form id="form" action="deleteprocess" method="post">
	<label style="font-weight: bold; margin-bottom: 5px; margin-right: 80px;">Enter Email:</label><br>
	<input type="email" name="email" size="20" required><br>
	<button type="submit" style="margin-left: 5px; margin-top: 5px; background-color: green;">Submit</button>
</form>
<div style="color:red">${res3}</div>
</div>
</div>
</body>
</html>