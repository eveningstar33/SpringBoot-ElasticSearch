package com.daiana.practicaljava.service;

import com.daiana.practicaljava.entity.Car;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class RandomCarService implements CarService {

    @Override
    public Car getRandomCar() {
        String brand = BRANDS.get(ThreadLocalRandom.current().nextInt(0, BRANDS.size()));
        String color = COLORS.get(ThreadLocalRandom.current().nextInt(0, COLORS.size()));
        String type = TYPES.get(ThreadLocalRandom.current().nextInt(0, TYPES.size()));

        return new Car(brand, color, type);
    }
}
