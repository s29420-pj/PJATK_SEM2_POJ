package ClassGamePlay;

import Character.*;

import java.util.Scanner;

public class KnightGameplay implements ClassGameplay {
    private Scanner scanner = new Scanner(System.in);
    private String input;
    private Knight knight;

    public KnightGameplay(String playerName) {
        knight = new Knight(playerName);
        knight.levelUP();
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
            knight.levelUP();
        } else if (input.equals("B")) {
            System.out.println("Przechodzimy do sytuacji B");
            knight.levelUP();
        }
    }

    // Poniżej można dodawać kolejne etapy, dylematy
}