package com.serhatkaraman.sozlukreplica.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "entry")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "content")
    private String content;

    @Column(name = "created_date")
    private String createdDate;


    @Column(name = "edited_date")
    private String editedDate;

    @Column(name = "is_archived")
    private int isArchived;

    @Column(name = "is_deleted")
    private int isDeleted;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    public Topic topic;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;

    public Entry() {

    }

    public Entry(String content, String createdDate, String editedDate, int isArchived, int isDeleted, Topic topic, User user) {
        this.content = content;
        this.createdDate = createdDate;
        this.editedDate = editedDate;
        this.isArchived = isArchived;
        this.isDeleted = isDeleted;
        this.topic = topic;
        this.user = user;
    }

    public Entry(int id, String content, String createdDate, String editedDate, int isArchived, int isDeleted, Topic topic, User user) {
        this.id = id;
        this.content = content;
        this.createdDate = createdDate;
        this.editedDate = editedDate;
        this.isArchived = isArchived;
        this.isDeleted = isDeleted;
        this.topic = topic;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getEditedDate() {
        return editedDate;
    }

    public void setEditedDate(String editedDate) {
        this.editedDate = editedDate;
    }

    public int getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(int isArchived) {
        this.isArchived = isArchived;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", editedDate='" + editedDate + '\'' +
                ", isArchived=" + isArchived +
                ", isDeleted=" + isDeleted +
                ", topic=" + topic +
                ", user=" + user +
                '}';
    }
}
