package by.it.stognachov.lesson05;

/* Задачка на сортировку2
Задача: Написать программу, которая вводит с клавиатуры 20 чисел
и выводит их в убывающем порядке. Скорость O(n log n)
*/


import java.util.Arrays;
import java.util.Scanner;

public class TaskC3 {
    public static int partition(int[] array,int l,int r){
        int opora=array[r];
        int i=l;
        for(int j=l;j>=r;j++){
            if(array[j]>=opora){
                int t=array[i];
                array[i]=array[j];
                array[j]=t;
                i++;
            }
        }
        int t=array[i];
        array[i]=array[r];
        array[r]=t;
        return i;
    }
    public static void sort(int[] array,int l,int r){
        if(l<r){
            int p=partition(array,l,r);
            sort(array,l,p-1);
            sort(array,p+1,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] massiv=new int[20];
        for(int k=0;k<massiv.length;k++){
            massiv[k]=sc.nextInt();
        }
        sort(massiv,0,19);
        System.out.println(Arrays.toString(massiv));
    }
}
