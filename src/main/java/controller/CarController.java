package controller;


import converter.CarConverter;
import dto.CarDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.CarService;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @DeleteMapping("/deleteCar")
    public void deleteCar(@PathVariable Integer id) {
        carService.deleteCar(id);

    }

    @PostMapping("/addCar")
    public CarDto addCar(@RequestBody CarDto car) {
        return CarConverter.toDto(carService.addCar(car));
    }

    @PostMapping("/testTransaction")
    public void testTransaction() {
        carService.testTransaction();
    }

}
