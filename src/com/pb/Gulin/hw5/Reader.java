package com.pb.Gulin.hw5;

public class Reader {
    private String FIO;
    private int NumReadBilet;
    private String facultet;
    private String Birthday;
    private String Phone;

    public void Reader(String FIO, int NumReadBilet, String facultet, String Birthday, String Phone) {
        this.FIO = FIO;
        this.NumReadBilet = NumReadBilet;
        this.facultet = facultet;
        this.Birthday = Birthday;
        this.Phone = Phone;
    }



    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void setNumReadBilet(int numReadBilet) {
        NumReadBilet = numReadBilet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFIO() {
        return FIO;
    }

    public int getNumReadBilet() {
        return NumReadBilet;
    }

    public String getFacultet() {
        return facultet;
    }

    public String getBirthday() {
        return Birthday;
    }

    public String getPhone() {
        return Phone;
    }

    public String takeBook(int count) {
        return this.FIO+" взял "+ count +" книги" ;
    }

    public String returnBook(int count) {
        return this.FIO+" вернул "+ count +" книги" ;
    }
    /*public String takeBook() {

        return this.FIO+" взял книги: "+  book.getBookName();
    }*/


}
