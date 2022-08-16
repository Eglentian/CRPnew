package controller;


import converter.OrderConverter;
import dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.OrderService;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;


    @PutMapping("/updateOrder")
    public void updateOrder(@PathVariable Integer id) {
        orderService.updateOrder(id);
    }

    @PostMapping("/addOrder")
    public OrderDto addOrder(@RequestBody OrderDto order) {
        return OrderConverter.toDto(orderService.addOrder(order));
    }

    @PostMapping("/testTransaction")
    public void testTransaction() {
        orderService.testTransaction();
    }

    @DeleteMapping("/deleteOrder")
    public void deleteOrder(@PathVariable Integer id) {
        orderService.deleteOrder(id);

    }

}
