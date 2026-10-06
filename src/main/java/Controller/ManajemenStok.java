package Controller;

import java.util.ArrayList;
import Model.Obat;

public class ManajemenStok {
    private ArrayList<Obat> daftarObat = new ArrayList<>();

    public boolean tambahObat(Obat obat) {
        return daftarObat.add(obat);
    }
    
    public ArrayList<Obat> getSemuaObat() {
        return daftarObat;
    }

    // Overloading 1: Mengubah seluruh informasi obat
    public boolean updateObat(String id, String namaBaru, int stokBaru, double hargaBaru) {
        Obat o = cariObatById(id);
        if (o != null) {
            o.setNamaObat(namaBaru);
            o.setStok(stokBaru);
            o.setHarga(hargaBaru);
            return true;
        }
        return false;
    }

    // Overloading 2: Hanya untuk menambah stok obat (Restock)
    public boolean updateObat(String id, int tambahanStok) {
        Obat o = cariObatById(id);
        if (o != null) {
            o.setStok(o.getStok() + tambahanStok);
            return true;
        }
        return false;
    }

    public boolean hapusObat(String id) {
        Obat o = cariObatById(id);
        if (o != null) {
            daftarObat.remove(o);
            return true;
        }
        return false;
    }

    public Obat cariObatById(String id) {
        for (Obat o : daftarObat) {
            if (o.getIdObat().equalsIgnoreCase(id)) {
                return o;
            }
        }
        return null;
    }
}