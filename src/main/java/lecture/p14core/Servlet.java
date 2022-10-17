package lecture.p14core;

import lombok.Setter;

public class Servlet {
	@Setter
	private Dao dao;
	
	public Dao getDao() {
		return dao;
	}	
}
