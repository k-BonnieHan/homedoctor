package pack.model;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import pack.controller.PatientBean;

public interface PatientDaoInter {

	//회원가입
	boolean insert(PatientBean pbean);
	
	
	//로그인
	List<PatientDto> patientList();	
	PatientDto getLoginInfo(String p_id);
	
	//로그아웃
	void logout(HttpSession session);

}
