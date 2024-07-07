package PBO1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    // 13. array
    private static Rentalps[] daftarPsRental = new Rentalps[3];
    private static int rentalCount = 0;
    // 12. I/O Sederhana
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 11. perulangan
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Rental PS");
            System.out.println("2. Tampilkan Hasil Rental PS");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            // 10. seleksi
            int pilihan = getInputInt();
            switch (pilihan) {
                case 1:
                    tambahRentalPs();
                    break;
                case 2:
                    tampilkanRentalPs();
                    break;
                case 3:
                    System.out.println("Keluar...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void tambahRentalPs() {
        if (rentalCount >= daftarPsRental.length) {
            System.out.println("Daftar rental PS penuh. Tidak dapat menambahkan rental lagi.");
            return;
        }

        System.out.print("Masukkan jenis rental PS (1. Regular, 2. VIP): ");
        int jenis = getInputInt();

        System.out.print("Masukkan nama game: ");
        String namaGame = scanner.next();

        System.out.print("Masukkan harga per jam (dalam IDR): ");
        int hargaPerJam = getInputInt();

        System.out.print("Masukkan durasi sewa (dalam jam): ");
        int durasiSewa = getInputInt();

        Rentalps rental;
        if (jenis == 1) {
            // 2. object
            rental = new Rentalps(namaGame, hargaPerJam, durasiSewa);
        } else if (jenis == 2) {
            boolean includeSnack;
            while (true) {
                System.out.print("Apakah rental VIP termasuk snack? (true/false): ");
                String input = scanner.next();
                if (input.equalsIgnoreCase("true")) {
                    includeSnack = true;
                    break;
                } else if (input.equalsIgnoreCase("false")) {
                    includeSnack = false;
                    break;
                } else {
                    System.out.println("Masukkan harus true atau false.");
                }
            }
            rental = new Rentalpsvip(namaGame, hargaPerJam, durasiSewa, includeSnack);
        } else {
            System.out.println("Jenis rental PS tidak valid.");
            return;
        }

        daftarPsRental[rentalCount] = rental;
        rentalCount++;
        if (rentalCount == daftarPsRental.length) {
            System.out.println("Daftar rental PS penuh. Tidak dapat menambahkan rental lagi.");
        } else {
            System.out.println("Rental PS berhasil ditambahkan.");
        }
    }

    private static void tampilkanRentalPs() {
        if (rentalCount == 0) {
            System.out.println("Belum ada rental PS yang ditambahkan.");
        } else {
            for (int i = 0; i < rentalCount; i++) {
                System.out.println(daftarPsRental[i]);
            }
        }
    }

    // 14. error handling
    private static int getInputInt() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Input harus berupa angka.");
            scanner.next(); // Clear the invalid input
            return -1;
        }
    }
}
