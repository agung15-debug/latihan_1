package tugas_2;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
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
        return 2 * ((super.hitungLuas()) + (super.getPanjang() * tinggi) + (super.getLebar() * tinggi));
    }
}
