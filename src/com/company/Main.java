package com.company;

import java.util.Scanner;

class Task1 {
    static int number;
    static char symbol;
}

class Dog {
    static String name;
    static String says;
}

class Task3 {
    public static void printTask3() {
        int numberN;
        System.out.println("****************** Task3: Even or Odd number ******************");
        System.out.print("Enter n:  ");
        Scanner scan = new Scanner(System.in);
        numberN = scan.nextInt();
        if (numberN % 2 == 0) System.out.println("Even number");
        else System.out.println("Odd number");
        System.out.println("***************************************************************");
        System.out.println();
    }
}

class Task4 {
    public static void printTask4() {
        int numberN;
        int summa = 0;
        System.out.println("***************** Task4: Sum of digits number *****************");
        System.out.print("Enter n:  ");
        Scanner scan = new Scanner(System.in);
        numberN = scan.nextInt();
        while (numberN != 0) {
            summa += (numberN % 10);
            numberN /= 10;
        }
        System.out.println("Summa = " + summa);
        System.out.println("**************************************************************");
        System.out.println();
    }
}

class Task5 {
    public static void printTask5() {
        double numberN;
        double numberM;
        System.out.println("****************** Task5: Number closest to 10 ****************");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n:  ");
        numberN = scan.nextDouble();
        System.out.print("Enter m:  ");
        numberM = scan.nextDouble();
        if (Math.abs(numberN - 10) == Math.abs(numberM - 10)) System.out.println("n and m are equal");
        else {
            if (Math.abs(numberN - 10) < Math.abs(numberM - 10)) System.out.println("n closer");
            else System.out.println("m closer");
        }
        System.out.println("***************************************************************");
        System.out.println();

    }
}

class Task6 {
    public static void printTask6() {
        double catetA;
        double catetB;
        double square;
        double perimetr;
        System.out.println("************ Task6: Perimeter and area of triangle ************");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a:  ");
        catetA = scan.nextDouble();
        System.out.print("Enter b:  ");
        catetB = scan.nextDouble();
        square = (catetA * catetB) / 2;
        perimetr = catetA + catetB + Math.sqrt(Math.pow(catetA, 2) + Math.pow(catetB, 2));
        System.out.println("Square = " + square);
        System.out.println("Perimetr = " + perimetr);
        System.out.println("***************************************************************");
        System.out.println();
    }
}

class Task7 {
    public static void printTask7() {
        double numberA;
        double numberB;
        double numberC;
        double discriminant;
        double koren1;
        double koren2;
        System.out.println("*********** Task7: The roots of a quadratic equation **********");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a:  ");
        numberA = scan.nextDouble();
        System.out.print("Enter b:  ");
        numberB = scan.nextDouble();
        System.out.print("Enter c:  ");
        numberC = scan.nextDouble();
        if ((Math.pow(numberB, 2) - 4 * numberA * numberC) < 0) System.out.println("There is no solution");
        else {
            discriminant = Math.sqrt(Math.pow(numberB, 2) - 4 * numberA * numberC);
            koren1 = (-numberB + discriminant) / (2 * numberA);
            koren2 = (-numberB - discriminant) / (2 * numberA);
            System.out.println("There is a solution");
            System.out.println("Root 1 = " + koren1);
            System.out.println("Root 2 = " + koren2);
        }
        System.out.println("***************************************************************");
        System.out.println();
    }
}

class Task8 {
    static int numberN;
    static int day;
    static int month;
    static int year;

    public static int printDay(int numberN) {
        return day = numberN / 1000000;
    }

    public static int printMonth(int numberN) {
        year = numberN % 10000;
        return month = ((numberN % 1000000) - year) / 10000;
    }

    public static int printYear(int numberN) {
        return year = numberN % 10000;
    }

    public static int setDay(int numberDay, int numberN) {
        int newDate;
        return newDate = ((numberDay * 1000000) + (numberN - (numberN / 1000000) * 1000000));
    }

    public static int setMonth(int numberMonth, int numberN) {
        int newDate;
        return newDate = ((numberN / 1000000) * 1000000) + (numberMonth * 10000) + (numberN % 10000);
    }

    public static int setYear(int numberYear, int numberN) {
        int newDate;
        return newDate = ((numberN / 10000) * 10000) + numberYear;
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Task1 task1 = new Task1();
        System.out.println("***************** Task1: Class with int and char **************");
        System.out.println("number = " + task1.number);
        System.out.println("symbol = " + task1.symbol);
        System.out.println("***************************************************************");
        System.out.println();

        System.out.println("************************ Task2: Class Dog *********************");
        Dog dog1 = new Dog();
        dog1.name = "Spot";
        dog1.says = "Ruff!";
        System.out.println("name: " + dog1.name + " says: " + dog1.says);
        Dog dog2 = new Dog();
        dog2.name = "Scruffy";
        dog2.says = "Wurf!";
        System.out.println("name: " + dog2.name + " says: " + dog2.says);
        System.out.println("***************************************************************");
        System.out.println();

        Task3 task3 = new Task3();
        task3.printTask3();

        Task4 task4 = new Task4();
        task4.printTask4();

        Task5 task5 = new Task5();
        task5.printTask5();

        Task6 task6 = new Task6();
        task6.printTask6();

        Task7 task7 = new Task7();
        task7.printTask7();

        System.out.println("********************** Task8: Birth Date *********************");
        System.out.print("Enter The Date of your Birth:  ");
        Scanner scan = new Scanner(System.in);
        int numberN = scan.nextInt();
        Task8 task8 = new Task8();
        System.out.println("Day: " + task8.printDay(numberN));
        System.out.println("Month: " + task8.printMonth(numberN));
        System.out.println("Year: " + task8.printYear(numberN));
        System.out.print("Enter New Day of your Birth:  ");
        int newDay = scan.nextInt();
        int newDate = task8.setDay(newDay, numberN);
        System.out.println("New Date of your Birth:  " + newDate);
        System.out.print("Enter New Month of your Birth:  ");
        int newMonth = scan.nextInt();
        newDate = task8.setMonth(newMonth, newDate);
        System.out.println("New Date of your Birth:  " + newDate);
        System.out.print("Enter New Year of your Birth:  ");
        int newYear = scan.nextInt();
        newDate = task8.setYear(newYear, newDate);
        System.out.println("New Date of your Birth:  " + newDate);

    }
}
