package converter;

import dto.OrderDto;
import entities.OrderEntity;

public class OrderConverter {

    public static OrderDto toDto(OrderEntity entity) {
        OrderDto toReturn = new OrderDto();
        toReturn.setId(entity.getId());
        toReturn.setCreatedOn(entity.getCreatedOn());
        return toReturn;
    }

    public static OrderEntity toEntity(OrderDto dto) {
        OrderEntity toReturn = new OrderEntity();
        toReturn.setId(dto.getId());
        toReturn.setCreatedOn(dto.getCreatedOn());
        return toReturn;
    }

}
