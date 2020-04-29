package com.company;
/* Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
 Вывести объекты на экран.
*
* Примечание:
* Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
*
* Пример вывода:
* Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
* Имя: Катя, пол: женский, возраст: 55
* Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
...*/
public class Main {
    public static void main(String[] args) {
        Human babka1=new Human("бабка1",false,80,null,null);
        Human babka2=new Human("бабка2",false,75,null,null);
        Human ded1=new Human("дед1",true,82,null,null);
        Human ded2=new Human("дед2",true,85,null,null);
        Human papa=new Human("папа",true,40,ded1,babka1);
        Human mama=new Human("мама",false,35,ded2,babka2);
        Human kid1=new Human("ребенок1",true,10,papa,mama);
        Human kid2=new Human("ребенок2",true,12,papa,mama);
        Human kid3=new Human("ребенок3",false,15,papa,mama);
        System.out.println(babka1.toString());
        System.out.println(babka2.toString());
        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());

    }
    public static class Human {
        String name;
        Boolean sex;
        int age;
        Human father, mother;

        public Human(String name, Boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}

