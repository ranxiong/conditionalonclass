package com.example.rx;

public class Cooker {
    private CookBook cookBook;

    public Cooker(CookBook cookBook) {
        this.cookBook = cookBook;
    }

    public void cook() {
        System.out.println("开始做饭");
        cookBook.cook();
    }
}
