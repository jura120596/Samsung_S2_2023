package ru.innovationcampus.samsung_s2_2023.module3;

import java.util.Scanner;

public class GameQuestMain {
    public static void main(String[] args) {
        int k = 1;
        int a = 100;
        int r = 50;
        System.out.println("Вы прошли собеседование и вот-вот станете сотрудниуом Корпорации. \\n Осталось уладить формальности - подпись под договором (Введите ваше имя):");
        Scanner  scanner  = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Карьера=%d,  Репутация=%d, Активы=%d", k, r, a);
        System.out.println("Только вы начали работать и тут же удача! " +
                "Вы нашли клиента и продаете ему партию \n ПО МС Виндовс. " +
                "Ему в принципе достаточно взять 100 коробок версии HOME.");
        System.out.println("- (1)у клиента денег много, а у меня нет - " +
                "вы выпишете ему счет на 120 коробок \n ULTIMATE по 50тр");
        System.out.println("- (2)чуть дороже сделаем, кто там заметит - вы выпишете ему счет на 100 коробок \n PRO по 10тр");
        System.out.println("- (3)как надо так и сделаем - вы выпишете ему счет на 100 " +
                "коробок HOME по 5тр");
        int answer =  scanner.nextInt();
        if (answer == 1)  {
            a -= 10;
            r -= 10;
            System.out.printf("Карьера=%d,  Репутация=%d, Активы=%d", k, r, a);
            ///другие ситуации 1
        } else if (answer == 2) {
            k += 1;
            a += 100 * 10;
            r += 0;
            System.out.printf("Карьера=%d,  Репутация=%d, Активы=%d", k, r, a);
            ///другие ситуации 2
        } else if (answer == 3) {
            r += 1;
            a += 100 * 5;
            System.out.printf("Карьера=%d,  Репутация=%d, Активы=%d", k, r, a);
            ///другие ситуации 3
        }

    }
}
