package services;

import converter.OrderConverter;
import dto.OrderDto;
import entities.OrderEntity;
import exceptions.InvalidDateException;
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

    @Autowired
    OrderConverter orderConverter;

    public OrderEntity addOrder(OrderDto orderDTO) throws InvalidDateException {

        OrderEntity orderEntity = OrderConverter.toEntity(orderDTO);
        if (orderEntity.getDateFrom() != orderEntity.getDateUntil()) {
            throw new InvalidDateException("Cannot order within the same day");
        }

        if (orderEntity.getCreatedOn().before(orderEntity.getDateFrom()) || orderEntity.getCreatedOn().after(orderEntity.getDateUntil())) {
            throw new InvalidDateException("Cannot order for past dates");
        } else {
            orderRepository.save(orderEntity);
            return orderEntity;
        }

    }

    @Override
    public OrderDto getOrderById(Integer id) {
        return OrderConverter.toDto(orderRepository.getOrderById(id));
    }

    public void deleteOrder(Integer id) {
        orderRepository.getOrderById(id);
        orderRepository.deleteOrderById(id);
    }

    @Override
    public void updateOrder(Integer id) {

    }

    @Override
    public OrderDto updateOrder(OrderDto orderDto) {
        OrderEntity orderEntity = orderConverter.toEntity(orderDto);
        orderRepository.save(orderEntity);
        return orderDto;
    }

    @Override
    public void testTransaction() {
        //to do
    }

}

