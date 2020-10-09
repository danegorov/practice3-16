package com.practice3;

import java.util.ArrayList;

public class Book {
    ArrayList<String> pages;
    String author, name;
    int year;

    Book(String author, String name, String info){
        pages = new ArrayList<>();
        pages.add(info);
        this.name = name;
    }
    Book(ArrayList<String> pages){

        this.pages = pages;
    }
    public void editPage(int i, String info){
        if(i >= pages.size()){
            System.out.println("Не удалось найти элемент добавлю в конец новый");
            pages.add(info);
        } else{
            pages.set(i, info);
        }
    }
    public String getPage(int i){
        try {
            return pages.get(i);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
            return "";
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public ArrayList<String> getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(ArrayList<String> pages) {
        this.pages = pages;
    }
}
