<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>

<link rel="stylesheet" type="text/css"
	href="Public/jquery-easyui-1.5/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="Public/jquery-easyui-1.5/themes/icon.css">

<script type="text/javascript"
	src="Public/jquery-easyui-1.5/jquery.min.js"></script>
<script type="text/javascript"
	src="Public/jquery-easyui-1.5/jquery.easyui.min.js"></script>

</head>
<body>
	<input type="button" value="添加用户" onclick="AddUser()">
	<input type="button" value="保存修改" onclick="ModifyAllUser()">
	<form name="userForm" action="modifyuser.do" method="post">
		<table width="100%" border=1>
			<tr>
				<td>编号</td>
				<td>用户名</td>
				<td>密码</td>
				<td>状态</td>
				<td>操作</td>

			</tr>
			<c:forEach items="${UserList }" var="user" varStatus="status">
				<tr>
					<td>${user.id}</td>
					<input type="hidden" name="UserList[${status.index}].id"
						value=${user.id } />
					<td><input name="UserList[${status.index}].name"
						value=${user.name } width="100%" border=0></td>
					<td><input name="UserList[${status.index}].password"
						value=${user.password } border=0></td>
					<td><input name="UserList[${status.index}].status"
						value=${user.status } border=0></td>
					<td align="center"><a href="" id=${user.id
						} onclick="DeleteUser(id)">删除</a></td>

				</tr>

			</c:forEach>


		</table>
	</form>
</body>
</html>

<script>
	function AddUser() {
		window.open("showAddUser.do");
	}

	function DeleteUser(id) {
		if (confirm("确定要删除该用户：编号（" + id + ")")) {
			$.get("DeleteUser.do?id=" + id, function(data1) {
				if (data1 == "1") {
					alert("用户删除成功，用户编号：" + id);
				}
			});
		}
	}

	function ModifyAllUser() {
		document.userForm.submit();

	}
</script>