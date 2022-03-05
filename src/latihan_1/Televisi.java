package latihan_1;

public class Televisi implements interfaceChannelTV, interfaceElektronik {
    boolean mesin, listrik;
    String merk;

    public Televisi(String merk) {
        this.merk = merk;
    }

    public void on() {
        listrik = true;
        mesin = true;
    }

    public void off() {
        listrik = false;
        mesin = false;
    }

    public void gantiChannel(int c) {
        System.out.println("Ganti channel TV");
    }
}
