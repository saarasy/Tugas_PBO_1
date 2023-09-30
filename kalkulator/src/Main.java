import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Deklarasi tipe data dan variabel
        int bil1, bil2, pilih;
        float hasil;
        boolean loop = true;

        // Membaca masukan dari pengguna
        Scanner input = new Scanner(System.in);

        while (loop) {
            System.out.println("\n=======PROGRAM KALKULATOR========");
            System.out.print("Masukkan bilangan pertama: ");
            bil1 = input.nextInt();
            System.out.print("Masukkan bilangan kedua: ");
            bil2 = input.nextInt();

            System.out.println("\n1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("\nMasukkan Pilihan Anda: ");
            pilih = input.nextInt();

            if (pilih == 1) {
                hasil = bil1 + bil2;
                System.out.println("Hasil Penjumlahan dari " + bil1 + " + " + bil2 + " adalah " + hasil);
            } else if (pilih == 2) {
                hasil = bil1 - bil2;
                System.out.println("Hasil Pengurangan dari " + bil1 + " - " + bil2 + " adalah " + hasil);
            } else if (pilih == 3) {
                hasil = bil1 * bil2;
                System.out.println("Hasil Perkalian dari " + bil1 + " x " + bil2 + " adalah " + hasil);
            } else if (pilih == 4) {
                if (bil2 != 0) {
                    hasil = (float) bil1 / bil2;
                    System.out.println("Hasil Pembagian dari " + bil1 + " : " + bil2 + " adalah " + hasil);
                } else {
                    System.out.println("Pembagian oleh nol tidak diizinkan.");
                }
            } else {
                System.out.println("ERROR!!");
            }

            System.out.println();
            System.out.print("Apakah Anda ingin melanjutkan (y/n)? ");
            String lanjut = input.next();
            if (!lanjut.equalsIgnoreCase("y")) {
                loop = false;
            }

            // membersihkan layar konsol
            clearConsole();
        }

        // Menutup scanner
        input.close();
    }

    // Metode untuk membersihkan layar konsol
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.out.println("Error saat membersihkan layar konsol: " + e.getMessage());
        }
    }
}
