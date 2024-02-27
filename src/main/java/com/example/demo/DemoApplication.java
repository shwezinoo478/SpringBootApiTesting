package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Testing");
		SpringApplication.run(DemoApplication.class, args);
		
	}
	
	@GetMapping("/hello")
	public String SayHello() {
		return "hello world";
	}
	@GetMapping("/hello2")
	public String SayHello2() {
		return "hello world";
	}

}
//spring.datasource.url=jdbc:sqlserver://DESKTOP-04ES2CS/SQLEXPRESS:1433;
//spring.datasource.url=jdbc:sqlserver://DESKTOP-04ES2CS/SQLEXPRESS:1433;databaseName=TestingDB
//	//spring.datasource.url=jdbc:sqlserver://DESKTOP-04ES2CS/SQLEXPRESS:1433;databaseName=TestingDB
//	spring.datasource.username=DESKTOP-04ES2CS\Shwe Zin Oo
//	spring.datasource.driverClassName=com.microsoft.sqlserver.jdbc.SQLServerDriver
//	spring.jpa.show-sql=true
//	encrypt = false
//	trustServerCertificate=true;
//	spring.jpa.hibernate.dialect=org.hibernate.dialect.SQLServer2012Dialect
//	spring.jpa.hibernate.ddl-auto = create-drop