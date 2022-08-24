package ngorteste.ngor.DAO;

import ngorteste.ngor.model.Maladie;
import ngorteste.ngor.model.MaladieCategorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaladieRepositorie extends JpaRepository<MaladieCategorie,Long> {
}
