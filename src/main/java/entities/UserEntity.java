package entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user", schema = "CRP")
@Getter
@Setter
@NoArgsConstructor
@ToString
//@Where(clause = "valid=true or valid=null")
@NamedQuery(name = "User.findAll", query = "SELECT user FROM UserEntity user ")
public class UserEntity implements Serializable {
    private static final Integer serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, name = "name", length = 50)
    private String name;

    @Column(nullable = false, name = "role", length = 50)
    private String role;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 25)
    private String password;


    /*@ManyToMany(fetch = FetchType.LAZY) //ManyToMany ? Pse duhet mbajtur ne tabel me vete kjo lidhja?
    // Nuk mjafton ta lexojme nga database cfare roli ka?
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))*/
}


