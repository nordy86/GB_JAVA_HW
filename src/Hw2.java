import java.util.GregorianCalendar;

/*
Домашнее задание №1
Щукин Андрей
 */
public class Hw2 {
    public static void main(String[] args) {

        System.out.println("******** Задание №1 ********");
        System.out.println(checkSum(4, 5));
        System.out.println(checkSum(5, 5));
        System.out.println(checkSum(15, 6));

        System.out.println("******** Задание №2 ********");
        if (positiveNegativeNumber(-1)) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

        System.out.println("******** Задание №3 ********");
        System.out.println(trueFolseReturn(-1));
        System.out.println(trueFolseReturn(+1));

        System.out.println("******** Задание №4 ********");
        cyclePrint("Task_4", 8);

        System.out.println("******** Задание №5 ********");
        System.out.println("является ли год високосным");
        System.out.println(hellYear(2023));

    }

    public static boolean checkSum(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }

    public static boolean positiveNegativeNumber(int a) {
        return (a >= 0);
    }

    public static boolean trueFolseReturn(int b) {
        return (b < 0);//Про ноль ничего сказано не было, поэтому считаю его положительным.
    }

    public static void cyclePrint(String word, int c) {
        for (int i = 0; i < c; i++) {
            System.out.println(word);
        }
    }

    public static boolean hellYear(int year) {
        return ((year % 4 == 0) || ((year % 100 == 0) && (year % 400 == 0)));
    }
}
/*Взял формулировку високосного года для Григореанского календаря из википедии
и для нее подогнал условие:По-прежнему високосным оставался год, номер которого
кратен четырём, но исключение делалось для тех, которые были кратны 100.
Такие годы были високосными только тогда, когда делились ещё и на 400.

В дз формулировка немного отличается.
 */

//
