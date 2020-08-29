package com.puvan.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return topicService.getAllTopics();
		
	}
	
	@RequestMapping(value="/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
		
	}
	
	//@RequestMapping(method=RequestMethod.POST, value="/topics")
	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {
		
		topicService.addTopic(topic);
		
	}
	@PutMapping("/topics")
	public void updateTopic(@RequestBody Topic topic) {
		topicService.updateTopic(topic);
		
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
		
	}
	

}
