package Object_Oriented_Program;

import Object_Oriented_Program.Data.Product;

public class SP1_SP2 {
    public static void main(String[] args) {
        System.out.println("===");
        System.out.println("INFO PRODUK");
        Product product = new Product();
        product.setNama("cofee");
        product.setDeskripsi("this is coffee");
        product.setHarga(15000);
        product.setJumlahstok(10);
        System.out.println("nama: " + product.getNama());
        System.out.println("deskripsi: " + product.getDeskripsi());
        System.out.println("harga: " + product.getHarga());
        System.out.println("jumlah stok: " + product.getJumlahstok());
        System.out.println("===");

        System.out.println("===");
        System.out.println("INFO PRODUK");
        Product product1 = new Product();
        product.setNama("milk");
        product.setDeskripsi("this is fresh milk");
        product.setHarga(25000);
        product.setJumlahstok(10);
        System.out.println("nama: " + product.getNama());
        System.out.println("deskripsi: " + product.getDeskripsi());
        System.out.println("harga: " + product.getHarga());
        System.out.println("jumlah stok: " + product.getJumlahstok());
        System.out.println("===");

        System.out.println("===");
        System.out.println("INFO PRODUK");
        Product product2 = new Product();
        product.setNama("apple juice");
        product.setDeskripsi("this is juice");
        product.setHarga(18000);
        product.setJumlahstok(20);
        System.out.println("nama: " + product.getNama());
        System.out.println("deskripsi: " + product.getDeskripsi());
        System.out.println("harga: " + product.getHarga());
        System.out.println("jumlah stok: " + product.getJumlahstok());
        System.out.println("===");

    }
}

