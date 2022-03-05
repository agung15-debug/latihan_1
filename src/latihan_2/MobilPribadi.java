package latihan_2;

public class MobilPribadi extends Mobil {
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
}
