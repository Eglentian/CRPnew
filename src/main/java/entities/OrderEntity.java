package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Order", schema = "CarRental")
@Getter
@Setter
@NoArgsConstructor
@ToString
@Where(clause = "valid=true or valid=null")
public class OrderEntity implements Serializable {

    private static final int serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "created_on")
    private Date createdOn;


    //user_id
    //car_id

    @Column(name = "date_from")
    private Date dateFrom;

    @Column(name = "date_until")
    private Date dateUntil;

}
