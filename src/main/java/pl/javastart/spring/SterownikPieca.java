package pl.javastart.spring;

import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {
    private StacjaPogodowa stacjaPogodowa;

    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public  void uruchom() {
        Integer temp = stacjaPogodowa.getTemperatura();
        if (temp<15){
            System.out.println("piec został włączony");
        }else
            System.out.println("piec nie został włączony");
    }
}