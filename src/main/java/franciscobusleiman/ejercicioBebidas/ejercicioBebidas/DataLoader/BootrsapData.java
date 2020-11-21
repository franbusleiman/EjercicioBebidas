package franciscobusleiman.ejercicioBebidas.ejercicioBebidas.DataLoader;

import franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model.Graduacion;

import franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Repositories.AlcoholRepository;
import franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model.Acompanante;
import franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model.Alcohol;
import franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model.TipoBebida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootrsapData implements CommandLineRunner {

    private final AlcoholRepository alcoholRepository;

    public BootrsapData (AlcoholRepository alcoholRepository){

        this.alcoholRepository = alcoholRepository;

    }

    @Override
    public void run(String... args) throws Exception {

        Alcohol fernet = new Alcohol("fernet",  TipoBebida.Coctel);
        Graduacion graduacion1 = new Graduacion(36);
        fernet.setGraduacion(graduacion1);
        Acompanante coca = new Acompanante("coca");
        fernet.setAcompanante(coca);
        alcoholRepository.save(fernet);




        Alcohol vodka = new Alcohol("vodka", TipoBebida.Blanca);
        Graduacion graduacion2 = new Graduacion(50);
        vodka.setGraduacion(graduacion2);
        Acompanante speed = new Acompanante("speed");
        vodka.setAcompanante(speed);
        alcoholRepository.save(vodka);

        Alcohol vino = new Alcohol("vino", TipoBebida.Fermentada);
        Graduacion graduacion3 = new Graduacion(15);
        vino.setGraduacion(graduacion3);
        Acompanante pritty = new Acompanante("pritty");
        vino.setAcompanante(pritty);
        alcoholRepository.save(vino);



    }
}
