import ClassGamePlay.ArcherGameplay;
import ClassGamePlay.KnightGameplay;
import ClassGamePlay.MageGameplay;

import java.util.Scanner;

public class Gameplay {
    private static String playerName;
    private static String playerClass;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcome();
        whatPlayerName();
        getPlayerName();
        whatPlayerClass();
        getPlayerClass();

        switch (playerClass) {
            case "mag":
                classSelectedMage();
                new MageGameplay(playerName);
                break;
            case "rycerz":
                classSelectedKnight();
                new KnightGameplay(playerName);
                break;
            case "łucznik":
                classSelectedArcher();
                new ArcherGameplay(playerName);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + playerClass);
        }
    }

    private static void welcome() {
        System.out.println("Witaj, wędrowcze, w tajemniczym świecie pełnym przygód!");
        System.out.println("Przed tobą rozciąga się nieznana kraina, w której twoje wybory będą pisać historię.");
        System.out.println("Otwórz drzwi do niezwykłych możliwości i stwórz swoją własną legendę.");

        waitForEnter();
    }
    private static void whatPlayerName() {
        System.out.println("Przed rozpoczęciem tej niezwykłej podróży, powiedz mi, jak masz na imię?");
        System.out.println("Twoje imię rozbrzmiewać będzie wśród gór, lasów i pól, budząc podziw i strach.");
    }
    private static void getPlayerName() {
        boolean validName = false;
        while (!validName) {
            System.out.println("Jakie jest twoje imię, wędrowcze? Wpisz je tu, abyśmy mogli Ciebie poznać.");

            try {
                playerName = scanner.nextLine().trim();

                if (playerName.isEmpty()) {
                    System.out.println("Musisz podać swoje imię!");
                } else {
                    validName = true;
                }
            } catch (Exception e) {
                System.out.println("Wystąpił błąd przy wprowadzaniu imienia. Spróbuj jeszcze raz.");
                scanner.nextLine(); // Odczytaj dodatkową linię, aby wyczyścić bufor wejścia
            }
        }
    }
    private static void whatPlayerClass() {
        System.out.println("\nTeraz, " + ", przyszedł czas, abyś wybrał swoją drogę.");
        System.out.println("Czy chcesz stać się Mistrzem Magii, czarującym żywiołami i kształtującym światy swoim wolą?");
        System.out.println("A może wolisz być Niezwyciężonym Rycerzem, który chroni słabszych i walczy z honorem?");
        System.out.println("A może twój cel to być Skrytym Łucznikiem, którego strzały są precyzyjne jak wiatr?");
        System.out.println("\nWybierz drogę: Mag, Rycerz, Łucznik");
    }
    private static void getPlayerClass() {
        boolean validClass = false;

        while (!validClass) {
            try {
                playerClass = scanner.nextLine().trim().toLowerCase();

                if (!playerClass.isEmpty()) {
                    if (playerClass.equals("mag") || playerClass.equals("rycerz") || playerClass.equals("łucznik")) {
                        validClass = true;
                    } else {
                        System.out.println("Nieprawidłowy wybór klasy. Spróbuj jeszcze raz.");
                    }
                } else {
                    System.out.println("Musisz wybrać klasę!");
                }
            } catch (Exception e) {
                System.out.println("Wystąpił błąd przy wyborze klasy. Spróbuj jeszcze raz.");
                scanner.nextLine(); // Odczytaj dodatkową linię, aby wyczyścić bufor wejścia
            }
        }
    }
    private static void classSelectedMage() {
        System.out.println("\nWspaniale! Wybrałeś drogę Mistrza Magii. Teraz, jako mag, otwierasz przed sobą bramy niezgłębionych tajemnic żywiołów.");
        System.out.println("Twoja wola połączona z potężnymi zaklęciami pozwoli Ci kształtować światy według własnych pragnień.");
        System.out.println("Czy będziesz bohaterem, który przynosi pokój i sprawiedliwość,");
        System.out.println("czy może ciemności zechcą cię zwabić na ścieżki wątpliwości?");
        System.out.println("Ostateczne losy tego świata leżą w twoich rękach.");
    }
    private static void classSelectedKnight() {
        System.out.println("\nWspaniale! Wybrałeś drogę Niezwyciężonego Rycerza. Jako rycerz, stajesz na straży słabszych i walczysz z honorem.");
        System.out.println("Twoja odwaga i sprawiedliwość będą twoimi największymi atutami w drodze do zwycięstwa.");
        System.out.println("Czy będziesz bronić tych, którzy potrzebują pomocy i walczyć ze złośliwością, czy może skusisz się na władzę i zapomnisz o swojej misji?");
        System.out.println("Ostateczne losy tego świata leżą w twoich rękach.");
    }
    private static void classSelectedArcher() {
        System.out.println("\nWspaniale! Wybrałeś drogę Skrytego Łucznika. Jako łucznik, twoje strzały są precyzyjne jak wiatr.");
        System.out.println("Twoja zręczność i umiejętność manewrowania w trudnych sytuacjach czynią cię niezrównanym strażnikiem tego świata.");
        System.out.println("Czy będziesz strzegł równowagi i używał swojego daru do celów sprawiedliwych,");
        System.out.println("czy może skłonisz się ku ciemności i użyjesz swojej umiejętności dla własnych korzyści?");
        System.out.println("Ostateczne losy tego świata leżą w twoich rękach.");
    }
    public static void waitForEnter() {
        System.out.println("\nAby kontynuować, wciśnij ENTER...");
        scanner.nextLine();
    }
}
