package tut8.factory;

// Create the CivilService class that extends Course abstract class 
class CivilService extends Course {
    // TO-DO: Implement getDuration() method: set a specific duration and print value
    public void getDuration() {
        duration = 10;
        System.out.println(CivilService.class.toString() + duration);
    }

    // TO-DO: Implement getFeePerSemester() method: set a specific fee and print value
    public void getFeePerSemester() {
        fee = 1500;
        System.out.println(CivilService.class.toString() + fee);

    }
}