package com.company;

import java.util.Scanner;

public class fifth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вкажіть число: ");
        int num1 = scanner.nextInt();
        System.out.print("Вкажіть число: ");
        int num2 = scanner.nextInt();
        System.out.print("Вкажіть число: ");
        int num3 = scanner.nextInt();

        int first = 0, second = 0, third = 0;

        //num1
        if ((num1 > num2) && (num1 > num3)){
            first = num1;
        }
        else if (((num1 < num2) && (num1 > num3)) || ((num1 > num2) && (num1 < num3))){
            second = num1;
        }
        else{
            third = num1;
        }

        //num2
        if ((num2 > num1) && (num2 > num3)){
            first = num2;
        }
        else if (((num2 < num1) && (num2 > num3)) || ((num2 > num1) && (num2 < num3))){
            second = num2;
        }
        else {
            third = num2;
        }

        //num3
        if ((num3 > num1) && (num3 > num2)){
            first = num3;
        }
        else if (((num3 < num1) && (num3 > num2)) || ((num3 > num1) && (num3 < num2))){
            second = num3;
        }
        else {
            third = num3;
        }

        System.out.println(first + " " + second + " " + third);
    }

}