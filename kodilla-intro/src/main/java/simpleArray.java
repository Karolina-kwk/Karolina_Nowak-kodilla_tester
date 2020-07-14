public class simpleArray {
    public static void main(String[] args) {
        String[] books = new String[5];
        books[0] = "Inferno";
        books[1] = "Sekret Wesaliusza";
        books[2] = "Spowiedz kata";
        books[3] = "Nowicjusz";
        books[4] = "Religa";
        String book = books[3];
        System.out.println(book);
        int numberOfElements = books.length;
        if (numberOfElements==5) {
        System.out.println("Moja tablica zawiera 5 elementów");
        }
    }
}
