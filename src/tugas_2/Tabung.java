package tugas_2;

public class Tabung extends Lingkaran implements MenghitungRuang {
    private int tinggi;

    public Tabung(int jari, int tinggi) {
        super(jari);
        setTinggi(tinggi);
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }

    public double hitungLuasPermukaan() {
        return (2 * super.hitungLuas()) + (super.hitungKeliling() * tinggi);
    }
}
