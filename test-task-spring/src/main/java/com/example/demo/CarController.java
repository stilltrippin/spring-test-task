package com.example.demo;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class CarController {

    Map<String, String> carMap = new HashMap<>();

    @PostMapping("/api")
    public ResponseEntity<Car> acceptCar(@RequestParam (defaultValue = "NoBrand")String brand, @RequestParam (defaultValue = "NoAmount") String amount) {
        Car tempCar = null ;
        if (!"NoBrand".equals(brand)) {
            tempCar = new Car( brand , amount);
            carMap.put(tempCar.getBrand(), tempCar.getAmount());
        }
        return ResponseEntity.ok(tempCar);
    }

    @GetMapping("/api")
    public Map<String,String> displayCars(@RequestParam(defaultValue = "NoBrand") String brand) {
        if (!"NoBrand".equals(brand)) {
            for (Map.Entry car : carMap.entrySet()
            ) {
                if (car.getKey().equals(brand)) {
                    return Map.of(car.getKey().toString(), car.getValue().toString());
                }
            }
        }
            return carMap;
    }
}
