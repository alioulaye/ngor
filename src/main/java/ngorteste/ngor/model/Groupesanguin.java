package ngorteste.ngor.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Groupesanguin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String libelle;

    @OneToMany(mappedBy = "groupesanguin" , cascade = CascadeType.ALL)
    private List<Habitant> habitants;

}
