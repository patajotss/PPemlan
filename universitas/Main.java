package universitas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manusia lakiMenikah = new Manusia("John Doe", true, "1234567890", true);
        Manusia perempuanMenikah = new Manusia("Jane Doe", false, "0987654321", true);
        Manusia belumMenikah = new Manusia("Alex Smith", true, "1122334455", false);
        System.out.println(lakiMenikah);
        System.out.println(perempuanMenikah);
        System.out.println(belumMenikah);

        MahasiswaFILKOM mahasiswaLowIpk = new MahasiswaFILKOM("Budi", true, "1234567890", false, "1651506000001", 2.9);
        MahasiswaFILKOM mahasiswaMidIpk = new MahasiswaFILKOM("Ayu", false, "0987654321", false, "1651507000002", 3.3);
        MahasiswaFILKOM mahasiswaHighIpk = new MahasiswaFILKOM("Sari", false, "1122334455", false, "1651502000003", 3.8);
        System.out.println(mahasiswaLowIpk);
        System.out.println(mahasiswaMidIpk);
        System.out.println(mahasiswaHighIpk);

        Pekerja pekerjaYoung = new Pekerja("Adi", true, "3216549870", true, 3000, LocalDate.of(2019, 1, 1), 2);
        Pekerja pekerjaMidCareer = new Pekerja("Dina", false, "6543219870", true, 4500, LocalDate.of(2013, 5, 15), 0);
        Pekerja pekerjaSenior = new Pekerja("Rudi", true, "9876543210", true, 5500, LocalDate.of(2000, 2, 20), 10);
        System.out.println(pekerjaYoung);
        System.out.println(pekerjaMidCareer);
        System.out.println(pekerjaSenior);

        Manager manager = new Manager("Rina", false, "3332221110", true, 7500, LocalDate.of(2005, 3, 10), 0, "IT");
        System.out.println(manager);
    }
}