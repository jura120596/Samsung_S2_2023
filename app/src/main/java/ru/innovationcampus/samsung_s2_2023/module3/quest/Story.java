package ru.innovationcampus.samsung_s2_2023.module3.quest;

public class Story {
    private Situation start;
    private Situation current ;
    private Character character;
    public Story(Character character) {
        this.character = character;
        this.current = this.start = new Situation(
                "Первая сделка",
                "полный текст ситуации:\n" +
                        "1 - продаю за 120, у киента много денег\n" +
                        "2 - продаю за 100, клиент так хочет\n" +
                        "3 - продаю за 50, пусть клиент останется довольным",
                0,0,0,3
        );
        this.start.getDirections()[0] = new Situation("я продал все за 120", "клиент очень зол, меня уволили", -1, -50, 120000,2);

        this.start.getDirections()[1] = new Situation("я продал все за 100", "сделка прошла успешно", 1, 0, 100000,0);

    }
    public void go(int answer)
    {
        if (answer <= current.getDirections().length && answer > 0) {
            current = current.getDirections()[answer - 1];
            this.character.setA( this.character.getA() + current.getdA() );
            this.character.setR( this.character.getR() + current.getdR() );
            this.character.setK( this.character.getK() + current.getdK() );
        } else {
            System.out.println("Введи правильный ответ");
        }
    }

    public boolean isEnd() {
        return current.getDirections().length == 0; //return true; || return false;
    }

    public Situation getStart() {
        return start;
    }

    public void setStart(Situation start) {
        this.start = start;
    }

    public Situation getCurrent() {
        return current;
    }

    public void setCurrent(Situation current) {
        this.current = current;
    }
}
