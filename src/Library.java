import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    protected String m_name;
    protected ArrayList<Book> m_listBooks= new ArrayList<Book>();
//

    private static Library instance;
    private Library(String name) {
        this.m_name = name;
    };

    public static Library getInstance() {
        if (instance == null) {
            instance = new Library("Theo Lib");
        }
        return instance;
    }

    public static Library getInstance(String name) {
        if (instance == null) {
            instance = new Library(name);
        }
        return instance;
    }


//    List<Integer> myArrayList = new ArrayList<>();

//    public Library(String name) {
//        this.m_name = name;
//    };

    public void add() {
        Scanner scanner = new Scanner(System.in);
        List<String> listErrors = new ArrayList<>();
        String title = "";
        String author = "";
        int pages = 0;
        int date = 0;

        System.out.println("Mettez le nom du livre : ");
        try {
            title = scanner.next();
        }catch (Exception err) {
            listErrors.add("Erreur avec le nom du livre : "+ err);
        }

        System.out.println("Mettez l'auteur du livre : ");
        try {
            author = scanner.next();
        }catch (Exception err) {
            listErrors.add("Erreur avec l'auteur nom du livre : "+ err);
        }

        System.out.println("Mettez le nombre de page du livre : ");
        try {
            pages = scanner.nextInt();
        }catch (Exception err) {
            scanner.nextLine();
            listErrors.add("Erreur avec le nombre de page du livre (que des nombre): "+ err);
        }

        System.out.println("Mettez la date de parution du livre : ");
        try {
            date = scanner.nextInt();
        }catch (Exception err) {
            scanner.nextLine();
            listErrors.add("Erreur avec la date de parution du livre (que des nombre): "+ err);
        }

        if (listErrors.size() >= 1) {
            System.out.println(listErrors);
            return;
        }

        add(new Book(title,author,pages,date));
    }

    public void add(Book book) {

        m_listBooks.add(book);
    }

    public void remove(String name) {
        for (Book book: m_listBooks) {
            if (book.m_title == name) {
                m_listBooks.remove(book);
                return;
            }
        }
        System.out.println("Votre livre n'existe pas dans la librairie");
    }

    public void research(String input) {
        for (Book book: m_listBooks) {
            if (book.m_title == input || book.m_author == input ) {
                book.show();
            }
        }
        System.out.println("Votre livre n'existe pas dans la librairie");
    }

    public void showBooks() {
        for (Book book: m_listBooks) {
            book.show();
        }
    }
}
