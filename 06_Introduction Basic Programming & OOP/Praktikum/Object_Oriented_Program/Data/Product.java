package Object_Oriented_Program.Data;

public class Product {
    private String nama;
    private String deskripsi;
    private Integer harga;
    private Integer jumlahstok;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getJumlahstok() {
        return jumlahstok;
    }

    public void setJumlahstok(Integer jumlahstok) {
        this.jumlahstok = jumlahstok;
    }
}