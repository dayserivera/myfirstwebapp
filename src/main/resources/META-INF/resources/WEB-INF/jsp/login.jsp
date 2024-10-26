<html>
	<head>
		<title> Login Page</title>
	</head>
	<body>
		Welcome to the login page!	
		<div><font color = "red">${errorMsg}</font></div>	
		<form method="post">
			Name: <input type="text" name="name">
			Password: <input type="password" name="password">
			<input type="submit">
		</form>
	</body>
</html>