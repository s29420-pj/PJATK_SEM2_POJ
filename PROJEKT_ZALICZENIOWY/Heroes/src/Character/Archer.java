package Character;

public class Archer extends Hero implements CharacterClass {
    public Archer(String playerName) {
        super();
        this.playerName = playerName;
        this.playerClass = "Archer";
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
                strength += 1.05 * strength;
                experience--;
                break;
            case "Obrona":
                defence += 1.05 * defence;
                experience--;
                break;
            case "Inteligencja":
                intelligence += intelligence;
                experience--;
                break;
            case "Celność":
                accuracy += 1.2 * accuracy;
                experience--;
                break;
            case "Zręczność":
                agility += 1.1 * agility;
                experience--;
                break;
            case "Prędkość":
                speed += 1.05 * speed;
                experience--;
                break;
            default:
                System.out.println("\nNieprawidłowa wartość: " + statistic);
                break;
        }
    }
}
