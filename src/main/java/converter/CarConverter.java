package converter;


import dto.CarDTO;
import dto.UserDTO;
import entities.CarEntity;
import entities.UserEntity;

public class CarConverter {

    public static CarDTO toDto(CarEntity entity) {
        CarDTO toReturn = new CarDTO();
        toReturn.setId(entity.getId());
        toReturn.setModel(entity.getModel());
        toReturn.setStatus(entity.getStatus());
        return toReturn;
    }

    public static CarEntity toEntity(CarDTO dto) {
        CarEntity toReturn = new CarEntity();
        toReturn.setId(dto.getId());
        toReturn.setModel(dto.getModel());
        toReturn.setStatus(dto.getStatus());
        return toReturn;
    }

}
