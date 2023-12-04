package ru.innovationcampus.samsung_s2_2023.module2;

public class Terminator extends Robot{
    protected String gun;

    public Terminator(String name, int hp, int armor, String gun) {
        super(name, hp, armor);
        this.gun = gun;
    }

    public Terminator(String name, int hp, int armor) {
        super(name, hp, armor);
        this.gun = "Rogatka";
    }


    @Override
    public void printInfo() {
        super.printInfo();//делаю то же самое что в Unit
        System.out.println("Gun: " + gun);
    }
}
