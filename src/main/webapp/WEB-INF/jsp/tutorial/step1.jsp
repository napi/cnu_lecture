<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="/css/main.css"/>
</head>
<body>

<body>
<div class="main">
	<div class="border-box">
		<h1>Hello ${name}</h1>
		<ul>
			<c:forEach items="${nameList}" var="name">
				<li>${name}</li>
			</c:forEach>
		</ul>
		<c:if test="${name == 'cnu'}">
		<h1>This is Chungnam National University</h1>
		</c:if>
	<div>
</div>
</body>


</body>
</html>