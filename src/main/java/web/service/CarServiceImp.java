package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {



    @Override
    public List<Car> getCars(int count) {

        List<Car> resultList = new ArrayList<>();

        if (count > carList.size()) {
            count = carList.size();
        }

        for (int i = 0; i < count; i++) {
            resultList.add(carList.get(i));
        }

        return resultList;
    }
}
