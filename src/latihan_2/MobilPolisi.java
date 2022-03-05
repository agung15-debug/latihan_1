package latihan_2;

public class MobilPolisi extends MobilNegara {
    public void nyalakanTape() {
        System.out.println("Tape dinyalakan");
    }

    public void nyalakanTV() {
        System.out.println("Televisi dinyalakan");
    }

    public void nyalakanAC() {
        System.out.println("AC dinyalakan");
    }

    public void nyalakanMesin() {
        mesin = true;
    }

    public void matikanMesin() {
        mesin = false;
    }

    public void tambahkanGerigi() {
        System.out.println("Gerigi ditambahkan");
    }

    public void turunkanGerigi() {
        System.out.println("Gerigi diturunkan");
    }

    public void tekanGas() {
        System.out.println("Gas ditekan, kecepatan bertambah!!");
    }

    public void tekanRem() {
        System.out.println("Rem ditekan, kecepatan berkurang!!");
    }

    public void nyalakanSirine() {
        System.out.println("Sirine dinyalakan");
    }

    public void matikanSirine() {
        System.out.println("Sirine dimatikan");
    }

    public void gantiSuaraSirine(int jenis) {
        System.out.println("Suara sirine Nomor " + jenis);
    }

    public void nyalakanRadioHT() {
        System.out.println("Radio HT dinyalakan");
    }

    public void matikanRadioHT() {
        System.out.println("Radio HT dimatikan");
    }
}
