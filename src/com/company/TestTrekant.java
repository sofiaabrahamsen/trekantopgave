package com.company;

import java.util.Scanner;

public class TestTrekant {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("venligst indtast siderne på trekanten i denne rækkefølge: a,b,c");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        int c = userInput.nextInt();
        if (a<=0 || b<=0 || c<=0) {
            System.out.println("Dette kan du ikke skrive. siderne skal være over 0");
        }

        Trekant trekant = new Trekant(a, b, c);
        System.out.println(trekant.getTrekantType());
    }
}
