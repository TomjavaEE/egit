<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="css/add.css">
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/add.js"></script>
<title>考勤记录登记表</title>
</head>
<body>
	<div id="all">
		<form action="addServlet" method="post" id="form">
			<div id="div">
				<strong>添加考勤记录</strong>
			</div>
			<table border="1" cellspacing="0" id="tab">
				<tr>
					<td>员工姓名</td>
					<td><input type="text" name="empName" id="empName"></td>
				</tr>
				<tr>
					<td>所属部门</td>
					<td><input type="text" name="dept" id="dept"></td>
				</tr>
				<tr>
					<td>考勤日期</td>
					<td><input type="text" name="chkDate" id="chkDate"><span
						style="font-size: 10px">日期必须是:yyyy-MM-dd</span></td>
				</tr>
				<tr>
					<td>考勤状态</td>
					<td><select name="status" id="status">
							<option value="请选择考勤类型">请选择考勤类型</option>
							<option value="正常">正常</option>
							<option value="迟到">迟到</option>
					</select></td>
				</tr>
			</table>
			<div style="text-align: center;border:1px solid black;">
				<input  type="submit" value="登记">
			</div>
		</form>
	</div>
</body>
</html>