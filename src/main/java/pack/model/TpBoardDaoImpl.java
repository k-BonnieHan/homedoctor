package pack.model;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pack.controller.TpBean;

@Repository
public class TpBoardDaoImpl extends SqlSessionDaoSupport implements TpBoardDaoInter {

	@Autowired
	public TpBoardDaoImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	@Override
	public ArrayList<TpDto> getList() {
		return (ArrayList)getSqlSession().selectList("selectTpList");

	}
	
	@Override
	public ArrayList<TpDto> getSearch(TpBean tpbean) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public TpDto getDetail(String tp_num) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean insert(TpBean tpbean) {
		int re = getSqlSession().insert("insertTp", tpbean);
		if(re > 0)
			return true;
		else
			return false;
	}
	
	
	
	
	
	//페이지
	@Override
	public int totalCnt() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int currentNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean updateReadcnt(String tp_num) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
