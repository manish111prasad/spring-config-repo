package in.IT.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class reportService {

	@Autowired
	//@Qualifier("mysqlDao")
	private reportDao Dao;
	
	public void generateReport(){
 	Dao.getData();
	//System.out.println("");	
	
	}
}
