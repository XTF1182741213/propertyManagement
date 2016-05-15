<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>

${requestScope.message}

	<s:form action="postRepairOrder" theme="simple" enctype="multipart/form-data">
		<table align="center" width="50%" border="1">
			<tr>
				<td>问题描述：</td>
				<td><s:textfield name="problemDescription"></s:textfield></td>
			</tr>
			<tr>
				<td>物业故障地点：</td>
				<td><s:textfield name="place"></s:textfield></td>
			</tr>
			<tr>
				<td>现场照片：</td>
				<td id="more"><s:file name="file"></s:file></td>
			</tr>
			<tr>
				<td><s:submit value=" submit "></s:submit></td>
				<td><s:reset value=" reset "></s:reset></td>
			</tr>
		</table>
	</s:form>
</body>

</html>