package com.beidou.servicehi;

import com.beidou.servicehi.config.TestConfig;
import com.beidou.servicehi.model.BdConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableAutoConfiguration
public class ServiceHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}

	@Value("${server.port}")
	String port;

	@Autowired
	private TestConfig testConfig;

	@RequestMapping(value = "/hi")
	public String home(@RequestParam String name) {

		String frameWork = testConfig.getFrameWork();
		System.out.println(frameWork);


		return "hi " + name + ",i am from port:" + port;

	}

}
