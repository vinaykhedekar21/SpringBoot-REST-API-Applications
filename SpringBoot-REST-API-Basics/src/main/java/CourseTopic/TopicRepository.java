package com.vinay.springboot.restapplications.CourseTopic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
}
