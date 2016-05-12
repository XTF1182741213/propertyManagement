<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>用户注册</title>

</head>

<body><br><br><br><br>
	<div align="center">
		${requestScope.message}
		<s:form action="register" method="POST">
			<s:textfield name="userName" label="user name" />
			<s:password name="password" size="21" label="password" />
			<s:password name="passwordConfirm" size="21" label="passwordConfirm" />
			<s:textfield name="phoneNumber" label="phoneNumber" />
			<s:textfield name="email" label="email" />
			<s:textfield name="sexual" label="sexual" />
			<s:submit value="OK" />
		</s:form>
	</div>
</body>
</html>
