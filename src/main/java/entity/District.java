package entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "district")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private City city;

}
