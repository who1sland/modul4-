import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {
    private static ArrayList<Double> hasilOperasi = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator. Program berakhir.");
                break;
            }

            System.out.print("Masukkan angka: ");
            double number = scanner.nextDouble();
            double result = 0;

            switch (choice) {
                case 1:
                    result = Math.sqrt(number);
                    break;
                case 2:
                    System.out.print("Masukkan pangkat: ");
                    int pangkat = scanner.nextInt();
                    result = Math.pow(number, pangkat);
                    break;
                case 3:
                    result = Math.log(number);
                    break;
                case 4:
                    result = faktorial((int) number);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    continue;
            }

            System.out.println("Hasil operasi adalah: " + result);
            hasilOperasi.add(result);
        }

        // Menampilkan hasil operasi yang disimpan di ArrayList
        System.out.println("=== Hasil Operasi ===");
        for (int i = 0; i < hasilOperasi.size(); i++) {
            System.out.println("Operasi ke-" + (i + 1) + ": " + hasilOperasi.get(i));
        }
    }

    private static void showMenu() {
        System.out.println("=== Calculator ===");
        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma");
        System.out.println("4. Faktorial");
        System.out.println("5. Keluar");
    }

    private static double faktorial(int angka) {
        if (angka == 0 || angka == 1) {
            return 1;
        } else {
            return angka * faktorial(angka - 1);
        }
    }
}