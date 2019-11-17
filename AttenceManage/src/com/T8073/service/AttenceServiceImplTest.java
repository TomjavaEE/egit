package com.T8073.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.apache.naming.java.javaURLContextFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.T8073.dao.AttenceDao;
import com.T8073.entity.Attence;

class AttenceServiceImplTest {
	private AttenceService attens=new AttenceServiceImpl();

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSelectAll() {
		List<Attence> selectAll = attens.selectAll();
		System.out.println(selectAll.size());
	}

	@Test
	void testInsertAttence() {
		Attence attence=new Attence();
		attence.setEmpName("侯成语");
		attence.setDept("管理部");
		attence.setChkDate(java.sql.Date.valueOf("2019-08-20"));
		attence.setStatus("正常");
		attens.InsertAttence(attence);
		System.out.println("成功");
	}

	@Test
	void testDeleteAttence() {
		attens.deleteAttence(6);
	}

}
