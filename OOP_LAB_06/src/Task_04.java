/*

QUESTION#4
 A library wants to organize its system by categorizing books such as Java, C, C++,
etc. Implement a program that contains a base class called Books that will
contain members such as book ID, book name, book author, ISBN and price. All
are protected members.
 Derive one class from the base class and name it as “Category1”.
 The class has one data member that is the category.
 Make a parameterized constructor and invoke the base class’s constructor.
 Create a display function and display all the details of the books in Category1 (3
books).
 In the main program, perform object up casting and cast child object to a parent
class object (Book).

 */


public class Task_04 {
    public static void main(String[] args) {
        Books b1 = (Books) new Category1("123", "C++", "John", 123456, 344, "Programming");
        b1.Display();

        Books b2 = (Books) new Category1("456", "On the Egde", "Mike", 46612, 123, "Novel");
        b2.Display();

        Books b3 = (Books) new Category1("789", "Java", "Daniel", 99023, 400, "Programming");
        b3.Display();
    }
}

class Books {
    protected String bookID;
    protected String bookName;
    protected String bookAuthor;
    protected long ISBN;
    protected double price;

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Books(String bookID, String bookName, String bookAuthor, long ISBN, double price) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.ISBN = ISBN;
        this.price = price;
    }

    void Display() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Author: " + bookAuthor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: " + price);
    }


}

class Category1 extends Books {
    protected String category;
    Category1(String bookID, String bookName, String bookAuthor, long ISBN, double price, String category) {
        super(bookID,bookName, bookAuthor, ISBN, price);
        this.category = category;
    }

    @Override
    void Display() {
        super.Display();
        System.out.println("Category: " + category);
    }
}
