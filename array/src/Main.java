import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1D = new int[20];
        int[][] array2D = new int[50][50];
        int pilih, banyak, baris, kolom;
        char lanjut;

        do {
            System.out.println("======PROGRAM ARRAY=====");
            System.out.println("1. Array 1 Dimensi");
            System.out.println("2. Array 2 Dimensi");
            System.out.print("Masukkan Pilihan Anda: ");
            pilih = input.nextInt();

            if (pilih == 1) {
                System.out.print("Masukkan Banyak Bilangan : ");
                banyak = input.nextInt();
                for (int i = 0; i < banyak; i++) {
                    System.out.print("Bilangan ke - " + (i + 1) + " : ");
                    array1D[i] = input.nextInt();
                }

                for (int i = 0; i < banyak; i++) {
                    System.out.println("Elemen ke-" + i + ": " + array1D[i]);
                }
            } else if (pilih == 2) {
                System.out.print("Masukkan Banyak Baris : ");
                baris = input.nextInt();
                System.out.print("Masukkan Banyak Kolom : ");
                kolom = input.nextInt();

                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        System.out.print("Masukkan elemen ke [" + i + "][" + j + "] : ");
                        array2D[i][j] = input.nextInt();
                    }
                }
            } else {
                System.out.println("ERROR");
            }

            System.out.print("Apakah Anda ingin melanjutkan (y/n)? ");
            lanjut = input.next().charAt(0);
        } while (lanjut == 'y' || lanjut == 'Y');

        input.close();
    }
}
