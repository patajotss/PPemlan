package MainsPackage2.BukuPerpus;
import java.util.Scanner;

// Class untuk merepresentasikan buku
class Book {
    private String title;
    private String author;
    private int pageCount;
    private String publisher;
    private String sinopsis; // Penambahan atribut sinopsis

    // Constructor untuk membuat objek Book dengan judul, penulis, jumlah halaman, penerbit, dan sinopsis tertentu
    public Book(String title, String author, int pageCount, String publisher, String sinopsis) {
        this.title = title;                 // Inisialisasi atribut judul
        this.author = author;               // Inisialisasi atribut penulis
        this.pageCount = pageCount;         // Inisialisasi atribut jumlah halaman
        this.publisher = publisher;         // Inisialisasi atribut penerbit
        this.sinopsis = sinopsis;           // Inisialisasi atribut sinopsis
    }
    // Constructor untuk membuat objek Book dengan nilai atribut yang sama dari objek lain
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.pageCount = other.pageCount;
        this.publisher = other.publisher;
        this.sinopsis = other.sinopsis;
    }

    // Method untuk membuat salinan objek Book
    public Book copy() {
        return new Book(this);
    }

    // Method untuk menghitung persentase kesamaan antara dua buku
    public double cekTingkatKesamaan(Book otherBook) {
        // Hitung persentase kesamaan untuk setiap atribut
        double titleSimilarity = calculateSimilarity(this.title, otherBook.title);
        double authorSimilarity = calculateSimilarity(this.author, otherBook.author);
        double pageCountSimilarity = calculateSimilarity(this.pageCount, otherBook.pageCount);
        double publisherSimilarity = calculateSimilarity(this.publisher, otherBook.publisher);
        double sinopsisSimilarity = calculateSimilarity(this.sinopsis, otherBook.sinopsis);

        // Hitung rata-rata persentase kesamaan
        double averageSimilarity = (titleSimilarity + authorSimilarity + pageCountSimilarity + publisherSimilarity + sinopsisSimilarity) / 5.0;

        return averageSimilarity * 100; // Konversi ke persentase
    }

    // Metode untuk menghitung persentase kesamaan antara dua nilai
    private double calculateSimilarity(String value1, String value2) {
        // Gunakan metode pembanding yang sesuai di sini.
        // Misalnya, Anda dapat menggunakan algoritma Levenshtein distance atau Jaccard similarity.
        // Di sini, untuk kesederhanaan, kita akan menggunakan equalsIgnoreCase.
        return value1.equalsIgnoreCase(value2) ? 1.0 : 0.0;
    }

    // Metode untuk menghitung persentase kesamaan antara dua nilai numerik
    private double calculateSimilarity(int value1, int value2) {
        // Misalnya, Anda dapat menghitung persentase perbedaan antara dua nilai numerik.
        // Di sini, untuk kesederhanaan, kita akan menggunakan perbandingan langsung.
        return value1 == value2 ? 1.0 : 0.0;
    }

    // Method untuk mencetak detail buku
    public void printDetails() {
        System.out.println("Title: " + title);             // Menampilkan judul
        System.out.println("Author: " + author);           // Menampilkan penulis
        System.out.println("Page Count: " + pageCount);    // Menampilkan jumlah halaman
        System.out.println("Publisher: " + publisher);     // Menampilkan penerbit
        System.out.println("Sinopsis: " + sinopsis);       // Menampilkan sinopsis
    }
    // Getter method untuk mendapatkan sinopsis buku
    public String getSinopsis() {
        return sinopsis;
    }
    // Method untuk menghitung jumlah kata pada sinopsis
    public int countWordsInSinopsis() {
        String[] words = sinopsis.split("\\s+");
        return words.length;
    }
}

// Class untuk merepresentasikan perpustakaan
class Library {
    private Book[][] books; // Array 2D untuk menyimpan buku-buku

    // Constructor untuk membuat perpustakaan dengan jumlah genre dan buku yang ditentukan
    public Library(int numGenres, int booksPerGenre) {
        books = new Book[numGenres][booksPerGenre];
    }

    // Method untuk menambahkan buku ke perpustakaan
    public void addBook(int genre, int index, String title, String author, int pageCount, String publisher, String sinopsis) {
        if (genre >= 0 && genre < books.length && index >= 0 && index < books[genre].length) {
            books[genre][index] = new Book(title, author, pageCount, publisher, sinopsis);
        } else {
            System.out.println("Invalid genre or index");
        }
    }
    // Method untuk mendapatkan buku berdasarkan kode genre dan indeks buku
    public Book getBook(int genre, int index) {
        if (genre >= 0 && genre < books.length && index >= 0 && index < books[genre].length) {
            return books[genre][index];
        } else {
            System.out.println("Book not found");
            return null; // Return null if book not found
        }
    }

    // Method untuk mencetak detail buku berdasarkan kode genre dan indeks buku
    public void getBookDetails(int genre, int index) {
        if (genre >= 0 && genre < books.length && index >= 0 && index < books[genre].length && books[genre][index] != null) {
            System.out.println("Genre " + (genre + 1) + ", Book " + (index + 1) + " Details:");
            books[genre][index].printDetails();
        } else {
            System.out.println("Book not found");
        }
    }
    // Metode untuk menghitung jumlah kata pada sinopsis buku berdasarkan kode genre dan indeks buku
    public int getSinopsisWordCount(int genre, int index) {
        if (genre >= 0 && genre < books.length && index >= 0 && index < books[genre].length && books[genre][index] != null) {
            String sinopsis = books[genre][index].getSinopsis();
            String[] words = sinopsis.split("\\s+");
            return words.length;
        } else {
            System.out.println("Book not found");
            return -1; // Return -1 if book not found
        }
    }
}


