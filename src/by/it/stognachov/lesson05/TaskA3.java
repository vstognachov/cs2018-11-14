package by.it.stognachov.lesson05;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Найти минимальный и максимальный элементы массива.
4. Вывести эти два элемента на экран, через пробел.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0 9
*/

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[10];
        for(int k=0;k<array.length;k++){
            array[k]=sc.nextInt();
        }
        int min,max;
        min=max=array[0];
        for(int k=0;k<array.length;k++){
            if(array[k]<min){
                min=array[k];
            }
            if(array[k]>max){
                max=array[k];
            }
        }
        System.out.println(min+" "+max);
    }
}
