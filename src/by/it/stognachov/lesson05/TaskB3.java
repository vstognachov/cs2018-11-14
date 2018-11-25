package by.it.stognachov.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/


import java.util.Scanner;

public class TaskB3 {
    public static int partition(int[] array, int l, int r) {
        int opora = array[r];
        int i = l;
        for (int j = l; j <= r - 1; j++) {
            if (array[j] <= opora) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
                i++;
            }
        }
        int t = array[i];
        array[i] = array[r];
        array[r] = t;
        return i;
    }

    public static void sort(int[] array, int l, int r) {
        if (l < r) {
            int p = partition(array, l, r);
            sort(array, l, p - 1);
            sort(array, p + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] m = new int[10];
        Scanner sc=new Scanner(System.in);
        for(int k=0;k<m.length;k++){
            m[k]=sc.nextInt();
        }
        int min=m[0];
        int max=m[9];
        sort(m, 0, 9);
        for(int k=0;k<m.length;k++){
            if(m[k]==min){
                min=k;
            }
            if(m[k]==max){
                max=k;
            }
        }
        System.out.println("Index of first element="+min);
        System.out.println("Index of last element="+max);
            }
}

