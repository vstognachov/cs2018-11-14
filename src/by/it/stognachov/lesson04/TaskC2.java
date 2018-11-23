package by.it.stognachov.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    static private void getNumber(int a,int b){
        int sum=0;
        for(int k=1;k<=b-1;k++){
         switch(k){
             case 1:
                 sum+=31;
                 break;
             case 2:
                 sum+=28;
                 break;
             case 3:
                 sum+=31;
                 break;
             case 4:
                 sum+=30;
                 break;
             case 5:
                 sum+=31;
                 break;
             case 6:
                 sum+=30;
                 break;
             case 7:
                 sum+=31;
                 break;
             case 8:
                 sum+=31;
                 break;
             case 9:
                 sum+=30;
                 break;
             case 10:
                 sum+=31;
                 break;
             case 11:
                 sum+=30;
                 break;
             case 12:
                 sum+=31;
                 break;
         }
        }
        sum+=a;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        getNumber(a,b);
    }
}
