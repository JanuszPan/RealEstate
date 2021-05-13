package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "voivodeship")
public class Voivodeship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "voivodeship", fetch = FetchType.EAGER)
    private List<City> city;

}
