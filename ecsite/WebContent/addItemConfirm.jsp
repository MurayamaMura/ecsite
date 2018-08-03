<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>AddItemConfirm</title>
</head>
<body>
	<div>
		<p>登録の内容は以下でよろしいですか？</p>
		<table>
			<s:form action="AddItemCompleteAction">
			<tr>
				<td>商品名</td>
				<td><s:property value="itemName"/></td>
			</tr>
			<tr>
				<td>価格</td>
				<td><s:property value="itemPrice"/></td>
			</tr>
			<tr>
				<td>在庫数</td>
				<td><s:property value="itemStock" /></td>
			</tr>
			<tr>
				<td><s:submit value="完了"/></td>
			</tr>
			</s:form>
		</table>
	</div>
	<div>

	</div>
</body>
</html>