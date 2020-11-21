package franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Controllers;

import franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model.Alcohol;
import franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Repositories.AlcoholRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;


@Controller
public class IndexController {

    private final AlcoholRepository alcoholRepository;

    public IndexController(AlcoholRepository alcoholRepository){

        this.alcoholRepository = alcoholRepository;
    }

    @RequestMapping({"/index", " ", "/" })
    public String getBebidas(Model model){

        List<Alcohol> bebidas = alcoholRepository.findAll();

        model.addAttribute("bebidas", bebidas);
        return "index.html";
    }
}
