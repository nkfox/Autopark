package ua.kiev.univ.cyb.car;

/**
 * This contains information about Car. This class is abstract. Extended by
 * {@link Coupe}, {@link Cabriolet}, {@link SportUtilityVehicle}.
 *
 * @author Nataliia Kozoriz
 * @version 1.0
 * @see Coupe
 * @see Cabriolet
 * @see SportUtilityVehicle
 */
public abstract class Car implements Comparable {

    /**
     * Car name.
     */
    protected String name;

    /**
     * Name of car company.
     */
    protected String company;

    /**
     * Maximum speed of this car.
     */
    protected int speed;

    /**
     * Consumption of furl of this car.
     */
    protected double fuelConsumption;

    /**
     * price of this car.
     */
    protected int price;

    /**
     * Amount of doors.
     */
    protected int doorsNumber;

    /**
     * Constructs a new Car with the
     *
     * @param newName name of car
     * @param newCompany company of car
     * @param newSpeed maximum speed of car
     * @param newFuel fuel consumption
     * @param newPrice price of car
     * @param doors amount of doors
     */
    public Car(String newName, String newCompany, int newSpeed, double newFuel, int newPrice, int doors) {
        name = newName;
        company = newCompany;
        speed = newSpeed;
        fuelConsumption = newFuel;
        price = newPrice;
        doorsNumber = doors;
    }

    @Override
    public int compareTo(Object o) {
        Car c = (Car) o;
        return c.speed - this.speed;

    }

    @Override
    public String toString() {
        return name + ", company: " + company + ", speed: " + speed + ", fuelConsumption: " + fuelConsumption
                + ", price: " + price + ", doorsNumber:" + doorsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

}
