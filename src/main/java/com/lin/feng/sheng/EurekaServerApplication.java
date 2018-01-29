package com.lin.feng.sheng;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
	public static Logger logger= Logger.getLogger(EurekaServerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);

		logger.debug("debug ################# server start .....服务起来了。");
		logger.info("info #################  server start .....服务起来了。");
		logger.error("error #################  server start .....服务起来了。");
		logger.warn("warn #################   server start .....服务起来了。");
	}




}
