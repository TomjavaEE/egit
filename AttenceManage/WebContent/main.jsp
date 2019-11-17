<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/main.css"> 
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
<title>考勤时间记录表</title>
</head>
<body>
<div id="all" >

<table border="1" cellspacing="0" id="tab">
<tr><h2 style="text-align: center">考勤时间记录表</h2></tr>
	<tr>
	<td>员工姓名</td>
	<td>所属部门</td>
	<td>考勤日期</td>
	<td>考勤状态</td>
	<td>操作</td>
	</tr>
	<c:forEach items="${requestScope.selectAll }" var="item">
	<tr>
	<td>${item.empName }</td>
	<td>${item.dept }</td>
	<td>${item.chkDate }</td>
	<td>${item.status }</td>
	<td><a href="javascript:void(0)" onclick="del(${item.id})">删除</a></td>
	</tr>
	</c:forEach>
</table>
<div id="da"><a href="add.jsp">考勤登记</a></div>
</div>


</body>
</html>