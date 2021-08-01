class Book {

    Book(int noOfPages, String author) {
        System.out.println("With pages:" + noOfPages);
        System.out.println("With author:" + author);
    }

    Book(int noOfPages, String author, String price) {
        this(noOfPages, author);
        System.out.println("With price:" + price);
    }

}
class ThisCurrentClassConstructor{
    public static void main(String[] args) {
        Book book = new Book(10, "Brroklyn");
        Book book1 = new Book(100, "Steve", "25.3");
    }
}