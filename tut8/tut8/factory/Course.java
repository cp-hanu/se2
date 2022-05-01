package tut8.factory;

import lombok.Data;

// Create the abstract class called Course
abstract class Course {
    protected int duration; //in semesters
    protected double fee; //in dollars ($)

    // TO-DO: Declare 2 void abstract methods: getDuration(), getFeePerSemester()
    public void getDuration() {}

    public void getFeePerSemester() {}

    // TO-DO: Declare void method: calculateTotalFee(). Total = duration * fee
    public double calculateTotalFee() {
        return duration * fee;
    }

}