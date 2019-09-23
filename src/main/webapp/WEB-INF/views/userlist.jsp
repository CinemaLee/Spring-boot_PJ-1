<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("JdbcTemplate : Hello World");
%>
<br>

<c:forEach var="dto" items="${ users }"> <!-- users를 하나씩 돌면서 그 값을 dto라고 변수 지정함. -->
	${ dto.id } / ${ dto.name }<br>
</c:forEach>
</body>
</html>