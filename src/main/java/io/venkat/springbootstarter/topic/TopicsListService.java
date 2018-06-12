package io.venkat.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicsListService {

	@Autowired
	private TopicsListRepository topicsRepository;

	public List<TopicsList> getAllTopics() {
		List<TopicsList> list = new ArrayList<TopicsList>();
		topicsRepository.findAll().forEach(list::add);
		return list;
	}

	public TopicsList getTopic(String id) {
		return topicsRepository.findOne(id);
	}

	public void addTopic(TopicsList list) {
		topicsRepository.save(list);
	}

	public void updateTopic(TopicsList list, String id) {
		topicsRepository.save(list);
	}

	public void deleteTopic(String id) {
		topicsRepository.delete(id);
	}

}
