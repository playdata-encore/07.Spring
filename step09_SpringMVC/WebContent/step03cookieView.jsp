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
	session Ȥ�� request�� newData�� �ִ� ��� : ${newData} <br>
	session Ȥ�� request�� id�� �ִ� ��� : ${id} <br>
	session Ȥ�� request�� age�� �ִ� ��� : ${age} <br>
	
	session �� cust��� key�� ������ Customer �����Ͱ� �ִ� ��� : ${cust} <br>
	
	<a href="sessiontracking/sessionDelete">1.HttpSession API�� ����</a> <br>
	<a href="sessiontracking/sessionDelete2">1.Spring API�� session ���� ����</a> <br>
</body>
</html>