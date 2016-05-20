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
			<h3 class="subtitle">[1] 제목입니다.</h3>
				<table cellspacing="0" class="request m_t10">
				<colgroup>
					<col style="width:13%">
					<col style="width:87%">
				</colgroup>
				<tbody>
				<tr>
					<th scope="row">작성자 : </th>
					<td class="tleft">
						<span>Robin</span>
					</td>
				</tr>
				<tr>
					<th scope="row">작성일 : </th>
					<td class="tleft">
						<span>2015-05-15 19:00:15</span>
					</td>
				</tr>
				<tr class="end">
					<th scope="row">내용 : </th>
					<td class="tleft">
						<div style="width:640px;">
							<p>
								소환사 여러분,<br><br>

								패치 노트와 개발자 노트, 그 외의 공식 공지에서 '카운터 정글링'을 '상대 정글에 침입하여 몬스터를 사냥해 이로운 효과를 가로채고 상대 정글 사냥꾼의 성장을 방해하거나 또는 상대 정글 사냥꾼을 직접 암살하려 하는 전략'이라고 표현하는 이유가 궁금하셨죠?
								라이엇 게임즈가 한국 문화를 지키기 위해 노력하는 것처럼, 한편으로 우리 말을 소중히 하고 '커뮤니티 용어'가 낯선 신규 소환사 여러분을 배려하기 위한 저희 노력의 일환이었습니다.
								하지만 이런 방식이 문맥을 필요 이상으로 복잡하게 만들어, 오히려 내용을 이해하기 어려워지는 측면도 있었습니다.<br><br>

								2015 시즌 첫 패치부터 패치 노트와 개발자 노트 등의 공지에서 해당 용어를 사용하여 내용을 보다 간결하고 명료하게 전달할 수 있는 경우에는 '커뮤니티 용어'를 활용하기로 했습니다. 또한, 그런 말들이 아직 낯선 소환사 여러분들을 위해 하단에 용어 해설을 추가하고, 소환사 광장을 통해 용어 해설을 제공해드리게 되었습니다.
								추가나 수정 필요한 사항에 대한 의견이나 다른 건의사항 또한 소환사 광장 해당 게시물에 댓글로 달아주시면 감사하겠습니다.<br>
								앞으로도 계속해서 개선된 모습 보여드리기 위해 노력하겠습니다.<br>
								정의의 전장에서 승리를 기원합니다.<br>
							</p>
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
			<a href="#" class="btn btn-primary right">목록</a>
		</div>
	</div>
</div>
</body>
</html>