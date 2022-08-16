package controller;


import converter.OrderConverter;
import dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.OrderService;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @DeleteMapping("/deleteOrder")
    public void deleteOrder(@PathVariable Integer id) {
        orderService.deleteOrder(id);

    }

    @PostMapping("/addOrder")
    public OrderDTO addOrder(@RequestBody OrderDTO order) {
        return OrderConverter.toDto(orderService.addOrder(order));
    }

    @PostMapping("/testTransaction")
    public void testTransaction() {
        orderService.testTransaction();
    }

}
