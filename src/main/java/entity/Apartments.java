package entity;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "apartments")
public class Apartments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    @Range(min = 1, max = 200000000)
    private int price;

    @Range(min = 1, max = 500)
    private int area;

    @Range(min = 1, max = 20)
    private int rooms;

    @Range(min = 0, max = 10)
    private int bathrooms;

    @Range(min = -2, max = 20)
    private int storey;

    private String parking;

    private String lift;

    @Size(max = 600)
    private String description;

    @Lob @Basic(fetch = FetchType.LAZY) //zdjęcia
    private byte [] image;

    @ManyToOne
    private Voivodeship voivodeship;

    @ManyToOne
    private City city;

    @ManyToOne
    private District district;

    @ManyToOne
    private Transaction transaction;
}
