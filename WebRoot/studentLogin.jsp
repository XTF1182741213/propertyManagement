<%@ page contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>ng page</title>

</head>

<body>
	<div align="center">
		${requestScope.message}
		<s:form action="studentLogin" method="POST">
			<s:textfield name="userName" label="user" />
			<s:password name="password" size="21" label="password" />
			<s:submit value="OK" />
		</s:form>
	</div>
</body>
</html>
