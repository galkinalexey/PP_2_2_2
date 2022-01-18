package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public interface CarService {

    List<Car> carList = List.of(
            new Car("Brand1", "Model1", 1),
            new Car("Brand2", "Model2", 2),
            new Car("Brand3", "Model3", 3),
            new Car("Brand4", "Model4", 4),
            new Car("Brand5", "Model5", 5)
    );

    List<Car> getCars(int count);
}
