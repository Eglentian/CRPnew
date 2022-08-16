package controller;


import converter.UserConverter;
import dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @DeleteMapping("/deleteUser")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);

    }

    @PostMapping("/addUser")
    public UserDTO addUser(@RequestBody UserDTO user) {


        return UserConverter.toDto(userService.addUser(user));
    }

    @PostMapping("/testTransaction")
    public void testTransaction() {
        userService.testTransaction();
    }

}
