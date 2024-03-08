package MainsPackage2.BukuPerpus;
import java.util.Scanner;

// Kelas untuk merepresentasikan buku
class Book {
    private String title;
    private String author;
    private int pageCount;
    private String publisher;

    public Book(String title, String author, int pageCount, String publisher) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.publisher = publisher;
    }

    // Metode untuk mencetak detail buku
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Publisher: " + publisher);
    }
}

// Kelas untuk merepresentasikan perpustakaan
class Library {
    private Book[][] books; // Array 2D untuk menyimpan buku-buku

    // Konstruktor untuk membuat perpustakaan dengan jumlah genre dan buku yang ditentukan
    public Library(int numGenres, int booksPerGenre) {
        books = new Book[numGenres][booksPerGenre];
    }

    // Metode untuk menambahkan buku ke perpustakaan
    public void addBook(int genre, int index, String title, String author, int pageCount, String publisher) {
        if (genre >= 0 && genre < books.length && index >= 0 && index < books[genre].length) {
            books[genre][index] = new Book(title, author, pageCount, publisher);
        } else {
            System.out.println("Invalid genre or index");
        }
    }

    // Metode untuk mencetak detail buku berdasarkan kode genre dan indeks buku
    public void getBookDetails(int genre, int index) {
        if (genre >= 0 && genre < books.length && index >= 0 && index < books[genre].length && books[genre][index] != null) {
            System.out.println("Genre " + (genre + 1) + ", Book " + (index + 1) + " Details:");
            books[genre][index].printDetails();
        } else {
            System.out.println("Book not found");
        }
    }
}
