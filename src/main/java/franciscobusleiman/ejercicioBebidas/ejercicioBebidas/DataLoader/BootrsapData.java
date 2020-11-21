package franciscobusleiman.ejercicioBebidas.ejercicioBebidas.DataLoader;

import franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model.Graduacion;

import franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Repositories.AlcoholRepository;
import franciscobusleiman.ejercicioBebidas.ejercicioBebidas.Model.Acompañante;
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
        Acompañante coca = new Acompañante("coca");
        alcoholRepository.save(fernet);
        fernet.getAcompañantes().add(coca);



        Alcohol vodka = new Alcohol("vodka", TipoBebida.Blanca);
        Graduacion graduacion2 = new Graduacion(50);
        vodka.setGraduacion(graduacion2);
        Acompañante speed = new Acompañante("speed");
        vodka.getAcompañantes().add(speed);
        alcoholRepository.save(vodka);

        Alcohol vino = new Alcohol("vino", TipoBebida.Fermentada);
        Graduacion graduacion3 = new Graduacion(15);
        vino.setGraduacion(graduacion3);
        Acompañante pritty = new Acompañante("pritty");
        vino.getAcompañantes().add(pritty);
        alcoholRepository.save(vino);



    }
}
