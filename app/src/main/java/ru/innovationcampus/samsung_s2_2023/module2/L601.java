package ru.innovationcampus.samsung_s2_2023.module2;

import ru.innovationcampus.samsung_s2_2023.Radio;
import ru.innovationcampus.samsung_s2_2023.Speakable;

public class L601 {

    public static void main(String[] args) {
        Unit[] units = new Unit[5];
        for (int i = 0; i < 5; i++) {
            int type = (int) Math.round(Math.random() * 2);
            switch (type) {
                case 0:
                    units[i] = new Robot("R2D2", 100, 123);
                    break;
                case 2:
                    units[i] = new Terminator("Arnold", 100, 123);
                    break;
                case 1:
                    units[i] = new Unit("Vedmak", 100){
                        @Override
                        public void speak() {
                            System.out.println("i can speak" +Math.random() );
                        }
                    };
                    break;
            }
            Unit u = units[i];
            u.printInfo();
            u.speak();
        }

        Radio radio = new Radio();
        onSpeakable(radio);
        onSpeakable(units[1]);

    }
    public static void onSpeakable(Speakable o){
        o.speak();
        if (o instanceof Radio) { //radio ли в переменной o
            System.out.println("on radio");
        } else if (o instanceof Terminator) {
            Terminator t = (Terminator) o;
            System.out.println("on " + t.gun);
            System.out.println("on " + t.armor);
        } else if (o instanceof Unit){ //и для робота и для юнита
            Unit u = (Unit) o;
            System.out.println("on " + u.name);
        }
    }
}
