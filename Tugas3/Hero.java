package Tugas3;

// Muhammad Habib
// 235150407111040
// SI - C

// Class untuk representasi Hero
public class Hero {
    private String name;
    private double hp;
    private double attack;
    private double defense;

    // Constructor 1 tanpa parameter
    public Hero() {}

    // Constructor 2 dengan parameter lengkap
    public Hero(String name, double hp, double attack, double defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    // Getter dan Setter untuk setiap atribut
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }
}
