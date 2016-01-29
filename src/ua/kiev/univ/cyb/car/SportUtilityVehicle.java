package ua.kiev.univ.cyb.car;

/**
 * This class extends {link Car}, which contains all information about car and
 * additional info that can have only this type of car.
 * {@link SportUtilityVehicle} can have {@link Trailer}.
 *
 * @author Nataliia Kozoriz
 * @version 1.0
 * @see Car
 * @see Trailer
 */
import ua.kiev.univ.cyb.car.trailer.Trailer;

public class SportUtilityVehicle extends Car {

    /**
     * if not null, car has trailer.
     */
    protected Trailer trailer;

    /**
     * Constructs a new Cabriolet with the
     *
     * @param newName name of car
     * @param newCompany company of car
     * @param newSpeed maximum speed of car
     * @param newFuel fuel consumption
     * @param newPrice price of car
     * @param newTrailer trailer of car, if not null
     */
    public SportUtilityVehicle(String newName, String newCompany, int newSpeed, double newFuel, int newPrice,
            Trailer newTrailer) {
        super(newName, newCompany, newSpeed, newFuel, newPrice, 5);
        trailer = newTrailer;
    }

    @Override
    public String toString() {
        if (trailer == null) {
            return super.toString() + ", no trailer";
        } else {
            return super.toString() + ", trailer: {" + trailer.toString() + "}";
        }
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }

    public void deleteTrailer() {
        trailer = null;
    }
}
