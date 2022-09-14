package ngorteste.ngor.DAO;

import ngorteste.ngor.model.Maladie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaladieRepositorie extends JpaRepository<Maladie,Long> {
}
