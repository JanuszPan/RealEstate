package entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@Table(name = "apartments")
public class Apartments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Range(min = 1, max = 500)
    private int area;

    @Range(min = 1, max = 20)
    private int rooms;

    @Range(min = 1, max = 10)
    private int bathrooms;

    private String stories;

    private String parking;

    @Lob //zdjęcia
    private byte [] image;//w bazie musi być kolumna typu blob

    @ManyToOne
    private District district;


}
