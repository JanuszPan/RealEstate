package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "city", fetch = FetchType.EAGER)
    private List<District> districts=new ArrayList<>();//walidacja

    @ManyToOne
    private Voivodeship voivodeship;

}
