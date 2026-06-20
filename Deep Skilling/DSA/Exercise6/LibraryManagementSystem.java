package Exercise6;
class Book {

    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(
                "Book Id : " + bookId +
                ", Title : " + title +
                ", Author : " + author);
    }
}
class Library {

    Book[] books;

    Library(Book[] books) {
        this.books = books;
    }

    Book linearSearch(String target) {

        for (int i = 0; i < books.length; i++) {

            if (books[i].title.equals(target)) {

                return books[i];

            }
        }

        return null;
    }

    Book binarySearch(String target) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int result = books[mid].title.compareTo(target);

            if (result == 0) {

                return books[mid];

            }
            else if (result < 0) {

                low = mid + 1;

            }
            else {

                high = mid - 1;

            }
        }

        return null;
    }
}
public class LibraryManagementSystem {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "C", "Dennis"),
                new Book(102, "DBMS", "Korth"),
                new Book(103, "Java", "Herbert Schildt"),
                new Book(104, "Python", "Mark Lutz"),
                new Book(105, "OS", "Galvin")

        };

        Library library = new Library(books);

        Book b = library.linearSearch("Java");

        if (b != null) {

            System.out.println("Book Found");

            b.display();

        }
        else {

            System.out.println("Book not found");

        }
    }
}