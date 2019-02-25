<%@page import="kr.or.ddit.rangers.model.RangerVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Dashboard Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- Custom styles for this template -->
<link href="${pageContext.servletContext.contextPath }/css/dashboard.css"
	rel="stylesheet">
</head>

<body>

	<%@ include file="/board/board_header.jsp"%>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<%@ include file="/board/board_left.jsp"%>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h3 class="page-header">자유 게시판</h3>
				<!-- userList 정보를 화면에 출력하는 로직 작성 -->

				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>게시글 번호</th>
								<th>제목</th>
								<th>작성자 아이디</th>
								<th>작성일자</th>
							</tr>
						</thead>		
						<c:forEach items="${boardList}" var="vo">
							<tr class=board datd-board="${vo.userId }">
						<tr class="userTr" data-userid="${vo.userId }">
							</c:forEach>
						
						
									
					</table>
	


				</div>
			</div>
		</div>
	</div>







	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

	<script>
		//문서로딩이 완료된 이후 이벤트 등록
		$(document).ready(function() {
			console.log("document ready");
			
			//msg 속성이 존재하면 alert, 존재하지 않으면 넘어가기
			<c:if test="${msg != null}">
				alert("${msg}");
				<%session.removeAttribute("msg");%>
			</c:if>
			

			//사용자 tr 태그 클릭시 이벤트 핸들러
			$(".userTr").on("click", function() {
				console.log("userTr click");
				//클릭한 userTr태그의 userId 값을 출력
				// 				var userId = $(this).children()[1].innerText;
				// 				console.log("userId : " + userId);

				var userId = $(this).data("userid");

				// /user
				// 1. docuemnt
				//document.location = "/user?userId=" + userId;

				// 2. form
				$("#userId").val(userId);
				//$("#frm").attr("action", "/userAllList");
				$("#frm").submit();
			});
		});
	</script>

	<form id="frm" action="${pageContext.servletContext.contextPath }/user"
		method="get">
		<input type="hidden" id="userId" name="userId" />
	</form>

</body>
</html>








