package tugas_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = getOption(), panjang, lebar, tinggi, jari;
        while (userInput != 0) {
            switch (userInput) {
                case 1:

                    System.out.print("Input Panjang: ");
                    panjang = input.nextInt();
                    System.out.print("Input Lebar: ");
                    lebar = input.nextInt();
                    System.out.print("Input Tinggi: ");
                    tinggi = input.nextInt();
                    Balok balok = new Balok(panjang, lebar, tinggi);

                    System.out.println("Luas Persegi Panjang= " + balok.hitungLuas());
                    System.out.println("Keliling Persegi Panjang= " + balok.hitungKeliling());
                    System.out.println("Volume Balok= " + balok.hitungVolume());
                    System.out.println("Luas Permukaan Balok= " + balok.hitungLuasPermukaan());
                    break;
                case 2:
                    System.out.print("Input Tinggi: ");
                    tinggi = input.nextInt();
                    System.out.print("Input Jari - jari: ");
                    jari = input.nextInt();
                    Tabung tabung = new Tabung(jari, tinggi);

                    System.out.println("Luas Lingkaran= " + tabung.hitungLuas());
                    System.out.println("Keliling Lingkaran= " + tabung.hitungKeliling());
                    System.out.println("Volume Tabung= " + tabung.hitungVolume());
                    System.out.println("Luas Permukaan Tabung= " + tabung.hitungLuasPermukaan());
            }
            if (userInput != 0) {
                userInput = getOption();
            }
        }

    }

    public static int getOption() {
        int pilih;
        System.out.println("==========");
        System.out.println("Menu Utama");
        System.out.println("==========");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        System.out.print("Pilih: ");
        Scanner sc = new Scanner(System.in);
        pilih = sc.nextInt();
        return pilih;
    }
}
