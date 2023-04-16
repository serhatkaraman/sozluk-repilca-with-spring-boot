package com.serhatkaraman.sozlukreplica.dao;

import com.serhatkaraman.sozlukreplica.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
}
