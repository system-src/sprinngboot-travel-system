package com.qianxia.sys.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysLogMapper {

	@Delete("delete from sys_logs where id = #{id}")
	int deleteObject(Integer id);
	
	int deleteObjects(@Param("ids") Integer... ids);
}
