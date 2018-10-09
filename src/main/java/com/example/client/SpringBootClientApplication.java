package com.example.client;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootClientApplication implements CommandLineRunner {

	public static void main(String args[]) {
		SpringApplication.run(SpringBootClientApplication.class, args);
	}
	
	@Autowired
	private SpringBootClient springbootClient;
	
	@Override
	public void run(String... args) throws Exception {
		Object obj = springbootClient.getSpringBootClient();
		JSONArray jo = new JSONArray(obj.toString());
		for (Object obj1 : jo) {
//			JSONObject jsonObject = new JSONObject(obj1.toString());
			System.out.println("Received roomName" + obj1);
		}
	}
}
