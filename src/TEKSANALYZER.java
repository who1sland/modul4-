import java.util.Scanner;

public class TEKSANALYZER {

    private static String text = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            displayMenu();
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputText();
                    break;
                case 2:
                    countCharacters();
                    break;
                case 3:
                    countWords();
                    break;
                case 4:
                    searchWord();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (choice != 5);
    }

    private static void displayMenu() {
        System.out.println("=== MENU TEKS ANALYZER ===");
        System.out.println("1. Masukkan Teks");
        System.out.println("2. Hitung Jumlah Karakter");
        System.out.println("3. Hitung Jumlah Kata");
        System.out.println("4. Cari Kata dalam Teks");
        System.out.println("5. Keluar");
    }

    private static void inputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan teks:");
        text = scanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("Teks kosong. Silakan masukkan teks lagi.\n");
        } else {
            System.out.println("Teks telah dimasukkan!\n");
        }
    }

    private static void countCharacters() {
        int characterCount = text.length();
        System.out.println("Jumlah karakter dalam teks: " + characterCount + "\n");
    }

    private static void countWords() {
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        System.out.println("Jumlah kata dalam teks: " + wordCount + "\n");
    }

    private static void searchWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kata yang ingin dicari: ");
        String searchWord = scanner.next();

        String[] words = text.split("\\s+");
        int wordFrequency = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                wordFrequency++;
            }
        }

        System.out.println("Kata '" + searchWord + "' ditemukan sebanyak " + wordFrequency + " kali dalam teks.\n");
    }
}