package com.company;

import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        System.out.print("Вкажіть число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n1, n2, n3;

        n1 = n / 100;
        n2 = (n % 100) / 10;
        n3 = n % 10;

        if ((n1 > n2) && (n1 > n3)){
            System.out.println(n1);
        }
        else if ((n2 > n1) && (n2 > n3)){
            System.out.println(n2);
        }
        else{
            System.out.println(n3);
        }
    }
}