package com.china.carbuilder.main;

import com.china.carbuilder.service.CarService;
import com.china.carbuilder.model.Car;
import java.util.List;
import java.util.StringJoiner;

public class Main {
    
    public static void main(String[] args) {
        
        List<Car> cars = new CarService().getCars();
        
        StringJoiner stringJoiner = new StringJoiner("\n/***********/\n");
        cars.stream().forEach(
                (car) -> { stringJoiner.add(car.toString()); }
        );
        
        System.out.println("Data:\n\n" + stringJoiner.toString());
    }
    
}
