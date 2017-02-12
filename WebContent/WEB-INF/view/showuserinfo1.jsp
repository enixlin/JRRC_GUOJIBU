<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="UTF-8">
<title>欢迎登录国际业务部信息查询系统</title>
<link rel="stylesheet" type="text/css"
	href="Public/jquery-easyui-1.5/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="Public/jquery-easyui-1.5/themes/icon.css">

<script type="text/javascript"
	src="Public/jquery-easyui-1.5/jquery.min.js"></script>
<script type="text/javascript"
	src="Public/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<!-- onmousedown="drag()" onmouseup="Canceldrag()" -->
<script type="text/javascript">
	function doKey() {
		if (event.keyCode == 13) {
			submit1();
		}
	}



	function submit1() {
		var dd = $("#ff").serialize();
		$.post('AddUser.do', dd, function(data1) {
			alert(data1);
			if (data1 == 1) {
				alert("添加成功");

			} else {
				alert("添加失败");
			}

		});
	}

	$("#bg_img_div").css({
		"border" : "0px solid gray",
		"background-Image" : "url('Public/res/image/Loginbg.jpg')",
		"height" : "500px",
		"width" : "1000px",
		"margin" : "20px auto",
	});

	$("#main_div").css({
		"width" : "100%",
		"margin" : "10px auto",
		"text-align" : "center"
	});

	$("#from_div").css({
		"width" : "100%",
		"max-width" : "350px",
		"padding" : "10px",
		"float" : "right",
		"margin" : "160px 30px",

	});

	function drag() {
		$('#from_div').draggable({});
	}
	function Canceldrag() {
		$('#from_div').draggable({
			disabled : "true"
		});
	}
</script>

</head>
<body>
<div width="300px" align="center"  >
<form:form action="ModifyUser.do" modelAttribute="User">
<table style="background:gray">
<form:hidden path="id"/>
<tr>
<td>用户名：</td><td><form:input path="name"/></td>
</tr>
<tr>
<td>密码：</td><td><form:input path="password"/></td>
</tr>
<tr>
<td>状态：</td><td><form:input path="status"/></td>
</tr>
<tr><td></td><td colspan="1" align="center"><input type="submit" value="保存修改"></td></tr>
</table>

</form:form>
</div>
</body>
</html>

