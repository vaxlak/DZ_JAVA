/*Задача 2.1
Дан массив из 10 целых чисел, необходимо найти среднее арифметическое значение чисел этого массива.*/
package com.company;
public class Main {

    public static void main(String[] args) {
        int m[]={3,2,0,0,0,0,0,1,2,4};
        double sum=0;
        for(int i=0;i<10;i++) sum+=m[i];
                System.out.println(sum/10);
    }
}
