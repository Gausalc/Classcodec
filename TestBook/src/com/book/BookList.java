package com.book;

public class BookList {
    //Book[] books = new Book[10];
    private Book[] books = new Book[10];
    private int usedSize;

    public BookList() {
        books[0] = new Book("杨超越","女",170,"女团");
        books[1] = new Book("周震南","男",170,"男团");
        books[2] = new Book("宫素","男",210,"男团");
        this.usedSize = 3;
    }

    public void setBooks(int pos ,Book book){
        books[pos] =book;
    }
    public Book getBook(int pos){
        return books[pos];
    }
    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}