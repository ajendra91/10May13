package com.example.RibbonClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
//@RibbonClient(name = "AJAY")
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}


	@Autowired
	private RestTemplate template;

	@Autowired
	public LoadBalancerClient loadBalancerClient;

	public String url="http://AJAY/hello/";

	@GetMapping("/demo/{name}")
	public String invokeCharbook(@PathVariable String name) {
		String url2 = loadBalancerClient.choose("AJAY").getUri().toString();
		System.out.println(url2);

		//return template.getForObject(url+name , String.class);
		return template.getForObject(url2+"/hello/"+name , String.class);
	}

	@Bean
	//@LoadBalanced
	public RestTemplate template() {

		return new RestTemplate();
	}


}
