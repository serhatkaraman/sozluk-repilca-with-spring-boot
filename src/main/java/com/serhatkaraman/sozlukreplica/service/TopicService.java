package com.serhatkaraman.sozlukreplica.service;

import com.serhatkaraman.sozlukreplica.entity.Topic;

import java.util.List;

public interface TopicService {

    List<Topic> findAll();

    Topic findById(int id);

}
