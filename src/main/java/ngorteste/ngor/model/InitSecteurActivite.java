package ngorteste.ngor.model;

import ngorteste.ngor.DAO.SecteurPostRepositories;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class InitSecteurActivite {
    
    @Autowired
    private final SecteurPostRepositories secteurPostRepositories;

    public InitSecteurActivite(SecteurPostRepositories secteurPostRepositories) {
        this.secteurPostRepositories = secteurPostRepositories;
    }

    @PostConstruct
    private void init(){
        secteurPostRepositories.save(new SecteurPoste(1L,"secteur primaire"));
        secteurPostRepositories.save(new SecteurPoste(2L,"secteur secondaire"));
        secteurPostRepositories.save(new SecteurPoste(3L,"secteur terciere"));
    }
    
    
}
