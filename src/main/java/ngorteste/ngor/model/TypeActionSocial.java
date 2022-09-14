package ngorteste.ngor.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TypeActionSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String libelle;

    @OneToMany(mappedBy = "typeActionSocial",cascade =CascadeType.ALL )
    private List<ActionSocial> actionSocials;

}
