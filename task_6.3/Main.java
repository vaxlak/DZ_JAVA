/*1. Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].
Параметр конструктора - название книги (title).
2. В классе MarkTwainBook реализуйте все абстрактные методы.
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.*/
import java.util.List;
import java.util.LinkedList;


public class Main {
    private List<Book> books;

    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        MarkTwainBook b1 = new MarkTwainBook("марк твен", "том соер");
        System.out.println(b1.getTitle() + " " + b1.getBook());


        books.add(new MarkTwainBook("mark","Tom Sawyer"));
        books.add(new AgathaChristieBook("Агата","Hercule Poirot"));
        System.out.println(books);
    }
}

     class MarkTwainBook extends Book {
        String MarkTwainBookTitle;

        public MarkTwainBook(String author, String MarkTwainBookTitle) {
            super(author);
            this.MarkTwainBookTitle = MarkTwainBookTitle;
        }

        @Override
        public String getBook() {
            return author;

        }

        @Override
        public String getTitle() {
            return MarkTwainBookTitle;
        }

    }

    class AgathaChristieBook extends Book{
    String AgathaChristieBookTitle;

        public AgathaChristieBook(String author, String agathaChristieBookTitle) {
            super(author);
            AgathaChristieBookTitle = agathaChristieBookTitle;
        }
        @Override
        public String getBook() {
            return author;

        }

        @Override
        public String getTitle() {
            return AgathaChristieBookTitle;
        }
    }

    abstract class Book {
        String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract String getBook();

        public abstract String getTitle();


        // Не видит getTitle. Не понимаю почему...
        // А если играться с пабликами и статиками для классов - тогда вообще ничего не работает...
        
        private String getOutputByBookType() {
        String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
        String markTwainOutput = getBook().getTitle() + " was written by " + author;

        String output = "output";
        //Add your code here

        return output;
    }

    public String toString() {
        return getOutputByBookType();
    }
    }

