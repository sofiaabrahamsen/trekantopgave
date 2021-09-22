package com.company;

public class Trekant {
    private int a;
    private int b;
    private int c;

    public Trekant(int a, int b, int c) {
        this.a= a;
        this.b= b;
        this.c= c;
        }

    public int trekantType() {
        if (a >= (b+c) || c >= (b+a) || b >= (a+c)) {
            System.out.println("Dette er ikke en trekant");
        } else if (a==b && b==c) {
            System.out.println("Dette er en ligesidet trekant");
        } else if (a!=b && b!=c && c!=a) {
            System.out.println("Dette er en scalene trekant, hvor ingen af siderne har samme størrelse");
        } else if((a==b && b!=c) || (c==a) && a!=b  || c==b && c!=a) {
            System.out.println("Dette er en ligebenet trekant ");
        }
        return 0;
    }
    public int getTrekantType() {
        return trekantType();
    }
}
