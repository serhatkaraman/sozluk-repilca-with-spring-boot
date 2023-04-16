package com.serhatkaraman.sozlukreplica.dao;

import com.serhatkaraman.sozlukreplica.entity.Entry;
import org.hibernate.annotations.Where;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EntryRepository extends JpaRepository<Entry, Integer> {


    @Where(clause ="created_date LIKE (?1) AND topic_id = ?2")
    List<Entry> getTodayEntries(String cratedDate, int topicId);

}
