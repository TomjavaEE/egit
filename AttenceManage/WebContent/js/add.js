$(function(){
	$("#form").submit(function(){
		if($("#empName").val()==""){
			alert("姓名不能为空");
			return false;
		}
		
		if($("#dept").val()==""){
			alert("部门不能为空不能为空");
			return false;
		}
		
		var sun=$("#chkDate").val().split("-");
		if(!(sun.length==3)){
			alert("日期格式不正确");
			return false;
		}
	
		
		if($("#status").val()=="请选择考勤类型"){
			alert("请选择考勤");
			return false;
		}
		
		return true;
		
	})
})