package dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class OrderDto {

    private Integer id;

    private Date createdOn;

    private UserDto userDTO;

    private CarDto carDTO;

}
