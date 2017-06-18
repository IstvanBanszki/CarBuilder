package com.china.carbuilder.core.main;

import com.china.carbuilder.core.service.CarService;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(new CarService().getCars());
    }
    
}
