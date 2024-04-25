package universitas;

import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan() {
        // Tunjangan manajerial 10% dari gaji
        double tunjanganManajerial = 0.1 * getGaji();
        return super.getPendapatan() + tunjanganManajerial;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departemen: " + departemen;
    }
}
