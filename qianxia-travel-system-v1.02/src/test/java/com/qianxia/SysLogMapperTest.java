package com.qianxia;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.qianxia.sys.mapper.SysLogMapper;

@SpringBootTest
public class SysLogMapperTest {

	@Autowired
	private SysLogMapper sysLogMapper;
	
	@Test
	public void sysLogMapper() {
		int rows = sysLogMapper.deleteObject(13);
		System.out.println("rows="+rows);
	}
	
	@Test
	public void sysLogMapperTests() {
		int rows = sysLogMapper.deleteObjects(15,16,17);
		System.out.println("rows="+rows);
	}
	
}
