package com.hand.domain.entity;

import javax.persistence.Table;

@Table(name = "admins")
public class User {
    private  String username;
    private  String password;
    private  String email;
    private  String github;
    private  String twitter;
    private  String md;
    private  String resume;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
