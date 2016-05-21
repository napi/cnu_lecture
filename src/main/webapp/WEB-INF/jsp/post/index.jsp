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
	<script>
        function deletePost(postId){
            alert("패스워드를 입력하셔야 합니다.");
            var password =  prompt("PASSWD 입력","");
            var form =  document.getElementById("deletePost");
            if(password != null){
            	form.postId.value=postId;
            	form.password.value=password;
            	form.submit();
            }
        }
        
        function exceptionPost(){
			  var query = window.location.search.substring(1);
			  if(query=="incorrectPassword"){
                        alert("비밀번호가 일치하지 않습니다.");
                        location.replace('/post/');
			  }else if(query=="emptyPost"){
			            alert("해당 게시글이 존재하지 않습니다.");
			  }
        }
    </script>
</head>
<body onload="exceptionPost()">
<form action = "/post/delete" id ="deletePost" method="post">
    <input name="postId" type="hidden"/>
    <input name="password" type="hidden"/>
</form>
<div class="main">
	<div class="border-box">
		<div class="contents-table"><!-- ContentsTable Start -->
			<table cellspacing="0" class="request-list info-type02 list-titlelong ">

				<colgroup>
					<col style="width:10%">
					<col style="width:*%">
					<col style="width:15%">
					<col style="width:15%">
					<col style="width:10%">
					<col style="width:10%">
				</colgroup>
				<thead>
				<tr>
					<th scope="col" class="first"></th>
					<th scope="col">제목</th>
					<th scope="col">작성자</th>
					<th scope="col">조회수</th>
					<th scope="col">작성일</th>
					<th scope="col">삭제</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach items="${cnuPostList}" var="cnuPost">
					<tr>
						<td>${cnuPost.postId}</td>
						<td class="tleft">
							<a href="/post/view?postId=${cnuPost.postId}">${cnuPost.title}</a>
						</td>
						<td>${cnuPost.author}</td>
						<td>${cnuPost.viewCount}</td>
						<td>
						    <fmt:formatDate type="date" value="${cnuPost.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
						</td>
						<td><input type="button" value="삭제" onClick="deletePost(${cnuPost.postId})"/></td>
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