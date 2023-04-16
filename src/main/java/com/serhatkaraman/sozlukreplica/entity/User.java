package com.serhatkaraman.sozlukreplica.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "is_admin")
    private int isAdmin;

    @Column(name = "is_moderator")
    private int isModerator;

    @Column(name = "password")
    private String password;

    @OneToMany()
    public List<Entry> entries;

    public User() {

    }

    public User(String username, String email, int isAdmin, int isModerator, String password, List<Entry> entries) {
        this.username = username;
        this.email = email;
        this.isAdmin = isAdmin;
        this.isModerator = isModerator;
        this.password = password;
        this.entries = entries;
    }

    public User(int id, String username, String email, int isAdmin, int isModerator, String password, List<Entry> entries) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.isAdmin = isAdmin;
        this.isModerator = isModerator;
        this.password = password;
        this.entries = entries;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    public int getIsModerator() {
        return isModerator;
    }

    public void setIsModerator(int isModerator) {
        this.isModerator = isModerator;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", isAdmin=" + isAdmin +
                ", isModerator=" + isModerator +
                ", password='" + password + '\'' +
                ", entries=" + entries +
                '}';
    }
}
