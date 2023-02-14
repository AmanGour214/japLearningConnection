package com.UstendingJPAandHybernate.testingJpa2;

import jakarta.persistence.*;

@Entity
@Table(name = "Author_table")
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int booksWriten;


    public Author() {

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

    public int getBooksWriten() {
        return booksWriten;
    }

    public void setBooksWriten(int booksWriten) {
        this.booksWriten = booksWriten;
    }
}
