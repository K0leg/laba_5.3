package com.company;

import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        System.out.print("Вкажіть число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ((number >= 50) && (number <= 100)){
            System.out.println("Число " + number + " міститься в проміжку (50; 100)");
        }else {
            System.out.println("Число " + number + " не міститься в проміжку (50; 100)");
        }


    }
}