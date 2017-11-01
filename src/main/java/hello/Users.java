package hello;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "USERS")
public class Users {

//    @SequenceGenerator(name = "UserIdSeq", sequenceName = "USERS_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "ID")
    Long id;

    @Column(name = "NAME")
    String name;
}
