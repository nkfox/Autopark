package ua.kiev.univ.cyb.autopark;

import ua.kiev.univ.cyb.car.Car;
import java.util.List;
import java.util.ArrayList;

/**
 * This class contains all information about Autopark: name, cost, cars.
 * Autopark contains {@link Car}.
 *
 * @author Nataliia Kozoriz
 * @version 1.0
 * @see Car
 */
public class Autopark {

    /**
     * Autopark name.
     */
    private String name;

    /**
     * Cars that are in this Autopark.
     *
     * @see Car
     */
    private List<Car> cars;

    /**
     * The total cost of Autopark (sum of cost of all cars).
     */
    private int cost;

    /**
     * Constructs a new, empty Autopark with the
     *
     * @param name the name of the Autopark.
     */
    public Autopark(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
        this.cost = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        List<Car> copyCars = new ArrayList<>();
        for(Car car:cars)
            copyCars.add(car);
        return copyCars;
    }

    /**
     * Add car to this Autopark. Increase cost of Autopark by the cost of added
     * car.
     *
     * @param car cat that are added.
     * @see Car
     */
    public void addCar(Car car) {
        cars.add(car);
        cost += car.getPrice();
    }

    /**
     * Returns car that is in @index place
     *
     * @param index place of needed car.
     * @return car that is in @index place.
     * @exception IndexOutOfBoundsException if @index is bigger that size of
     * Autopark or less than 0.
     * @see Car
     */
    public Car getCar(int index) {
        if (cars.size() > index && index >= 0) {
            return cars.get(index);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int getCost() {
        return cost;
    }

    /**
     * Returns list of cars sorted by speed.
     *
     * @param carA list of cars sorted by speed
     * @param carB list of cars sorted by speed
     * @return list that is merging of two other list of cars sorted by speed.
     */
    private List<Car> mergeBySpeed(List<Car> carA, List<Car> carB) {
        int i, j;
        List<Car> carRes = new ArrayList<>();
        for (i = 0, j = 0; i < carA.size(); i++) {
            while (j < carB.size() && carB.get(j).compareTo(carA.get(i)) > 0) {
                carRes.add(carB.get(j++));
            }
            carRes.add(carA.get(i));
        }
        while (j < carB.size()) {
            carRes.add(carB.get(j++));
        }
        return carRes;
    }

    /**
     * Returns list of cars sorted by speed.
     *
     * @param first index of first car that have to be sorted
     * @param last index of last car that have to be sorted
     * @return list of cars sorted by speed.
     */
    public List<Car> mergeSortBySpeed(int first, int last) {
        if (last == first) {
            List<Car> car = new ArrayList<>();
            car.add(cars.get(first));
            return car;
        }

        int middle = (last + first) / 2;
        List<Car> carA = mergeSortBySpeed(first, middle);
        List<Car> carB = mergeSortBySpeed(middle + 1, last);
        List<Car> carRes = mergeBySpeed(carA, carB);
        return carRes;
    }

    /**
     * Sort cars by speed.
     */
    public void sortBySpeed() {
        cars = mergeSortBySpeed(0, cars.size() - 1);
    }

    /**
     * Returns list of cars that are of given company and in given range of
     * speed.
     *
     * @param ofCompany name of company, cars of which is searched.
     * @param speedMin lower bound of speed range
     * @param speedMax upper bound of speed range
     * @return list of cars that are of given company and in given range of
     * speed.
     */
    public List<Car> findCarsByCompanyAndSpeed(String ofCompany, int speedMin, int speedMax) {
        List<Car> list = new ArrayList<>();
        for (Car car : cars) {
            if (car.getCompany().equals(ofCompany) && car.getSpeed() >= speedMin
                    && car.getSpeed() <= speedMax) {
                list.add(car);
            }
        }
        return list;
    }

    /**
     * Print name of Autopark and all cars in it.
     */
    public void print() {
        System.out.println(name + " Autopark");
        for (Car car : cars) {
            System.out.println("    " + car.toString());
        }
    }
}
