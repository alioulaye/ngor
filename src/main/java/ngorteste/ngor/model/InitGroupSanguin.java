package ngorteste.ngor.model;

import ngorteste.ngor.DAO.GroupeSanguiRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public class InitGroupSanguin {

    @Autowired
    private final GroupeSanguiRepository groupeSanguiRepository;

    public InitGroupSanguin(GroupeSanguiRepository groupeSanguiRepository) {
        this.groupeSanguiRepository = groupeSanguiRepository;
    }

    @PostConstruct
    private void init() {
        groupeSanguiRepository.save(new Groupesanguin(1, "Groupe A+", null));
        groupeSanguiRepository.save(new Groupesanguin(2, "Groupe A-", null));
        groupeSanguiRepository.save(new Groupesanguin(3, "Groupe B+", null));
        groupeSanguiRepository.save(new Groupesanguin(4, "Groupe B-",null));
        groupeSanguiRepository.save(new Groupesanguin(5, "Groupe AB+",null));
        groupeSanguiRepository.save(new Groupesanguin(6, "Groupe AB-",null));
        groupeSanguiRepository.save(new Groupesanguin(7, "Groupe O+",null));
        groupeSanguiRepository.save(new Groupesanguin(8, "Groupe O-",null));
    }

}
