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

	<table>
		<tr>
			<th>사용자 아이디</th>
			<th>사용자 이름</th>
		</tr>
		<c:forEach items="${userList }" var="userVo">
			<tr>
				<th>${userVo.userId }</th>
				<th>${userVo.userNm}</th>
			</tr>
		</c:forEach>
	</table>

</body>
</html>