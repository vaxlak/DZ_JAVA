/*Задание 1.9
Запросить у пользователя 2 числа (сохранить их в разные переменные)
Вывести на экран максимальное из двух чисел, если числа равны, вывести их сумму.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 числа...");
        int a=scan.nextInt();
        int b=scan.nextInt();
        if(a>b) System.out.println("Максимальное число " + a);
        else if(a<b) System.out.println("Максимальное число " + b);
        else System.out.println("Числа равны, их сумма " + 2*a);
    }}
