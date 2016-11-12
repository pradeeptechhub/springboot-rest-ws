package com.patel.pradeep.dao;

import org.springframework.data.repository.CrudRepository;

import com.patel.pradeep.model.Poll;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
