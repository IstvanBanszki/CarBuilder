package com.china.carbuilder.dao;

import com.china.carbuilder.jdbc.MySqlConnector;
import com.china.carbuilder.model.CarData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class CarDataDAO extends MySqlConnector implements ICarDataDAO {

    private final static String QUERY = "SELECT ct.id, ct.name AS car_name, ct.brand AS car_brand, MIN(ps.number/cpc.number) as build_number \n" +
                                        "  FROM car_type ct, car_part_connection cpc, part_storage ps \n" +
                                        " WHERE ct.id = cpc.car_type_id \n" +
                                        "   AND cpc.part_storage_id = ps.id \n" +
                                        "GROUP BY ct.id";
    
    @Override
    public List<CarData> getCarData() {
        List<CarData> result = new LinkedList();
        
        try(Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(QUERY)) {
            
            while (rs.next()) {
                result.add(new CarData(
                        rs.getInt("id"),
                        rs.getString("car_name"),
                        rs.getString("car_brand"),
                        rs.getInt("build_number")
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarPartsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
    
}
