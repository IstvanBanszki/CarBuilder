package com.china.carbuilder.dao;

import com.china.carbuilder.model.Part;
import java.util.List;
import java.util.Map;

public interface ICarPartsDAO {

    Map<Integer, List<Part>> getCarParts();

}
