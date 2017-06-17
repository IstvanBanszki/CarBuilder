package com.china.carbuilder.dao;

import com.china.carbuilder.jdbc.MySqlConnector;
import com.china.carbuilder.model.Part;
import java.util.List;
import java.util.Map;

public class CarPartsDAO extends MySqlConnector implements ICarPartsDAO {

    @Override
    public Map<Integer, List<Part>> getCarParts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
