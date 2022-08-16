package converter;


import dto.UserDTO;
import entities.UserEntity;

public class UserConverter {

    public static UserDTO toDto(UserEntity entity) {
        UserDTO toReturn = new UserDTO();
        toReturn.setId(entity.getId());
        toReturn.setName(entity.getName());
        toReturn.setEmail(entity.getEmail());
        return toReturn;
    }

    public static UserEntity toEntity(UserDTO dto) {
        UserEntity toReturn = new UserEntity();
        toReturn.setId(dto.getId());
        toReturn.setName(dto.getName());
        toReturn.setEmail(dto.getEmail());
        return toReturn;
    }

}
