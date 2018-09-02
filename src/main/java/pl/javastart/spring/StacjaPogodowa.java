package pl.javastart.spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa {
    private Integer temperatura;
    private boolean naslonecznienie;

    Random random = new Random();

    public Integer getTemperatura() {
        if (temperatura == null) {

            temperatura = random.nextInt(61) - 25;
        }
        return temperatura;
    }

    public boolean getNaslonecznienie() {

        if (naslonecznienie == false) {
            naslonecznienie = random.nextBoolean();
        }
        return naslonecznienie;
    }
}