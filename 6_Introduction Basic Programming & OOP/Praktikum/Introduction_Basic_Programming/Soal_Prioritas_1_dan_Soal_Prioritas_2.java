package Introduction_Basic_Programming;

public class Soal_Prioritas_1_dan_Soal_Prioritas_2 {
    public static void main(String[] args) {
        drawXYZ(5);
        printAsterisk(5);

        // segitiga
        float alas = 20;
        float tinggi = 25;

        // TODO: hitung luas segitiga
        System.out.println("Luas Segitiga: " + 0.5 * (alas * tinggi));

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
            System.out.println("Untung: Dengan Keuntungan " + (hargaJual - hargaBeli));
        } else if (hargaBeli > hargaJual) {
            System.out.println("Rugi: Dengan Kerugian " + (hargaJual - hargaBeli));
        } else {
            System.out.println("Sama saja ");
        }
    }

    private static void printAsterisk(int n) {
        // TODO: complete this code
        int tinggi_segitiga = n, i, j, k;
        for (i = 1; i <= tinggi_segitiga; i++) {
            for (j = 1; j <= tinggi_segitiga - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void drawXYZ(int n) {
        //TODO: complete this code
        for (int i = 1; i < n * n; i++) {
            if (i % 3 == 0) {
                System.out.print("X");
            } else if (i % 2 == 1) {
                System.out.print("Y");
            } else {
                System.out.print("Z");
            }
            if (i % n == 0) {
                System.out.println();
            }
        }
    }
}

