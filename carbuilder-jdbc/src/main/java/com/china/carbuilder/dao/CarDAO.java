package com.china.carbuilder.dao;

public class CarDAO {
    
    private ICarDataDAO carDataDao;
    private ICarPartsDAO carPartsDao;

    public ICarDataDAO getCarDataDao() {
        if (this.carDataDao == null) {
            this.carDataDao = new CarDataDAO();
        }
        return this.carDataDao;
    }

    public ICarPartsDAO getCarPartsDao() {
        if (this.carPartsDao == null) {
            this.carPartsDao = new CarPartsDAO();
        }
        return carPartsDao;
    }
    
}
