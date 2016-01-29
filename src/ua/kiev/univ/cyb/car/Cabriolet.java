package ua.kiev.univ.cyb.car;

/**
 * This class extends {link Car}, which contains all information about {link
 * Car}.
 *
 * @author Nataliia Kozoriz
 * @version 1.0
 * @see Car
 */
public class Cabriolet extends Car {

    /**
     * Type of roof.
     */
    protected String retractableRoofType;

    /**
     * Constructs a new Cabriolet with the
     *
     * @param newName name of car
     * @param newCompany company of car
     * @param newSpeed maximum speed of car
     * @param newFuel fuel consumption
     * @param newPrice price of car
     * @param retractableRoof type of roof
     */
    public Cabriolet(String newName, String newCompany, int newSpeed, double newFuel, int newPrice,
            String retractableRoof) {
        super(newName, newCompany, newSpeed, newFuel, newPrice, 5);
        retractableRoofType = retractableRoof;
    }

    @Override
    public String toString() {
        return super.toString() + ", retractableRoofType: " + retractableRoofType;
    }

    public String getRetractableRoofType() {
        return retractableRoofType;
    }

    public void setRetractableRoofType(String retractableRoofType) {
        this.retractableRoofType = retractableRoofType;
    }
}
