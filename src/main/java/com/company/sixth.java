package com.company;


import java.time.LocalDateTime;

public class sixth {

    public static void main(String[] args) {

        int hour = LocalDateTime.now().getHour();
        float minute = LocalDateTime.now().getMinute();

        float time = (minute / 60);
        float number;


        if ((hour >= 9) && (hour <= 17)) {
            switch (hour) {
                case 9:
                    number = (8 - time) * 3600;
                    System.out.println(number +" " + "секунд\n" + "До кінця робочого дня залишилось 8 годин");
                    break;
                case 10:
                    number = (7 - time) * 3600;
                    System.out.println(number +" " + "секунд\n" + "До кінця робочого дня залишилось 7 годин");
                    break;
                case 11:
                    number = (6 - time) * 3600;
                    System.out.println(number +" " + "секунд\n" + "До кінця робочого дня залишилось 6 годин");
                    break;
                case 12:
                    number = (5 - time) * 3600;
                    System.out.println(number +" " + "секунд\n" + "До кінця робочого дня залишилось 5 годин");
                    break;
                case 13:
                    number = (4 - time) * 3600;
                    System.out.println(number +" " + "секунд\n" + "До кінця робочого дня залишилось 4 годин");
                    break;
                case 14:
                    number = (3 - time) * 3600;
                    System.out.println(number +" " + "секунд\n" + "До кінця робочого дня залишилось 3 годин");
                    break;
                case 15:
                    number = (2 - time) * 3600;
                    System.out.println(number +" " + "секунд\n" + "До кінця робочого дня залишилось 2 годин");
                    break;
                case 16:
                    if (minute >= 30) {
                        number = (1 - time) * 3600;
                        System.out.println(number +" " + "секунд\n" + "До кінця робочого дня залишилось менше 1 годин");
                        break;
                    }
                    else {
                        number = (1 - time) * 3600;
                        System.out.println(number +" " + "секунд\n" + "До кінця робочого дня залишилось більше 1 годин");
                        break;
                    }
                case 17:
                    System.out.println("0 секунд\n" + "кінець робочого дня !");
                    break;
            }

        }
        else {
            System.out.println("Робочий день закінчився !");
        }

    }

}