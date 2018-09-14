<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>register</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/user/insert.action">
		<table border=0>
			<tr>
				<td>
					<input name="username" value="用户名" type="text"/>
				</td>
			</tr>		
			<tr>
				<td>
					<input name="password" value="密码" type="text"/>
				</td>
			</tr>	
			<tr>
				<td>
					<input name="mailbox" value="邮箱" type="text"/>
				</td>
			</tr>	
			<tr>
				<td>
					<input name="address" value="地址" type="text"/>
				</td>
			</tr>		
			<tr>
				<td>
					<input name="phone" value="电话" type="text"/>
				</td>
			</tr>		
			<tr>
				<td>
					<input name="sex" value="性别" type="text"/>
				</td>
			</tr>		
			<tr>
				<td>
					<input name="age" value="年龄" type="text"/>
				</td>
			</tr>		
			<tr>
				<td>
					<input name="nickname" value="昵称" type="text"/>
				</td>
			</tr>		
			<tr>
				<td>
					<input name="account_createTime" value="账户创建时间" type="text"/>
				</td>
			</tr>
			<tr>
				<td>
					<input name="cyberspace_avatar" value="头像" type="text"/>
				</td>
			</tr>	
			<tr>
				<td>
					<input value="提交" type="submit"/>
				</td>
			</tr>					
		</table>
	</form>
</body>
</html>