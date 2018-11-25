package by.it.stognachov.lesson05;

/*
Один большой массив и два маленьких
1. Создать массив m на 20 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива a и b на 10 целых чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
5. Вывести массивы a и b на экран командами:
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));

Например, для такого ввода
1 2 3 4 5 6 7 8 9 10 11 22 33 44 55 66 77 88 99 0

ожидается такой вывод:
a=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
b=[11, 22, 33, 44, 55, 66, 77, 88, 99, 0]

*/

import java.util.Arrays;
import java.util.Scanner;

public class TaskB2 {
    public static void main(String[] args) {
        int[] m=new int[20];
        int[] a=new int[10];
        int[] b=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int k=0;k<m.length;k++){
            m[k]=sc.nextInt();
        }
        for(int k=0;k<10;k++){
            a[k]=m[k];
        }
        for(int k=10,c=0;k<20;k++,c++){
            b[c]=m[k];
        }
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));
    }
}
