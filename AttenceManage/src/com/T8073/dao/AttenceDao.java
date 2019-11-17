package com.T8073.dao;

import java.util.List;

import com.T8073.entity.Attence;
import com.T8073.entity.Pet;

public interface AttenceDao {
	List<Attence> selectAll(); //查询所有宠物信息
	int InsertAttence(Attence atten); //添加宠物信息
	int deleteAttence(int id); //删除方法
	

}
