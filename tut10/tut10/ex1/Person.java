package tut10.ex1;

import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws Exception {
        if (age < 0){
           throw new Exception("Age must be positive");
        }
        if (name.length() < 4){
            throw new Exception("Name length should not be lesser than 3 symbol");
        }
        this.name = name;
        this.age = age;
    }
}
