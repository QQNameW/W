package com.demo.pojo;

/**
 * Created by Administrator on 2017/4/26.
 */
public class BookBean {
    private String Name;
    private String Author;
    private String Price;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "BookBean{" +
                "Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }
}
