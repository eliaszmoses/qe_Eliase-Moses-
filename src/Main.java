package lanjutan;

public class Main {
    public static void main(String[] args) {
        // segitiga
        float alas = 20;
        float tinggi = 25;

        // TODO: hitung luas segitiga
        System.out.println("Luas Segitiga: " + 0.5 * (alas * tinggi));
        ;

        // persegi panjang
        float panjang = 40;
        float lebar = 6;

        //TODO: hitung luas persegi panjang
        System.out.println("Luas persegi panjang: " + panjang * lebar);

        // lingkaran
        double jari2 = 7;

        //TODO: hitung luas lingkaran
        System.out.println("Luas lingkaran: " + 3.14 * (jari2 * jari2));

        int hargaBeli = 15000;
        int hargaJual = 30000;

        if (hargaBeli < hargaJual) {
            System.out.println("Untung: Dengan Keuntungan "+ (hargaJual-hargaBeli));
        } else if(hargaBeli > hargaJual) {
            System.out.println("Rugi: Dengan Kerugian "+ (hargaJual-hargaBeli));
        } else {
            System.out.println("Sama saja ");
        }
    }
}
