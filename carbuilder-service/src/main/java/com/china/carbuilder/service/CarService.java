package com.china.carbuilder.service;

import com.china.carbuilder.dao.CarDAO;
import com.china.carbuilder.model.Car;
import com.china.carbuilder.model.CarData;
import com.china.carbuilder.model.Part;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CarService extends CarDAO implements ICarService {

    @Override
    public List<Car> getCars() {
        List<Car> result = new LinkedList();
        List<CarData> carDataList = getCarDataDao().getCarData();
        Map<Integer, List<Part>> carPartsMap = getCarPartsDao().getCarParts();
        
        carDataList.stream().forEach((carData) -> {
            result.add(new Car(carData, carPartsMap.get(carData.getId())));
        });
        return result;
    }

}
