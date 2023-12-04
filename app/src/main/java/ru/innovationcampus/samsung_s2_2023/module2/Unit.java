package ru.innovationcampus.samsung_s2_2023.module2;

import ru.innovationcampus.samsung_s2_2023.Speakable;

public class Unit implements Speakable{
    protected int hp;
    protected String name;

    @Override
    public void speak() {
        System.out.println("I unit with name " + name);
    }


    public Unit(String name, int hp) {
        this.hp = hp;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
    }
}
