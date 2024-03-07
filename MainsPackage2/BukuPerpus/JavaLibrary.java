package MainsPackage2.BukuPerpus;

import java.util.Scanner;

public class JavaLibrary {
    public static void main(String[] args) {
        // Inisialisasi perpustakaan dengan 5 genre dan 5 buku per genre
        Library library = new Library(5, 5);

        // Menambahkan buku-buku untuk setiap genre
        // Genre: Politik
        library.addBook(0, 0, "Politik dan Pembangunan", "Mohammad Hatta", 350, "Gramedia");
        library.addBook(0, 1, "Perjuangan Kemerdekaan", "Ir. Soekarno", 450, "Erlangga");
        library.addBook(0, 2, "Demokrasi Modern", "Abraham Lincoln", 280, "Pustaka Jaya");
        library.addBook(0, 3, "Teori Politik", "Niccolo Machiavelli", 320, "Penerbit ITB");
        library.addBook(0, 4, "Negara dan Ideologi", "John Locke", 400, "Penerbit Universitas Indonesia");

        // Genre: Sains
        library.addBook(1, 0, "Sains Alamiah", "Stephen Hawking", 500, "Springer");
        library.addBook(1, 1, "Kimia Modern", "Marie Curie", 380, "Wiley");
        library.addBook(1, 2, "Fisika Kuantum", "Albert Einstein", 450, "McGraw-Hill");
        library.addBook(1, 3, "Biologi Sel", "Charles Darwin", 420, "Pearson");
        library.addBook(1, 4, "Astronomi Dasar", "Galileo Galilei", 360, "Elsevier");

        // Genre: Sejarah
        library.addBook(2, 0, "Sejarah Peradaban", "Will Durant", 600, "HarperCollins");
        library.addBook(2, 1, "Perang Dunia I", "Winston Churchill", 480, "Oxford University Press");
        library.addBook(2, 2, "Sejarah Kuno", "Herodotus", 520, "Penguin Classics");
        library.addBook(2, 3, "Kolonialisme dan Imperialisme", "Frantz Fanon", 420, "Verso");
        library.addBook(2, 4, "Sejarah Modern", "Eric Hobsbawm", 550, "Verso");

        // Genre: Fiksi
        library.addBook(3, 0, "Matahari", "Tere Liye", 320, "Republika");
        library.addBook(3, 1, "Laskar Pelangi", "Andrea Hirata", 390, "Bentang Pustaka");
        library.addBook(3, 2, "Perahu Kertas", "Dee Lestari", 350, "Bentang Pustaka");
        library.addBook(3, 3, "Bumi Manusia", "Pramoedya Ananta Toer", 420, "Hasta Mitra");
        library.addBook(3, 4, "Ayat-Ayat Cinta", "Habiburrahman El Shirazy", 360, "Republika");

        // Genre: Romance
        library.addBook(4, 0, "Me Before You", "Jojo Moyes", 320, "Penguin Books");
        library.addBook(4, 1, "The Notebook", "Nicholas Sparks", 350, "Warner Books");
        library.addBook(4, 2, "Pride and Prejudice", "Jane Austen", 400, "Penguin Classics");
        library.addBook(4, 3, "Romeo and Juliet", "William Shakespeare", 320, "Penguin Books");
        library.addBook(4, 4, "A Walk to Remember", "Nicholas Sparks", 280, "Warner Books");

        // Meminta pengunjung untuk memasukkan kode genre dan indeks buku yang ingin diakses
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter genre code (1-5):");
        int genreCode = scanner.nextInt();
        System.out.println("Enter book index (1-5):");
        int bookIndex = scanner.nextInt();

        // Menampilkan detail buku berdasarkan kode genre dan indeks buku
        library.getBookDetails(genreCode - 1, bookIndex - 1);

        scanner.close();
    }
    public void showtype(String[][] type, String categoryType) {
                System.out.printf("Kategori %s\n\n", categoryType);
                for (int i = 0; i < type.length; i++) {
                        System.out.printf("Buku ke-%d\n"
                                        + "1. %-15s: %s\n" + "2. %-15s: %s\n" + "3. %-15s: %s halaman\n"
                                        + "4. %-15s: %s\n" + "5. %-15s: %s\n\n",
                                        i + 1, "Judul Buku", type[i][0], "Penulis", type[i][1], "Jumlah Halaman",
                                        type[i][2],
                                        "Penerbit", type[i][3], "Tahun Terbit", type[i][4]);
                }
        }
}

