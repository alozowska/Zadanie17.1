package pl.javastart.spring;

import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {
    StacjaPogodowa stacjaPogodowa;

    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }
    public void uruchomRolety(){
        boolean naslonecznienie=stacjaPogodowa.getNaslonecznienie();
        if (naslonecznienie==true){
            System.out.println("Jest słonecznie. Zasłaniam rolety");
        }else
            System.out.println("Jest pochmurno. Nie zasłaniam rolet");
    }
}
