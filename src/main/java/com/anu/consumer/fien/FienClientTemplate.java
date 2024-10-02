package com.anu.consumer.fien;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "producer-service") 
public interface FienClientTemplate {

	@GetMapping("producer/getMessage/{name}")
	String getProducerMessage(@PathVariable("name") String name);

}
