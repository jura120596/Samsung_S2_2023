package ru.innovationcampus.samsung_s2_2023.module2;

public class Robot extends Unit implements Printable{
    protected int armor;


    public Robot(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }


    @Override
    public void printInfo() {
        super.printInfo();//делаю то же самое что в Unit
        System.out.println("Armor: " + armor);
    }
}
