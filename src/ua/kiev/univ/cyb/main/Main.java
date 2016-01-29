/*
 * Nataliia Kozoriz
 * Task1
 * Car. Its types. Create autopark. Sort auto by consumption of fuel.
 *      Find auto of the company that are in given range of speed.
 *      Count autopark cost.
 */

package ua.kiev.univ.cyb.main;

import ua.kiev.univ.cyb.car.Coupe;
import ua.kiev.univ.cyb.car.Cabriolet;
import ua.kiev.univ.cyb.car.SportUtilityVehicle;
import ua.kiev.univ.cyb.car.trailer.Trailer;
import ua.kiev.univ.cyb.autopark.Autopark;
import ua.kiev.univ.cyb.car.Car;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Create autopark");
        Autopark autopark = new Autopark("Nightwish");
        autopark.addCar(new Cabriolet("S6", "BMW", 360, 2.5, 50000, "soft"));
        autopark.addCar(new Coupe("RE4", "Lexus", 420, 3.1, 37000, true));
        Trailer trailer = new Trailer("Corny", "Honda", 25000);
        autopark.addCar(new SportUtilityVehicle("T78", "Toyota", 394, 3.0, 75000, trailer));
        autopark.addCar(new Coupe("Cherry", "BMW", 290, 3.5, 41000, false));
        autopark.print();

        System.out.println("\nSort autopark cars by consumption of fuel");
        autopark.sortBySpeed();
        autopark.print();

        System.out.println("\nFind auto of the company that are in given range of speed.");
        List<Car> found = autopark.findCarsByCompanyAndSpeed("BMW", 350, 400);
        for (Car car : found) {
            System.out.println(car.toString());
        }
        
        System.out.println("\nCount autopark cost.");
        System.out.println(autopark.getCost());
    }

}
