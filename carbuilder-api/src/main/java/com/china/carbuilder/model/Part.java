package com.china.carbuilder.model;

import java.util.Objects;

public class Part {

    private final String name;
    private final int needNumber;

    public Part(String name, int needNumber) {
        this.name = name;
        this.needNumber = needNumber;
    }

    public String getName() {
        return name;
    }

    public int getNeedNumber() {
        return needNumber;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + this.needNumber;
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
        final Part other = (Part) obj;
        return (this.needNumber != other.needNumber) && 
               (!Objects.equals(this.name, other.name));
    }

    @Override
    public String toString() {
        return "Part{name=" + name + ", needNumber=" + needNumber + '}';
    }
    
}
