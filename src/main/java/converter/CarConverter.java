package converter;


import dto.CarDto;
import entities.CarEntity;

public class CarConverter {

    public static CarDto toDto(CarEntity entity) {
        CarDto toReturn = new CarDto();
        toReturn.setId(entity.getId());
        toReturn.setModel(entity.getModel());
        toReturn.setStatus(entity.getStatus());
        return toReturn;
    }

    public static CarEntity toEntity(CarDto dto) {
        CarEntity toReturn = new CarEntity();
        toReturn.setId(dto.getId());
        toReturn.setModel(dto.getModel());
        toReturn.setStatus(dto.getStatus());
        return toReturn;
    }

}
