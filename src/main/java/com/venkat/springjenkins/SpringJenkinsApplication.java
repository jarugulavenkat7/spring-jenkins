package com.venkat.springjenkins;


import java.util.logging.Logger;

import javax.annotation.PostConstruct;

import org.apache.logging.log4j.spi.LoggerContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsApplication {
public static Logger logger=Logger.getLogger(SpringJenkinsApplication.class.getName());
@PostConstruct
public void init() {
logger.info("Application Started...")hjgjhh;
}
	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
