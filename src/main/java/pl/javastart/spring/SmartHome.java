package pl.javastart.spring;

import org.springframework.stereotype.Component;

@Component
public class SmartHome {
    private SterownikPieca sterownikPieca;
    private SterownikGłośnika sterownikGłośnika;
    private SterownikRolet sterownikRolet;

    public SmartHome(SterownikPieca sterownikPieca, SterownikGłośnika sterownikGłośnika, SterownikRolet sterownikRolet) {
        this.sterownikPieca = sterownikPieca;
        this.sterownikGłośnika = sterownikGłośnika;
        this.sterownikRolet = sterownikRolet;
    }

    public void uruchomSterowniki(){
        sterownikGłośnika.podajPogode();
        sterownikPieca.uruchom();
        sterownikRolet.uruchomRolety();

    }
}
