package com.daiana.practicaljava.service;

import com.daiana.practicaljava.entity.Car;

import java.util.Arrays;
import java.util.List;

public interface CarService {

    List<String> BRANDS = Arrays.asList("Toyota", "Honda", "Ford");
    List<String> COLORS = Arrays.asList("Red", "Black", "White");
    List<String> TYPES = Arrays.asList("Sedan", "SUV", "MDV");

    Car getRandomCar();
}
