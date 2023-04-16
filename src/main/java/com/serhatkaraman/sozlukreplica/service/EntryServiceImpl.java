package com.serhatkaraman.sozlukreplica.service;

import com.serhatkaraman.sozlukreplica.dao.EntryRepository;
import com.serhatkaraman.sozlukreplica.entity.Entry;
import com.serhatkaraman.sozlukreplica.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EntryServiceImpl implements EntryService {

    private EntryRepository entryRepository;

    @Autowired
    public EntryServiceImpl(EntryRepository entryRepository) {
       this.entryRepository = entryRepository;
    }

    @Override
    public List<Entry> findAll() {
        return entryRepository.findAll();
    }

    @Override
    public List<Entry> getTodayEntries(String createdDate, int userId) {
        List<Entry> entries = new ArrayList<>();
        entries = entryRepository.getTodayEntries(createdDate, userId);
        if(entries == null) {
            throw new RuntimeException("There is nothing here!");
        }
        return entries;
    }

//    @Override
//    public List<Entry> findTodayEntries(String today, int topic_id) {
//        List<Entry> entries = null;
//        entries = entryRepository.findTodayEntries(today, topic_id);
//        if(entries == null) {
//            throw new RuntimeException("There is nothing here!");
//        }
//        return entries;
//    }
}
