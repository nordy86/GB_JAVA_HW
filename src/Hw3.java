import java.util.Arrays;
import java.util.Random;

/*
Домашнее задание №3
Щукин Андрей
 */
public class Hw3 {
    public static void main(String[] args) {

        System.out.println("******** Задание №1 ********");
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int a = rnd.nextInt(2);
            arr[i] = a;
        }
        System.out.println("Было: " + Arrays.toString(arr));
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println("Стало: " + Arrays.toString(arr));

        System.out.println("******** Задание №2 ********");
        int[] arr2 = new int[101];
        for (int i = 1; i < 101; i++) {
            arr2[i] = i;
            if (i % 20 == 0) {
                System.out.println(" ");
            }
            System.out.print(arr2[i] + "\t");
        }
        System.out.println(" ");

        System.out.println("******** Задание №3 ********");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Before:" + Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println("After:" + Arrays.toString(arr3));

        System.out.println("******** Задание №4 ********");
        int[][] arr4 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print((arr4[i][j] = 1));
                } else if (i + j == 9) {
                    System.out.print((arr4[i][j] = 1));
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }

        System.out.println("******** Задание №5 ********");
        ex5(10,55);

        System.out.println("******** Задание №6 ********");
        Random rnd1 = new Random();
        int[] arr6 = new int[21];
        for (int i = 0; i < arr6.length; i++) {
            int a = rnd1.nextInt(20);
            arr6[i] = a;
        }
        System.out.println("Исходный массив:" + Arrays.toString(arr6));
        Arrays.sort(arr6);
        System.out.println("Сортировка массива:" + Arrays.toString(arr6));
        System.out.println("Мин значение =" + arr6[0] + " " + "Макс значение =" + arr6[20]);
    }

    public static void ex5(int len, int initialValue) {
        int[] arr5 = new int[len];
        Arrays.fill(arr5,initialValue);
//        for (int i = 0; i < arr5.length; i++) {
//            arr5[i] = initialValue;
//        }
        System.out.println(Arrays.toString(arr5));

    }
}

