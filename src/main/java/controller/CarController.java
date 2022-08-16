package controller;


import converter.CarConverter;
import converter.UserConverter;
import dto.CarDTO;
import dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.CarService;
import services.UserService;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @DeleteMapping("/deleteCar")
    public void deleteCar(@PathVariable Integer id) {
        carService.deleteCar(id);

    }

    @PostMapping("/addCar")
    public CarDTO addCar(@RequestBody CarDTO car) {
        return CarConverter.toDto(carService.addCar(car));
    }

    @PostMapping("/testTransaction")
    public void testTransaction() {
        carService.testTransaction();
    }

}
