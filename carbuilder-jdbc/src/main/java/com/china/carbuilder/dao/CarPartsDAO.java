package com.china.carbuilder.dao;

import com.china.carbuilder.jdbc.MySqlConnector;
import com.china.carbuilder.model.Part;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

class CarPartsDAO extends MySqlConnector implements ICarPartsDAO {
    
    private final static String QUERY = "SELECT ct.id, ps.name, cpc.number \n" +
                                        "  FROM car_type ct, car_part_connection cpc, part_storage ps \n" +
                                        " WHERE ct.id = cpc.car_type_id \n" +
                                        "   AND cpc.part_storage_id = ps.id";

    @Override
    public Map<Integer, List<Part>> getCarParts() {
        Map<Integer, List<Part>> result = Collections.EMPTY_MAP;
        
        try(Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(QUERY)) {
            
            while (rs.next()) {
                int id = rs.getInt("id");
                
                if (!result.containsKey(id)) {
                    List<Part> parts = Collections.EMPTY_LIST;
                    parts.add(new Part(rs.getString("name"), rs.getInt("id")));
                    result.put(id, parts);
                } else {
                    result.get(id).add(new Part(rs.getString("name"), rs.getInt("id")));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarPartsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

}
