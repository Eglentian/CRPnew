package services;


import dto.UserDTO;
import entities.UserEntity;

public interface UserService {

    public UserEntity addUser(UserDTO user);

    public boolean deleteUser(Integer id);

    public void testTransaction();

}
