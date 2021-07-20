import java.util.Scanner;
/*
Домашнее задание №1
Щукин Андрей
 */
public class Hw1 {

    public static void main (String [] args) {
        System.out.println("**** Задание 2 ************");
        printThreeWords();

        System.out.println("**** Задание 3 ************");
        checkSumSign();

        System.out.println("**** Задание 4 ************");
        printColor(101);

        System.out.println("**** Задание 5 ************");
        compareNumbers(1,2);
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        System.out.println("Введите число a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите число b");
        int b = scanner.nextInt();
        int sum = a + b;
        if (sum>=0) {
            System.out.println("a+b= "+ (a+b));
            System.out.println("Сумма положительная");
        } else {
            System.out.println("a+b= "+ (a+b));
            System.out.println("Число отрицательное");
        }
        scanner.close();
    }
    public static void printColor(int value) {
        if (value <=0) {
            System.out.println("RED");
        } else if (value >= 1 && value <= 100) {
            System.out.println("YELLOW");
        } else {
            System.out.println("GREEN");
        }
    }
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}