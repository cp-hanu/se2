package tut10.ex1;

public class Child extends Person{
    public Child(String name, int age) throws Exception {
        super(name, age);
        if (age > 15){
            throw new Exception("Children should not bigger than 15");
        }
    }
}
