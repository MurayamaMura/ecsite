<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>ManagerPage</title>
</head>
<body>
<h1>管理者用ページ</h1>
<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
		<s:form action="AddItemAction">
 			<s:submit value="商品を追加する"/>
		</s:form>
		<br>
		<div>
			<span>前画面に戻る場合は</span>
			<a href='<s:url action="ManagerAction"/>'>こちら</a>
		</div>
	</div>
</div>
	<div id="footer">
	<div id="pr">
	</div>
</div>
</body>
</html>