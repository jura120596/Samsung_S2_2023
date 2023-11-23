package ru.innovationcampus.samsung_s2_2023.module2;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction(int numerator, int denominator) {
        if (numerator < 0 && denominator < 0
                || numerator > 0 && denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Знаменатель неправильный");
        }
        this.normal();
    }

    public static int gcd(int a, int b) {
        int x = 1;
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        x = a + b;
        return x;
    }

    public void normal() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public Fraction add(Fraction f) {
        int n = this.numerator * f.denominator
                + f.numerator * this.denominator;
        int d = this.denominator * f.denominator;
        return new Fraction(n, d);
    }

    public Fraction sub(Fraction f) {
        f = new Fraction(-1 * f.numerator, f.denominator);
        return this.add(f);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public String toString() {
        return this.numerator + " / " + this.denominator;
    }
}
