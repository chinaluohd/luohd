package com.test.message.messageController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	
private final Logger logger = LoggerFactory.getLogger(MsgController.class);
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping(value="/message",method=RequestMethod.GET)
	public String index() {
		List<ServiceInstance> list = discoveryClient.getInstances("message-code");
		for(ServiceInstance s:list){
			logger.info("host:"+s.getHost()+",service_id:"+s.getServiceId());
		}		
		return "Hello World";
	}
}
