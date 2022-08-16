package converter;

import dto.OrderDTO;
import entities.OrderEntity;

public class OrderConverter {

    public static OrderDTO toDto(OrderEntity entity) {
        OrderDTO toReturn = new OrderDTO();
        toReturn.setId(entity.getId());
        toReturn.setCreatedOn(entity.getCreatedOn());
        return toReturn;
    }

    public static OrderEntity toEntity(OrderDTO dto) {
        OrderEntity toReturn = new OrderEntity();
        toReturn.setId(dto.getId());
        toReturn.setCreatedOn(dto.getCreatedOn());
        return toReturn;
    }

}
