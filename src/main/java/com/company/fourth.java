package com.company;

import java.util.Scanner;

public class fourth {

    public static void main(String[] args) {
        System.out.print("Погодитись/Відмовитися: ");
        Scanner scanner = new Scanner(System.in);
        String bool = scanner.nextLine();

        switch (bool){
            // Yes
            case "Так":
                System.out.println("Я погоджуюсь!");
                break;
            case "ОК":
                System.out.println("Я погоджуюсь!");
                break;
            case "Y":
                System.out.println("Я погоджуюсь!");
                break;
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "Yes":
                System.out.println("Я погоджуюсь!");
                break;
            // No
            case "Ні":
                System.out.println("Я відмовляюся!");
                break;
            case "NO":
                System.out.println("Я відмовляюся!");
                break;
            case "N":
                System.out.println("Я відмовляюся!");
                break;
            case "-":
                System.out.println("Я відмовляюся!");
                break;
            case "No":
                System.out.println("Я відмовляюся!");
                break;
        }
    }

}