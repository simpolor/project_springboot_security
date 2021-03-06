<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Role Register</title>
<script>
	function f_submit(){
		document.getElementById("roleRegisterForm").submit();
	}
	
	function f_move( url ){
		location.href = url;
	}
</script>
</head>
<body>
	<h1>Role Register</h1>

	<form id="roleRegisterForm" action="/role/register" method="post"> 
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<table>
			<tr>
				<td><label for="role_code">Role Code</label></td>
				<td><input type="text" name="role_code" id="role_code" /></td>
			</tr>
			<tr>
				<td><label for="role_name">Role Name</label></td>
				<td><input type="text" name="role_name" id="role_name" /></td>
			</tr>
		</table>
	</form>
	
	<hr> 
	
	<button onclick="f_submit()">등록</button>
	<button onclick="f_move('${pageContext.request.contextPath}/role/list')">뒤로가기</button>
	
</body>
</html>