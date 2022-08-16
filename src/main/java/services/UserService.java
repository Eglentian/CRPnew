package services;


import dto.UserDto;
import entities.UserEntity;

public interface UserService {

    public UserEntity addUser(UserDto user);

    public void deleteUser(Integer id);

    public void testTransaction();

}
