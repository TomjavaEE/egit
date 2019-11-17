function del(id){
	 var r=confirm("确认要删除吗!");
	 if(r==true){
			$.ajax({
			url:"deleteServlet",
			type:"get",
			data:"id="+id,
			dataType:"text",
			success:function(result){
				if(result>0){
					location.href="selectAllServlet";
				}
			}
		 })
	 }
}
