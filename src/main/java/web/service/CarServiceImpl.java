package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Auto1", 1998, 1000));
        cars.add(new Car("Auto2", 1999, 2000));
        cars.add(new Car("Auto3", 2000, 3000));
        cars.add(new Car("Auto4", 2001, 4000));
        cars.add(new Car("Auto5", 2002, 5000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            count = 5;
        } else if (count < 0) {
            count = 0;
        }
        return cars.subList(0, count);
    }
}
