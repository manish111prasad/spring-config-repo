package in.IT.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracleDao")
@Primary
public class OracleDBReportDao implements reportDao {

	public void getData() {
	System.out.println("Getting data from Oracle db ");
	}
	
}
