package latihan_1;

public class Radio implements interfaceChannelRadio, interfaceElektronik {
    boolean mesin;
    int volume;

    public void on() {
        this.mesin = true;
    }

    public void off() {
        this.mesin = false;
    }

    public void gantiChannel(int c) {
        System.out.println("Channel Radio Berganti");
    }

    public void perbesarVolume() {
        this.volume++;
    }

    public void perkecilVolume() {
        this.volume--;
    }
}
