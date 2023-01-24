package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar2.hw.Car;
import seminar2.hw.Motorcycle;
import seminar2.hw.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void bef(){
        this.car = new Car("Dodge", "Ram", 2010);
        this.motorcycle = new Motorcycle("Honda", "Shadow", 2016);
    }
    @Test
    public void testCarIsInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }
    @Test
    public void testCarIs4Wheel() {
        assertEquals(4, car.getNumWheels());
    }
    @Test
    public void testMotocycleIs2Wheel() {
        assertEquals(2, motorcycle.getNumWheels());
    }
    @Test
    public void testCarTestDriveSpeedIs60() {
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }
    @Test
    public void testMotocycleTestDriveSpeedIs75() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }
    @Test
    public void testCarParkingTest() {
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
    @Test
    public void testMotocycleParkingTest() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0,motorcycle.getSpeed());
    }
}

