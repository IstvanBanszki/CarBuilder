package com.china.carbuilder.service;

import com.china.carbuilder.dao.ICarDataDAO;
import com.china.carbuilder.dao.ICarPartsDAO;
import com.china.carbuilder.model.Car;
import com.china.carbuilder.model.CarData;
import com.china.carbuilder.model.Part;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class CarService implements ICarService {

    @Inject private ICarDataDAO carDataDAO;
    @Inject private ICarPartsDAO carPartsDAO;
    
    @Override
    public List<Car> getCars() {
        List<Car> result = new LinkedList();
        List<CarData> carDataList = this.carDataDAO.getCarData();
        Map<Integer, List<Part>> carPartsMap = carPartsDAO.getCarParts();
        
        carDataList.stream().forEach((carData) -> {
            result.add(new Car(carData, carPartsMap.get(carData.getId())));
        });
        return result;
    }

}
