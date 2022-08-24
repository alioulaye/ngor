package ngorteste.ngor.controller;

import ngorteste.ngor.model.Quartier;
import ngorteste.ngor.service.QuartierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/quartier")
public class QuartierController {

    @Autowired
    private QuartierService quartierService;

    @GetMapping("/quartier-liste")
    public @ResponseBody List<Quartier> liste() {
        List<Quartier> listeQuartier = quartierService.listeQuartier();
        return listeQuartier;
    }

    @PostMapping("/add-quartier")
    public @ResponseBody boolean add(@RequestBody Quartier quartier){
        return quartierService.save(quartier);

    }
}
