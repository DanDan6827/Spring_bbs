<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{margin: 0 auto; border: 1px solid black; height: 300px;}

</style>
<script type="text/javascript">
	function login_go(f) {
		if (f.id.value==""||f.pw.value=="") {
			alert("아이디혹은 패스워드를 입력하세요");
			f.id.value="";
			f.pw.value="";
			f.id.focus();
			return;
		}
		f.action="login_ok.do";
		f.submit();
	}
	//미완
function join_go(f) {
	f.action="join.do";
	f.submit();
	}
</script>
</head>
<body>
	<div id="log_div">
		<form method="post">
			<table>
				<thead>
					<tr>
						<th colspan="2"><h2>LogIn</h2> </th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th>아이디:</th>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<th>패스워드:</th>
						<td><input type="password" name="pw"></td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="2">
							<input type="button" value="로그인" onclick="login_go(this.form)">
							<input type="button" value="회원가입" onclick="join_go(this.form)">
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>