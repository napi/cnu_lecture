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
			<h3 class="subtitle">[${cnuPost.postId}] ${cnuPost.title}</h3>
				<table cellspacing="0" class="request m_t10">
				<colgroup>
					<col style="width:13%">
					<col style="width:87%">
				</colgroup>
				<tbody>
				<tr>
					<th scope="row">작성자 : </th>
					<td class="tleft">
						<span>${cnuPost.author}</span>
					</td>
				</tr>
				<tr>
					<th scope="row">작성일 : </th>
					<td class="tleft">
						<span>${cnuPost.createTime}	</span>
					</td>
				</tr>
				<tr class="end">
					<th scope="row">내용 : </th>
					<td class="tleft">
						<div style="width:640px;">
							<p>${cnuPost.content}</p>
						</div>
					</td>
				</tr>
				</tbody>
			</table>

			<h3 class="subtitle">덧글</h3>
			<ul class="fdb_lst_ul ">
				<li class="fdb_itm clear">
					<div class="meta">
						<b>Robin</b><span class="date">2016-05-16 11:00:00</span>
					</div>

					<div>
						<div class="xe_content">덧글이 이게 뭐냐</div>
					</div>

					<div class="fdb_nav img_tx">
					</div>
				</li>
				<li class="fdb_itm clear">
					<div class="meta">
						<b>Robin</b><span class="date">2016-05-16 11:00:00</span>
					</div>

					<div>
						<div class="xe_content">덧글이 이게 뭐냐</div>
					</div>

					<div class="fdb_nav img_tx">
					</div>
				</li>
			</ul>


			<div class="cmt_editor" style="margin-bottom:10px;">
				<label for="editor_2756295" class="cmt_editor_tl fl"><em>✔</em><strong>댓글 쓰기</strong></label>
				<form action="./" method="post" onsubmit="" class="bd_wrt cmt_wrt clear" editor_sequence="2756295">
					<div class="simple_wrt" style="margin-left:0px;margin-right:0px;">
						<div class="text">
							<input type="hidden" name="use_html" value="Y">
							<input type="hidden" id="htm_2756295" value="n">
							<textarea id="editor_2756295" cols="50" rows="4" style="overflow: hidden; min-height: 4em; height: 46px; width: 100%;"></textarea><div class="autogrow-textarea-mirror" style="display: none; word-wrap: break-word; padding: 4px 6px; width: 936px; font-family: Tahoma, Geneva, sans-serif; font-size: 12px; line-height: 18px;">.<br>.</div>
						</div>
					</div>
					<div class="edit_opt clear" style="padding-top: 10px;">
						<span class="itx_wrp">
							<label for="nick_name_2756295">글쓴이</label>
							<input type="text" name="nick_name" id="nick_name_2756295" value="" class="itx n_p">
						</span>
						<span class="itx_wrp">
							<label for="password_2756295">비밀번호</label>
							<input type="password" name="password" id="password_2756295" class="itx n_p">
						</span>
						<input type="submit" value="등록" class="btn_img">
						<div class="opt_chk">
						</div>
					</div>
				</form>
			</div>
		</div>
		<div style="padding-top: 25px;">
			<a href="/post" class="btn btn-primary right">목록</a>
		</div>
	</div>
</div>
</body>
</html>