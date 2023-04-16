package com.serhatkaraman.sozlukreplica.service;

import com.serhatkaraman.sozlukreplica.dao.TopicRepository;
import com.serhatkaraman.sozlukreplica.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicServiceImpl implements TopicService{

    private TopicRepository topicRepository;

    @Autowired
    public TopicServiceImpl(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }


    @Override
    public List<Topic> findAll() {
        return topicRepository.findAll();
    }

    @Override
    public Topic findById(int id) {
        Topic topic = null;
        Optional<Topic> result = topicRepository.findById(id);

        if (result.isPresent()){
            topic = result.get();
        } else {
            throw new RuntimeException("Topic couldn't find: " + id);
        }

        return topic;

    }
}
