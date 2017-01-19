package com.turreta.apache.camel.demo;

import org.apache.camel.CamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComTurretaApacheCamelDemoApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(ComTurretaApacheCamelDemoApplication.class, args);

		CamelContext camelContext = (CamelContext)ctx.getBean("camelContext");

		camelContext.addRoutes(new MyRouteBuilder());
		camelContext.start();

		Thread.sleep(60*100);
		camelContext.stop();
	}
}
