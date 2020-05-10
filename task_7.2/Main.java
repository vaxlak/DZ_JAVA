/*
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
Используйте коллекции.
(Придётся погуглить коллекции)
*/
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Номер месяца
*/

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> m = new ArrayList<String>();
        m.add("0");
        m.add("Январь");
        m.add("Февраль");
        m.add("Март");
        m.add("Апрель");
        m.add("Май");
        m.add("Июнь");
        m.add("Июль");
        m.add("Август");
        m.add("Сентябрь");
        m.add("Октябрь");
        m.add("Ноябрь");
        m.add("Декабрь");

        Scanner scan=new Scanner(System.in);
        System.out.println("Введите название месяца");
        String s = scan.next();
        System.out.println(s +" " + m.indexOf(s) + " по счету месяц");


    }
}
