/*Задача №80 (Повышенная сложность)
1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
Результат: 3*/
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m[] = new int[10];
        int result=1, count=1;
        for(int i=0;i<10;i++) m[i]= scan.nextInt();

        for(int i=0;i<9;i++) {

            if(m[i]==m[i+1])   {
                count++;
                if (result < count) result = count;
            }
            else count = 1;
        }
        System.out.println(result);
    }
}
