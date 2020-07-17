public class Book {
    private String author;
    private String title;

    public static void main (String[] args) {
        Book book = Book.of("Dan Brown", "Inferno");
        System.out.println(book.getAuthor());
        System.out.println(book.toString());

    }
    public Book (String author, String title) {
        this.author = author;
        this.title = title;
    }
    public static Book of(String author, String title) {
        Book book = new Book(author, title);
        return book;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return this.author + " wrote a book \"" + this.title + "\"";
    }
}