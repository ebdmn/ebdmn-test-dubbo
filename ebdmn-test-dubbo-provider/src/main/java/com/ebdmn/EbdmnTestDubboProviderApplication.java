package com.ebdmn;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.ebdmn.manager")
public class EbdmnTestDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbdmnTestDubboProviderApplication.class, args);
	}

}
