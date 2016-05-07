package com.springapp.mvc.form;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by salavatshirgaleev on 07.05.16.
 */
public class BlogFormBean {
    @Size( min = 10, max = 15,message = "Поле не должно быть пустым" )
    private String title;

    @NotEmpty(message = "Введите текст")
    private String text;

    public BlogFormBean(String text, String title) {
        this.text = text;
        this.title = title;
    }

    public BlogFormBean(){

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
}
