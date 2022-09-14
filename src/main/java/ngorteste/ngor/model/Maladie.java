package ngorteste.ngor.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Maladie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idM;

    private String categorie;

    private String libelle;

    private String detailMaladie;

    private Date dateDebutMaladie;

    private Date dateGuerison;

    @OneToMany(mappedBy = "maladie",cascade = CascadeType.ALL)
    private List<Habitant> habitants;
}
