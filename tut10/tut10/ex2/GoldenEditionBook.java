package tut10.ex2;

import lombok.AllArgsConstructor;
import lombok.Data;

public class GoldenEditionBook extends Book {
    public GoldenEditionBook(String title, String author, double price) throws Exception {
        super(title, author, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.3;
    }


}
