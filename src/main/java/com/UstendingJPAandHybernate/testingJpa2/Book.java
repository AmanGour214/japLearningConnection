package com.UstendingJPAandHybernate.testingJpa2;

import jakarta.persistence.*;

@Entity
@Table(name = "book_table")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    private int pages;


    // three things to write always in child Entit
    // 1.mapping i.e onetoone or onetomany or manytomany according to relation;
    // joinColumn which coloum you want to join and alse the colum should be unique or not null;
    // 3 write parent obj name;
    @OneToOne
    @JoinColumn
    private Author author;



    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Book() {
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
