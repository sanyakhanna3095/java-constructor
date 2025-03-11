import java.util.Scanner;
class Book{
    public String isbn;
    protected String title;
    private String author;

    Book(String isbn, String title, String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
}
class EBook extends Book{

    EBook(String isbn, String title, String author){
        super(isbn,title,author);
    }
    public void display(){
        System.out.println("ISBN: "+isbn);
        System.out.println("Title: "+title);
        System.out.println("Author: "+super.getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take user input
        System.out.print("Enter ISBN: ");
        String ISBN = sc.nextLine();

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        EBook e1 = new EBook(ISBN, title, author);

        e1.setAuthor(author);
        e1.display();
    }
}


/*
I/P ->
Enter ISBN: 345g
Enter title: Ring of fire
Enter author: Eric Flint

O/P ->
ISBN: 345g
Title: Ring of fire
Author: Eric Flint
 */