package converter;


import dto.UserDto;
import entities.UserEntity;

public class UserConverter {

    public static UserDto toDto(UserEntity entity) {
        UserDto toReturn = new UserDto();
        toReturn.setId(entity.getId());
        toReturn.setName(entity.getName());
        toReturn.setEmail(entity.getEmail());
        return toReturn;
    }

    public static UserEntity toEntity(UserDto dto) {
        UserEntity toReturn = new UserEntity();
        toReturn.setId(dto.getId());
        toReturn.setName(dto.getName());
        toReturn.setEmail(dto.getEmail());
        return toReturn;
    }

}
