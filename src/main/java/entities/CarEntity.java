package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "car", schema = "CarRental")
@Getter
@Setter
@NoArgsConstructor
@ToString
@NamedQuery(name = "car.findAll", query = "SELECT car FROM CarEntity car ")
public class CarEntity implements Serializable {
    private static final Integer serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "model", length = 50)
    private String model;

    @Column(nullable = false, name = "power", length = 50)
    private String power;

    @Column(nullable = false, name = "price", length = 50)
    private String price;


    @Column(name = "status")
    private String status;


}


