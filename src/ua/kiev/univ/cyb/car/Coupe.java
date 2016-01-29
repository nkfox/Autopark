package ua.kiev.univ.cyb.car;

/**
 * This class extends {link Car}, which contains all information about car and
 * additional info that can have only this type of car.
 *
 * @author Nataliia Kozoriz
 * @version 1.0
 * @see Car
 */
public class Coupe extends Car {

    /**
     * true if car can be added row of seats
     */
    protected boolean additionalRow;

    /**
     * Constructs a new Cabriolet with the
     *
     * @param newName name of car
     * @param newCompany company of car
     * @param newSpeed maximum speed of car
     * @param newFuel fuel consumption
     * @param newPrice price of car
     * @param row if there is additional seat row
     */
    public Coupe(String newName, String newCompany, int newSpeed, double newFuel, int newPrice,
            boolean row) {
        super(newName, newCompany, newSpeed, newFuel, newPrice, 3);
        additionalRow = row;
    }

    @Override
    public String toString() {
        if (additionalRow) {
            return super.toString() + ", there is additional row";
        } else {
            return super.toString() + ", no additional row";
        }
    }

    public boolean isAdditionalRow() {
        return additionalRow;
    }

    public void setAdditionalRow(boolean additionalRow) {
        this.additionalRow = additionalRow;
    }
}
