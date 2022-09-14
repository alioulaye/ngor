package ngorteste.ngor.model;

import lombok.*;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Habitant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idH;

    private String nom;

    private String prenom;

    private String tel;

    private int age;


    private String CNI;

    private boolean casocial;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idQ")
    private Quartier quartier;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idM")
    private Maladie maladie;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idGs")
    private Groupesanguin groupesanguin;

    @Nullable
    @ManyToMany
    @JoinTable(name = "t_action_social_habitant",joinColumns = @JoinColumn(name = "idH"),
            inverseJoinColumns = @JoinColumn(name = "idAh"))
    private List<ActionSocial> actionSocials = new ArrayList<>();
}