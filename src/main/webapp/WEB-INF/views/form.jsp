<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<div align="left">
	<h2>${resultString}</h2>
		<h2>FORM</h2>
		<form action="validate" method="post" modelAttribute="formModel">
			<div>
				String 1: <input type = "text" name = "string1" />
			</div>

			<div>
				String 2: <input type = "text" name = "string2" />
			</div>

			<div>
				<div>
					<input type = "submit" value = "Submit" />
				</div>
			</div>
		</form>
	</div>
</body>
</html>