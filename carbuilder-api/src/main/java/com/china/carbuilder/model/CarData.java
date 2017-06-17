package com.china.carbuilder.model;

import java.util.Objects;

public class CarData {
    
    private final int id;
    private final String firstName;
    private final String lastName;
    private final int buildNumber;

    public CarData(int id, String firstName, String lastName, int buildNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.buildNumber = buildNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBuildNumber() {
        return buildNumber;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.firstName);
        hash = 67 * hash + Objects.hashCode(this.lastName);
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
               (!Objects.equals(this.firstName, other.firstName)) &&
               (!Objects.equals(this.lastName, other.lastName));
    }

    @Override
    public String toString() {
        return "CarData{id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", buildNumber=" + buildNumber + '}';
    }
    
}
