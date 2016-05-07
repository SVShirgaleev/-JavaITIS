package com.springapp.mvc.common;

import javax.persistence.*;

/**
 * Created by salavatshirgaleev on 04.05.16.
 */
@Entity
@Table(name = "h_categories")
public class CategoryInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;


    @ManyToOne
    @JoinColumn(name = "parent_id")
    private CategoryInfo parent;

    public CategoryInfo() {
    }

    public CategoryInfo(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public CategoryInfo getParent() {
        return parent;
    }

    public void setParent(CategoryInfo parent) {
        this.parent = parent;
    }
}
