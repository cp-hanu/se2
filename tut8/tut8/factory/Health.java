package tut8.factory;

// Creating the Health class that extends Course abstract class 
class Health extends Course {
    // TO-DO: Implement getDuration() method: set a specific duration and print value
    public void getDuration() {
        duration = 10;
        System.out.println(duration);
    }

    // TO-DO: Implement getFeePerSemester() method: set a specific fee and print value
    public void getFeePerSemester() {
        fee = 1000;
        System.out.println(fee);
    }
}// end of Health class.