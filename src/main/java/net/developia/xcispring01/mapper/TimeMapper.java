package net.developia.xcispring01.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	@Select("SELECT sysdate FROM DUAL")
	public String getTime();
}
