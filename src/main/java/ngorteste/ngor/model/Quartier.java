package ngorteste.ngor.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Quartier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   private String quartierName;

   @OneToMany(mappedBy = "quartier" , cascade = CascadeType.ALL)
    private List<Habitant> habitants;
}
