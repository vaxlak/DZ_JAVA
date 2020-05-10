
/*Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat. */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-dd", Locale.ENGLISH);
        Date d=new Date();
        /* Если задать Date d= new Date(2013,8,18); - то выдается какая-то ахинея.
        Как это победить - не знаю. Гугл молчит....
         */

        System.out.println(sdf1.format(d));
        SimpleDateFormat sdf2 = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);
        System.out.println(sdf2.format(d));


    }


}
