package Utils;

import java.util.Scanner;

public class ValidasiInput {
    
    public static int inputIntPositif(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String raw = scanner.nextLine().trim();
            try {
                int value = Integer.parseInt(raw);
                if (value < 0) {
                    System.out.println("Input salah! Nilai stok tidak boleh negatif.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Input salah! Masukkan angka bulat yang valid.");
            }
        }
    }

    public static double inputDoublePositif(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String raw = scanner.nextLine().trim();
            try {
                double value = Double.parseDouble(raw);
                if (value < 0) {
                    System.out.println("Input salah! Harga tidak boleh negatif.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Input salah! Masukkan angka desimal/bulat yang valid.");
            }
        }
    }
}