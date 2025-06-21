package in.IT.beans;

import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
public class MySQLDBReportDao implements reportDao {

	public void getData() {
		System.out.println("Getting data from mysql db ");
	}

}
