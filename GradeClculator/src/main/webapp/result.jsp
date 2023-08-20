<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class ="result-container">
		<h1>Your Result</h1>
		 <p class="result-info">Roll Number: ${rollNumber}</p>
	     <p class="result-info">Name: ${name}</p>
	     <p class="result-info">Total Marks: ${totalMarks}</p>
	     <p class="result-info">Average Percentage: ${averagePercentage}</p>
	     <p class="result-grade">Grade: ${grade}</p>
     </div>
</body>
</html>