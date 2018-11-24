package by.it.yarmolenka.lesson03;

/*
Lesson 03. Конвертер температуры

Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия.
Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.

Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TC = (TF – 32) * 5/9

Пример:
В метод convertCelsiumToFahrenheit на вход подается значение 40.

Пример вывода:
104.0


Требования:
1. Метод convertCelsiumToFahrenheit(int) должен быть не приватным и статическим.
2. Метод convertCelsiumToFahrenheit должен возвращать значение типа double.
3. Метод convertCelsiumToFahrenheit не должен ничего выводить на экран.
4. Метод convertCelsiumToFahrenheit должен правильно переводить градусы Цельсия
в градусы Фаренгейта и возвращать это число.*/


import java.util.Scanner;

class TaskC1 {
    private static double convertCelsiumToFahrenheit(int C){
        double F = (double) C * 9/ 5 +32;
        return F;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println(convertCelsiumToFahrenheit(c));
    }





//    public static void main(String[] args) {
//        System.out.println(convertCelsiumToFahrenheit(40));
//    }

}
