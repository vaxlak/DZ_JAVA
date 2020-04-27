/*Задание 3,1: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
        Если есть - выведите 'да', а если нет - выведите 'нет'.*/

package com.company;

public class Main {

    public static void main(String[] args) {
        int[] m={7,7,-1,4,5,3,9,99};
        Boolean have_five=false;
        for(int i=0;i<m.length;i++) if(m[i]==5){
            have_five=true;
            break;
        }
        System.out.println(have_five?"да":"нет");

    }
}
