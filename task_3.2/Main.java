/*Задание 3,2: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
        Если есть - выведите 'да', а если нет - выведите 'нет'.*/
package com.company;

public class Main {

    public static void main(String[] args) {
        int[] m={7,6,5,3,5,8};
        Boolean is_two_equal=false;
        for(int i=0;i<m.length-1;i++) if(m[i]==m[i+1]) is_two_equal=true;
        System.out.println(is_two_equal?"да":"нет");

    }
}
