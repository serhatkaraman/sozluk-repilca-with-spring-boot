package com.serhatkaraman.sozlukreplica.controller;

import com.serhatkaraman.sozlukreplica.entity.Entry;
import com.serhatkaraman.sozlukreplica.entity.Topic;
import com.serhatkaraman.sozlukreplica.service.EntryService;
import com.serhatkaraman.sozlukreplica.service.TopicService;
import com.serhatkaraman.sozlukreplica.service.TopicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/topic")
public class TopicController {



    @Autowired
    private EntryService entryService;
    @Autowired
    private TopicService topicService;

    public TopicController() {

    }

    @GetMapping("/{id}")
    public String getAllEntries(@PathVariable int id) {

        return "display-topic";
    }

    @GetMapping("/today/{id}")
    public String getTodayEntries(@PathVariable int id, Model model) {
        // TODO: argoment of getTodayEntriesSholdubeChanged with today's date + % string
        List<Entry> todayEntries = entryService.getTodayEntries("2023-04-12%", id);
        List<Topic> todayTopics = topicService.findAll();
        model.addAttribute("todayTopics", todayTopics);
        model.addAttribute("todayEntries", todayEntries);
        return "display-topic";
    }

}
