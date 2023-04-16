package com.serhatkaraman.sozlukreplica.service;

import com.serhatkaraman.sozlukreplica.dao.EntryRepository;
import com.serhatkaraman.sozlukreplica.entity.Entry;
import com.serhatkaraman.sozlukreplica.entity.Topic;
import org.hibernate.engine.spi.CollectionEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
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
    public List<Entry> getTodayEntries(String createdDate, int topicId) {
        List<Entry> entries = entryRepository.getTodayEntries(createdDate, topicId);
        if(entries == null) {
            throw new RuntimeException("There is nothing here!");
        }
        return entries;
    }

}
