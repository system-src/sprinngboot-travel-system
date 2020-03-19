package com.qianxia;

import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class DataSourceTests {
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testDataSource() throws Exception {
		if (dataSource != null) {
			System.out.println(dataSource.getConnection());
		}
	}
	
}
