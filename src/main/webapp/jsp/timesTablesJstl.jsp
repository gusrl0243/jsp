<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
	스크립틀릿 / 표현식 사용 금지
	jstl / el 만 사용해서 동일한 기능 구현
--%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
td {
	border: 1px solid black;
}
</style>
</head>
<body>

<table>
	<c:forEach begin="2" end="9" var="i">
		<tr>
			<c:forEach begin="1" end="9" var="j">
				<td>${i }* ${j } = ${i*j }</td>
			</c:forEach>
		</tr>  
	</c:forEach>
</table>
</body>
</html>





=======
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>기본</h2>
	<table border="1">
	<%	for(int i=1; i<=9; i++){ %>
			<tr>
	<% 		for(int j=2; j<=9; j++){ %>
				<td><%=j %> * <%=i %> = <%=(j*i) %></td>
	<%		} %>
			</tr>
	<%	} %>
	</table>
	
	<h2>jstl(varStatus) / el</h2>
	<table border="1">
	<c:forEach begin="1" end="9" varStatus="i">
		<tr>
		<c:forEach begin="2" end="9" varStatus="j">
			<td>${j.index} * ${i.index} = ${j.index*i.index}</td>
		</c:forEach>
		</tr>
	</c:forEach>
	</table>
	
	<h2>jstl(var) / el</h2>
	<table border="1">
	<c:forEach begin="1" end="9" var="i">
		<tr>
		<c:forEach begin="2" end="9" var="j">
			<td>${j} * ${i} = ${j*i}</td>
		</c:forEach>
		</tr>
	</c:forEach>
	</table>
</body>
</html>
>>>>>>> refs/remotes/origin/master
