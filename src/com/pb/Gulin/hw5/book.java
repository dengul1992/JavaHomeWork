package com.pb.Gulin.hw5;

public class book {
    private String BookName;
    private String BookAuthor;
    private String BookYear;

    public void Book(String BookName, String BookAuthor, String BookYear) {
        this.BookName=BookName;
        this.BookAuthor=BookAuthor;
        this.BookYear=BookYear;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }

    public void setBookYear(String bookYear) {
        BookYear = bookYear;
    }

    public String getBookName() {
        return BookName;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public String getBookYear() {
        return BookYear;
    }
}
