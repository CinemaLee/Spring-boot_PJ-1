package com.study.springboot.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.dao.ISimpleBbsDao;
import com.study.springboot.dto.SimpleBbsDto;

@Service // 사람이 구분하기 위함.
public class SimpleBbsService implements ISimpleBbsService{
	
	@Autowired
	ISimpleBbsDao dao;
	
	@Override
	public List<SimpleBbsDto> list() {
		// TODO Auto-generated method stu
		return dao.listDao();
	}

	@Override
	public SimpleBbsDto view(String id) {
		// TODO Auto-generated method stub
		return dao.viewDao(id);
	}

	@Override
	public int write(Map<String, String> map) {
		// TODO Auto-generated method stub
		int nResult = dao.writeDao(map);
		return nResult;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		int nResult = dao.deleteDao(id);
		return nResult;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		int nResult = dao.articleCount();
		return nResult;
	}

}
