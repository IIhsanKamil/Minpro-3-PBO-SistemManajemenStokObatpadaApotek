package Model;

public abstract class Obat implements InfoObat {
    private final String idObat; 
    private String namaObat;
    private int stok;
    private double harga;

    public Obat(String idObat, String namaObat, int stok, double harga) {
        this.idObat = idObat;
        this.namaObat = namaObat;
        this.stok = stok;
        this.harga = harga;
    }

    public String getIdObat() { return idObat; }
    public String getNamaObat() { return namaObat; }
    public int getStok() { return stok; }
    public double getHarga() { return harga; }



    public void setNamaObat(String namaObat) { this.namaObat = namaObat; }
    public void setStok(int stok) { this.stok = stok; }
    public void setHarga(double harga) { this.harga = harga; }

    public abstract String getKategoriString();

    @Override
    public void tampilkanInfo() {
        System.out.printf("| %-8s | %-18s | %-15s | %-6d | Rp %-10.2f |", 
                idObat, namaObat, getKategoriString(), stok, harga);
    }
}