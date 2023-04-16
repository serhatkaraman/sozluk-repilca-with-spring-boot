package com.serhatkaraman.sozlukreplica.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "topic")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "name")
    private String name;

    @Column(name = "labels")
    private String labels;

    @Column(name = "date")
    private String date;

    @Column(name = "user_id")
    private int userId;

    @OneToMany()
    public List<Entry> entries;

    public Topic() {
    }

    public Topic(int id, String name, String labels, String date, int userId, List<Entry> entries) {
        this.id = id;
        this.name = name;
        this.labels = labels;
        this.date = date;
        this.userId = userId;
        this.entries = entries;
    }

    public Topic(String name, String labels, String date, int userId, List<Entry> entries) {
        this.name = name;
        this.labels = labels;
        this.date = date;
        this.userId = userId;
        this.entries = entries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
