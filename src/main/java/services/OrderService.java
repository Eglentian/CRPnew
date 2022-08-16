package services;


import dto.OrderDto;
import entities.OrderEntity;

public interface OrderService {

    public OrderEntity addOrder(OrderDto order);

    public OrderDto getOrderById(Integer id);

    public void deleteOrder(Integer id);

    public void updateOrder(Integer id);

    OrderDto updateOrder(OrderDto orderDto);

    public void testTransaction();

}
