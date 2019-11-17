package com.T8073.service;

import java.util.List;

import com.T8073.dao.AttenceDao;
import com.T8073.dao.AttenceDaoImpl;
import com.T8073.entity.Attence;
import com.T8073.entity.Pet;
import com.T8073.util.BaseDao;

public class AttenceServiceImpl extends BaseDao implements AttenceService{
	private static AttenceDao attenceDao=new AttenceDaoImpl();

	@Override
	public List<Attence> selectAll() {
		// TODO Auto-generated method stub
		return attenceDao.selectAll();
	}

	@Override
	public int InsertAttence(Attence atten) {
		// TODO Auto-generated method stub
		return attenceDao.InsertAttence(atten);
	}

	@Override
	public int deleteAttence(int id) {
		// TODO Auto-generated method stub
		return attenceDao.deleteAttence(id);
	}
	
	
}
