package Character;

import java.util.Scanner;

public class Mage extends Hero implements CharacterClass {
    public Mage(String playerName) {
        super();
        this.playerName = playerName;
        this.playerClass = "Mage";
    }
    @Override
    public void levelUP() {
        super.levelUP();
        String statistic = null;
        System.out.println("\nAwansowałeś!");
        while (experience > 0) {
            System.out.println("Doświadczenie: " + experience);
            System.out.println("\nWybierz statystykę do ulepszenia:");
            printStats();
            System.out.println("\nAby ulepszyć statystykę, wpisz jej nazwę. Aby zakończyć wpisz 'Koniec'.\n" +
                    "Pamiętaj, że jak nie wykorzystasz teraz wszystkich pkt Doświadczenia, będziesz mógł to zrobić\n" +
                    "dopiero po zdobyciu poziomu!");
            statistic = scanner.next();
            if (statistic.equals("Koniec")) {
                break;
            }
            statModify(statistic);
        }
    }
    @Override
    public void statModify(String statistic) {
        switch (statistic) {
            case "Siła":
                strength += strength;
                experience--;
                break;
            case "Obrona":
                defence += defence;
                experience--;
                break;
            case "Inteligencja":
                intelligence += 1.2 * intelligence;
                experience--;
                break;
            case "Celność":
                accuracy += 1.05 * accuracy;
                experience--;
                break;
            case "Zręczność":
                agility += 1.02 * agility;
                experience--;
                break;
            case "Prędkość":
                speed += speed;
                experience--;
                break;
            default:
                System.out.println("\nNieprawidłowa wartość: " + statistic);
                break;
        }
    }
}
