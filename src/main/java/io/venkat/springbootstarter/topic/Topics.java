package io.venkat.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Topics {
	
	@Autowired
	private TopicsListService topicsListService;
	
	@RequestMapping("/topics")
	public List<TopicsList> getTopics() {
		return topicsListService.getAllTopics();	
	}
	
	@RequestMapping("/topics/{id}")
	public TopicsList getTopic(@PathVariable String id) {	
		return topicsListService.getTopic(id);
	}

	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody TopicsList list) {
		topicsListService.addTopic(list);
     }
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody TopicsList list,@PathVariable String id) {
		topicsListService.updateTopic(list,id);
     }
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicsListService.deleteTopic(id);
     }
	
	
	
	
}
