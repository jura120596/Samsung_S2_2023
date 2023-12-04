package ru.innovationcampus.samsung_s2_2023.module2;

public class MyProgram {
    public static class A {
        public int a = 1;
        private int b = 2;
        protected int c = 3;
    }
    public static class B extends A {
        public B() {
            a = 11; // допустимо, так как a - public
//            b = 22; // недопустимо, так как b - private
            c = 33; // допустимо, так как c - protected
        }
    }
    public static void main(String args[]) {
        B bObj = new B();
        bObj.a = 111; // допустимо, так как a - public
//        bObj.b = 222; // недопустимо, так как b - private
        bObj.c = 333; // допустимо, так как c - protected и классы находятся в одном пакете
    }
}
