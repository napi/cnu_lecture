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

<script>
	function deletePost(postId){
		var password = prompt("비밀번호 입력 ", "");
		var form = document.getElementById("deletePost");
		console.log(postId + ", " + password);
		form.postId.value=postId;
		form.password.value=password;
		form.submit();
	}
	
	function deleteResult(){
		if(window.location.search.substring(1) == "fail"){
			alert("삭제 실패");
		}
	}
</script>

<form id=deletePost action=/post/delete method=post>
	 <input name="postId" type="hidden"/>
     <input name="password" type="hidden"/>
</form>

<body onload="deleteResult()">
<div class="main">
	<div class="border-box">
		<div class="contents-table"><!-- ContentsTable Start -->
			<table cellspacing="0" class="request-list info-type02 list-titlelong ">

				<colgroup>
					<col style="width:10%">
					<col style="width:*%">
					<col style="width:15%">
					<col style="width:15%">
				</colgroup>
				<thead>
				<tr>
					<th scope="col" class="first"></th>
					<th scope="col">제목</th>
					<th scope="col">작성자</th>
					<th scope="col">작성일</th>
					<th scope="col">삭제</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach items="${cnuPostList}" var="cnuPost">
					<tr>
						<td>${cnuPost.postId}</td>
						<td class="tleft">
							<a href="post/view?postId=${cnuPost.postId}">${cnuPost.title}</a>
						</td>
						<td>${cnuPost.author}</td>
						<td>${cnuPost.createTime}</td>
						<td>
							<input type="button" value="delete" onClick="deletePost(${cnuPost.postId})"/>
						</td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
		</div><!-- ContentsTable End -->
		<div style="padding-top: 25px;">
			<a href="/post/write" class="btn btn-primary right">글쓰기</a>
		</div>
	</div>
</div>
</body>


</body>
</html>