package com.T8073.dao;

import java.util.List;

import com.T8073.entity.Attence;
import com.T8073.entity.Pet;

public interface AttenceDao {
	List<Attence> selectAll(); //��ѯ���г�����Ϣ
	int InsertAttence(Attence atten); //��ӳ�����Ϣ
	int deleteAttence(int id); //ɾ������
	

}
