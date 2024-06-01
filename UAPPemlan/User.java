package UAPPemlan;

import java.util.ArrayList;

public class User {
    String username;
    String password;
    int saldo;
    ArrayList<String> orders;

    public User(String username, String password, int saldo) {
        this.username = username;
        this.password = password;
        this.saldo = saldo;
        this.orders = new ArrayList<>();
    }
}
