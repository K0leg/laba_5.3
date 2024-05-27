package com.company;

import java.util.Scanner;

public class third {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("До гори/До низу: ");
        String direction = scanner.nextLine();
        System.out.print("Поверх: ");
        int floor = scanner.nextInt();

        if (direction.equals("До гори")){
            if (floor == 1) {
                System.out.println("Ви піднялись на " + floor + " поверх");
            }
            else if (floor == 2) {
                System.out.println("Ви піднялись на 3 поверх");
            }
            else if (floor == 3) {
                System.out.println("Ви піднялись на " + floor + " поверх");
            }
            else if (floor == 4) {
                System.out.println("Ви піднялись на " + floor + " поверх");
            }
            else if (floor == 5) {
                System.out.println("Ви піднялись на " + floor + " поверх");
            }
            else if (floor == 6) {
                System.out.println("Ви піднялись на " + floor + " поверх");
            }
            else if (floor == 7) {
                System.out.println("Ви піднялись на " + floor + " поверх");
            }
            else if (floor == 8) {
                System.out.println("Ви піднялись на " + floor + " поверх");
            }
            else if (floor == 9) {
                System.out.println("Ви піднялись на " + floor +" поверх");
            }
            else {
                System.out.println("Ви вказали неіснуючий поверх!");
            }
        }

        else if (direction.equals("До низу")){
            if (floor == 1) {
                System.out.println("Ви спустились на " + floor + " поверх");
            }
            else if (floor == (2)) {
                System.out.println("Ви спустились на 1 поверх");
            }
            else if (floor == (3)) {
                System.out.println("Ви спустились на " + floor + " поверх");
            }
            else if (floor == 4) {
                System.out.println("Ви спустились на " + floor + " поверх");
            }
            else if (floor == 5) {
                System.out.println("Ви спустились на " + floor + " поверх");
            }
            else if (floor == 6) {
                System.out.println("Ви спустились на " + floor + " поверх");
            }
            else if (floor == 7) {
                System.out.println("Ви спустились на " + floor + " поверх");
            }
            else if (floor == 8) {
                System.out.println("Ви спустились на " + floor + " поверх");
            }
            else if (floor == 9) {
                System.out.println("Ви спустились на " + floor +" поверх");
            }
            else {
                System.out.println("Ви вказали неіснуючий поверх!");
            }
        }







    }

}