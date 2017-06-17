package com.china.carbuilder.dao;

import com.china.carbuilder.jdbc.MySqlConnector;
import com.china.carbuilder.model.CarData;
import java.util.List;

public class CarDataDAO extends MySqlConnector implements ICarDataDAO {

    @Override
    public List<CarData> getCarData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
