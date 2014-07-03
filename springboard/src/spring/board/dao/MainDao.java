package spring.board.dao;

import java.util.List;
import java.util.Map;

public interface MainDao  {
	public String getToday();
	
	public int writeProc(Map<String, Object> paraMap);

	public List getList(Map<String, Object> paramMap);
}
