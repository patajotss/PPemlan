package MainsPackage2.BukuPerpus;

import java.util.Scanner;

public class JavaLibrary {
    public static void main(String[] args) {
        // Inisialisasi perpustakaan dengan 5 genre dan 5 buku per genre
        Library library = new Library(5, 5);

        // Menambahkan buku-buku untuk setiap genre
        // Genre: Politik
        library.addBook(0, 0, "Politik dan Pembangunan", "Mohammad Hatta", 350, "Gramedia", "politik dan pembangunan yang membahas peran politik dalam proses pembangunan sebuah negara.");
        library.addBook(0, 1, "Perjuangan Kemerdekaan", "Ir. Soekarno", 450, "Erlangga", "tentang perjuangan bangsa Indonesia dalam merebut kemerdekaannya.");
        library.addBook(0, 2, "Demokrasi Modern", "Abraham Lincoln", 280, "Pustaka Jaya", "mengenai prinsip-prinsip demokrasi modern dan penerapannya di berbagai negara.");
        library.addBook(0, 3, "Teori Politik", "Niccolo Machiavelli", 320, "Penerbit ITB", "teori politik dari sudut pandang Machiavelli yang kontroversial.");
        library.addBook(0, 4, "Negara dan Ideologi", "John Locke", 400, "Penerbit Universitas Indonesia", "tentang hubungan antara negara dan ideologi menurut pemikiran John Locke.");

        // Genre: Sains
        library.addBook(1, 0, "Sains Alamiah", "Stephen Hawking", 500, "Springer", "mengenai konsep-konsep dasar dalam sains alamiah dan pemahaman tentang alam semesta.");
        library.addBook(1, 1, "Kimia Modern", "Marie Curie", 380, "Wiley", "tentang perkembangan ilmu kimia modern dan kontribusi Marie Curie di bidang ini.");
        library.addBook(1, 2, "Fisika Kuantum", "Albert Einstein", 450, "McGraw-Hill", "tentang teori fisika kuantum dan kontribusi Einstein dalam pengembangannya.");
        library.addBook(1, 3, "Biologi Sel", "Charles Darwin", 420, "Pearson", "mengenai struktur dan fungsi biologi sel serta teori evolusi Darwin.");
        library.addBook(1, 4, "Astronomi Dasar", "Galileo Galilei", 360, "Elsevier", "tentang konsep dasar astronomi dan penemuan-penemuan Galileo Galilei.");

        // Genre: Sejarah
        library.addBook(2, 0, "Sejarah Peradaban", "Will Durant", 600, "HarperCollins", "perjalanan sejarah peradaban manusia dari masa purba hingga zaman modern.");
        library.addBook(2, 1, "Perang Dunia I", "Winston Churchill", 480, "Oxford University Press", "tentang peristiwa dan dampak Perang Dunia I dalam sejarah dunia.");
        library.addBook(2, 2, "Sejarah Kuno", "Herodotus", 520, "Penguin Classics", "mengenai catatan sejarah kuno dari sudut pandang Herodotus.");
        library.addBook(2, 3, "Kolonialisme dan Imperialisme", "Frantz Fanon", 420, "Verso", "tentang kolonialisme dan imperialisme serta dampaknya terhadap bangsa-bangsa di seluruh dunia.");
        library.addBook(2, 4, "Sejarah Modern", "Eric Hobsbawm", 550, "Verso", "mengenai perkembangan sejarah dunia pada era modern dan perubahan sosial yang terjadi.");

        // Genre: Fiksi
        library.addBook(3, 0, "Matahari", "Tere Liye", 320, "Republika", "tentang perjalanan seorang tokoh dalam menghadapi berbagai rintangan hidup.");
        library.addBook(3, 1, "Laskar Pelangi", "Andrea Hirata", 390, "Bentang Pustaka", "tentang perjuangan sekelompok anak di daerah terpencil untuk mendapatkan pendidikan yang layak.");
        library.addBook(3, 2, "Perahu Kertas", "Dee Lestari", 350, "Bentang Pustaka", "tentang kisah cinta dan petualangan dua tokoh utama yang tidak biasa.");
        library.addBook(3, 3, "Bumi Manusia", "Pramoedya Ananta Toer", 420, "Hasta Mitra", "tentang perjuangan seorang pribumi dalam menghadapi penjajahan Belanda di Indonesia.");
        library.addBook(3, 4, "Ayat-Ayat Cinta", "Habiburrahman El Shirazy", 360, "Republika", "tentang perjalanan seorang pria dalam mencari makna cinta sejati dalam agama Islam.");

        // Genre: Romance
        library.addBook(4, 0, "Me Before You", "Jojo Moyes", 320, "Penguin Books", "tentang kisah cinta yang penuh liku antara dua tokoh dengan latar belakang yang berbeda.");
        library.addBook(4, 1, "The Notebook", "Nicholas Sparks", 350, "Warner Books", "tentang kisah cinta abadi antara dua insan yang dipisahkan oleh waktu dan keadaan.");
        library.addBook(4, 2, "Pride and Prejudice", "Jane Austen", 400, "Penguin Classics", "tentang perjuangan tokoh utama mengatasi rasa bangga dan prasangka dalam mencari cinta sejati.");
        library.addBook(4, 3, "Romeo and Juliet", "William Shakespeare", 320, "Penguin Books", "tentang cinta tragis antara dua keluarga yang berseteru.");
        library.addBook(4, 4, "A Walk to Remember", "Nicholas Sparks", 280, "Warner Books", "tentang perjalanan cinta yang menginspirasi antara dua remaja dengan masa lalu yang penuh warna.");

        // Meminta pengunjung untuk memasukkan kode genre dan indeks buku yang ingin diakses
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter genre code (1-5):");
        int genreCode = scanner.nextInt();
        System.out.println("Enter book index (1-5):");
        int bookIndex = scanner.nextInt();

        // Menampilkan detail buku berdasarkan kode genre dan indeks buku
        library.getBookDetails(genreCode - 1, bookIndex - 1);

        // Menampilkan detail buku berdasarkan kode genre dan indeks buku
        library.getBookDetails(genreCode - 1, bookIndex - 1);

        // Membuat salinan buku yang dipilih
        Book selectedBook = library.getBook(genreCode - 1, bookIndex - 1).copy();
        System.out.println("\nCopied Book Details:");
        selectedBook.printDetails();

        // Menghitung jumlah kata pada sinopsis buku yang dipilih
        int wordCount = library.getSinopsisWordCount(genreCode - 1, bookIndex - 1);
        System.out.println("Number of words in sinopsis: " + wordCount);

        // Menampilkan detail buku kedua berdasarkan kode genre dan indeks buku
        library.getBookDetails(genreCode - 1, bookIndex - 1);

        // Membandingkan kesamaan antara dua buku
        Book firstBook = library.getBook(genreCode - 1, bookIndex - 1);
        Book secondBook = library.getBook(genreCode - 1, bookIndex - 1);

        if (firstBook != null && secondBook != null) {
            double similarity = firstBook.cekTingkatKesamaan(secondBook);
            System.out.println("Similarity between the two books: " + similarity + "%");
        }

        scanner.close();
    }
}
