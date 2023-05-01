import java.util.Scanner;

public class Menu {
    private static Menu instance;
    private Menu() {};

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }

//    public void ChooseMenu() {
//
//        Scanner scanner = new Scanner(System.in);
//        int InputUser;
//        String test = "test";
//        while (true) {
//            System.out.println("--- Choix " + test + "---");
//            System.out.println("Votre choix : ");
//            InputUser = scanner.nextInt();
//
//            switch (InputUser) {
//                case 0 -> System.out.println("Yes");
//                case 1 -> System.out.println("NO");
//                case 2 -> {
//                    scanner.close();
//                    System.exit(0);
//                }
//                default -> {
//                    System.out.println("Votre nombre n'est pas entre 0 et 2");
//                }
//            }
//        }
//    };

    public int ChooseMenuLibrary() {

        Library library = Library.getInstance();
        Scanner scanner = new Scanner(System.in);
        int InputUser;
        String test = "test";
        while (true) {
            System.out.println("--- Choix " + test + "---");
            System.out.println("0 : Sortir du système");
            System.out.println("1 : Afficher les livres");
            System.out.println("2 : Ajouter un livre");
            System.out.println("3 : Enlever un livre");
            System.out.println("Votre choix : ");
            InputUser = scanner.nextInt();

            switch (InputUser) {
                case 0 -> {
                    System.exit(0);
                }
                case 1 -> {
                    library.showBooks();
                }
                case 2 -> {
                    library.add();
                }
                case 3 -> {
                    library.remove("");
                }
                default -> {
                    System.out.println("Votre nombre n'est pas entre 0 et 3");
                }
            }
            System.out.println("Boucle");
        }
    };


}
