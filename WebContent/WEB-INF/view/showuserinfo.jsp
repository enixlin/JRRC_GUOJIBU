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
		$.post('ModifyUser.do', dd, function(data1) {
			
			if (data1 == 1) {
				alert("修改成功");
				window.close();

			} else {
				alert("修改失败");
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
<body onkeydown="doKey()" align="center">
	<div id="main_div">
		<div id="bg_img_div">
			<div id="from_div">
				<div class="easyui-panel " title="修改用户信息"
					style="handle: '#from_div'; width: 100%; max-width: 350px; padding: 20px 30px; align: center"
					id="title">
					<div></div>
					<form:form action="ModifyUser.do" modelAttribute="User" id="ff">
						<div style="margin-bottom: 20px">
						<form:hidden path="id"/>
								<form:input class="easyui-textbox" path="name"
								style="width: 100%" data-options="label:'用户名称：'" />
						</div>

						<div style="margin-bottom: 20px">
							<form:input class="easyui-passwordbox" 
								style="width: 100%" data-options="label:'密码:'"  path="password" />
								
						</div>
						
						<div style="margin-bottom: 20px">
								<input class="easyui-textbox" name="status"
								style="width: 100%" data-options="label:'状态:'" value="1">
						</div>

						<div
							style="padding-right: 0px; width: 250px; border: 0px solid #ccc; text-align: right;">

							<a href="#" class="easyui-linkbutton"
								style="padding-left: 10px; padding-right: 10px; margin-right: 10px"
								iconCls="icon-no">重置</a> <a href="#" class="easyui-linkbutton"
								style="padding-left: 10px; padding-right: 10px"
								iconCls="icon-ok" onclick="submit1()">修改</a>
						</div>


					</form:form>
				</div>
			</div>
		</div>
	</div>


</body>
</html>

