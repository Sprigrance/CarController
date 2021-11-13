package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private int year;
    private int price;
    private List<Car> cars;

    public Car(String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public static List<Car> makeCars(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Auto1", 1998, 1000));
        cars.add(new Car("Auto2", 1999, 2000));
        cars.add(new Car("Auto3", 2000, 3000));
        cars.add(new Car("Auto4", 2001, 4000));
        cars.add(new Car("Auto5", 2002, 5000));
        return cars.subList(0, count);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
