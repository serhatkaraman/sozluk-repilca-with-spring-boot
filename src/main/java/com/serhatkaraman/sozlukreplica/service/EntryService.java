package com.serhatkaraman.sozlukreplica.service;

import com.serhatkaraman.sozlukreplica.entity.Entry;

import java.util.List;

public interface EntryService {

    List<Entry> findAll();

//    List<Entry> findTodayEntries(String today, int topic_id);

    List<Entry> getTodayEntries(String createdDate, int userId);

}
