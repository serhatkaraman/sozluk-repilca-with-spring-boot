package com.serhatkaraman.sozlukreplica.dao;

import com.serhatkaraman.sozlukreplica.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.List;

public interface EntryRepository extends JpaRepository<Entry, Integer> {

    @Query(value = "SELECT * FROM entry WHERE created_date like ?1 AND topic_id = ?2", nativeQuery = true)
    List<Entry> getTodayEntries(String createdDate, int topicId);

}
