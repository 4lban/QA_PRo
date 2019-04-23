<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="RegisterMember" method="POST">

	Username: <input type="text" name="name"></input>
	<br></br>
	Surname: <input type="text" name="surname"></input>
	<br></br>
	Languages:
	<select name="language">
		<option value="english">English</option>
		<option value="albanian">Albanian</option>
		<option value="turkish">Turkish</option>
		<option value="japanese">Japanese</option>
	</select>
	<br></br>
	Categories:
	<select name="topics" multiple="multiple" size="4" >
		<option value="geography">Geography</option>
		<option value="history">History</option>
		<option value="literature">Literature</option>
	</select>
	<input type="checkbox" name="rememberMe"> Remember me
	<br></br>
	<input type="submit" value="Submit"/>
 
</form>

</body>
</html>
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>