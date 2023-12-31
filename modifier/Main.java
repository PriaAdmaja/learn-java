package modifier;

import model.User;

public class Main {
  public static void main(String[] args) {
    // instance obj
    User user = new User();
    // assign value
    user.namaDepan = "femilia";
    // get value
    System.out.println(user.namaDepan);
    user.setUsia(-1);
    System.out.println(user.getUsia());

    // instance obj book
    Book book = new Book();
    // Book book;
    book.setAuthor("febriawan");
    System.out.println(book.getAuthor());

    Book book2 = new Book("laskar pelangi");
    System.out.println(book2.getTitle());

    String menu = "3";

    switch (menu) {
      case "1":
        System.out.println("menu pertama");
        break;

      case "2":
        System.out.println("menu kedua");
        break;

      default:
        System.out.println("menu tidak tersedia");
        break;
    }
  }
}

class Book {
  private String title;
  private String author;

  public Book(String judul) {
    title = judul;
  }

  public Book() {
  }

  public void setTitle(String judul) {
    title = judul;
  }

  public void setAuthor(String pengarang) {
    author = pengarang;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
}
