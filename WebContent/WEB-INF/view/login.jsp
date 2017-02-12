 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!--  引入extjs库-->
<link rel="stylesheet" type="text/css"
	href="../Public/Extjs/theme-triton/resources/theme-triton-all.css" />
<script type="text/javascript" src="../Public/Extjs/ext.js"></script>
<script type="text/javascript" src="../Public/Extjs/ext-all.js"></script>
<!-- 加载EXTjs中文配置文件 -->
<script type="text/javascript" src="../Public/Extjs/locale/locale-zh_CN-debug.js"></script>
<script type="text/javascript" src="../Public/js/login.js"></script>

</head>
<body>
	<div id="container">
		<div id="head">国际业务信息查询系统</div>
		<div id="content"></div>
		<div id="login">
			<div id="information"></div>
			<div id="loginForm"></div>
		</div>
		<div id="copyRight">融和农商银行国际业务部版权所有@2017年1月</div>
	</div> 

</body>
</html>

<script>
	
</script>


<style>
#container {
	width: 1002px;
	height: 624px;
	border: 1px solid gray;
	margin: 10px auto
}

#head {
	width: 1000px;
	height: 60px;
	border: 0px solid gray;
	background: white;
	text-align: center;
	font-size: 30px;
	line-height: 60px;
	font-weight: 300;
	font-family: 'Open Sans', 'Helvetica Neue', helvetica, arial, verdana, sans-serif;
}

#content {
	width: 1000px;
	height: 400px;
	border: 0px solid gray
}

#login {
	width: 1002px;
	height: 140px;
	margin: 0px auto
}

#information {
	width: 700px;
	height: 140px;
	border: 0px solid gray;
	background: white;
	float: left;
	margin-left: 2px
}

#loginForm {
	width: 298px;
	height: 140px;
	border: 0px solid gray;
	background: #abcdef;
	float: left;
	margin-left: 0px
}

#copyRight {
	width: 1000px;
	height: 20px;
	border: 1px solid gray, background:gray;
	text-align: center;
	font: 10px/20px '微软雅黑' 'heiti' serif
}
</style>