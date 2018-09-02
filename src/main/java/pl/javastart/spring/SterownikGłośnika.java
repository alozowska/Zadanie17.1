package pl.javastart.spring;

import org.springframework.stereotype.Component;

@Component
public class SterownikGłośnika {

    StacjaPogodowa stacjaPogodowa;

    public SterownikGłośnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }
    public void podajPogode(){
        Integer temp = stacjaPogodowa.getTemperatura();
        boolean naslonecznienie=stacjaPogodowa.getNaslonecznienie();
        System.out.println("Dzień dobry. Dziesiejsza temperatura: "+temp+" "+naslonecznienie);
}
}
