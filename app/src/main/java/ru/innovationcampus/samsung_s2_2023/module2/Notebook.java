package ru.innovationcampus.samsung_s2_2023.module2;

public class Notebook {
    int width;
    int height;
    String name;

    public Notebook(int width, int height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public String toString() {
        return name + "(" + width + "x" + height +")";
    }
}
