package com.china.carbuilder.model;

import java.util.Objects;

public class CarData {
    
    private final int id;
    private final String brand;
    private final String type;
    private final int buildNumber;

    public CarData(int id, String firstName, String lastName, int buildNumber) {
        this.id = id;
        this.brand = firstName;
        this.type = lastName;
        this.buildNumber = buildNumber;
    }

    public int getId() {
        return this.id;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getType() {
        return this.type;
    }

    public int getBuildNumber() {
        return this.buildNumber;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.brand);
        hash = 67 * hash + Objects.hashCode(this.type);
        hash = 67 * hash + this.buildNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CarData other = (CarData) obj;
        if (this.id != other.id) {
            return false;
        }
        return (this.buildNumber != other.buildNumber) && 
               (!Objects.equals(this.brand, other.brand)) &&
               (!Objects.equals(this.type, other.type));
    }

    @Override
    public String toString() {
        return "CarData{brand=" + this.brand + ", type=" + this.type + ", buildNumber=" + this.buildNumber + '}';
    }
    
}
