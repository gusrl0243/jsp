<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>현재 사용자 정보</h2>
<%--currentLoginUserList --%>
<table>
	<tr>
	<th>사용자 아이디</th>
	<th>사용자 이름</th>
	<th>별명</th>
	<tr>
<c:forEach item="${currentLoginUserList }" var="userVo">
<tr>
	<th></th>
	<th></th>
	<th></th>
	<tr>
	</c:forEach>
</table>


</body>
</html>