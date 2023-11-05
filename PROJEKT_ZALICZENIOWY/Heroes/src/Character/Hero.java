package Character;

import java.util.Scanner;

public class Hero implements Character {
    protected String playerName;
    protected String playerClass;
    protected int playerLevel, experience;
    protected double strength, defence, intelligence, accuracy, agility, speed;
    Scanner scanner = new Scanner(System.in);

    public Hero() {
        this.playerLevel = 0;
        this.strength = 50;
        this.defence = 50;
        this.intelligence = 50;
        this.accuracy = 50;
        this.agility = 50;
        this.speed = 1.0;
    }
    @Override
    public void printStats() {
        System.out.println("Gracz: " + playerName);
        System.out.println("Klasa: " + playerClass);
        System.out.println("Poziom: " + playerLevel);
        System.out.println("Doświadczenie:" + experience);
        System.out.println("\nSiła: " + strength);
        System.out.println("Obrona: " + defence);
        System.out.println("Inteligencja: " + intelligence);
        System.out.println("Celność: " + accuracy);
        System.out.println("Zręczność: " + agility);
        System.out.println("Prędkość: " + speed);
    }
    @Override
    public void levelUP() {
        playerLevel++;
        experience += 10;
    }
    @Override
    public String getPlayerName() {
        return playerName;
    }
    @Override
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    @Override
    public String getPlayerClass() {
        return playerClass;
    }
    @Override
    public double getStrength() {
        return strength;
    }

    @Override
    public void setStrength(double strength) {
        this.strength = strength;
    }

    @Override
    public double getDefence() {
        return defence;
    }

    @Override
    public void setDefence(double defence) {
        this.defence = defence;
    }

    @Override
    public double getIntelligence() {
        return intelligence;
    }

    @Override
    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public double getAccuracy() {
        return accuracy;
    }

    @Override
    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public double getAgility() {
        return agility;
    }

    @Override
    public void setAgility(double agility) {
        this.agility = agility;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
