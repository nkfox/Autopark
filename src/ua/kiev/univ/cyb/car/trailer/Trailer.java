package ua.kiev.univ.cyb.car.trailer;

/*
 * Trailer is additional part of {@link SportCarVehicle}
 *
 * @author Nataliia Kozoriz
 * @version 1.0
 * @see SportUtilityVehicle
 * @see Car
 */
public class Trailer {

    /**
     * Trailer name.
     */
    protected String name;

    /**
     * Trailer company name.
     */
    protected String company;

    /**
     * Trailer price.
     */
    protected int price;

    /**
     * Constructs a new Trailer with the
     *
     * @param newName name of trailer
     * @param newCompany company of trailer
     * @param newPrice price of trailer
     */
    public Trailer(String newName, String newCompany, int newPrice) {
        name = newName;
        company = newCompany;
        price = newPrice;
    }

    @Override
    public String toString() {
        
                
        return name + ", company: " + company + "price: " + price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
