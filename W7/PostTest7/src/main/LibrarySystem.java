package main;
import model.Book;
import model.Member;
import java.util.ArrayList;

public class LibrarySystem {
    ArrayList<Book> books;
    ArrayList<Member> members;

    public LibrarySystem() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void tambahBuku(Book book) {
        books.add(book);
    }

    public void tambahAnggota(Member member) {
        members.add(member);
    }

    public void tampilkanBuku() {
        System.out.println("\nDaftar Buku:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " oleh " + book.getAuthor() + " (" + book.getYearPublished() + ")");
        }
    }

    public void tampilkanAnggota() {
        System.out.println("\nDaftar Anggota:");
        for (Member member : members) {
            System.out.println("- " + member.getName() + " (ID: " + member.getMemberId() + ")");
        }
    }

    public static void main(String[] args) {
        LibrarySystem system = new LibrarySystem();

        Book buku1=new Book("Laskar Pelangi", "Andrea Hirata", 2005);
        Book buku2=new Book("Menggelinding", "Pramoedya Anata Toer", 2005);
        Member anggota1=new Member("miwk", "P1");
        Member anggota2=new Member("Rakan", "P2");

        system.tambahBuku(buku1);
        system.tambahBuku(buku2);
        system.tambahAnggota(anggota1);
        system.tambahAnggota(anggota2);

        system.tampilkanBuku();
        system.tampilkanAnggota();
    }
}