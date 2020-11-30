package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCarList(int count){

        Car car1 = new Car("BMW", 2, "blue");
        Car car2 = new Car("Audi", 75, "black");
        Car car3 = new Car("Jaguar", 80, "gray");
        Car car4 = new Car("Volvo", 35, "red");
        Car car5 = new Car("Porsche", 911, "green");

        List<Car> carList = new ArrayList<>();
        List<Car> carList1 = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        int i = 0;
        if (count<=5) {
            while (count != i) {
                carList1.add(carList.get(i));
                i++;
            }
            return carList1;
        }
        else {
            return carList;
        }
    }
}
