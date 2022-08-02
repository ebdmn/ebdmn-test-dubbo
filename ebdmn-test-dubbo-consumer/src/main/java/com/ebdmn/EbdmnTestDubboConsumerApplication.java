package com.ebdmn;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class EbdmnTestDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbdmnTestDubboConsumerApplication.class, args);
	}

}
