package com.java.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.java.springboot.topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
