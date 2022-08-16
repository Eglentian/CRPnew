package services;


import dto.CarDto;
import entities.CarEntity;

public interface CarService {

    public CarEntity addCar(CarDto car);

    public boolean deleteCar(Integer id);

    public void testTransaction();

}
