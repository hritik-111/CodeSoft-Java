<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Grade Calculator</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

	<div class='main'>
		<form action="Result" method="POST">
			ROLL NO: <input type="text" name="rollno"><br>
			NAME: <input type="text" name="s_name"><br>
			SUB1: <input type="text" name="sub1"><br>
			SUB2: <input type="text" name="sub2"> <br>
			SUB3: <input type="text" name="sub3"><br>
			SUB4: <input type="text" name="sub4"><br>
			SUB5: <input type="text" name="sub5"><br>
			<input type="submit" value="calculate">	<br>	
		</form>
	</div>
</body>
</html>