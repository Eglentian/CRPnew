package services;


import dto.CarDTO;
import entities.CarEntity;

public interface CarService {

    public CarEntity addCar(CarDTO car);

    public boolean deleteCar(Integer id);

    public void testTransaction();

}
