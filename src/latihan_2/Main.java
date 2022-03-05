package latihan_2;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        MobilPribadi mobil = new MobilPribadi();
        Ambulance ambulance = new Ambulance();
        MobilPolisi polisi = new MobilPolisi();

        bus.tambahPenumpang();
        mobil.nyalakanTV();
        ambulance.gantiSuaraSirine(5);
        polisi.tekanGas();
    }
}
