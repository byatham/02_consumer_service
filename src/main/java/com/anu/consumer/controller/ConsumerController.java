package com.anu.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anu.consumer.fien.FienClientTemplate;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/consumer")
@Slf4j
public class ConsumerController {

	private FienClientTemplate fienClientTemplate;

	@Autowired
	public ConsumerController(FienClientTemplate fienClientTemplate) {
		this.fienClientTemplate = fienClientTemplate;
	}

	@GetMapping("/message/{name}")
	public String getMessageFromProducer(@PathVariable("name") String name) {
		log.info("inside ConsumerController:getMessageFromProducer()");
		log.debug("inside ConsumerController:getMessageFromProducer()");

		return fienClientTemplate.getProducerMessage(name);
	}

}
