package services;

import dto.OrderDTO;
import entities.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.CarRepository;
import repositories.OrderRepository;


@Service

public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    CarRepository carRepository;

    /*public OrderEntity addOrder(OrderDTO order) {
        return null;
    }*/


    public OrderEntity addOrder(OrderDTO order) {
        if (order != null) {
        }
        return null;
    }


    public boolean deleteOrder(Integer id) {
        return true;
    }

    public void testTransaction() {
    }

}
