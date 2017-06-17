package com.china.carbuilder.service;

import com.china.carbuilder.dao.CarDAO;
import com.china.carbuilder.model.Car;
import java.util.List;

public class CarService extends CarDAO implements ICarService {

    @Override
    public List<Car> getCar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
