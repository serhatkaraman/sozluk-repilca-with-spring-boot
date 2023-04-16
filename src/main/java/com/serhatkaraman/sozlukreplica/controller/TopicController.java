package com.serhatkaraman.sozlukreplica.controller;

import com.serhatkaraman.sozlukreplica.service.EntryService;
import com.serhatkaraman.sozlukreplica.service.TopicService;
import com.serhatkaraman.sozlukreplica.service.TopicServiceImpl;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/topic")
public class TopicController {

    private TopicService topicService;
    private EntryService entryService;

    public TopicController(TopicService topicService, EntryService entryService) {
        this.topicService = topicService;
        this.entryService = entryService;
    }

    public TopicController() {

    }

    @GetMapping("/{id}")
    public String getAllEntries(@PathVariable int id) {

        return "display-topic";
    }

    @GetMapping("/today/{id}")
    public String getTodayEntries(@PathVariable int id) {
        System.out.println(java.time.LocalDate.now());
//        System.out.println(entryService.findTodayEntries("2023-04-12", 4));
        System.out.println(entryService.getTodayEntries("2023-04-12%", 4));

        return "display-topic";
    }

}
