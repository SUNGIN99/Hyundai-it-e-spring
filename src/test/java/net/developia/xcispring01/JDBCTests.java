package net.developia.xcispring01;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.log4j.Log4j;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@ContextConfiguration(locations = "file:**/*-context.xml")
@Log4j
public class JDBCTests {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnection() {
		try(Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/XEPDB1",
				"SCOTT1",
				"TIGER"
				)) {
			log.info(con);
			log.debug(con);
			log.warn(con);
			log.error(con);
			log.fatal(con);
			// System.out.println 과의 차이 
			// System.out.pirntln 지우기 힘듬
			// log로 했다면, 원하는 로그를 선택할 수 있음.
			// log4j.xml에서 수정
		}catch (Exception e) {
			fail(e.getMessage());
		}
	}

}
