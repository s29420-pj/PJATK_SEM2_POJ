package ClassGamePlay;

import Character.*;

import java.util.Scanner;

public class ArcherGameplay implements ClassGameplay {
    private Scanner scanner = new Scanner(System.in);
    private String input;
    private Archer archer;

    public ArcherGameplay(String playerName) {
        archer = new Archer(playerName);
        archer.levelUP();
        intro();
    }

    @Override
    public void intro() {
        System.out.println("Znajdujesz się w takiej sytacji, co wybierasz A czy B?");

        do {
            input = scanner.next();
            if (!input.equals("A") && !input.equals("B")) {
                System.out.println("Nieprawidłowy wybór: " + input);
            }
        } while (!input.equals("A") && !input.equals("b"));

        if (input.equals("A")) {
            System.out.println("Przechodzimy do sytuacji A.");
            archer.levelUP();
        } else if (input.equals("B")) {
            System.out.println("Przechodzimy do sytuacji B");
            archer.levelUP();
        }
    }

    // Poniżej można dodawać kolejne etapy, dylematy
}