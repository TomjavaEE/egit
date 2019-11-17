package com.T8073.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.T8073.entity.Attence;
import com.T8073.util.BaseDao;

public class AttenceDaoImpl extends BaseDao implements AttenceDao{

	//查询所有宠物的信息
	@Override
	public List<Attence> selectAll() {
		List<Attence> list=new ArrayList<Attence>();
		ResultSet res=null;
		String sql="select * from attence";
		Attence atten=null;
		try {
			res=this.executeQuery(sql);
			while(res.next()) {
				atten=new Attence();
				atten.setId(res.getInt("id"));
				atten.setEmpName(res.getString("empName"));
				atten.setDept(res.getString("dept"));
				atten.setChkDate(res.getDate("chkDate"));
				atten.setStatus(res.getString("status"));
				list.add(atten);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
	//增加宠物的信息
	@Override
	public int InsertAttence(Attence atten) {
		int res=0;
		String sql="insert into attence values(null,?,?,?,?)";
		res=this.executeUpdate(sql,atten.getEmpName(),atten.getDept(),atten.getChkDate(),atten.getStatus());
		return res;
	}

	@Override
	public int deleteAttence(int id) {
		int res=-1;
		String sql="delete from attence where id=?";
		res=this.executeUpdate(sql, id);
		return res;
	}

}
