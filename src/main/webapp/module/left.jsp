<%@ page language="java" contentType="text/html; charset=UTF-8"
<<<<<<< HEAD
	pageEncoding="UTF-8"%>
<ul class="nav nav-sidebar">
	<li><a href="${cp}/userAllList">사용자 리스트</a></li>
	<li><a href="${cp}/userPagingList">사용자 리스트 페이징</a></li>
</ul>

<ul class="nav nav-sidebar">
	<li><a href="${cp}/lprodList">제품 그룹리스트 조회</a></li>
	<li><a href="${cp}/lprodPagingList">제품 그룹리스트(페이징) 조회</a></li>
=======
    pageEncoding="UTF-8"%>
    
<ul class="nav nav-sidebar">
	<li><a href="<%=request.getContextPath()%>/userAllList">사용자 리스트</a></li>
    <li><a href="<%=request.getContextPath()%>/userPagingList">사용자 리스트 페이징</a></li>
</ul>

<ul class="nav nav-sidebar">
    <li><a href="<%=request.getContextPath()%>/lprodAllList">제품 그룹리스트 조회</a></li>
    <li><a href="<%=request.getContextPath()%>/lprodPagingList">제품 그룹리스트 페이징</a></li>
>>>>>>> refs/remotes/origin/master
</ul>