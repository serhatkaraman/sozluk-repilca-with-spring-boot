package com.serhatkaraman.sozlukreplica.controller;

import com.serhatkaraman.sozlukreplica.entity.Entry;
import com.serhatkaraman.sozlukreplica.entity.Topic;
import com.serhatkaraman.sozlukreplica.service.EntryService;
import com.serhatkaraman.sozlukreplica.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class sozluk {

    private TopicService topicService;
    private EntryService entryService;

    public sozluk(TopicService topicService, EntryService entryService) {
        this.topicService = topicService;
        this.entryService = entryService;
    }

    @GetMapping("/")
    public String mainPage(Model model) {
        List<Topic> topics = topicService.findAll();
        List<Entry> entries = entryService.findAll();
        model.addAttribute("topics", topics);
        model.addAttribute("entries", entries);
        System.out.println(entryService.getTodayEntries("2023-04-12%", 4));
        return "main-page";
    }

}
