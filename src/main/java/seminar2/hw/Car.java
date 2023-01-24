package seminar2.hw;

public class Car extends Vehicle {
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;
    public Car(String company, String model, int year) {
        super(company);
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 4;
        this.speed = 0;
    }
    public void testDrive() { this.speed = 60; }
    public void park() { this.speed = 0; }
    public String getModel() { return model; }
    public int getYearRelease() { return yearRelease; }
    public int getNumWheels() { return numWheels; }
    public int getSpeed() { return speed; }
    public String toString() { return "This car is a " + yearRelease + " make " + model ;}
}