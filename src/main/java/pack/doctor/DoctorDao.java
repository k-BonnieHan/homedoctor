package pack.doctor;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorDao extends SqlSessionDaoSupport {
	@Autowired
	public DoctorDao(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}
	
	public List<BuserDto> ClassList(){
		List<BuserDto> list = getSqlSession().selectList("selectClass");
		System.out.println(list.size());
		return list;
	}
	
	public List<DoctorDto> DoctorList(String c_class){
		List<DoctorDto> list = getSqlSession().selectList("selectDoctorName", c_class);
		return list;
	}

	


}
