package com.china.carbuilder.model;

import java.util.List;
import java.util.Objects;

public class Car {

    private final CarData carData;
    private final List<Part> parts;

    public Car(CarData carData, List<Part> parts) {
        this.carData = carData;
        this.parts = parts;
    }

    public CarData getCarData() {
        return this.carData;
    }

    public List<Part> getParts() {
        return this.parts;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.carData.hashCode();
        hash = 23 * hash + Objects.hashCode(this.parts);
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
        final Car other = (Car) obj;
        return (this.carData.equals(other.carData)) &&
               (!Objects.equals(this.parts, other.parts));
    }

    @Override
    public String toString() {
        return "Car{carData=" + carData + ", parts=" + parts + '}';
    } 
    
}
