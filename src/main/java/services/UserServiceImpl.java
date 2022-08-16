package services;

import dto.UserDTO;
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

    public UserEntity addUser(UserDTO user) {
        return null;
    }

    public boolean deleteUser(Integer id) {
        return true;
    }

    public void testTransaction() {
    }

}
