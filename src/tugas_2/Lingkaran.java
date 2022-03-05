package tugas_2;

public class Lingkaran implements MenghitungBangun {
    private int jari;

    public Lingkaran(int jari) {
        setJari(jari);
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public int getJari() {
        return jari;
    }

    public double hitungLuas() {
        return PHI * (jari * jari);
    }

    public double hitungKeliling() {
        return 2 * (PHI * jari);
    }
}
