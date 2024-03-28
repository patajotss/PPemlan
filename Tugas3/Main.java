package Tugas3;

// Muhammad Habib
// 235150407111040
// SI - C

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input untuk Hero pertama menggunakan setter
        System.out.println("Permainan adu hero!");
        System.out.println("Player 1 : Silahkan masukkan hero Anda !");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500 !");
        System.out.println("===================================");
        Hero player1 = new Hero();
        System.out.print("Nama Hero   : ");
        player1.setName(scanner.nextLine());
        System.out.print("Health Point : ");
        player1.setHp(scanner.nextDouble());
        System.out.print("Attack      : ");
        player1.setAttack(scanner.nextDouble());
        System.out.print("Defense     : ");
        player1.setDefense(scanner.nextDouble());
        scanner.nextLine(); // membersihkan buffer

        // Input untuk Hero kedua menggunakan constructor full
        System.out.println("\nPermainan adu hero");
        System.out.println("Player 2 : Silahkan masukkan hero Anda !");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500 !");
        System.out.println("===================================");
        System.out.print("Nama Hero   : ");
        String name = scanner.nextLine();
        System.out.print("Health Point : ");
        double hp = scanner.nextDouble();
        System.out.print("Attack      : ");
        double attack = scanner.nextDouble();
        System.out.print("Defense     : ");
        double defense = scanner.nextDouble();
        Hero player2 = new Hero(name, hp, attack, defense);
        scanner.nextLine(); // membersihkan buffer

        int round = 1;
        // Looping pertarungan hingga salah satu Hero kehabisan HP
        while (round <= 3 && player1.getHp() > 0 && player2.getHp() > 0) {
            System.out.println("\n===================================");
            System.out.println("Round " + round + " FIGHT!!");
            // Penyerangan Hero 2 ke Hero 1
            System.out.println("\n(" + player2.getName() + ") menyerang (" + player1.getName() + ")");
            double damageToPlayer1 = player2.getAttack() - player1.getDefense();
            player1.setHp(player1.getHp() - damageToPlayer1);
            System.out.println("\n(" + player2.getName() + ") menyerang sebesar " + player2.getAttack() + " damage");
            System.out.println("(" + player1.getName() + ") memiliki pertahan sebesar " + player1.getDefense() + " yang mengurangi serangan");
            System.out.println("Health Point (" + player1.getName() + ") saat ini " + player1.getHp());

            // Penyerangan Hero 1 ke Hero 2
            System.out.println("\n(" + player1.getName() + ") menyerang (" + player2.getName() + ")");
            double damageToPlayer2 = player1.getAttack() - player2.getDefense();
            player2.setHp(player2.getHp() - damageToPlayer2);
            System.out.println("\n(" + player1.getName() + ") menyerang sebesar " + player1.getAttack() + " damage");
            System.out.println("(" + player2.getName() + ") memiliki pertahan sebesar " + player2.getDefense() + " yang mengurangi serangan");
            System.out.println("Health Point (" + player2.getName() + ") saat ini " + player2.getHp());

            round++;
        }

        // Menentukan pemenang
        System.out.println("\n===================================");
        System.out.println("Pertarungan telah usai !");
        if (player1.getHp() <= 0) {
            System.out.println("(" + player1.getName() + ") telah kalah !");
            System.out.println("(" + player2.getName() + ") adalah pemenangnya");
        } else if (player2.getHp() <= 0) {
            System.out.println("(" + player2.getName() + ") telah kalah !");
            System.out.println("(" + player1.getName() + ") adalah pemenangnya");
        } else {
            System.out.println("Hasil akhirnya seri!");
        }
    }
}
