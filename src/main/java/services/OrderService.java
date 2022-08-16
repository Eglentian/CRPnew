package services;


import dto.OrderDTO;
import entities.OrderEntity;

public interface OrderService {

    public OrderEntity addOrder(OrderDTO order);

    public boolean deleteOrder(Integer id);

    public void testTransaction();

}
