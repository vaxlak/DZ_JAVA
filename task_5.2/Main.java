package com.company;
/* Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
 * Создайте объект класса Сat*/
public class Main {
    public static void main(String[] args) {
        Cat vaska=new Cat("Васька",5,4, 100500);
        System.out.println(vaska.name +" "+vaska.age+" "+vaska.weight+" "+vaska.strength);
    }
}
class Cat{
    String name;
    int age, weight, strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
}

