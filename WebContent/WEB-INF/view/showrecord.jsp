<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<input type="button" value="添加用户"  onclick="adduser()">
<table width="100%" border=1>
<tr>
<td>客户名</td>
<td>业务类型</td>
<td>日期</td>
<td>修改</td>
<td>删除</td>
</tr>

<c:forEach items="${recordlist }" var ="record">
<tr>
<td>${record.name }</td>
<td>${record.yw_type }</td>
<td>${record.yw_date }</td>
<td><a href="">修改</a></td>
<td><a href="">删除</a></td>
</tr>
</c:forEach>


</table>
</body>
</html>

<script>


function adduser(){
	window.open("showadduser.do");   
}


</script>