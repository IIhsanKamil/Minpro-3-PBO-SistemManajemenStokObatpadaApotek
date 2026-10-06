package Main;

import Controller.ManajemenStok;
import Model.ObatBebas;
import Model.ObatResep;
import View.MainView;

public class Main {
    public static void main(String[] args) {
        ManajemenStok app = new ManajemenStok();

        app.tambahObat(new ObatBebas("OBT01", "Paracetamol", 50, 5000, "Mengantuk"));
        app.tambahObat(new ObatResep("OBT02", "Amoxicillin", 20, 12000, "dr. Rizki"));

        MainView view = new MainView(app);
        view.tampilkanMenu();
    }
}