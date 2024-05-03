package kue;

public class Main {
    public static void main(String[] args) {
        Kue[] kueArray = new Kue[20];

        for (int i = 0; i < kueArray.length; i++) {
            if (i % 2 == 0) {
                kueArray[i] = new KuePesanan("KuePesanan" + i, 1000 + i * 10, 2 + i * 0.5);
            } else {
                kueArray[i] = new KueJadi("KueJadi" + i, 500 + i * 5, 5 + i);
            }
        }

        double totalHarga = 0;
        double totalHargaPesanan = 0, totalBeratPesanan = 0;
        double totalHargaJadi = 0, totalJumlahJadi = 0;
        Kue kueHargaTertinggi = kueArray[0];

        for (Kue kue : kueArray) {
            System.out.println(kue);
            totalHarga += kue.hitungHarga();

            if (kue instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) kue;
                totalHargaPesanan += kp.hitungHarga();
                totalBeratPesanan += kp.getBerat();
            } else if (kue instanceof KueJadi) {
                KueJadi kj = (KueJadi) kue;
                totalHargaJadi += kj.hitungHarga();
                totalJumlahJadi += kj.getJumlah();
            }

            if (kue.hitungHarga() > kueHargaTertinggi.hitungHarga()) {
                kueHargaTertinggi = kue;
            }
        }

        System.out.println("Total harga semua kue: " + totalHarga);
        System.out.println("Total harga dan berat Kue Pesanan: " + totalHargaPesanan + ", " + totalBeratPesanan);
        System.out.println("Total harga dan jumlah Kue Jadi: " + totalHargaJadi + ", " + totalJumlahJadi);
        System.out.println("Kue dengan harga tertinggi: " + kueHargaTertinggi);
    }
}
