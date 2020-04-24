/*Задача 2.2
Дан массив из 10 целых чисел, необходимо найти максимальное число в этом массиве.*/

package com.company;
public class Main {

    public static void main(String[] args) {
        int m[]={3,2,0,8,4,0,0,1,2,-5};
        int max=0;
        for(int i=0;i<10;i++) if(m[i]>max) max=m[i];
        System.out.println(max);

    }
}
