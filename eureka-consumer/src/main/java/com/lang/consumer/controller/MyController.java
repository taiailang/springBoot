package com.lang.consumer.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MyController {

	@Autowired
	EurekaClient eurekaClient;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/client")
	public String get(){
		List<InstanceInfo> provider = eurekaClient.getInstancesByVipAddress("PROVIDER", false);
		InstanceInfo info = provider.get(0);
		String forObject=null;
		System.out.println(info);
		if (info.getStatus()!= InstanceInfo.InstanceStatus.DOWN){
			System.out.println(info.getIPAddr());
			System.out.println(info.getPort());
			String url="http://"+info.getIPAddr()+":"+info.getPort()+"/getHi";
			RestTemplate restTemplate = new RestTemplate();
			 forObject = restTemplate.getForObject(url, String.class);

		}

//		String forObject = restTemplate.getForObject("http://Provider/getHi", String.class);
		System.out.println(forObject);
		return forObject;
	}
}
