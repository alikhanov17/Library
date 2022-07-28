package com.company;

public class Book {
    String name;
    String muallif;

    public Book() {
    }

    public Book(String name, String muallif) {
        this.name = name;
        this.muallif = muallif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuallif() {
        return muallif;
    }

    public void setMuallif(String muallif) {
        this.muallif = muallif;
    }
}
