package UAPPemlan;

import java.util.ArrayList;
import java.util.Scanner;

public class AksiAdmin {
    static Scanner scanner = new Scanner(System.in);

    public static void loginAdmin(ArrayList<Admin> admins, ArrayList<Film> films) {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (Admin admin : admins) {
            if (admin.username.equals(username) && admin.password.equals(password)) {
                System.out.println("Selamat datang " + username);
                adminMenu(films);
                return;
            }
        }
        System.out.println("Username atau password salah. Silakan coba lagi.");
    }

    static void adminMenu(ArrayList<Film> films) {
        while (true) {
            System.out.println("1. Lihat Daftar Film");
            System.out.println("2. Tambah Film");
            System.out.println("3. Logout");
            System.out.print("Pilih menu: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Aksi.viewFilms(films);
                    break;
                case 2:
                    Aksi.addFilm(films);
                    break;
                case 3:
                    System.out.println("Anda telah logout.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
