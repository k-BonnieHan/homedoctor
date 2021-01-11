package pack.model;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pack.controller.PatientBean;

@Repository
public class PatientDaoImpl extends SqlSessionDaoSupport implements PatientDaoInter {
	private SqlSessionTemplate sqlSession;
	
	public PatientDaoImpl() {
		
		
	}
	@Autowired
	public PatientDaoImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);

	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	// 로그인
	@Override
	public List<PatientDto> patientList() {
		return getSqlSession().selectList("selectPatientData");
	}

	@Override
	public PatientDto getLoginInfo(String p_id) {
		return getSqlSession().selectOne("selectLoginData", p_id);
	}

	// 로그아웃
	@Override
	public void logout(HttpSession session) {
		// 세션 정보 초기화
		session.invalidate();

	}
	
	
	@Override
	public boolean insert(PatientBean pbean) {
		int re = getSqlSession().insert("insertPatient", pbean);
		if(re>0) return true;
		else return false;
	}




}
