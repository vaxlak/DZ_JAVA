/*Задание 1.7
Запросить у пользователя число и записать его в переменную redius.
Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius.
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14. */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int radius=scan.nextInt();
        double L=2*3.14*radius;
        System.out.println(L);
    }
}
