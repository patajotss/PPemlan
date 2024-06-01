package UAPPemlan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Film> films = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Admin> admins = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize some data
        films.add(new Film("Avengers: Endgame", "Sekuel epik dari Marvel Studios.", 50000, 10));
        films.add(new Film("Titanic", "Kisah romantis berlatar belakang tragedi Titanic.", 60000, 5));

        users.add(new User("user", "123", 100000));

        admins.add(new Admin("admin", "admin"));

        while (true) {
            System.out.println("Selamat Datang di Bioskop DSI >_< by : habib");
            System.out.println("1. Login sebagai User");
            System.out.println("2. Login sebagai Admin");
            System.out.println("3. Tutup Aplikasi");
            System.out.print("Pilih menu: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    AksiUser.loginUser(users, films);
                    break;
                case 2:
                    AksiAdmin.loginAdmin(admins, films);
                    break;
                case 3:
                    System.out.println("Aplikasi ditutup.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }
}
