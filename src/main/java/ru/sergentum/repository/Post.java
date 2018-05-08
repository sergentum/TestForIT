package ru.sergentum.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String message;
    private String from_account_id;
    private String to_account_id;

    public Post() {
    }

    public Post(String message) {
        this.message = message;
    }

    public Post(String message, String from_account_id, String to_account_id) {
        this.message = message;
        this.from_account_id = from_account_id;
        this.to_account_id = to_account_id;
    }

    public long getId() {
        return id;
    }

    public String getFrom_account_id() {
        return from_account_id;
    }

    public void setFrom_account_id(String from_account_id) {
        this.from_account_id = from_account_id;
    }

    public void setTo_account_id(String to_account_id) {
        this.to_account_id = to_account_id;
    }

    public String getTo_account_id() {

        return to_account_id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
