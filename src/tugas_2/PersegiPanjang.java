package tugas_2;

public class PersegiPanjang implements MenghitungBangun {
    private int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        setPanjang(panjang);
        setLebar(lebar);
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLebar() {
        return lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
