package com.company;

public class Book2 {
    String name;
    String muallif;

    public Book2() {
    }

    public Book2(String name) {
        this.name = name;
    }

    public Book2(String name, String muallif) {
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
