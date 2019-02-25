<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<<<<<<< HEAD
<style>
	td {
		border :1px solid black;
	}
</style>
</head>
<body>

<table>
<% for(int i = 2; i <=9; i++){ %>
	<tr>
	<%for(int j = 1; j <=9; j++){ %>
		<td><%=i %> * <%=j %> = <%=i*j %></td>
	<%} %>
	
	</tr>
	<%} %>
</table>	
</body>
</html>





=======
</head>
<body>
	<table border="1">
	<%	for(int i=1; i<=9; i++){ %>
			<tr>
	<% 		for(int j=2; j<=9; j++){ %>
				<td><%=j %> * <%=i %> = <%=(j*i) %></td>
	<%		} %>
			</tr>
	<%	} %>
	</table>
</body>
</html>
>>>>>>> refs/remotes/origin/master
