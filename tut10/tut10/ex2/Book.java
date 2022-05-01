package tut10.ex2;

import lombok.Data;

@Data
public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) throws Exception {
        if (!checkPrice(price)){
            throw new Exception("Price is not valid");
        }
        if (!checkTitle(title)){
            throw  new Exception("Title is not valid");
        }
        this.title = title;
        this.author = author;
        this.price = price;
    }

    private boolean checkTitle(String title){
        return title.length() >= 3;
    }
    private boolean checkPrice(double price){
        return price > 0;
    }
}
