package com.venkat.springjenkins;

import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Logger logger=Logger.getLogger(SpringJenkinsApplicationTests.class.getName());

	@Test
	void contextLoads() {
		logger.info("First Test case executing");
		assertEquals(true,true);
	}

}
