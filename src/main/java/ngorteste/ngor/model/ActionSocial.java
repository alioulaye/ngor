package ngorteste.ngor.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActionSocial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAh;
    private String libelle;

    @ManyToMany
    @JoinTable(name = "t_action_social_habitant",joinColumns = @JoinColumn(name = "idAh"),
                inverseJoinColumns = @JoinColumn(name = "idH"))
    private List<Habitant> habitantList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idT")
    private TypeActionSocial typeActionSocial;


}
