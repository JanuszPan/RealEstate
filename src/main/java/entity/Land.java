package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@Table(name = "land")
public class Land {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    @Size(max = 600)
    private String description;

    @Lob @Basic(fetch = FetchType.LAZY) //zdjęcia
    private byte [] image;//w bazie musi być kolumna typu blob

    @ManyToOne
    private District district;
}

