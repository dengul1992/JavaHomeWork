package com.pb.Gulin.hw5;
import com.pb.Gulin.hw5.book;


public class Library {
    public static void main(String[] args) {
        book book1=new book();
        book book2=new book();
        book book3=new book();
        Reader reader1= new Reader();
        Reader reader2= new Reader();
        Reader reader3= new Reader();

        book1.Book("Приключения","Иванов И. И.", "2000 г.");
        book2.Book("Словарь","Сидоров А. В.", "1980 г.");
        book3.Book("Энциклопедия","Гусев К. В. ", "2010 г.");

        reader1.Reader("Петров В. В.", 123456, "Электрометаллургический", "25.06.1996", "+38(098)765-43-21");
        reader2.Reader("Странный А. В.", 234567, "Механики", "14.09.1975", "+38(056)765-65-65");
        reader3.Reader("Помидоркин В. И.", 345678, "Микробиологии", "05.10.1986", "+38(050)800-12-23");


    }
}
