package latihan_1;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Televisi tv = new Televisi("LG");
        radio.on();
        radio.gantiChannel(4);
        radio.perbesarVolume();
        tv.on();
        tv.gantiChannel(3);
    }
}
