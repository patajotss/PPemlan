package UAPPemlan;

import java.util.ArrayList;
import java.util.Scanner;

public class Aksi {
    static Scanner scanner = new Scanner(System.in);

    static void viewFilms(ArrayList<Film> films) {
        for (Film film : films) {
            System.out.println("Film: " + film.name + " - Deskripsi: " + film.description + " - Harga: " + film.price + " - Stok: " + film.stock);
        }
    }

    static void orderFilm(User user, ArrayList<Film> films) {
        System.out.print("Nama Film yang ingin dipesan: ");
        String filmName = scanner.nextLine();
        Film selectedFilm = null;

        for (Film film : films) {
            if (film.name.equals(filmName)) {
                selectedFilm = film;
                break;
            }
        }

        if (selectedFilm == null) {
            System.out.println("Film yang dicari tidak ditemukan.");
            return;
        }

        System.out.print("Jumlah tiket yang ingin dipesan: ");
        int ticketCount = Integer.parseInt(scanner.nextLine());

        if (ticketCount > selectedFilm.stock) {
            System.out.println("Stok tiket tidak mencukupi.");
            return;
        }

        int totalPrice = ticketCount * selectedFilm.price;

        if (totalPrice > user.saldo) {
            System.out.println("Saldo tidak mencukupi, saldo yang dimiliki " + user.saldo);
            return;
        }

        user.saldo -= totalPrice;
        selectedFilm.stock -= ticketCount;
        user.orders.add("Film: " + selectedFilm.name + " - Jumlah: " + ticketCount + " - Total Harga: " + totalPrice);
        System.out.println("Tiket berhasil dipesan.");
    }

    static void viewOrders(User user) {
        if (user.orders.isEmpty()) {
            System.out.println("Kamu belum pernah melakukan pemesanan.");
        } else {
            for (String order : user.orders) {
                System.out.println(order);
            }
        }
    }

    static void addFilm(ArrayList<Film> films) {
        System.out.print("Nama Film: ");
        String name = scanner.nextLine();
        for (Film film : films) {
            if (film.name.equals(name)) {
                System.out.println("Film " + name + " sudah ada.");
                return;
            }
        }

        System.out.print("Deskripsi Film: ");
        String description = scanner.nextLine();
        System.out.print("Harga Tiket: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Stok Tiket: ");
        int stock = Integer.parseInt(scanner.nextLine());

        films.add(new Film(name, description, price, stock));
        System.out.println("Film : " + name);
        System.out.println("Deskripsi Film : " + description);
        System.out.println("Harga Tiket : " + price);
        System.out.println("Stok Tiket : " + stock);
        System.out.println("Deskripsi Film : " + description);
        System.out.println("Film " + name + "Berhasil ditambahkan");
    }
}
