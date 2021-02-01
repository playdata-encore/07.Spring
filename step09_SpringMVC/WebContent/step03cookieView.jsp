<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	step03cookieView.jsp : ${cookie.id.value} <br>
	session 혹은 request에 newData가 있는 경우 : ${newData} <br>
	session 혹은 request에 id가 있는 경우 : ${id} <br>
	session 혹은 request에 age가 있는 경우 : ${age} <br>
	
	session 에 cust라는 key로 지정된 Customer 데이터가 있는 경우 : ${cust} <br>
	
	<a href="sessiontracking/sessionDelete">1.HttpSession API로 삭제</a> <br>
	<a href="sessiontracking/sessionDelete2">1.Spring API로 session 정보 삭제</a> <br>
</body>
</html>