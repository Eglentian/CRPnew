package services;

import dto.CarDTO;
import entities.CarEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CarRepository;


@Service

public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository carRepository;

    public CarEntity addCar(CarDTO car) {
        return null;
    }

    public boolean deleteCar(Integer id) {
        return true;
    }

    public void testTransaction() {
    }

}
