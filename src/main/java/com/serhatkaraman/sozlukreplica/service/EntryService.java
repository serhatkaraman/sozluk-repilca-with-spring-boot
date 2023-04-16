package com.serhatkaraman.sozlukreplica.service;

import com.serhatkaraman.sozlukreplica.entity.Entry;

import java.util.List;

public interface EntryService {

    List<Entry> findAll();

    List<Entry> getTodayEntries(String createDate, int topicId);

}
