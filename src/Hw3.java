import java.util.Arrays;
import java.util.Random;

/*
Домашнее задание №3 Работа над ошибками
Щукин Андрей
 */
public class Hw3 {
    public static void main(String[] args) {
        Random rnd = new Random(); //Объявляю рандом один раз.
        System.out.println("******** Задание №1 ********");

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int a = rnd.nextInt(2);
            arr[i] = a;
        }
        System.out.println("Было: " + Arrays.toString(arr));
//Arrays.toString возвращает одномерный массив в строку, что позволяет вывести его на печать через sopl
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println("Стало: " + Arrays.toString(arr));//Распечатываю массив, чтобы сравнить с первоначальным

        System.out.println("******** Задание №2 ********");
        int[] arr2 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr2[i] = i+1;
        }
        System.out.println(Arrays.toString(arr2));

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
                } else if (i + j == arr4.length - 1) { //Теперь можно менять размер массива и все будет работать
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
        int[] arr6 = new int[20];
        for (int i = 0; i < arr6.length; i++) {
            int a = rnd.nextInt(20);
            arr6[i] = a;
        }
        System.out.println("Исходный массив:" + Arrays.toString(arr6));
        Arrays.sort(arr6); // Arrays.sort() выполняет сортировку элементов массива по возрастанию
        System.out.println("Сортировка массива:" + Arrays.toString(arr6));
        System.out.println("Мин значение =" + arr6[0] + " " + "Макс значение =" + arr6[arr6.length -1]);
    }

    public static void ex5(int len, int initialValue) {
        int[] arr5 = new int[len];
        Arrays.fill(arr5,initialValue); //Данный метод заполняет указанный массив переданным значением.
//        Альтернативаный вариант:
//        for (int i = 0; i < arr5.length; i++) {
//            arr5[i] = initialValue;
//        }
        System.out.println(Arrays.toString(arr5));

    }
}

