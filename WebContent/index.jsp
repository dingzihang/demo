<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/view/common/common.jsp" %>
</head>
<body>
	<table>
		<tr>
			<td><input type="text" name="qrPath" value="D:\temp\img"> </td>
			<td><input type="button" name="selectQRPath" value="选择图片保存路径"> </td>
		</tr>
		<tr>
			<td><input type="button" name="login" value="登录"> </td>
		</tr>
	</table>
	
	<script type="text/javascript" src="/Demo/resources/common/jquery-3.4.0.min.js"></script>
	<script type="text/javascript" src="/Demo/resources/login.js"></script>
</body>
</html>