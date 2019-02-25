<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<<<<<<< HEAD
	총합 : <%=session.getAttribute("sumResult")%>
=======
	합 결과 : <%=session.getAttribute("sumResult") %> <br>
	합 결과2 : <% out.write(session.getAttribute("sumResult").toString()); %>
>>>>>>> refs/remotes/origin/master
</body>
</html>
