package seminar2.hw;

public abstract class Vehicle {
    private String company;

    public Vehicle(String company) {
        this.company = company;
    }

    public abstract void testDrive();

    public abstract void park();

    public String getCompany() {
        return company;
    }

}
