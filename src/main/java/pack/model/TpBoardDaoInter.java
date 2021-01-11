package pack.model;

import java.util.ArrayList;

import pack.controller.TpBean;

public interface TpBoardDaoInter {
	ArrayList<TpDto> getList();
	ArrayList<TpDto> getSearch(TpBean bean);
	
	boolean insert(TpBean tpbean);
	TpDto getDetail(String tp_num);
	
	int currentNum();
	int totalCnt();
	boolean updateReadcnt(String tp_num);
	
	
}
