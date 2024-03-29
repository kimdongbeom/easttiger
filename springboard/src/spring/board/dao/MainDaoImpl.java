package spring.board.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class MainDaoImpl extends SqlSessionDaoSupport implements MainDao {
	
	public String getToday() {
		String today =  (String)getSqlSession().selectOne("main.getToday");
		return today;
	}
	
	public int writeProc(Map<String, Object> paramMap){
		return getSqlSession().insert("main.writeProc", paramMap);
	}

	public List getList(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return (List) getSqlSession().selectList("main.getList");
	}
}
