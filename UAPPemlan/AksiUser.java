package UAPPemlan;

import java.util.ArrayList;
import java.util.Scanner;

public class AksiUser {
    static Scanner scanner = new Scanner(System.in);

    public static void loginUser(ArrayList<User> users, ArrayList<Film> films) {
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                System.out.println("Selamat datang " + username);
                userMenu(user, films);
                return;
            }
        }
        System.out.println("Username atau password salah. Silakan coba lagi.");
    }

    static void userMenu(User user, ArrayList<Film> films) {
        while (true) {
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Lihat Daftar Film");
            System.out.println("3. Pesan Film");
            System.out.println("4. Lihat Pesanan");
            System.out.println("5. Logout");
            System.out.print("Pilih menu: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Saldo anda: " + user.saldo);
                    break;
                case 2:
                    Aksi.viewFilms(films);
                    break;
                case 3:
                    Aksi.orderFilm(user, films);
                    break;
                case 4:
                    Aksi.viewOrders(user);
                    break;
                case 5:
                    System.out.println("Anda telah logout.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
