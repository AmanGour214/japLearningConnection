package com.UstendingJPAandHybernate.testingJpa2;

import jakarta.persistence.*;

@Entity
@Table(name = "Libary_Card")
public class LibaryCard {

    @Id
    private int id;

    private int fine;
    private int noOfBook;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    @OneToOne
    @JoinColumn
    private User user;

    public LibaryCard() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getNoOfBook() {
        return noOfBook;
    }

    public void setNoOfBook(int noOfBook) {
        this.noOfBook = noOfBook;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
