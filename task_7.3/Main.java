import java.time.LocalDate;

/* Задача: Разработать метод который возвращает дату пасхи.
Передаём в качестве параметра год. Метод возвращает дату пасхи в этом году.
Подсказка: воспользуйтесь алгоритмом Гаусса вычисления даты Пасхи.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(getEaster(2020));

    }
    static LocalDate getEaster(int y){
        int dayOfPasxa;
        int monthOfPasxa;

        int a=y%19;
        int b=y%4;
        int v=y%7;
        int g=(19*a+15)%30;
        int d=(2*b+4*v+6*g+6)%7;
        int x=g+d;
        if(x<9) {
            dayOfPasxa=x+22;
            monthOfPasxa=3;
        }
        else {
            dayOfPasxa=x-9;
            monthOfPasxa=4;
        }
        LocalDate dateOfPasxa=LocalDate.of(y,monthOfPasxa,dayOfPasxa);
        if(y>=1918) dateOfPasxa=dateOfPasxa.plusDays(13);
        return dateOfPasxa;
    }
}
