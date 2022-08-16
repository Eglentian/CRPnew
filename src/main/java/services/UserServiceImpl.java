package services;

import dto.UserDto;
import entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.OrderRepository;
import repositories.UserRepository;

@Service

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    OrderRepository orderRepository;

    public UserEntity addUser(UserDto user) {
        return null;
    }

    public void deleteUser(Integer id) {
    }

    public void testTransaction() {
    }

}
