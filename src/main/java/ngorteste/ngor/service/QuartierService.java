package ngorteste.ngor.service;

import ngorteste.ngor.DAO.QuartierRepository;
import ngorteste.ngor.model.Quartier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuartierService {

    @Autowired
    private QuartierRepository quartierRepository;

    public boolean save (Quartier quartier){
        if (quartier == null){
            return false;
        }else {
            quartierRepository.save(quartier);
            return true;

        }
    }

    public List<Quartier> listeQuartier(){
        return quartierRepository.findAll();
    }

}
