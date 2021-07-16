import java.util.Arrays;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5(5, 3);
        Task6();
    }

    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    static void Task1(){
        int [] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                array[i] = 1;
            }else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 2. Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */

    static void Task2(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     * и числа меньшие 6 умножить на 2;
     */

    static void Task3(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами
     * (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    static void Task4(){
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || i == (array.length - 1) - j){
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);
            }
            System.out.println(" ");
        }

    }

    /**
     * 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len,
     * каждая ячейка которого равна initialValue;
     */

    static int[] Task5(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    /**
     * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
     */

    static void Task6(){
        int[] array = new int[(int) (Math.random() * 10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Максимальный элемент массива " + max);
        System.out.println("Минимальный элемент массива " + min);
    }
}
