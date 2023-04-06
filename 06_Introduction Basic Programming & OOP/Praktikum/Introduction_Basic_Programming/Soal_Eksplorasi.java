package Introduction_Basic_Programming;

import java.util.Scanner;
public class Soal_Eksplorasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan teks yang ingin dienkripsi: ");
        String plaintext = scanner.nextLine();

        String ciphertext = encrypt(plaintext);

        System.out.println("Teks terenkripsi: " + ciphertext);
    }

    private static String encrypt(String plaintext) {
        // Susunan alphabet yang digunakan untuk enkripsi
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int shift = 10;

        String ciphertext = "";

        // Mengubah plaintext ke uppercase
        plaintext = plaintext.toUpperCase();

        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);

            // Cek apakah karakter merupakan huruf atau bukan
            if (Character.isLetter(c)) {
                // Mencari posisi karakter di dalam alphabet
                int pos = alphabet.indexOf(c);

                // Melakukan pergeseran sesuai dengan shift
                int newPos = (pos + shift) % 26;

                // Mendapatkan karakter baru dari posisi yang telah digeser
                char newChar = alphabet.charAt(newPos);

                ciphertext += newChar;
            } else {
                // Jika bukan huruf, tambahkan karakter aslinya ke ciphertext
                ciphertext += c;
            }
        }

        return ciphertext;
    }
}
