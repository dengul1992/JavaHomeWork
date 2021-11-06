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

    public void takeBook(int count) {

        System.out.println (this.FIO+" взял "+ count +" книги") ;
    }

    public void takeBook(String... BookNames) {

        System.out.println ( this.FIO+ " взял такие книги: "+BookNames) ;
    }
    public void takeBook(book... books) {

        System.out.println (this.FIO+ " взял такие книги: "+books);
    }


    public void returnBook(int count) {

        System.out.println (this.FIO+" вернул "+ count +" книги") ;
    }
    public void returnBook(String... BookNames) {

        System.out.println (this.FIO+ " взял такие книги: "+BookNames) ;
    }

    public void returnBook(book... books) {

        System.out.println (this.FIO+ " взял такие книги: "+books) ;
    }


}
