package com.serhatkaraman.sozlukreplica.controller;

import com.serhatkaraman.sozlukreplica.entity.Entry;
import com.serhatkaraman.sozlukreplica.entity.Topic;
import com.serhatkaraman.sozlukreplica.service.EntryService;
import com.serhatkaraman.sozlukreplica.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class sozluk {

    @Autowired
    private TopicService topicService;
    @Autowired
    private EntryService entryService;

    public sozluk() {

    }

    @GetMapping("/")
    public String mainPage(Model model) {
        List<Topic> topics = topicService.findAll();
        List<Entry> entries = entryService.findAll();
        model.addAttribute("topics", topics);
        model.addAttribute("entries", entries);
        return "main-page";
    }

}
