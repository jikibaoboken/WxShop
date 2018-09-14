<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/user/login.action">
		<table border=0>
			<tr>
				<td>
					<input name="username" value="用户名" type="text"/>
				</td>
			</tr>		
			<tr>
				<td>
					<input name="password" value="密码" type="password"/>
				</td>
			</tr>	
			<tr>
				<td>
					<input name="submit" value="提交" type="submit"/>
				</td>
			</tr>	
		</table>
	</form>

</body>
</html>