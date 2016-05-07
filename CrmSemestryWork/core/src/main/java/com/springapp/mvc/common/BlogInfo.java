package com.springapp.mvc.common;

import javax.persistence.*;

/**
 * Created by salavatshirgaleev on 07.05.16.
 */
@Entity
@Table(name = "h_blog")
public class BlogInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private String authorId;
    private String title;
    private String text;
    private String date;

    public BlogInfo(String authorId, String title, String text, String date) {
        this.authorId = authorId;
        this.title = title;
        this.text = text;
        this.date = date;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
