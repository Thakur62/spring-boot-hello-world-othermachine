package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestOperations;

@Component
public class SpringBootClient {

	@Autowired
	private RestOperations restOperations; 
	
	private String uri;
	
	
	@Autowired
	public SpringBootClient(@Value("${service.uri}") final String uri) {
		this.uri = uri;
	}
	
	public Object getSpringBootClient() {
/*		RestTemplate restTemplate = new RestTemplate();
		System.out.println("URI" + uri);
			
// */     
		String date = "2017-01-01";
//		EmployeeList employeList = new EmployeeList((long)15, "name", "designation", "expertise", null);
 		 return restOperations.postForObject(uri, date, String.class);
	}
}
