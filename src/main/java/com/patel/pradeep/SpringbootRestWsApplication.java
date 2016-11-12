package com.patel.pradeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mangofactory.swagger.plugin.EnableSwagger;

@SpringBootApplication
@EnableSwagger
public class SpringbootRestWsApplication {

	public static void main(String[] args) {
		//java -cp F:\eclipseTutorials\installed\repo\com\h2database\h2\1.4.192\h2-1.4.192.jar org.h2.tools.Console
		SpringApplication.run(SpringbootRestWsApplication.class, args);
	}
}
