/*Задание 1.8
Запросить у пользователя число(температуру в цельсиях) и записать его в переменную.
Программа должна переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32
Например: для числа 41 результат будет 105.8*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите температуру по цельсию");
        double TC=scan.nextDouble();
        double TF=9*TC/5+32;
        System.out.println("Температура по Фаренгейту " +TF);

    }
}
