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

<div class="main">
	<div class="border-box community-write">
		<div class="contents-table"><!-- contents-table Start -->
			<h3 class="subtitle">글쓰기</h3>
			<form name="writeForm" id="writeForm" action="/post/write" method="post" target="" onsubmit="">

				<table cellspacing="0" class="request m_t10">
				<colgroup>
					<col style="width:13%">
					<col style="width:87%">
				</colgroup>
				<tbody>
				<tr>
					<th scope="row">제목</th>
					<td class="tleft">
						<input type="text" class="max" title="제목을 입력하세요" name="title" placeholder="제목을 입력하세요." style="width:640px;">
					</td>
				</tr>
				<tr class="end">
					<th scope="row">내용</th>
					<td class="tleft">
						<div style="width:640px; height: 300px;;">
						<textarea id="content" name="content" style="width: 100%; height: 100%;" placeholder="내용을 입력하세요."></textarea>
						</div>
					</td>
				</tr>
				<tr>
					<th scope="row">파일</th>
					<td class="tleft">
						<input type="file" class="max" name="uploadFile" placeholder="..." style="width:640px;">
					</td>
				</tr>

				<tr>
					<th scope="row"></th>
					<td class="tleft">
						<div>
							<span>ID</span>
							<input type="text" class="max" title="제목을 입력하세요" name="author" placeholder="작성자" style="width:120px;">

							&nbsp;&nbsp;&nbsp;<span>PW</span>
							<input type="text" class="max" title="제목을 입력하세요" name="password" placeholder="비밀번호" style="width:120px;">
						</div>
					</td>

				</tr>

				</tbody>
			</table>
			</form>
		</div>
		<div style="padding-top: 25px;">
			<a href="#" onclick="submit()" class="btn btn-primary right">글쓰기</a>
		</div>
	</div>
</div>
</body>
<script type="text/javascript">
	function submit() {
		document.getElementById("writeForm").submit();
		return false;
	}
</script>
</html>